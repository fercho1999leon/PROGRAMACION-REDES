
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
public class jpDelectUser extends javax.swing.JPanel {

    /**
     * Creates new form jpDelectUser
     */
    public jpDelectUser() {
        initComponents();
    }
   
   
    public JTextField getjTextDNI() {
        return jTextField1;
    }

    public void setjTextDNI(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 180, 180));
        jLabel1.setText("ELIMINAR:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 90, 30));

        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("INGRESE DNI");
        jTextField1.setBorder(null);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 190, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 190, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/x-30.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 30, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "EDAD"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 480, 250));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 5, 280, 20));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back-40.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
