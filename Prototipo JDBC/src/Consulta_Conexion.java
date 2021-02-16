/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
/**
 *
 * @author karen
 */
public class Consulta_Conexion {
    static Statement sentencia;
      static ResultSet resultado;
    
    //METODO EJECUTAR
    public static void ejecutar(String c) { 
        try {
            sentencia.executeUpdate(c);
            System.out.println("CORRECTO");
        } catch (Exception e) { 
	System.out.println("ERROR");
	}
    }
    
    //METODO ELIMINAR
    public static  void eliminar_registro (int DNI) {
        String c = "DELETE FROM jdbc WHERE Nombre = '"+DNI+"'"; 
        ejecutar(c ); 
    }
    
    
    //METODO BUSCAR REGISTRO
    public static User buscar_registro(int DNI) {
        User u = null; 
        String c = "SELECT * FROM jdbc" + "WHERE Nombre='"+DNI+"'";
        try{
            resultado = sentencia.executeQuery(c);
            System.out.println("BUSQUEDA ENCONTRADA");
        } catch (Exception e){
            System.out.println("BUSQUEDA NO ENCONTRADA");
        } 
            return u;
      }    
    }
    

