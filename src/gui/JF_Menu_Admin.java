
package gui;

public class JF_Menu_Admin extends javax.swing.JFrame {

    /**
     * Creates new form JFMenu
     */
    public JF_Menu_Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jD_Panel_Usuarios = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Usuarios = new javax.swing.JMenu();
        jMI_Registro_Usuarios = new javax.swing.JMenuItem();
        jMI_Modificar_Usuarios = new javax.swing.JMenuItem();
        jMI_Eliminar_Usuarios = new javax.swing.JMenuItem();
        jMenu_Productos = new javax.swing.JMenu();
        jMI_Registro_Productos = new javax.swing.JMenuItem();
        jMI_Modificar_Producto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMI_Registro_Clientes = new javax.swing.JMenuItem();
        jMI_Modificar_Cliente = new javax.swing.JMenuItem();
        jMI_Eliminar_Clientes = new javax.swing.JMenuItem();
        jMenu_Proveedor = new javax.swing.JMenu();
        jMI_Registro_Proveedor = new javax.swing.JMenuItem();
        jMI_Modificar_Proveedor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMI_Busqueda_Factura_Ven = new javax.swing.JMenuItem();
        jM_Busqueda_Fechas_Ve = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Administrador");

        javax.swing.GroupLayout jD_Panel_UsuariosLayout = new javax.swing.GroupLayout(jD_Panel_Usuarios);
        jD_Panel_Usuarios.setLayout(jD_Panel_UsuariosLayout);
        jD_Panel_UsuariosLayout.setHorizontalGroup(
            jD_Panel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1161, Short.MAX_VALUE)
        );
        jD_Panel_UsuariosLayout.setVerticalGroup(
            jD_Panel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuBar1.setToolTipText("");

        jMenu_Usuarios.setText("Usuarios");

        jMI_Registro_Usuarios.setText("Registro Usuarios");
        jMI_Registro_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Registro_UsuariosActionPerformed(evt);
            }
        });
        jMenu_Usuarios.add(jMI_Registro_Usuarios);

        jMI_Modificar_Usuarios.setText("Modificar Usuarios");
        jMI_Modificar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Modificar_UsuariosActionPerformed(evt);
            }
        });
        jMenu_Usuarios.add(jMI_Modificar_Usuarios);

        jMI_Eliminar_Usuarios.setText("Eliminar Usuarios");
        jMI_Eliminar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Eliminar_UsuariosActionPerformed(evt);
            }
        });
        jMenu_Usuarios.add(jMI_Eliminar_Usuarios);

        jMenuBar1.add(jMenu_Usuarios);

        jMenu_Productos.setText("Productos");

        jMI_Registro_Productos.setText("Registrar Producto");
        jMI_Registro_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Registro_ProductosActionPerformed(evt);
            }
        });
        jMenu_Productos.add(jMI_Registro_Productos);

        jMI_Modificar_Producto.setText("Modificar Producto");
        jMI_Modificar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Modificar_ProductoActionPerformed(evt);
            }
        });
        jMenu_Productos.add(jMI_Modificar_Producto);

        jMenuBar1.add(jMenu_Productos);

        jMenu2.setText("Clientes");

        jMI_Registro_Clientes.setText("Registro Cliente");
        jMI_Registro_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Registro_ClientesActionPerformed(evt);
            }
        });
        jMenu2.add(jMI_Registro_Clientes);

        jMI_Modificar_Cliente.setText("Modificar Cliente");
        jMI_Modificar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Modificar_ClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMI_Modificar_Cliente);

        jMI_Eliminar_Clientes.setText("Eliminar Cliente");
        jMI_Eliminar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Eliminar_ClientesActionPerformed(evt);
            }
        });
        jMenu2.add(jMI_Eliminar_Clientes);

        jMenuBar1.add(jMenu2);

        jMenu_Proveedor.setText("Proveedor");

        jMI_Registro_Proveedor.setText("Registrar Proveedor");
        jMI_Registro_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Registro_ProveedorActionPerformed(evt);
            }
        });
        jMenu_Proveedor.add(jMI_Registro_Proveedor);

        jMI_Modificar_Proveedor.setText("Modificar Proveedor");
        jMI_Modificar_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Modificar_ProveedorActionPerformed(evt);
            }
        });
        jMenu_Proveedor.add(jMI_Modificar_Proveedor);

        jMenuBar1.add(jMenu_Proveedor);

        jMenu1.setText("Reportes");

        jMI_Busqueda_Factura_Ven.setText("Reporte por Factura");
        jMI_Busqueda_Factura_Ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Busqueda_Factura_VenActionPerformed(evt);
            }
        });
        jMenu1.add(jMI_Busqueda_Factura_Ven);

        jM_Busqueda_Fechas_Ve.setText("Reporte por Fechas");
        jM_Busqueda_Fechas_Ve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_Busqueda_Fechas_VeActionPerformed(evt);
            }
        });
        jMenu1.add(jM_Busqueda_Fechas_Ve);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jD_Panel_Usuarios, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jD_Panel_Usuarios)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMI_Registro_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Registro_UsuariosActionPerformed
    Registro_Usuarios ru = new Registro_Usuarios();
    jD_Panel_Usuarios.add(ru);
    ru.show();
    }//GEN-LAST:event_jMI_Registro_UsuariosActionPerformed

    private void jMI_Registro_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Registro_ProductosActionPerformed
    Registra_Producto rp = new Registra_Producto();
    jD_Panel_Usuarios.add(rp);
    rp.show();
    }//GEN-LAST:event_jMI_Registro_ProductosActionPerformed

    private void jMI_Modificar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Modificar_UsuariosActionPerformed
    Modificar_Usuarios mu = new Modificar_Usuarios();
    jD_Panel_Usuarios.add(mu);
    mu.show();
    }//GEN-LAST:event_jMI_Modificar_UsuariosActionPerformed

    private void jMI_Eliminar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Eliminar_UsuariosActionPerformed
    Eliminar_Usuario eu = new Eliminar_Usuario();
    jD_Panel_Usuarios.add(eu);
    eu.show();
    }//GEN-LAST:event_jMI_Eliminar_UsuariosActionPerformed

    private void jMI_Modificar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Modificar_ProductoActionPerformed
    Modifica_Producto mp = new Modifica_Producto();
    jD_Panel_Usuarios.add(mp);
    mp.show();
    }//GEN-LAST:event_jMI_Modificar_ProductoActionPerformed

    private void jMI_Busqueda_Factura_VenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Busqueda_Factura_VenActionPerformed
    Buscar_factura bf = new Buscar_factura();
    jD_Panel_Usuarios.add(bf);
    bf.show();
    }//GEN-LAST:event_jMI_Busqueda_Factura_VenActionPerformed

    private void jM_Busqueda_Fechas_VeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_Busqueda_Fechas_VeActionPerformed
    ReporteFechas rf = new ReporteFechas();
    jD_Panel_Usuarios.add(rf);
    rf.show();
    }//GEN-LAST:event_jM_Busqueda_Fechas_VeActionPerformed

    private void jMI_Registro_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Registro_ClientesActionPerformed
    Registro_Cliente rc = new Registro_Cliente();
    jD_Panel_Usuarios.add(rc);
    rc.show();
    }//GEN-LAST:event_jMI_Registro_ClientesActionPerformed

    private void jMI_Modificar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Modificar_ClienteActionPerformed
    Modificar_Cliente mc = new Modificar_Cliente();
    jD_Panel_Usuarios.add(mc);
    mc.show();
    }//GEN-LAST:event_jMI_Modificar_ClienteActionPerformed

    private void jMI_Eliminar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Eliminar_ClientesActionPerformed
    Eliminar_Cliente ec = new Eliminar_Cliente();
    jD_Panel_Usuarios.add(ec);
    ec.show();
    }//GEN-LAST:event_jMI_Eliminar_ClientesActionPerformed

    private void jMI_Registro_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Registro_ProveedorActionPerformed
    Registra_Proveedor rpro = new Registra_Proveedor();
    jD_Panel_Usuarios.add(rpro);
    rpro.show();
    }//GEN-LAST:event_jMI_Registro_ProveedorActionPerformed

    private void jMI_Modificar_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Modificar_ProveedorActionPerformed
    Modifica_Proveedor mpro = new Modifica_Proveedor();
    jD_Panel_Usuarios.add(mpro);
    mpro.show();
    }//GEN-LAST:event_jMI_Modificar_ProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jD_Panel_Usuarios;
    private javax.swing.JMenuItem jMI_Busqueda_Factura_Ven;
    private javax.swing.JMenuItem jMI_Eliminar_Clientes;
    private javax.swing.JMenuItem jMI_Eliminar_Usuarios;
    private javax.swing.JMenuItem jMI_Modificar_Cliente;
    private javax.swing.JMenuItem jMI_Modificar_Producto;
    private javax.swing.JMenuItem jMI_Modificar_Proveedor;
    private javax.swing.JMenuItem jMI_Modificar_Usuarios;
    private javax.swing.JMenuItem jMI_Registro_Clientes;
    private javax.swing.JMenuItem jMI_Registro_Productos;
    private javax.swing.JMenuItem jMI_Registro_Proveedor;
    private javax.swing.JMenuItem jMI_Registro_Usuarios;
    private javax.swing.JMenuItem jM_Busqueda_Fechas_Ve;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Productos;
    private javax.swing.JMenu jMenu_Proveedor;
    private javax.swing.JMenu jMenu_Usuarios;
    // End of variables declaration//GEN-END:variables
}