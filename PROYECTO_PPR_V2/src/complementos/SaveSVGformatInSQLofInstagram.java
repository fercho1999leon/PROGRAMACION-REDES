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
public class SaveSVGformatInSQLofInstagram {
    private String url;

    public SaveSVGformatInSQLofInstagram(String url) {
        this.url = url;
    }
    
    public void start(String id){
        List<ModeloInstagram> data = new ArrayList<ModeloInstagram>();
        data = importarCSV(id);
        insertMySql(data);
    }
    
    private List<ModeloInstagram> importarCSV(String id){
        List<ModeloInstagram> data = new ArrayList<ModeloInstagram>();
        try {
            CsvReader readCsv = new CsvReader(url);
            readCsv.readHeaders();
            while(readCsv.readRecord()){
                String id_id = readCsv.get(0);
                String shortcode = readCsv.get(1);
                String display_url = readCsv.get(2);
                String edge_media_to_comment = readCsv.get(3);
                String edge_liked_by = readCsv.get(4);
                String registrousuario_idUsuario = id;
                data.add(new ModeloInstagram(id_id,shortcode,display_url,edge_media_to_comment,edge_liked_by,registrousuario_idUsuario));
            }
            readCsv.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error FileNotFoundException SaveSVGformatInSQLofFacebook: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IOException SaveSVGformatInSQLofFacebook HOLA: "+e.getMessage());
        }
        return data;
    }
    private void insertMySql(List<ModeloInstagram> data){
        String Query = "INSERT INTO registroinstagram (id,shortcode,display_url,edge_media_to_comment,edge_liked_by,registroConsultaInstagram_id) VALUES (?,?,?,?,?,?)";
        MySqlConnection mySql = new MySqlConnection();
        Connection conet = mySql.conetMysql();
        try{
            PreparedStatement my_statement = conet.prepareStatement(Query);
            PreparedStatement my_statement3 = conet.prepareStatement("INSERT INTO registroconsultainstagram (registrousuario_idUsuario) VALUES (?);");
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
                my_statement.setString(1, data.get(i).getId());
                my_statement.setString(2, data.get(i).getShortcode());
                my_statement.setString(3, data.get(i).getDisplay_url());
                my_statement.setString(4, data.get(i).getEdge_media_to_comment());
                my_statement.setString(5, data.get(i).getEdge_liked_by());
                my_statement.setInt(6, (Integer.parseInt(registro)));
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
