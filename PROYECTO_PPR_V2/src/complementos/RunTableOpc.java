/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FERNANDO
 */
public class RunTableOpc {
    private DefaultTableModel modeloTable;
    private JTable table;
    private String registro;

    public RunTableOpc(JTable table, String registro) {
        this.table = table;
        this.registro = registro;
    }
    


    public void startTable(){
        modeloTable = new DefaultTableModel();
        String columnas[] = {"Id","User Id"};
        modeloTable.setColumnIdentifiers(columnas);     
        try {
            setDatosTabla(cargarDatosArreglo ());
        } catch (SQLException e) {
            System.out.println("Error SQLException JPTableOpcTwitter startTable: "+e.getMessage());
        }
    }
    
    private ArrayList<ModeloOpc> cargarDatosArreglo () throws SQLException{
        ArrayList<ModeloOpc> arreglo = new ArrayList<ModeloOpc>();
        String url = "SELECT * FROM "+registro;
        Connection my_connection = null;
        Statement my_statement = null;
        ResultSet my_resultSet = null;
        
        try{
            my_connection = (new MySqlConnection()).conetMysql();
            my_statement = my_connection.createStatement();
            my_resultSet = my_statement.executeQuery(url);
            while(my_resultSet.next()){
                ModeloOpc temp = new ModeloOpc();
                temp.setIdTwitter(my_resultSet.getString("id"));
                temp.setIdUserTwitter(my_resultSet.getString("registrousuario_idUsuario"));
                arreglo.add(temp);
            }
            return arreglo;
        }catch(SQLException e){
            System.out.println("Error SQLException cargarDatosArreglo: "+e.getMessage());
        }finally{
            if(my_connection!=null)my_connection.close();
            if(my_statement!=null)my_statement.close();
        }
        return arreglo;
    }
    
    private void setDatosTabla (ArrayList<ModeloOpc> datos){
        modeloTable.setRowCount(0);
        Object o[] = new Object[modeloTable.getColumnCount()];
        for(ModeloOpc e:datos){
            o[0] = e.getIdTwitter();
            o[1] = e.getIdUserTwitter();
            modeloTable.addRow(o);
        }
        table.setModel(modeloTable);
    }
}
