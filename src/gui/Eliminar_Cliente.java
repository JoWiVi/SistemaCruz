
package gui;

import javax.swing.JOptionPane;
import logica.Cliente;
import percistencia.ControladorCliente;

public class Eliminar_Cliente extends javax.swing.JInternalFrame {
    private ControladorCliente cc;
    public Eliminar_Cliente() {
        initComponents();
        cc = new ControladorCliente();
    }
    public void limpiarcampos(){
        jTxt_Buscar_Cli.setText("");
        jTxt_IdCliente_Eli.setText("");
        jTxt_NombreCli_Eli.setText("");
        jTxt_ApPaternoCli_Eli.setText("");
        jTxt_ApMaternoCli_Eli.setText("");
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
        jTxt_NombreCli_Eli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxt_ApMaternoCli_Eli = new javax.swing.JTextField();
        jTxt_ApPaternoCli_Eli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxt_IdCliente_Eli = new javax.swing.JTextField();
        jBtn_Eliminar_Cli = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ELIMINAR CLIENTE");

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Cliente"));

        jLabel3.setText("Nombre:");

        jTxt_NombreCli_Eli.setEditable(false);

        jLabel5.setText("Ap. Paterno:");

        jLabel2.setText("Ap. Materno:");

        jTxt_ApMaternoCli_Eli.setEditable(false);

        jTxt_ApPaternoCli_Eli.setEditable(false);

        jLabel4.setText("Id Cliente:");

        jTxt_IdCliente_Eli.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxt_IdCliente_Eli)
                    .addComponent(jTxt_NombreCli_Eli)
                    .addComponent(jTxt_ApMaternoCli_Eli)
                    .addComponent(jTxt_ApPaternoCli_Eli))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxt_IdCliente_Eli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxt_NombreCli_Eli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxt_ApPaternoCli_Eli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTxt_ApMaternoCli_Eli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jBtn_Eliminar_Cli.setText("Eliminar");
        jBtn_Eliminar_Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Eliminar_CliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jBtn_Eliminar_Cli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtn_Eliminar_Cli)
                .addGap(9, 9, 9))
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
            jTxt_IdCliente_Eli.setText(String.valueOf(temp.getId_cliente()));
            jTxt_NombreCli_Eli.setText(temp.getNombre_cliente());
            jTxt_ApPaternoCli_Eli.setText(temp.getAppaterno_cliente());
            jTxt_ApMaternoCli_Eli.setText(temp.getApmaterno_cliente());
        }else{
            limpiarcampos();
            JOptionPane.showMessageDialog(rootPane, "Cliente no encontrado, verificar los datos","Error de busqueda",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtn_Buscar_CliActionPerformed

    private void jBtn_Eliminar_CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Eliminar_CliActionPerformed
        // Obtener el ID del usuario desde el campo de texto
    String idClienteText = jTxt_IdCliente_Eli.getText();  // El campo donde almacenas el ID
    
    // Verificar que el campo de ID no esté vacío
    if (!idClienteText.isEmpty()) {
        try {
            // Convertir el ID a un entero
            int idCliente = Integer.parseInt(idClienteText);
            // Crear un objeto Usuario con el ID a eliminar
            Cliente cliente = new Cliente();
            cliente.setId_cliente(idCliente);
            // Mostrar un cuadro de confirmación antes de proceder
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, 
                    "¿Estás seguro que deseas eliminar al cliente con ID: " + idCliente + "?", 
                    "Confirmar eliminación", 
                    JOptionPane.YES_NO_OPTION);
            // Si el usuario confirma la eliminación
            if (confirmacion == JOptionPane.YES_OPTION) {
                // Llamar al método para borrar el usuario en el controlador
                if (cc.borrarCliente(cliente)) {
                    JOptionPane.showMessageDialog(rootPane, "Cliente eliminado con éxito", "Eliminación Cliente", JOptionPane.INFORMATION_MESSAGE);
                    limpiarcampos();  // Método para limpiar los campos del formulario
                } else {
                    limpiarcampos();
                    JOptionPane.showMessageDialog(rootPane, "Error al eliminar el Cliente. Verifica el ID", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            limpiarcampos();
            // Si el ID no es un número válido, mostrar un mensaje de error
            JOptionPane.showMessageDialog(rootPane, "El ID ingresado no es válido", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        limpiarcampos();
        // Mostrar mensaje si el campo de ID está vacío
        JOptionPane.showMessageDialog(rootPane, "Por favor, ingresa el ID del cliente a eliminar", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jBtn_Eliminar_CliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Buscar_Cli;
    private javax.swing.JButton jBtn_Eliminar_Cli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTxt_ApMaternoCli_Eli;
    private javax.swing.JTextField jTxt_ApPaternoCli_Eli;
    private javax.swing.JTextField jTxt_Buscar_Cli;
    private javax.swing.JTextField jTxt_IdCliente_Eli;
    private javax.swing.JTextField jTxt_NombreCli_Eli;
    // End of variables declaration//GEN-END:variables
}
