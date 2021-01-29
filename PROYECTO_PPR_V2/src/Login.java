
import complementos.MySqlConnection;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        N_Intentos = 0;
        //Agregar laminal al contenedor principal cardLayout
        jPanelContenedor.setLayout(new java.awt.CardLayout(0,0));
        jPanelContenedor.add(new JPPresentacion(),idPresentacion);
        jPanelContenedor.add(new JPCreateUser(jPanelContenedor),idCrearUsuario);
        
        
        //Iniciar presentacion
        CardLayout carta = (CardLayout)jPanelContenedor.getLayout();
        carta.show(jPanelContenedor, idPresentacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtContrasena = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JLabel();
        lbPasswordRecovery = new javax.swing.JLabel();
        lbCrearUser = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 180, 180)));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user-160.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 180, 180));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 180, 180));
        jLabel3.setText("Usurario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtUsuario.setForeground(new java.awt.Color(180, 180, 180));
        txtUsuario.setText("INGRESAR USUARIO");
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, 30));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 220, 10));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconUser-25.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 30, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconKey-30.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 30, 30));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 220, 10));

        txtContrasena.setForeground(new java.awt.Color(180, 180, 180));
        txtContrasena.setText("jPasswordField1");
        txtContrasena.setBorder(null);
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 180, 30));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(58, 180, 180));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/enter-50.png"))); // NOI18N
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 120, 40));

        lbPasswordRecovery.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbPasswordRecovery.setForeground(new java.awt.Color(58, 180, 180));
        lbPasswordRecovery.setText("¿Recuperacion de usuario y contraseña?");
        lbPasswordRecovery.setToolTipText("");
        lbPasswordRecovery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPasswordRecovery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPasswordRecoveryMouseClicked(evt);
            }
        });
        jPanel1.add(lbPasswordRecovery, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        lbCrearUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCrearUser.setForeground(new java.awt.Color(58, 180, 180));
        lbCrearUser.setText("Crear un nuevo usuario");
        lbCrearUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCrearUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCrearUserMouseClicked(evt);
            }
        });
        jPanel1.add(lbCrearUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelContenedor.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedor.setPreferredSize(new java.awt.Dimension(570, 360));
        jPanelContenedor.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar-30.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 4, 30, 30));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/minimize-30.png"))); // NOI18N
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 4, 30, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 570, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setText("INGRESAR");
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setText("");
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void lbCrearUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCrearUserMouseClicked
        // TODO add your handling code here:
        CardLayout carta = (CardLayout)jPanelContenedor.getLayout();
        carta.show(jPanelContenedor, idCrearUsuario);
    }//GEN-LAST:event_lbCrearUserMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        if(N_Intentos < 3){
            try {
                // TODO add your handling code here:
                //Se crea la coneccion 
                Connection my_connection = (new MySqlConnection().conetMysql());//PONER LA BASE DE DATOS(proyecto_ppr)
                //Se crea objeto del tipo statement
                Statement my_statement = my_connection.createStatement();
                //Ejecutar sentencia Sql
                ResultSet my_resultSet = my_statement.executeQuery("SELECT * FROM "+Tabla);//SE PONE LA TABLA DE USUARIOS (usuario)
                //Recorrer resultset
                while(my_resultSet.next()){
                    if(txtUsuario.getText().equals(my_resultSet.getString("users"))){//Se pone el campo de id de usuario de la DB (usuario_id)
                        if(txtContrasena.getText().equals(my_resultSet.getString("contraseniaUsuario"))){//Se pone el campo de contraseña de la DB(contrasena)
                            System.out.println("Access");
                            N_Intentos = 0;
                            //TIENE QUE IR EL MENU Y DESACTIVAR EL LOGIN
                            /*
                            *
                            *  ojo
                            *
                            */
                        }
                    }
                }
                if(this.isVisible() && N_Intentos < 3){
                    N_Intentos ++;
                    JOptionPane.showMessageDialog(null, "Intento: "+N_Intentos,"Inicio de seccion",JOptionPane.INFORMATION_MESSAGE);
                }
                my_connection.close();
            } catch (SQLException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya no tiene mas intentos","Seccion Cerrada",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void lbPasswordRecoveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPasswordRecoveryMouseClicked
        // TODO add your handling code here:
        boolean Bandera = false;
        String in = JOptionPane.showInputDialog(lbPasswordRecovery,"INGRESE EL CORREO.","RECUPERACION DE CONTRASEÑA Y USUARIO",JOptionPane.QUESTION_MESSAGE);
        if(in!=null){
            try {
                //Se crea la coneccion
                Connection my_connection = (new MySqlConnection().conetMysql());//PONER LA BASE DE DATOS(proyecto_ppr)
                //Se crea objeto del tipo statement
                Statement my_statement = my_connection.createStatement();
                //Ejecutar sentencia Sql
                ResultSet my_resultSet = my_statement.executeQuery("SELECT * FROM "+Tabla);//SE PONE LA TABLA DE USUARIOS (usuario)
                //Recorrer resultset
                while(my_resultSet.next()){
                    if(my_resultSet.getString("correoUsuario").equals(in)){
                        JOptionPane.showMessageDialog(null, "SU USUARIO ES: "+my_resultSet.getString("users")+"\nSU CONTRASEÑA ES: "+my_resultSet.getString("contraseniaUsuario"),"RECUPERACION DE CONTRASEÑA Y USUARIO",JOptionPane.INFORMATION_MESSAGE);
                        Bandera = true;
                        break;
                    }
                }
                if(!Bandera)JOptionPane.showMessageDialog(null, "CORREO NO ENCONTRADO","RECUPERACION DE CONTRASEÑA Y USUARIO",JOptionPane.INFORMATION_MESSAGE);
                my_connection.close();
            } catch (SQLException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_lbPasswordRecoveryMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbCrearUser;
    private javax.swing.JLabel lbPasswordRecovery;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    
    private int N_Intentos;
    private final String BaseDatos = "PROYECTOPPR";
    private final String Tabla = "REGISTROUSUARIO";
    
    private final static String idPresentacion = "laminaPresentacion";
    private final static String idFacebook = "laminaFacebook";
    private final static String idCrearUsuario = "laminaUserCreate";
}
