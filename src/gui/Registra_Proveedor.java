
package gui;

import javax.swing.JOptionPane;
import percistencia.ControladorProveedor;

public class Registra_Proveedor extends javax.swing.JInternalFrame {
    private ControladorProveedor crp;
    public Registra_Proveedor() {
        initComponents();
        crp = new ControladorProveedor();
    }
    public void limpiarcampos(){
        jTxt_Nombre_Prove_Re.setText("");
        jTxt_Contacto_Prove_Re.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTxt_Nombre_Prove_Re = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxt_Contacto_Prove_Re = new javax.swing.JTextField();
        jBtn_Registrar_Prove = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRO PROVEEDOR");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Contacto:");

        jBtn_Registrar_Prove.setText("Registrar");
        jBtn_Registrar_Prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Registrar_ProveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxt_Contacto_Prove_Re)
                    .addComponent(jTxt_Nombre_Prove_Re))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jBtn_Registrar_Prove)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxt_Nombre_Prove_Re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxt_Contacto_Prove_Re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtn_Registrar_Prove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_Registrar_ProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Registrar_ProveActionPerformed
       String nombre_proveedor,contacto_proveedor;
        nombre_proveedor = jTxt_Nombre_Prove_Re.getText();
        contacto_proveedor = jTxt_Contacto_Prove_Re.getText();
        
        if(!nombre_proveedor.equals("") && !contacto_proveedor.equals("")){
           if(crp.insertarProve( nombre_proveedor, contacto_proveedor)){
               limpiarcampos();
               JOptionPane.showMessageDialog(rootPane, "Se registro Proveedor");
           }else{
               limpiarcampos();
               JOptionPane.showMessageDialog(rootPane, "Error al crear Proveedor");
         }
       }else {
            limpiarcampos();
            JOptionPane.showMessageDialog(rootPane, "Tiene que llenar los campos");
        }
    }//GEN-LAST:event_jBtn_Registrar_ProveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Registrar_Prove;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTxt_Contacto_Prove_Re;
    private javax.swing.JTextField jTxt_Nombre_Prove_Re;
    // End of variables declaration//GEN-END:variables
}
