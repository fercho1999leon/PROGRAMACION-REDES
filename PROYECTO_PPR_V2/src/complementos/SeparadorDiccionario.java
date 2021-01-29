/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import java.util.ArrayList;

/**
 *
 * @author Roger
 */
public class SeparadorDiccionario {
    public ArrayList <ModeloDiccionario> getDic (String Diccionario){
        ArrayList <ModeloDiccionario> Dic = new ArrayList <ModeloDiccionario> ();
       
        String var = "[{'url': 'https://t.co/RxoAtdJIQE', 'expanded_url': 'https://cnn.it/3iYGe61', 'display_url': 'cnn.it/3iYGe61', 'indices': [91, 114]}]";
        char cad[]= var.toCharArray();
        
        return Dic;
    }    
            
    public class ModeloDiccionario{
        public String Clave;
        public String Valor;
        
        public String getClave() {
            return Clave;
        }
        public void setClave(String Clave) {
            this.Clave = Clave;
        }
        public String getValor() {
            return Valor;
        }
        public void setValor(String Valor) {
            this.Valor = Valor;
        }
        
    
    }  
            
            
}
