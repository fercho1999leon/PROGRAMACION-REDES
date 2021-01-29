/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FERNANDO
 */
public class MySqlConnection {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String baseDatos = "PROYECTOPPR";
    private String hostname = "localhost";
    private String url = "jdbc:mysql://"+hostname+":3306/"+baseDatos+"?serverTimezone=UTC";
    private String username = "PROYECTO_PPR";
    private String password = "Fernando1999";
    public Connection conetMysql(){
        Connection conet = null;
        try{
            Class.forName(driver);
            conet = DriverManager.getConnection(url, username, password);
        
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return conet;
    }
    
}
