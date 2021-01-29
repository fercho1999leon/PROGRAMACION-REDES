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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    
    public void start(){
        List<ModeloTwitter> data = new ArrayList<ModeloTwitter>();
        data = importarCSV();
        insertMySql(data);
    }
    private List<ModeloTwitter> importarCSV(){
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
                String urlstwitter_urls_id = readCsv.get(1);
                urls = readCsv.get(6);
                data.add(new ModeloTwitter(tweet_id,created_at,tweet_text,screen_name,name,account_creation_date,urlstwitter_urls_id));
            }
            readCsv.close();
            for(ModeloTwitter e:data){
                System.out.println(
                        e.getCreated_at()+","+
                        e.getTweet_id()+","+
                        e.getTweet_text()+","+
                        e.getScreen_name()+","+
                        e.getName()+","+
                        e.getAccount_creation_date()+","+
                        e.getUrlstwitter_urls_id()
                );
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error FileNotFoundException SaveSVGformatInSQLofTwitter: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IOException SaveSVGformatInSQLofTwitter: "+e.getMessage());
        }
    
        return data;
    }
    private void insertMySql(List<ModeloTwitter> data){
        String Query = "INSERT INTO registrotwitter (created_at,tweet_id,tweet_text,screen_name,name,account_creation_date,urlsTwitter_urls_id) VALUES (?,?,?,?,?,?,?)";
        MySqlConnection mySql = new MySqlConnection();
        Connection conet = mySql.conetMysql();
        try{
            PreparedStatement my_statement = conet.prepareStatement(Query);
            PreparedStatement my_statement2 = conet.prepareStatement("INSERT INTO urlstwitter (urls_id,url,expanded_url,display_url) VALUES (?,?,?,?);");
            for(int i = 0 ; i < data.size() ; i++){
                my_statement2.setString(1, data.get(i).getUrlstwitter_urls_id());
                my_statement2.setString(2, "hola");
                my_statement2.setString(3, "hola");
                my_statement2.setString(4, "hola");
                my_statement2.executeUpdate();
            }
            my_statement2.close();
            for(int i = 0 ; i < data.size() ; i++){
                my_statement.setString(1, data.get(i).getCreated_at());
                my_statement.setString(2, data.get(i).getTweet_id());
                my_statement.setString(3, data.get(i).getTweet_text());
                my_statement.setString(4, data.get(i).getScreen_name());
                my_statement.setString(5, data.get(i).getName());
                my_statement.setString(6, data.get(i).getAccount_creation_date());
                my_statement.setString(7, data.get(i).getUrlstwitter_urls_id());
                my_statement.executeUpdate();
                System.out.println("Se inserto el elemento numero: "+(i+1)+"/"+data.size());
            }
            my_statement.close();
            conet.close();
        }catch(SQLException e){
            System.out.println("Error SQLException SaveSVGformatInSQLofTwitter: "+e.getMessage());
        }
        
    }
}
