
package gui;

import javax.swing.JOptionPane;
import logica.Producto;
import percistencia.ControladorProducto;

public class Modifica_Producto extends javax.swing.JInternalFrame {
    private ControladorProducto cp;
    public Modifica_Producto() {
        initComponents();
        cp = new ControladorProducto();
    }
    public void limpiarcampos(){
        jTxt_Buscar_Pro.setText("");
        jTxt_Mo_Codigo_Pro.setText("");
        jTxt_Mo_Nombre_Pro.setText("");
        jTxt_Mo_Marca_Pro.setText("");
        jTxt_Mo_Precio_Pro.setText("");
        jTxt_Mo_Cantidad_Pro.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtn_Modificar_Pro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTxt_Buscar_Pro = new javax.swing.JTextField();
        jBtn_Buscar_Pro1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTxt_Mo_Codigo_Pro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxt_Mo_Nombre_Pro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxt_Mo_Marca_Pro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxt_Mo_Precio_Pro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTxt_Mo_Cantidad_Pro = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MODIFICAR PRODUCTO");

        jBtn_Modificar_Pro.setText("Modificar");
        jBtn_Modificar_Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Modificar_ProActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Producto"));

        jLabel9.setText("Nom. Pro.:");

        jBtn_Buscar_Pro1.setText("Buscar");
        jBtn_Buscar_Pro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Buscar_Pro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxt_Buscar_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtn_Buscar_Pro1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(jTxt_Buscar_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jBtn_Buscar_Pro1))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Producto"));

        jLabel10.setText("Codigo:");

        jTxt_Mo_Codigo_Pro.setEditable(false);

        jLabel11.setText("Nombre:");

        jLabel12.setText("Marca:");

        jLabel13.setText("Precio:");

        jLabel14.setText("Cantidad:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTxt_Mo_Codigo_Pro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxt_Mo_Nombre_Pro)
                            .addComponent(jTxt_Mo_Marca_Pro)
                            .addComponent(jTxt_Mo_Precio_Pro)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxt_Mo_Cantidad_Pro)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTxt_Mo_Codigo_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTxt_Mo_Nombre_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTxt_Mo_Marca_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTxt_Mo_Precio_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTxt_Mo_Cantidad_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jBtn_Modificar_Pro)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtn_Modificar_Pro)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_Modificar_ProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Modificar_ProActionPerformed
       Producto temp;
    if(cp.getProducto() != null){
        temp = cp.getProducto();
        String nuevoNombreProducto = jTxt_Mo_Nombre_Pro.getText();
        String nuevaMarcaProducto = jTxt_Mo_Marca_Pro.getText();
        String nuevoPrecioProducto = jTxt_Mo_Precio_Pro.getText();
        String nuevaCantidadProducto = jTxt_Mo_Cantidad_Pro.getText();

        // Validación de campos vacíos
        if (nuevoNombreProducto.isEmpty() || nuevaMarcaProducto.isEmpty() || nuevoPrecioProducto.isEmpty() || nuevaCantidadProducto.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, complete todos los campos antes de modificar el producto.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si algún campo está vacío
        }

        try {
            // Convertir el precio y la cantidad a números
            double precio = Double.parseDouble(nuevoPrecioProducto);
            int ncantidad = Integer.parseInt(nuevaCantidadProducto);

            // Establecer los valores en el objeto Producto
            temp.setNombre_producto(nuevoNombreProducto);
            temp.setMarca_producto(nuevaMarcaProducto);
            temp.setPrecio_producto(precio);
            temp.setCantidad_producto(ncantidad);
            
            // Actualizar el producto
            if(cp.actualizarPro(temp)){
                JOptionPane.showMessageDialog(rootPane, "Datos actualizados con éxito", "Actualización Producto", JOptionPane.INFORMATION_MESSAGE);
                limpiarcampos(); 
            } else {
                limpiarcampos();
                JOptionPane.showMessageDialog(rootPane, "Error al actualizar los datos, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }  
        } catch (NumberFormatException e) {
            limpiarcampos();
            // Mensaje de error si la conversión falla
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese valores válidos para el precio y la cantidad.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        limpiarcampos();
        JOptionPane.showMessageDialog(rootPane, "Error al actualizar los datos, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jBtn_Modificar_ProActionPerformed

    private void jBtn_Buscar_Pro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Buscar_Pro1ActionPerformed
        Producto temp = new Producto();
        temp.setNombre_producto(jTxt_Buscar_Pro.getText());
        cp.setProducto(temp);

        if(cp.mostrarProducto()){
            temp = cp.getProducto();
            System.out.println(temp.getNombre_producto());
            jTxt_Mo_Codigo_Pro.setText(temp.getCodigo_producto());
            jTxt_Mo_Nombre_Pro.setText(temp.getNombre_producto());
            jTxt_Mo_Marca_Pro.setText(temp.getMarca_producto());
            jTxt_Mo_Precio_Pro.setText(String.valueOf(temp.getPrecio_producto()));
            jTxt_Mo_Cantidad_Pro.setText(String.valueOf(temp.getCantidad_producto()));
        }else{
            limpiarcampos();
            JOptionPane.showMessageDialog(rootPane, "Producto no encontrado, verificar los datos","Error de busqueda",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtn_Buscar_Pro1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Buscar_Pro1;
    private javax.swing.JButton jBtn_Modificar_Pro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTxt_Buscar_Pro;
    private javax.swing.JTextField jTxt_Mo_Cantidad_Pro;
    private javax.swing.JTextField jTxt_Mo_Codigo_Pro;
    private javax.swing.JTextField jTxt_Mo_Marca_Pro;
    private javax.swing.JTextField jTxt_Mo_Nombre_Pro;
    private javax.swing.JTextField jTxt_Mo_Precio_Pro;
    // End of variables declaration//GEN-END:variables
}
