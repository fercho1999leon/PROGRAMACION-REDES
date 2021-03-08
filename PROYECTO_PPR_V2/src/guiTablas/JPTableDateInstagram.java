/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiTablas;

import complementos.ModeloInstagram;
import complementos.MySqlConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FERNANDO
 */
public class JPTableDateInstagram extends javax.swing.JPanel {

    /**
     * Creates new form JPTableDateInstagram
     */
    public JPTableDateInstagram() {
        initComponents();
    }
    
    public void startTable(){
        modeloTableInstagram = new DefaultTableModel();
        String columnas[] = {"id","shortcode","display_url","edge_media_to_comment","edge_liked_by"};
        modeloTableInstagram.setColumnIdentifiers(columnas);     
        try {
            setDatosTabla(cargarDatosArreglo ());
        } catch (SQLException e) {
            System.out.println("Error SQLException JPTableOpcTwitter: "+e.getMessage());
        }
    }

    public String getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(String valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    
    private ArrayList<ModeloInstagram> cargarDatosArreglo () throws SQLException{
        ArrayList<ModeloInstagram> arreglo = new ArrayList<ModeloInstagram>();
        String QUERRY = "SELECT * FROM registroinstagram WHERE registroconsultaInstagram_id = "+valorConsulta;
        Connection my_connection = null;
        Statement my_statement = null;
        ResultSet my_resultSet = null;
        
        try{
            my_connection = (new MySqlConnection()).conetMysql();
            my_statement = my_connection.createStatement();
            my_resultSet = my_statement.executeQuery(QUERRY);
            while(my_resultSet.next()){
                
                String id = my_resultSet.getString("id");
                String shortcode = my_resultSet.getString("shortcode");
                String display_url = my_resultSet.getString("display_url");
                String edge_media_to_comment = my_resultSet.getString("edge_media_to_comment");
                String edge_liked_by = my_resultSet.getString("edge_liked_by");
                
                String registrousuario_idUsuario = String.valueOf(my_resultSet.getInt("registroconsultaInstagram_id"));
                arreglo.add(new ModeloInstagram(id,shortcode,display_url,edge_media_to_comment,edge_liked_by,registrousuario_idUsuario));
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
    
    private void setDatosTabla (ArrayList<ModeloInstagram> datos){
        modeloTableInstagram.setRowCount(0);
        Object o[] = new Object[modeloTableInstagram.getColumnCount()];
        for(ModeloInstagram e:datos){
            o[0] = e.getId();
            o[1] = e.getShortcode();
            o[2] = e.getDisplay_url();
            o[3] = e.getEdge_media_to_comment();
            o[4] = e.getEdge_liked_by();;
            modeloTableInstagram.addRow(o);
        }
        jtDateInstagram.setModel(modeloTableInstagram);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtDateInstagram = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtDateInstagram.setBackground(new java.awt.Color(255, 255, 255));
        jtDateInstagram.setForeground(new java.awt.Color(58, 180, 180));
        jtDateInstagram.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtDateInstagram);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 230));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtDateInstagram;
    // End of variables declaration//GEN-END:variables
    private String valorConsulta;
    private DefaultTableModel modeloTableInstagram;
}
