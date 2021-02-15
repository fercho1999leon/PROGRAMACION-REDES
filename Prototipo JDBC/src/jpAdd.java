
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class jpAdd extends javax.swing.JPanel {

    /**
     * Creates new form jpAdd
     */
    public jpAdd(String titulo,ActionListener event) {
        initComponents();
        jlTitulo.setText(titulo);
        btnSave.addActionListener(event);
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
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        txtEdad = new javax.swing.JFormattedTextField();
        txtDNI = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 180, 180));
        jLabel1.setText("Nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("INGRESE NOMBRES");
        txtNombre.setBorder(null);
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 280, 30));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 320, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add-30.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 30, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 180, 180));
        jLabel3.setText("Apellido:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/apellido-30.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 30, 30));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtApellido.setText("INGRESE APELLIDOS");
        txtApellido.setBorder(null);
        add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 280, 30));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 320, 10));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(58, 180, 180));
        jLabel5.setText("DNI:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cedula-30.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 30, 30));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 320, 10));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(58, 180, 180));
        jLabel7.setText("Edad:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edad-30.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 30, 30));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 320, 10));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(58, 180, 180));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar-70.png"))); // NOI18N
        btnSave.setContentAreaFilled(false);
        btnSave.setDefaultCapable(false);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 190, 70));

        jlTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(58, 180, 180));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 170, 20));

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setBorder(null);
        txtEdad.setColumns(3);
        txtEdad.setForeground(new java.awt.Color(153, 153, 153));
        txtEdad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtEdad.setText("INGRESE EDAD");
        txtEdad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 280, 30));

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setBorder(null);
        txtDNI.setForeground(new java.awt.Color(153, 153, 153));
        txtDNI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtDNI.setText("INGRESE DNI");
        txtDNI.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 280, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        // TODO add your handling code here:
        btnSave.setText("GUARDAR");
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        // TODO add your handling code here:
        btnSave.setText("");
    }//GEN-LAST:event_btnSaveMouseExited

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JFormattedTextField getTxtDNI() {
        return txtDNI;
    }

    public void setTxtDNI(JFormattedTextField txtDNI) {
        this.txtDNI = txtDNI;
    }

    public JFormattedTextField getTxtEdad() {
        return txtEdad;
    }

    public void setTxtEdad(JFormattedTextField txtEdad) {
        this.txtEdad = txtEdad;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JFormattedTextField txtDNI;
    private javax.swing.JFormattedTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}