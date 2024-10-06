
package gui;

import percistencia.ControladorVenta;

import percistencia.ControladorVenta;


public class Venta_Productos extends javax.swing.JInternalFrame {
    private ControladorVenta cve;
    
    public Venta_Productos() {
        initComponents();
        cve = new ControladorVenta();
        /*PRODUCTO*/
        jTxt_IdProducto_Fac.setEnabled(false);
        jTxt_CodProducto_Fac.setEnabled(false);
        jTxt_NomProducto_Fac.setEnabled(false);
        jTxt_MarProducto_Fac.setEnabled(false);
        jTxt_PreProducto_Fac.setEnabled(false);
        jTxt_CanProducto_Fac.setEnabled(false);
        jTxt_PreVenProducto_Fac.setEnabled(false);
        /*CLIENTES*/
        jTxt_IdCliente_Fac.setEnabled(false);
        jTxt_NomCliente_Fac.setEnabled(false);
        jTxt_ApPaterno_Fac.setEnabled(false);
        jTxt_ApMaterno_Fac.setEnabled(false);
        
        cve.MostrarUltimaFactura(jLbl_UltimaFactura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTxt_Buscar_Productos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTb_Productos_Fac = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTxt_IdCliente_Fac = new javax.swing.JTextField();
        jTxt_NomCliente_Fac = new javax.swing.JTextField();
        jTxt_ApPaterno_Fac = new javax.swing.JTextField();
        jTxt_ApMaterno_Fac = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxt_IdProducto_Fac = new javax.swing.JTextField();
        jTxt_NomProducto_Fac = new javax.swing.JTextField();
        jTxt_PreProducto_Fac = new javax.swing.JTextField();
        jTxt_CanProducto_Fac = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTxt_PreVenProducto_Fac = new javax.swing.JTextField();
        jBtn_Habilitar_PreVen = new javax.swing.JButton();
        jBtn_Deshabilitar_PreVen = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTxt_CantidadVenta_Fac = new javax.swing.JTextField();
        jBtn_AgregarPro_Fac = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTxt_CodProducto_Fac = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTxt_MarProducto_Fac = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLbl_UltimaFactura = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jBtn_EliminarPro_Re = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTb_ResumenVenta = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLbl_IVA = new javax.swing.JLabel();
        jLbl_Total = new javax.swing.JLabel();
        jBtn_Guar_Venta = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTxt_Buscar_Cliente = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTb_Cliente_Fac = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("VENTA PRODUCTOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos Disponibles"));

        jLabel4.setText("Buscar por Nom.:");

        jTxt_Buscar_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_Buscar_ProductosActionPerformed(evt);
            }
        });
        jTxt_Buscar_Productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxt_Buscar_ProductosKeyReleased(evt);
            }
        });

        jTb_Productos_Fac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTb_Productos_Fac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTb_Productos_FacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTb_Productos_Fac);

        jLabel7.setText("Click para seleccionar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxt_Buscar_Productos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt_Buscar_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen Selección"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente"));

        jLabel1.setText("Id Cliente:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Ap. Paterno:");

        jLabel8.setText("Ap. Materno:");

        jTxt_IdCliente_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jTxt_NomCliente_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jTxt_ApPaterno_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jTxt_ApMaterno_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxt_NomCliente_Fac)
                    .addComponent(jTxt_IdCliente_Fac, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jTxt_ApMaterno_Fac)
                    .addComponent(jTxt_ApPaterno_Fac, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxt_IdCliente_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxt_NomCliente_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxt_ApPaterno_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTxt_ApMaterno_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto"));

        jLabel9.setText("Id Producto:");

        jLabel10.setText("Nombre:");

        jLabel11.setText("Precio:");

        jLabel12.setText("Cantidad:");

        jTxt_IdProducto_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jTxt_NomProducto_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jTxt_PreProducto_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jTxt_CanProducto_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio y Cantidad"));

        jLabel13.setText("Precio de Venta:");

        jTxt_PreVenProducto_Fac.setDisabledTextColor(new java.awt.Color(255, 0, 0));

        jBtn_Habilitar_PreVen.setText("Habilitar");
        jBtn_Habilitar_PreVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Habilitar_PreVenActionPerformed(evt);
            }
        });

        jBtn_Deshabilitar_PreVen.setText("Deshabilitar");
        jBtn_Deshabilitar_PreVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Deshabilitar_PreVenActionPerformed(evt);
            }
        });

        jLabel14.setText("Cantidad de Venta:");

        jBtn_AgregarPro_Fac.setText("Agregar Producto");
        jBtn_AgregarPro_Fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AgregarPro_FacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addComponent(jTxt_PreVenProducto_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn_Habilitar_PreVen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn_Deshabilitar_PreVen))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxt_CantidadVenta_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtn_AgregarPro_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTxt_PreVenProducto_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_Habilitar_PreVen)
                    .addComponent(jBtn_Deshabilitar_PreVen))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTxt_CantidadVenta_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtn_AgregarPro_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setText("Codigo:");

        jTxt_CodProducto_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jLabel22.setText("Marca:");

        jTxt_MarProducto_Fac.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxt_CanProducto_Fac, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxt_PreProducto_Fac)
                    .addComponent(jTxt_MarProducto_Fac)
                    .addComponent(jTxt_NomProducto_Fac, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxt_CodProducto_Fac, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxt_IdProducto_Fac, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTxt_IdProducto_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTxt_CodProducto_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTxt_NomProducto_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTxt_MarProducto_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTxt_PreProducto_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTxt_CanProducto_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de Venta"));

        jLabel19.setText("Ultima Fac. Creada:");

        jLbl_UltimaFactura.setText(".......");

        jLabel21.setText("Seleccionar para eliminar:");

        jBtn_EliminarPro_Re.setText("Eliminar");
        jBtn_EliminarPro_Re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_EliminarPro_ReActionPerformed(evt);
            }
        });

        jTb_ResumenVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_Producto", "Nom_Producto", "Precio_Producto", "Cantidad_Pro", "Sub_Total"
            }
        ));
        jScrollPane4.setViewportView(jTb_ResumenVenta);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbl_UltimaFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jBtn_EliminarPro_Re)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jBtn_EliminarPro_Re))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLbl_UltimaFactura)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("IVA(18%):");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("TOTAL:");

        jLbl_IVA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbl_IVA.setText("......");

        jLbl_Total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbl_Total.setText(".......");

        jBtn_Guar_Venta.setText("GUARDAR");
        jBtn_Guar_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Guar_VentaActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes Disponibles"));

        jLabel17.setText("Buscar por Nom.:");

        jTxt_Buscar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_Buscar_ClienteActionPerformed(evt);
            }
        });
        jTxt_Buscar_Cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxt_Buscar_ClienteKeyReleased(evt);
            }
        });

        jTb_Cliente_Fac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTb_Cliente_Fac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTb_Cliente_FacMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTb_Cliente_Fac);

        jLabel18.setText("Click para seleccionar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxt_Buscar_Cliente))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel18)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTxt_Buscar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
                .addComponent(jBtn_Guar_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(447, 447, 447)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLbl_IVA))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLbl_Total)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLbl_IVA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLbl_Total)))
                    .addComponent(jBtn_Guar_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxt_Buscar_ProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_Buscar_ProductosKeyReleased
    // Llamar al método para buscar y actualizar la tabla
    cve.BuscaProdCli(jTxt_Buscar_Productos, jTb_Productos_Fac);
    }//GEN-LAST:event_jTxt_Buscar_ProductosKeyReleased

    private void jTxt_Buscar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_Buscar_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_Buscar_ClienteActionPerformed

    private void jTxt_Buscar_ClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_Buscar_ClienteKeyReleased
    cve.BuscaClienteCli(jTxt_Buscar_Cliente, jTb_Cliente_Fac);
    }//GEN-LAST:event_jTxt_Buscar_ClienteKeyReleased

    private void jTb_Productos_FacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTb_Productos_FacMouseClicked
    cve.SeleccionarProducto(jTb_Productos_Fac, jTxt_IdProducto_Fac, jTxt_CodProducto_Fac, jTxt_NomProducto_Fac, jTxt_MarProducto_Fac, jTxt_PreProducto_Fac,jTxt_CanProducto_Fac,jTxt_PreVenProducto_Fac );
    }//GEN-LAST:event_jTb_Productos_FacMouseClicked

    private void jTb_Cliente_FacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTb_Cliente_FacMouseClicked
      cve.SeleccionarCliente(jTb_Cliente_Fac, jTxt_IdCliente_Fac, jTxt_NomCliente_Fac, jTxt_ApPaterno_Fac, jTxt_ApMaterno_Fac);
    }//GEN-LAST:event_jTb_Cliente_FacMouseClicked

    private void jBtn_AgregarPro_FacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AgregarPro_FacActionPerformed
        cve.pasarProductosVenta(jTb_ResumenVenta, jTxt_IdProducto_Fac, jTxt_NomProducto_Fac,jTxt_PreVenProducto_Fac , jTxt_CantidadVenta_Fac, jTxt_CanProducto_Fac);
        cve.calcularTotalPagar(jTb_ResumenVenta, jLbl_IVA, jLbl_Total);
    }//GEN-LAST:event_jBtn_AgregarPro_FacActionPerformed

    private void jBtn_EliminarPro_ReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_EliminarPro_ReActionPerformed
        cve.eliminarProSeleResumVenta(jTb_ResumenVenta);
        cve.calcularTotalPagar(jTb_ResumenVenta, jLbl_IVA, jLbl_Total);
    }//GEN-LAST:event_jBtn_EliminarPro_ReActionPerformed

    private void jBtn_Guar_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Guar_VentaActionPerformed
        cve.crearFactura(jTxt_IdCliente_Fac);
        cve.realizarVenta(jTb_ResumenVenta);
        cve.limpiarcamposdespuesVenta(jTxt_Buscar_Cliente, jTb_Cliente_Fac, jTxt_Buscar_Productos, jTb_Productos_Fac, jTxt_IdCliente_Fac, jTxt_NomCliente_Fac, jTxt_ApPaterno_Fac, jTxt_ApMaterno_Fac, jTxt_IdProducto_Fac, jTxt_CodProducto_Fac, jTxt_NomProducto_Fac, jTxt_MarProducto_Fac, jTxt_PreProducto_Fac, jTxt_CanProducto_Fac, jTxt_PreVenProducto_Fac, jTxt_CantidadVenta_Fac, jTb_ResumenVenta, jLbl_IVA, jLbl_Total);
        cve.MostrarUltimaFactura(jLbl_UltimaFactura);
    }//GEN-LAST:event_jBtn_Guar_VentaActionPerformed

    private void jBtn_Habilitar_PreVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Habilitar_PreVenActionPerformed
        jTxt_PreVenProducto_Fac.setEnabled(true);
    }//GEN-LAST:event_jBtn_Habilitar_PreVenActionPerformed

    private void jBtn_Deshabilitar_PreVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Deshabilitar_PreVenActionPerformed
        jTxt_PreVenProducto_Fac.setEnabled(false);
    }//GEN-LAST:event_jBtn_Deshabilitar_PreVenActionPerformed

    private void jTxt_Buscar_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_Buscar_ProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_Buscar_ProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_AgregarPro_Fac;
    private javax.swing.JButton jBtn_Deshabilitar_PreVen;
    private javax.swing.JButton jBtn_EliminarPro_Re;
    private javax.swing.JButton jBtn_Guar_Venta;
    private javax.swing.JButton jBtn_Habilitar_PreVen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbl_IVA;
    private javax.swing.JLabel jLbl_Total;
    private javax.swing.JLabel jLbl_UltimaFactura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTb_Cliente_Fac;
    private javax.swing.JTable jTb_Productos_Fac;
    private javax.swing.JTable jTb_ResumenVenta;
    private javax.swing.JTextField jTxt_ApMaterno_Fac;
    private javax.swing.JTextField jTxt_ApPaterno_Fac;
    private javax.swing.JTextField jTxt_Buscar_Cliente;
    private javax.swing.JTextField jTxt_Buscar_Productos;
    private javax.swing.JTextField jTxt_CanProducto_Fac;
    private javax.swing.JTextField jTxt_CantidadVenta_Fac;
    private javax.swing.JTextField jTxt_CodProducto_Fac;
    private javax.swing.JTextField jTxt_IdCliente_Fac;
    private javax.swing.JTextField jTxt_IdProducto_Fac;
    private javax.swing.JTextField jTxt_MarProducto_Fac;
    private javax.swing.JTextField jTxt_NomCliente_Fac;
    private javax.swing.JTextField jTxt_NomProducto_Fac;
    private javax.swing.JTextField jTxt_PreProducto_Fac;
    private javax.swing.JTextField jTxt_PreVenProducto_Fac;
    // End of variables declaration//GEN-END:variables
}
