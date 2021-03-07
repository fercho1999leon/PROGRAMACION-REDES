/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FERNANDO
 */
public class SaveSVGformatInSQLofFacebook {
    private String url;

    public SaveSVGformatInSQLofFacebook(String url) {
        this.url = url;
    }
    
    public void start(String id){
        List<ModeloFacebook> data = new ArrayList<ModeloFacebook>();
        data = importarCSV(id);
        insertMySql(data);
    }
    
    private List<ModeloFacebook> importarCSV(String id){
        List<ModeloFacebook> data = new ArrayList<ModeloFacebook>();
        try {
            CsvReader readCsv = new CsvReader(url);
            readCsv.readHeaders();
            while(readCsv.readRecord()){
                String post_id = readCsv.get(0);
                String text = readCsv.get(1);
                String time = readCsv.get(2);
                String image = readCsv.get(3);
                String images = readCsv.get(4);
                String likes = readCsv.get(5);
                String comments = readCsv.get(6);
                String shares = readCsv.get(7);
                String post_url = readCsv.get(8);
                String link = readCsv.get(9);
                String registrousuario_idUsuario = id;
                data.add(new ModeloFacebook(post_id,text,time,image,images,likes,comments,shares,post_url,link,registrousuario_idUsuario));
            }
            readCsv.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error FileNotFoundException SaveSVGformatInSQLofFacebook: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IOException SaveSVGformatInSQLofFacebook HOLA: "+e.getMessage());
        }
    
        return data;
    }
    
    private void insertMySql(List<ModeloFacebook> data){
        String Query = "INSERT INTO registrofacebook (post_id,text,time,image,images,likes,comments,shares,post_url,link,registroConsultaFacebook_id) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        MySqlConnection mySql = new MySqlConnection();
        Connection conet = mySql.conetMysql();
        try{
            PreparedStatement my_statement = conet.prepareStatement(Query);
            PreparedStatement my_statement3 = conet.prepareStatement("INSERT INTO registroconsultafacebook (registrousuario_idUsuario) VALUES (?);");
            my_statement3.setString(1, data.get(0).getRegistrousuario_idUsuario());
            my_statement3.executeUpdate();
            my_statement3.close();
            
            
            Statement my_statement2 = conet.createStatement();
            ResultSet my_resultSet = my_statement2.executeQuery("SELECT MAX(id) FROM registroconsultafacebook");
            my_resultSet.next();
            String registro = my_resultSet.getString("MAX(id)");
            System.out.println("---------->  "+registro);
            my_statement3.close();
            
            
            for(int i = 0 ; i < data.size() ; i++){
                my_statement.setString(1, data.get(i).getPost_id());
                my_statement.setString(2, data.get(i).getText());
                my_statement.setString(3, data.get(i).getTime());
                my_statement.setString(4, data.get(i).getImage());
                my_statement.setString(5, data.get(i).getImages());
                my_statement.setString(6, data.get(i).getLikes());
                my_statement.setString(7, data.get(i).getComments());
                my_statement.setString(8, data.get(i).getShares());
                my_statement.setString(9, data.get(i).getPost_url());
                my_statement.setString(10, data.get(i).getLink());
                my_statement.setInt(11, (Integer.parseInt(registro)));
                my_statement.executeUpdate();
                System.out.println("Se inserto el elemento numero: "+(i+1)+"/"+data.size());
            }
            my_statement.close();
            conet.close();
        }catch(SQLException e){
            System.out.println("Error SQLException SaveSVGformatInSQLofFacebook: "+e.getMessage()+"\n"+e.getSQLState());
        }
        
    }
}
