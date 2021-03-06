
import complementos.RunJavaAndPython;
import complementos.SaveSVGformatInSQLofInstagram;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
public class GuiBtnInstagram extends javax.swing.JPanel {

    /**
     * Creates new form GuiBtnInstagram
     */
    public GuiBtnInstagram(javax.swing.JPanel contenedor) {
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

        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuarioInstagran = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spItens = new javax.swing.JSpinner();
        lbMessengerScrip = new javax.swing.JLabel();
        lbMessengerBD = new javax.swing.JLabel();
        btnRunInstagram = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel2.setForeground(new java.awt.Color(190, 45, 142));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INSTAGRAM");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/instagram-100.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 100, 100));

        txtUsuarioInstagran.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioInstagran.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtUsuarioInstagran.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuarioInstagran.setText("Ingrese Usuario a Buscar");
        txtUsuarioInstagran.setBorder(null);
        txtUsuarioInstagran.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioInstagranFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioInstagranFocusLost(evt);
            }
        });
        add(txtUsuarioInstagran, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 180, 180));
        jLabel3.setText("Nombre de Usuario");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(58, 180, 180));
        jLabel4.setText("Cantidad de Itens");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        spItens.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        spItens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        add(spItens, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 50, 30));

        lbMessengerScrip.setForeground(new java.awt.Color(102, 102, 102));
        lbMessengerScrip.setText("Ejecucion de Scrip De Python");
        add(lbMessengerScrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, 20));

        lbMessengerBD.setForeground(new java.awt.Color(102, 102, 102));
        lbMessengerBD.setText("Guardando en Base de Datos");
        add(lbMessengerBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, 20));

        btnRunInstagram.setBackground(new java.awt.Color(255, 255, 255));
        btnRunInstagram.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRunInstagram.setForeground(new java.awt.Color(102, 102, 102));
        btnRunInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mine-50.png"))); // NOI18N
        btnRunInstagram.setBorderPainted(false);
        btnRunInstagram.setContentAreaFilled(false);
        btnRunInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRunInstagramMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRunInstagramMouseExited(evt);
            }
        });
        btnRunInstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunInstagramActionPerformed(evt);
            }
        });
        add(btnRunInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 120, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, 10));
    }// </editor-fold>//GEN-END:initComponents

    public String getUsuarioLogin() {
        return UsuarioLogin;
    }

    public void setUsuarioLogin(String UsuarioLogin) {
        this.UsuarioLogin = UsuarioLogin;
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout carta = (CardLayout)contenedor.getLayout();
        carta.show(contenedor, idJPMenu);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUsuarioInstagranFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioInstagranFocusGained
        // TODO add your handling code here:
        if(txtUsuarioInstagran.getText().equals("Ingrese Usuario a Buscar")){
            txtUsuarioInstagran.setText("");
        }
    }//GEN-LAST:event_txtUsuarioInstagranFocusGained

    private void txtUsuarioInstagranFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioInstagranFocusLost
        // TODO add your handling code here:
        if(txtUsuarioInstagran.getText().equals("")){
            txtUsuarioInstagran.setText("Ingrese Usuario a Buscar");
        }
    }//GEN-LAST:event_txtUsuarioInstagranFocusLost

    private void btnRunInstagramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunInstagramMouseEntered
        // TODO add your handling code here:
        btnRunInstagram.setText("Run");
    }//GEN-LAST:event_btnRunInstagramMouseEntered

    private void btnRunInstagramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunInstagramMouseExited
        // TODO add your handling code here:
        btnRunInstagram.setText("");
    }//GEN-LAST:event_btnRunInstagramMouseExited

    private void btnRunInstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunInstagramActionPerformed
        // TODO add your handling code here:
        String name = txtUsuarioInstagran.getText();
        String itens = String.valueOf((int)spItens.getValue());
        RunJavaAndPython obj = new RunJavaAndPython(9999,name,itens);
        Runnable contPython = obj;
        Thread hilo = new Thread(contPython);
        hilo.start();
        try {
            Process p = Runtime.getRuntime().exec("cmd /c py src/scriptPython/INSTAGRAM.py");
            lbMessengerScrip.setForeground(new java.awt.Color(96,229,117));
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String aux = br.readLine();
            while (aux != null) {
                // Se escribe la linea en pantalla
                System.out.println(aux);

                // y se lee la siguiente.
                aux = br.readLine();
            }
            Thread.sleep(8000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        SaveSVGformatInSQLofInstagram OBJ = new SaveSVGformatInSQLofInstagram("src/scriptPython/data/Instagram.csv");
        OBJ.start(UsuarioLogin);
        lbMessengerBD.setForeground(new java.awt.Color(96,229,117));
    }//GEN-LAST:event_btnRunInstagramActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRunInstagram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbMessengerBD;
    private javax.swing.JLabel lbMessengerScrip;
    private javax.swing.JSpinner spItens;
    private javax.swing.JTextField txtUsuarioInstagran;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel contenedor;
    private final static String idJPMenu = "laminaMenu";
    private String UsuarioLogin;
}
