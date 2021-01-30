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
        String var = Diccionario.replace('[', '\0');
        var = var.replace(']', '\0');
        var = var.replace('{', '\0');
        var = var.replace('}', '\0');
        var = var.replace("'", "\0");
        Diccionario = var;
        char arreglo[] = Diccionario.toCharArray();
        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i < arreglo.length ; i++) {
        	if(arreglo[i]==':' || arreglo[i]==','){
                if(arreglo[i+1]!='/' && (i+1)<arreglo.length){
                	arreglo[i]='\0';
                }
        	}
        }

        for(int i=0;i<arreglo.length;i++) {
        	if(arreglo[i]!='\0') {
        		str.append(arreglo[i]);
        	}
        }
        Diccionario = str.toString();
        Diccionario = Diccionario.replace(" ", "\0");
        arreglo = Diccionario.toCharArray();
        str = null;
        str = new StringBuilder();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != '\0') {
                str.append(arreglo[i]);
            } else {
                ModeloDiccionario modelo = new ModeloDiccionario();
                modelo.setClave(str.toString());
                str = null;
                str = new StringBuilder();
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[j] != '\0') {
                        str.append(arreglo[j]);
                    } else {
                        modelo.setValor(str.toString());
                        str = null;
                        str = new StringBuilder();
                        i = j;
                        Dic.add(modelo);
                        if (!(i + 1 < arreglo.length)) {
                            i++;
                        }
                        break;
                    }

                }
            }

        }
        for(ModeloDiccionario e:Dic) {
        	System.out.println(e.getClave()+","+e.getValor());
        }
        
        
        
        
        
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