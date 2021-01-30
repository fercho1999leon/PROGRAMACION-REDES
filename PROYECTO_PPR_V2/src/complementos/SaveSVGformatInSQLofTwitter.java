/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import com.csvreader.CsvReader;
import complementos.SeparadorDiccionario.ModeloDiccionario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FERNANDO
 */
public class SaveSVGformatInSQLofTwitter {
    private String url;
    private String urls;

    public SaveSVGformatInSQLofTwitter(String url) {
        this.url = url;
    }
    
    
    public void start(String id){
        List<ModeloTwitter> data = new ArrayList<ModeloTwitter>();
        data = importarCSV(id);
        insertMySql(data);
    }
    private List<ModeloTwitter> importarCSV(String id){
        List<ModeloTwitter> data = new ArrayList<ModeloTwitter>();
        try {
            CsvReader readCsv = new CsvReader(url);
            readCsv.readHeaders();
            while(readCsv.readRecord()){
                String tweet_id = readCsv.get(1);
                String created_at = readCsv.get(0);
                String tweet_text = readCsv.get(2);
                String screen_name = readCsv.get(3);
                String name = readCsv.get(4);
                String account_creation_date = readCsv.get(5);
                urls = readCsv.get(6); 
                SeparadorDiccionario separador = new SeparadorDiccionario();
                ArrayList<ModeloDiccionario> diccionario = separador.getDic(urls);
                String url;
                String expanded_url;
                String display_url;
                if(diccionario.size()>2){
                    url = diccionario.get(0).Valor;
                    expanded_url = diccionario.get(1).Valor;
                    display_url = diccionario.get(2).Valor;
                }else{
                    url = " ";
                    expanded_url = " ";
                    display_url = " ";
                }
                String registrousuario_idUsuario = id;
                data.add(new ModeloTwitter(tweet_id,created_at,tweet_text,screen_name,name,account_creation_date,url,expanded_url,display_url,registrousuario_idUsuario));
            }
            readCsv.close();
            /*
            for(ModeloTwitter e:data){
                System.out.println(
                        e.getCreated_at()+","+
                        e.getTweet_id()+","+
                        e.getTweet_text()+","+
                        e.getScreen_name()+","+
                        e.getName()+","+
                        e.getAccount_creation_date()+","
                );
            }
            */
        } catch (FileNotFoundException e) {
            System.out.println("Error FileNotFoundException SaveSVGformatInSQLofTwitter: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IOException SaveSVGformatInSQLofTwitter HOLA: "+e.getMessage());
        }
    
        return data;
    }
    private void insertMySql(List<ModeloTwitter> data){
        String Query = "INSERT INTO registrotwitter (created_at,tweet_id,tweet_text,screen_name,name,account_creation_date,url,expanded_url,display_url,registroConsultaTwitter_id) VALUES (?,?,?,?,?,?,?,?,?,?)";
        MySqlConnection mySql = new MySqlConnection();
        Connection conet = mySql.conetMysql();
        try{
            PreparedStatement my_statement = conet.prepareStatement(Query);
            PreparedStatement my_statement3 = conet.prepareStatement("INSERT INTO registroconsultatwitter (registrousuario_idUsuario) VALUES (?);");
            my_statement3.setString(1, data.get(0).getRegistrousuario_idUsuario());
            my_statement3.executeUpdate();
            my_statement3.close();
            Statement my_statement2 = conet.createStatement();
            ResultSet my_resultSet = my_statement2.executeQuery("SELECT MAX(id) FROM registroconsultatwitter");
            my_resultSet.next();
            String registro = my_resultSet.getString("MAX(id)");
            System.out.println("---------->  "+registro);
            my_statement3.close();
            for(int i = 0 ; i < data.size() ; i++){
                my_statement.setString(1, data.get(i).getCreated_at());
                my_statement.setString(2, data.get(i).getTweet_id());
                my_statement.setString(3, data.get(i).getTweet_text());
                my_statement.setString(4, data.get(i).getScreen_name());
                my_statement.setString(5, data.get(i).getName());
                my_statement.setString(6, data.get(i).getAccount_creation_date());
                my_statement.setString(7, data.get(i).getUrl());
                my_statement.setString(8, data.get(i).getExpanded_url());
                my_statement.setString(9, data.get(i).getDisplay_url());
                my_statement.setInt(10, (Integer.parseInt(registro)));
                my_statement.executeUpdate();
                System.out.println("Se inserto el elemento numero: "+(i+1)+"/"+data.size());
            }
            my_statement.close();
            conet.close();
        }catch(SQLException e){
            System.out.println("Error SQLException SaveSVGformatInSQLofTwitter: "+e.getMessage()+"\n"+e.getSQLState());
        }
        
    }
}
