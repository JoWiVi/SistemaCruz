
package gui;

import javax.swing.JOptionPane;
import percistencia.ControladorProducto;

public class Registra_Producto extends javax.swing.JInternalFrame {
    private ControladorProducto crp;
    public Registra_Producto() {
        initComponents();
        crp = new ControladorProducto();
    }
    public void limpiarcampos(){
        jTxt_Codigo_Re.setText("");
        jTxt_Nombre_Pro_Re.setText("");
        jTxt_Marca_Pro_Re.setText("");
        jTxt_Precio_Pro_Re.setText("");
        jTxt_Cantidad_Pro_Re.setText("");
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
        jTxt_Codigo_Re = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxt_Nombre_Pro_Re = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxt_Marca_Pro_Re = new javax.swing.JTextField();
        jBtn_Registrar_Pro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxt_Precio_Pro_Re = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxt_Cantidad_Pro_Re = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRO PRODUCTOS");

        jLabel1.setText("Codigo:");

        jTxt_Codigo_Re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_Codigo_ReActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Marca:");

        jBtn_Registrar_Pro.setText("Registrar");
        jBtn_Registrar_Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Registrar_ProActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio:");

        jLabel5.setText("Cantidad:");

        jTxt_Cantidad_Pro_Re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_Cantidad_Pro_ReActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn_Registrar_Pro)
                    .addComponent(jTxt_Cantidad_Pro_Re, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTxt_Nombre_Pro_Re)
                        .addComponent(jTxt_Codigo_Re)
                        .addComponent(jTxt_Marca_Pro_Re, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addComponent(jTxt_Precio_Pro_Re)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxt_Codigo_Re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxt_Nombre_Pro_Re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxt_Marca_Pro_Re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxt_Precio_Pro_Re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt_Cantidad_Pro_Re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtn_Registrar_Pro)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxt_Codigo_ReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_Codigo_ReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_Codigo_ReActionPerformed

    private void jBtn_Registrar_ProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Registrar_ProActionPerformed
       String codigo_producto = jTxt_Codigo_Re.getText();
    String nombre_producto = jTxt_Nombre_Pro_Re.getText();
    String marca_producto = jTxt_Marca_Pro_Re.getText();
    String precio_producto = jTxt_Precio_Pro_Re.getText();
    String cantidad_producto = jTxt_Cantidad_Pro_Re.getText();
    
    // Verificar que todos los campos necesarios estén llenos
    if (codigo_producto.isEmpty() || nombre_producto.isEmpty() || marca_producto.isEmpty() ||
        precio_producto.isEmpty() || cantidad_producto.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Por favor, complete todos los campos antes de registrar el producto.");
        return; // Salir del método si algún campo está vacío
    }

    double precio_productode;
    int cantidad_productoen;

    try {
        // Intentar convertir los valores de texto a números
        precio_productode = Double.parseDouble(precio_producto);
        cantidad_productoen = Integer.parseInt(cantidad_producto);

        // Continuar con el proceso de registro si la conversión fue exitosa
        if (crp.insertarPro(codigo_producto, nombre_producto, marca_producto, precio_productode, cantidad_productoen)) {
            limpiarcampos();
            JOptionPane.showMessageDialog(rootPane, "Producto registrado exitosamente.");
        } else {
            limpiarcampos();
            JOptionPane.showMessageDialog(rootPane, "Error al crear producto. El código de producto ya existe.");
        }
    } catch (NumberFormatException e) {
        limpiarcampos();
        // Mostrar un mensaje si los valores de precio o cantidad no son válidos
        JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese un número válido para el precio y la cantidad.");
    }
    }//GEN-LAST:event_jBtn_Registrar_ProActionPerformed

    private void jTxt_Cantidad_Pro_ReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_Cantidad_Pro_ReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_Cantidad_Pro_ReActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Registrar_Pro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTxt_Cantidad_Pro_Re;
    private javax.swing.JTextField jTxt_Codigo_Re;
    private javax.swing.JTextField jTxt_Marca_Pro_Re;
    private javax.swing.JTextField jTxt_Nombre_Pro_Re;
    private javax.swing.JTextField jTxt_Precio_Pro_Re;
    // End of variables declaration//GEN-END:variables
}