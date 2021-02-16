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
    public static  void eliminar_registro (String Nombre) {
        String c = "DELETE FROM Datos WHERE Nombre = '"+Nombre+"'"; 
        ejecutar(c ); 
    }
    
}
