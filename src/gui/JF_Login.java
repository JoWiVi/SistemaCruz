package gui;

import javax.swing.JOptionPane;
import logica.Usuario;
import percistencia.ControladorLogin;

public class JF_Login extends javax.swing.JFrame {
private ControladorLogin crl;
    public JF_Login() {
        initComponents();
        crl = new ControladorLogin();
        this.setLocationRelativeTo(null);
    }
    public void limpiarcampos(){
        jtxt_Usuario.setText("");
        jPass_Contraseña.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JBt_Ingresar = new javax.swing.JButton();
        jtxt_Usuario = new javax.swing.JTextField();
        jPass_Contraseña = new javax.swing.JPasswordField();
        jB_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Validación de Usuario");

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        JBt_Ingresar.setText("Ingresar");
        JBt_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBt_IngresarActionPerformed(evt);
            }
        });

        jPass_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPass_ContraseñaActionPerformed(evt);
            }
        });

        jB_Salir.setText("Salir");
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JBt_Ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_Salir)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPass_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPass_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBt_Ingresar)
                    .addComponent(jB_Salir))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jPass_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPass_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPass_ContraseñaActionPerformed

    private void JBt_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBt_IngresarActionPerformed
        String nombre_usuario;
        String contraseña_usuario;
        //String rol_empleado;
        Usuario usuario;
        
        if(!jtxt_Usuario.getText().equals("") && jPass_Contraseña.getPassword().length>0){
            nombre_usuario = jtxt_Usuario.getText();
            contraseña_usuario = new String(jPass_Contraseña.getPassword());
            usuario = crl.validarUsuario(nombre_usuario, contraseña_usuario);
            
            if(usuario != null){
            if(usuario.getRol_empleado().equalsIgnoreCase("Administrador")) {
                this.setVisible(false);
                new JF_Menu_Admin().setVisible(true);
            } else if(usuario.getRol_empleado().equalsIgnoreCase("Vendedor")) {
                this.setVisible(false);
                new JF_Menu_Vendedor().setVisible(true);
            }
        } else {
                limpiarcampos();
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos", "Login", JOptionPane.ERROR_MESSAGE);
        }
    } else {
            limpiarcampos();
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar usuario y contraseña", "Login", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_JBt_IngresarActionPerformed

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
        // Cerrar completamente el programa
        System.exit(0);
        // Cerrar solo la ventana actual
        //this.dispose();:
    }//GEN-LAST:event_jB_SalirActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBt_Ingresar;
    private javax.swing.JButton jB_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPass_Contraseña;
    private javax.swing.JTextField jtxt_Usuario;
    // End of variables declaration//GEN-END:variables
}
