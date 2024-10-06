
package gui;

import percistencia.ControladorReportes;

public class Buscar_factura extends javax.swing.JInternalFrame {
    private ControladorReportes cre;
    /**
     * Creates new form Buscar_factura
     */
    public Buscar_factura() {
        initComponents();
        cre = new ControladorReportes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTxt_Buscar_Fa = new javax.swing.JTextField();
        jBtn_Buscar_Fa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLbl_Numero_Fac = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLbl_Fecha_Fac = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLbl_Nombre_Cli_Fac = new javax.swing.JLabel();
        jLbl_Appaterno_Cli_Fac = new javax.swing.JLabel();
        jLbl_Apmaterno_Cli_Fac = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTb_Productos_De = new javax.swing.JTable();
        jLbl_Iva_Fac = new javax.swing.JLabel();
        jLbl_Total_venta_Fac = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("BUSQUEDA DE FACTURAS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Numero de Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT", 1, 14))); // NOI18N

        jBtn_Buscar_Fa.setText("Buscar");
        jBtn_Buscar_Fa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Buscar_FaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTxt_Buscar_Fa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtn_Buscar_Fa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt_Buscar_Fa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_Buscar_Fa))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel2.setText("Factura N°:");

        jLbl_Numero_Fac.setText(".......");

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de Venta: ");

        jLbl_Fecha_Fac.setText("....");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel1.setText("Nombres:");

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel6.setText("Ap. Paterno:");

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel7.setText("Ap.Materno:");

        jLbl_Nombre_Cli_Fac.setText(".........");

        jLbl_Appaterno_Cli_Fac.setText(".....");

        jLbl_Apmaterno_Cli_Fac.setText("....");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbl_Nombre_Cli_Fac)))
                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLbl_Appaterno_Cli_Fac)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLbl_Apmaterno_Cli_Fac)
                        .addGap(70, 70, 70))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbl_Nombre_Cli_Fac)
                    .addComponent(jLbl_Appaterno_Cli_Fac)
                    .addComponent(jLbl_Apmaterno_Cli_Fac))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel8.setText("Productos:");

        jTb_Productos_De.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTb_Productos_De);

        jLbl_Iva_Fac.setText("....");

        jLbl_Total_venta_Fac.setText("....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLbl_Numero_Fac)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLbl_Fecha_Fac)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLbl_Total_venta_Fac)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLbl_Iva_Fac)
                        .addGap(35, 35, 35))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLbl_Numero_Fac)
                    .addComponent(jLabel4)
                    .addComponent(jLbl_Fecha_Fac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbl_Iva_Fac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbl_Total_venta_Fac)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_Buscar_FaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Buscar_FaActionPerformed
      cre.BuscarFacturaMostrarDatosCliente(jTxt_Buscar_Fa, jLbl_Numero_Fac, jLbl_Fecha_Fac, jLbl_Nombre_Cli_Fac, jLbl_Appaterno_Cli_Fac, jLbl_Apmaterno_Cli_Fac);
      cre.BuscarFacturaMostrarDatosProducto(jTxt_Buscar_Fa, jTb_Productos_De, jLbl_Iva_Fac, jLbl_Total_venta_Fac);
    }//GEN-LAST:event_jBtn_Buscar_FaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Buscar_Fa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbl_Apmaterno_Cli_Fac;
    private javax.swing.JLabel jLbl_Appaterno_Cli_Fac;
    private javax.swing.JLabel jLbl_Fecha_Fac;
    private javax.swing.JLabel jLbl_Iva_Fac;
    private javax.swing.JLabel jLbl_Nombre_Cli_Fac;
    private javax.swing.JLabel jLbl_Numero_Fac;
    private javax.swing.JLabel jLbl_Total_venta_Fac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTb_Productos_De;
    private javax.swing.JTextField jTxt_Buscar_Fa;
    // End of variables declaration//GEN-END:variables
}
