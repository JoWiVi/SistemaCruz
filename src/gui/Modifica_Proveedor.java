
package gui;

import javax.swing.JOptionPane;
import logica.Proveedor;
import percistencia.ControladorProveedor;

public class Modifica_Proveedor extends javax.swing.JInternalFrame {
    private ControladorProveedor cpro;
    public Modifica_Proveedor() {
        initComponents();
        cpro = new ControladorProveedor();
    }
    public void limpiarcampos(){
        jTxt_Buscar_Prove.setText("");
        jTxt_Mo_IdProveedor_Prove.setText("");
        jTxt_Mo_Nombre_Prove.setText("");
        jTxt_Mo_Contacto_Prove.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtn_Modificar_Prove = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxt_Buscar_Prove = new javax.swing.JTextField();
        jBtn_Buscar_Pro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxt_Mo_IdProveedor_Prove = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxt_Mo_Nombre_Prove = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxt_Mo_Contacto_Prove = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MODIFICAR PROVEEDOR");

        jBtn_Modificar_Prove.setText("Modificar");
        jBtn_Modificar_Prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Modificar_ProveActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Proveedor"));

        jLabel1.setText("Nom. Prove.:");

        jBtn_Buscar_Pro.setText("Buscar");
        jBtn_Buscar_Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Buscar_ProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxt_Buscar_Prove, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtn_Buscar_Pro)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jTxt_Buscar_Prove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jBtn_Buscar_Pro))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Proveedor"));

        jLabel3.setText("Id Prove.:");

        jTxt_Mo_IdProveedor_Prove.setEditable(false);

        jLabel5.setText("Nombre:");

        jLabel4.setText("Contacto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTxt_Mo_IdProveedor_Prove))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxt_Mo_Nombre_Prove)
                            .addComponent(jTxt_Mo_Contacto_Prove))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxt_Mo_IdProveedor_Prove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxt_Mo_Nombre_Prove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxt_Mo_Contacto_Prove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jBtn_Modificar_Prove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jBtn_Modificar_Prove)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_Buscar_ProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Buscar_ProActionPerformed
        Proveedor temp = new Proveedor();
        temp.setNombre_proveedor(jTxt_Buscar_Prove.getText());
        cpro.setProveedor(temp);

        if(cpro.mostrarProveedor()){
            temp = cpro.getProveedor();
            System.out.println(temp.getNombre_proveedor());
            jTxt_Mo_IdProveedor_Prove.setText(String.valueOf(temp.getId_proveedor()));
            jTxt_Mo_Nombre_Prove.setText(temp.getNombre_proveedor());
            jTxt_Mo_Contacto_Prove.setText(temp.getContacto_proveedor());
        }else{
            limpiarcampos();
            JOptionPane.showMessageDialog(rootPane, "Proveedor no encontrado, verificar los datos","Error de busqueda",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtn_Buscar_ProActionPerformed

    private void jBtn_Modificar_ProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Modificar_ProveActionPerformed
       Proveedor temp;
       if(cpro.getProveedor() != null){
           temp = cpro.getProveedor();
           String nuevoNombreProveedor = jTxt_Mo_Nombre_Prove.getText();
           temp.setNombre_proveedor(nuevoNombreProveedor);
           String nuevoContactoProveedor = jTxt_Mo_Contacto_Prove.getText();
           temp.setContacto_proveedor(nuevoContactoProveedor);
         if(cpro.actualizarProve(temp)){
            JOptionPane.showMessageDialog(rootPane, "Datos actualizados con éxito", "Actualización Proveedor", JOptionPane.INFORMATION_MESSAGE);
            limpiarcampos(); 
         }else{
             limpiarcampos();
             JOptionPane.showMessageDialog(rootPane, "Error al actualizar los datos, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
         }  
       }else{
           limpiarcampos();
           JOptionPane.showMessageDialog(rootPane, "Error al actualizar los datos, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jBtn_Modificar_ProveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Buscar_Pro;
    private javax.swing.JButton jBtn_Modificar_Prove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTxt_Buscar_Prove;
    private javax.swing.JTextField jTxt_Mo_Contacto_Prove;
    private javax.swing.JTextField jTxt_Mo_IdProveedor_Prove;
    private javax.swing.JTextField jTxt_Mo_Nombre_Prove;
    // End of variables declaration//GEN-END:variables
}
