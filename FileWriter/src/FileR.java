/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
import java.io.*;
public class FileR {
    public static void main(String[] args){
        String arreglo[] = {"LEON","ARREAGA","CARRILLO","HUACON","HOLGUIN"};
        File archivo = new File("src/contenedor/apellidos.txt");
        try{
            FileWriter fw = new FileWriter(archivo);
            for(String temp:arreglo){
                fw.write(temp);
                fw.write("\n");
            }
            fw.flush();
            fw.close();
            System.out.println("PROCESO COMPLETADO CORRECTAMENTE");
        }catch(IOException e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
