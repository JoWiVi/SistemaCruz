
package gui;

import javax.swing.JOptionPane;
import percistencia.ControladorCliente;

public class Registro_Cliente extends javax.swing.JInternalFrame {
    private ControladorCliente cc;
    public Registro_Cliente() {
        initComponents();
        cc = new ControladorCliente();
    }
    public void limpiarcampos(){
        jTxt_Nombre_R.setText("");
        jTxt_Appaterno_R.setText("");
        jTxt_Apmaterno_R.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxt_Nombre_R = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxt_Appaterno_R = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxt_Apmaterno_R = new javax.swing.JTextField();
        jBtn_Registrar_Cli = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRO CLIENTES");

        jLabel1.setText("Nombre:");

        jLabel4.setText("Ap. Paterno:");

        jLabel2.setText("Ap. Materno:");

        jBtn_Registrar_Cli.setText("Registrar");
        jBtn_Registrar_Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Registrar_CliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxt_Nombre_R, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxt_Appaterno_R, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(jTxt_Apmaterno_R, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jBtn_Registrar_Cli)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTxt_Nombre_R, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxt_Appaterno_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt_Apmaterno_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBtn_Registrar_Cli)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_Registrar_CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Registrar_CliActionPerformed

        String nombre_cliente,appaterno_cliente, apmaterno_cliente;
        nombre_cliente = jTxt_Nombre_R.getText();
        appaterno_cliente = jTxt_Appaterno_R.getText();
        apmaterno_cliente = jTxt_Apmaterno_R.getText();
        if(!nombre_cliente.equals("") && !appaterno_cliente.equals("") && !apmaterno_cliente.equals("")){
           if(cc.insertarCliente( nombre_cliente, appaterno_cliente, apmaterno_cliente)){
               limpiarcampos();
               JOptionPane.showMessageDialog(rootPane, "Se registro Cliente");
           }else{
               limpiarcampos();
               JOptionPane.showMessageDialog(rootPane, "Error al crear Cliente");
         }
       }else {
            limpiarcampos();
            JOptionPane.showMessageDialog(rootPane, "Tiene que llenar los campos");
        }
    }//GEN-LAST:event_jBtn_Registrar_CliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Registrar_Cli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTxt_Apmaterno_R;
    private javax.swing.JTextField jTxt_Appaterno_R;
    private javax.swing.JTextField jTxt_Nombre_R;
    // End of variables declaration//GEN-END:variables
}
