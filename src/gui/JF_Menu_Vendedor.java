
package gui;

public class JF_Menu_Vendedor extends javax.swing.JFrame {

    public JF_Menu_Vendedor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jD_Venta_Pro = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jM_Venta_Pro = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMI_Registro_Clientes = new javax.swing.JMenuItem();
        jMI_Modificar_Cliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMI_Busqueda_Factura_Ven = new javax.swing.JMenuItem();
        jM_Busqueda_Fechas_Ve = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Vendedor");

        javax.swing.GroupLayout jD_Venta_ProLayout = new javax.swing.GroupLayout(jD_Venta_Pro);
        jD_Venta_Pro.setLayout(jD_Venta_ProLayout);
        jD_Venta_ProLayout.setHorizontalGroup(
            jD_Venta_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1172, Short.MAX_VALUE)
        );
        jD_Venta_ProLayout.setVerticalGroup(
            jD_Venta_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );

        jMenu1.setText("Venta");

        jM_Venta_Pro.setText("Vender Producto");
        jM_Venta_Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_Venta_ProActionPerformed(evt);
            }
        });
        jMenu1.add(jM_Venta_Pro);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Clientes");

        jMI_Registro_Clientes.setText("Registro Cliente");
        jMI_Registro_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Registro_ClientesActionPerformed(evt);
            }
        });
        jMenu4.add(jMI_Registro_Clientes);

        jMI_Modificar_Cliente.setText("Modificar Cliente");
        jMI_Modificar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Modificar_ClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMI_Modificar_Cliente);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Reportes");

        jMI_Busqueda_Factura_Ven.setText("Reporte por Factura");
        jMI_Busqueda_Factura_Ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Busqueda_Factura_VenActionPerformed(evt);
            }
        });
        jMenu3.add(jMI_Busqueda_Factura_Ven);

        jM_Busqueda_Fechas_Ve.setText("Reporte por Fechas");
        jM_Busqueda_Fechas_Ve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_Busqueda_Fechas_VeActionPerformed(evt);
            }
        });
        jMenu3.add(jM_Busqueda_Fechas_Ve);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jD_Venta_Pro)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jD_Venta_Pro)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMI_Registro_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Registro_ClientesActionPerformed
        Registro_Cliente rc = new Registro_Cliente();
        jD_Venta_Pro.add(rc);
        rc.show();
    }//GEN-LAST:event_jMI_Registro_ClientesActionPerformed

    private void jMI_Modificar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Modificar_ClienteActionPerformed
        Modificar_Cliente mc = new Modificar_Cliente();
        jD_Venta_Pro.add(mc);
        mc.show();
    }//GEN-LAST:event_jMI_Modificar_ClienteActionPerformed

    private void jMI_Busqueda_Factura_VenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Busqueda_Factura_VenActionPerformed
        Buscar_factura bf = new Buscar_factura();
        jD_Venta_Pro.add(bf);
        bf.show();
    }//GEN-LAST:event_jMI_Busqueda_Factura_VenActionPerformed

    private void jM_Busqueda_Fechas_VeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_Busqueda_Fechas_VeActionPerformed
        ReporteFechas rf = new ReporteFechas();
        jD_Venta_Pro.add(rf);
        rf.show();
    }//GEN-LAST:event_jM_Busqueda_Fechas_VeActionPerformed

    private void jM_Venta_ProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_Venta_ProActionPerformed
        Venta_Productos vp = new Venta_Productos();
        jD_Venta_Pro.add(vp);
        vp.show();
    }//GEN-LAST:event_jM_Venta_ProActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jD_Venta_Pro;
    private javax.swing.JMenuItem jMI_Busqueda_Factura_Ven;
    private javax.swing.JMenuItem jMI_Modificar_Cliente;
    private javax.swing.JMenuItem jMI_Registro_Clientes;
    private javax.swing.JMenuItem jM_Busqueda_Fechas_Ve;
    private javax.swing.JMenuItem jM_Venta_Pro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
