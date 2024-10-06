
package gui;

import javax.swing.JOptionPane;
import logica.Cliente;
import percistencia.ControladorCliente;

public class Modificar_Cliente extends javax.swing.JInternalFrame {
    private ControladorCliente cc;
    public Modificar_Cliente() {
        initComponents();
        cc = new ControladorCliente();
    }
    public void limpiarcampos(){
        jTxt_Buscar_Cli.setText("");
        jTxt_Mo_Nombre_Cli.setText("");
        jTxt_Mo_ApPaterno_Cli.setText("");
        jTxt_Mo_ApMaterno_Cli.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxt_Buscar_Cli = new javax.swing.JTextField();
        jBtn_Buscar_Cli = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxt_Mo_Nombre_Cli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxt_Mo_ApMaterno_Cli = new javax.swing.JTextField();
        jTxt_Mo_ApPaterno_Cli = new javax.swing.JTextField();
        jBtn_Modificar_Cli = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MODIFICAR CLIENTE");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente"));

        jLabel1.setText("Cliente:");

        jBtn_Buscar_Cli.setText("Buscar");
        jBtn_Buscar_Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Buscar_CliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxt_Buscar_Cli, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtn_Buscar_Cli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxt_Buscar_Cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_Buscar_Cli))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Cliente"));

        jLabel3.setText("Nombre:");

        jLabel5.setText("Ap. Paterno:");

        jLabel2.setText("Ap. Materno:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxt_Mo_Nombre_Cli, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jTxt_Mo_ApMaterno_Cli)
                    .addComponent(jTxt_Mo_ApPaterno_Cli))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxt_Mo_Nombre_Cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxt_Mo_ApPaterno_Cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTxt_Mo_ApMaterno_Cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtn_Modificar_Cli.setText("Modificar");
        jBtn_Modificar_Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Modificar_CliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jBtn_Modificar_Cli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtn_Modificar_Cli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_Buscar_CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Buscar_CliActionPerformed
        Cliente temp = new Cliente();
        temp.setNombre_cliente(jTxt_Buscar_Cli.getText());
        cc.setCliente(temp);

        if(cc.mostrarCliente()){
            temp = cc.getCliente();
            System.out.println(temp.getNombre_cliente());
            jTxt_Mo_Nombre_Cli.setText(temp.getNombre_cliente());
            jTxt_Mo_ApPaterno_Cli.setText(temp.getAppaterno_cliente());
            jTxt_Mo_ApMaterno_Cli.setText(temp.getApmaterno_cliente());
        }else{
            limpiarcampos();
            JOptionPane.showMessageDialog(rootPane, "Cliente no encontrado, verificar los datos","Error de busqueda",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtn_Buscar_CliActionPerformed

    private void jBtn_Modificar_CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Modificar_CliActionPerformed
        Cliente temp;
        if(cc.getCliente()!=null){
            temp = cc.getCliente();
            String nuevoNombreCliente = jTxt_Mo_Nombre_Cli.getText();
            temp.setNombre_cliente(nuevoNombreCliente);
            String nuevoApPaternoCliente = jTxt_Mo_ApPaterno_Cli.getText();
            temp.setNombre_cliente(nuevoApPaternoCliente);
            String nuevoApMaternoCliente = jTxt_Mo_ApMaterno_Cli.getText();
            temp.setNombre_cliente(nuevoApMaternoCliente);
        if(cc.actualizarCliente(temp)){
            JOptionPane.showMessageDialog(rootPane, "Datos actualizados con éxito", "Actualización Cliente", JOptionPane.INFORMATION_MESSAGE);
            limpiarcampos(); 
         }else{
            limpiarcampos();
             JOptionPane.showMessageDialog(rootPane, "Error al actualizar los datos, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE); 
       }
     }else{
            limpiarcampos();
           JOptionPane.showMessageDialog(rootPane, "Error cliente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jBtn_Modificar_CliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Buscar_Cli;
    private javax.swing.JButton jBtn_Modificar_Cli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTxt_Buscar_Cli;
    private javax.swing.JTextField jTxt_Mo_ApMaterno_Cli;
    private javax.swing.JTextField jTxt_Mo_ApPaterno_Cli;
    private javax.swing.JTextField jTxt_Mo_Nombre_Cli;
    // End of variables declaration//GEN-END:variables
}
