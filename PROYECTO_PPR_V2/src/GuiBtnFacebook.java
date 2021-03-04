
import java.awt.CardLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
public class GuiBtnFacebook extends javax.swing.JPanel {

    /**
     * Creates new form GuiBtnFacebook
     */
    public GuiBtnFacebook(javax.swing.JPanel contenedor) {
        initComponents();
        this.contenedor=contenedor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtUsuarioFacebook = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        spItens = new javax.swing.JSpinner();
        lbMessengerScrip = new javax.swing.JLabel();
        lbMessengerBD = new javax.swing.JLabel();
        btnRunFacebook = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 180, 180));
        jLabel3.setText("Nombre de Grupo");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        txtUsuarioFacebook.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioFacebook.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtUsuarioFacebook.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuarioFacebook.setText("Ingrese Grupo a Buscar");
        txtUsuarioFacebook.setBorder(null);
        txtUsuarioFacebook.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFacebookFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFacebookFocusLost(evt);
            }
        });
        add(txtUsuarioFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, 10));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(58, 180, 180));
        jLabel4.setText("Cantidad de Paginas");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        spItens.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        spItens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        add(spItens, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 50, 30));

        lbMessengerScrip.setForeground(new java.awt.Color(102, 102, 102));
        lbMessengerScrip.setText("Ejecucion de Scrip De Python");
        add(lbMessengerScrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, 20));

        lbMessengerBD.setForeground(new java.awt.Color(102, 102, 102));
        lbMessengerBD.setText("Guardando en Base de Datos");
        add(lbMessengerBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, 20));

        btnRunFacebook.setBackground(new java.awt.Color(255, 255, 255));
        btnRunFacebook.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRunFacebook.setForeground(new java.awt.Color(102, 102, 102));
        btnRunFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mine-50.png"))); // NOI18N
        btnRunFacebook.setBorderPainted(false);
        btnRunFacebook.setContentAreaFilled(false);
        btnRunFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRunFacebookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRunFacebookMouseExited(evt);
            }
        });
        add(btnRunFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 120, 50));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back-40.png"))); // NOI18N
        btnBack.setToolTipText("");
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 76, 213));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FACEBOOK");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/facebook-100.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 100, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioFacebookFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFacebookFocusGained
        // TODO add your handling code here:
        if(txtUsuarioFacebook.getText().equals("Ingrese Usuario a Buscar")){
            txtUsuarioFacebook.setText("");
        }
    }//GEN-LAST:event_txtUsuarioFacebookFocusGained

    private void txtUsuarioFacebookFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFacebookFocusLost
        // TODO add your handling code here:
        if(txtUsuarioFacebook.getText().equals("")){
            txtUsuarioFacebook.setText("Ingrese Usuario a Buscar");
        }
    }//GEN-LAST:event_txtUsuarioFacebookFocusLost

    private void btnRunFacebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunFacebookMouseEntered
        // TODO add your handling code here:
        btnRunFacebook.setText("Run");
    }//GEN-LAST:event_btnRunFacebookMouseEntered

    private void btnRunFacebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunFacebookMouseExited
        // TODO add your handling code here:
        btnRunFacebook.setText("");
    }//GEN-LAST:event_btnRunFacebookMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout carta = (CardLayout)contenedor.getLayout();
        carta.show(contenedor, idJPMenu);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRunFacebook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbMessengerBD;
    private javax.swing.JLabel lbMessengerScrip;
    private javax.swing.JSpinner spItens;
    private javax.swing.JTextField txtUsuarioFacebook;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel contenedor;
    private final static String idJPMenu = "laminaMenu";
    private String UsuarioLogin;
}
