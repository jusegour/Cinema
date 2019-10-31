/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Conexion;
import controlador.ControladorCliente;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Estudiante
 */
public class GUI_RegistrarCliente extends javax.swing.JFrame {

    Conexion con=new Conexion();
    ControladorCliente ctrl =new ControladorCliente();
    Cliente c=new Cliente();
    public GUI_RegistrarCliente() {
        initComponents();
        lbltipo.setVisible(false);
        lblidentificacion.setVisible(false);
        lblnombres.setVisible(false);
        lblusuario.setVisible(false);
        lblcontraseña.setVisible(false);
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
        combo_identificacion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lbltipo = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblidentificacion = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo de Identificacion");

        combo_identificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "VIP", "Oro", "Platino" }));

        jLabel2.setText("Numero de Identificacion");

        txtidentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentificacionKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombres");

        jLabel4.setText("Usuario");

        jLabel5.setText("Contraseña");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lbltipo.setForeground(new java.awt.Color(255, 0, 0));
        lbltipo.setText("*Campo requerido");

        lblnombres.setForeground(new java.awt.Color(255, 0, 0));
        lblnombres.setText("*Campo requerido");

        lblidentificacion.setForeground(new java.awt.Color(255, 0, 0));
        lblidentificacion.setText("*Campo requerido");

        lblusuario.setForeground(new java.awt.Color(255, 0, 0));
        lblusuario.setText("*Campo requerido");

        lblcontraseña.setForeground(new java.awt.Color(255, 0, 0));
        lblcontraseña.setText("*Campo requerido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(combo_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidentificacion)
                                    .addComponent(txtnombres)
                                    .addComponent(txtusuario)
                                    .addComponent(txtcontraseña))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltipo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(lblidentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblnombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcontraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnRegistrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combo_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltipo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidentificacion))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombres))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusuario))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblcontraseña)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentificacionKeyTyped
        char validar=evt.getKeyChar();
        if (validar<'0') {
            evt.consume();
        }
        if (Character.isLetter(validar)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtidentificacionKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (combo_identificacion.getSelectedIndex()==0) {
            lbltipo.setVisible(true);
        }else{
        lbltipo.setVisible(false);
        }
        if (txtidentificacion.getText().isEmpty()) {
            lblidentificacion.setVisible(true);
        }else{
        lblidentificacion.setVisible(false);
        }
        if (txtnombres.getText().isEmpty()) {
            lblnombres.setVisible(true);
        }else{
        lblnombres.setVisible(false);
        }
        if (txtusuario.getText().isEmpty()) {
            lblusuario.setVisible(true);
        }else{
        lblusuario.setVisible(false);
        }
        if (txtcontraseña.getText().isEmpty()) {
            lblcontraseña.setVisible(true);
        }else{
        lblcontraseña.setVisible(false);
        }
        
        if (combo_identificacion.getSelectedIndex()!=0 && !txtidentificacion.getText().isEmpty() && !txtnombres.getText().isEmpty() && !txtusuario.getText().isEmpty() && !txtcontraseña.getText().isEmpty()) {
          c.setTipo_identificacion(combo_identificacion.getSelectedItem().toString());
          c.setNro_identificacion(txtidentificacion.getText());
          c.setNombre(txtnombres.getText());
          c.setUsuario(txtusuario.getText());
          String pass=new String(txtcontraseña.getText());
          c.setPassword(pass);
          try{
          con.conectarme();
          ctrl.setCon(con.getCon());
              if (ctrl.registrar_cliente(c)) {
                  JOptionPane.showMessageDialog(null, "Registrado Exitosamente");
              }else{
              JOptionPane.showMessageDialog(null, "Error al registrarse");
              }
          }catch(SQLException e){
              System.out.println(e.toString());
          }
        }
       
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_RegistrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> combo_identificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblidentificacion;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}