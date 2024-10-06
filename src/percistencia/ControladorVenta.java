
package percistencia;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import logica.Producto;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import logica.Cliente;
import logica.DetalleFactura;
import logica.Factura;

public class ControladorVenta {
    //private Factura factura;
    public ControladorVenta(){
        //factura = new Factura();
    }
    public void BuscaProdCli (JTextField txtBuscanombreProducto, JTable tablaproductos){
        // Obtener el texto ingresado en el campo de búsqueda
        String nomproducto = txtBuscanombreProducto.getText().trim();
        // Si el campo de búsqueda está vacío, no realizar la consulta
        if (nomproducto.isEmpty()) {
        return;
        }
        Producto producto = new Producto();
        producto.setNombre_producto(nomproducto);
        // Llamar al método que realiza la búsqueda y obtiene todos los productos similares
        List<Producto> resultados = GestorBD.buscarLikProducto(producto);
        //Producto rproducto = GestorBD.buscarLikProducto(producto);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_producto");
        modelo.addColumn("codigo_producto");
        modelo.addColumn("nombre_producto");
        modelo.addColumn("marca_producto");
        modelo.addColumn("precio_producto");
        modelo.addColumn("cantidad_producto");
        // Agregar cada producto encontrado a la tabla
    for (Producto p : resultados) {
        modelo.addRow(new Object[]{
            p.getId_producto(),
            p.getCodigo_producto(),
            p.getNombre_producto(),
            p.getMarca_producto(),
            p.getPrecio_producto(),
            p.getCantidad_producto()
        });
    }
    tablaproductos.setModel(modelo); 
    for (int column = 0; column < tablaproductos.getColumnCount();column++){
       Class <?>columClass = tablaproductos.getColumnClass(column);
       tablaproductos.setDefaultEditor(columClass,null);
    }
    }
    public void SeleccionarProducto(JTable tablaProducto,JTextField id,JTextField codigoProducto,JTextField nombreProducto, JTextField marcaProducto,JTextField precioProducto,JTextField cantidadProducto, JTextField precioFiProducto ){
       int fila = tablaProducto.getSelectedRow();
       try{
           if(fila >= 0){
               id.setText(tablaProducto.getValueAt(fila,0).toString());
               codigoProducto.setText(tablaProducto.getValueAt(fila,1).toString());
               nombreProducto.setText(tablaProducto.getValueAt(fila,2).toString());
               marcaProducto.setText(tablaProducto.getValueAt(fila,3).toString());
               precioProducto.setText(tablaProducto.getValueAt(fila,4).toString());
               cantidadProducto.setText(tablaProducto.getValueAt(fila,5).toString());
               precioFiProducto.setText(tablaProducto.getValueAt(fila,4).toString());
           }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de seleccion"+e.toString());
       }
    }
    public void BuscaClienteCli (JTextField txtBuscanombreCliente, JTable tablacliente){
        // Obtener el texto ingresado en el campo de búsqueda
        String nomcliente = txtBuscanombreCliente.getText().trim();
        // Si el campo de búsqueda está vacío, no realizar la consulta
        if (nomcliente.isEmpty()) {
        return;
        }
        Cliente cliente = new Cliente();
        cliente.setNombre_cliente(nomcliente); 
        // Llamar al método que realiza la búsqueda y obtiene todos los productos similares
        List<Cliente> resultados = GestorBD.buscarLikCliente(cliente);
        //Producto rproducto = GestorBD.buscarLikProducto(producto);
        DefaultTableModel modelocli = new DefaultTableModel();
        modelocli.addColumn("id_cliente");
        modelocli.addColumn("nombres_cliente");
        modelocli.addColumn("appaterno_cliente");
        modelocli.addColumn("apmaterno_cliente");
        // Agregar cada cliente encontrado a la tabla
    for (Cliente c : resultados) {
        modelocli.addRow(new Object[]{
            c.getId_cliente(),
            c.getNombre_cliente(),
            c.getAppaterno_cliente(),
            c.getApmaterno_cliente()
        });
    }
    tablacliente.setModel(modelocli); 
    for (int columncli = 0; columncli < tablacliente.getColumnCount();columncli++){
       Class <?>columClass = tablacliente.getColumnClass(columncli);
       tablacliente.setDefaultEditor(columClass,null);
    }
    }
    public void SeleccionarCliente(JTable tablaCliente,JTextField id,JTextField nombreCliente,JTextField appaternoCliente, JTextField apmaternoCliente ){
       int fila = tablaCliente.getSelectedRow();
       try{
           if(fila >= 0){
               id.setText(tablaCliente.getValueAt(fila,0).toString());
               nombreCliente.setText(tablaCliente.getValueAt(fila,1).toString());
               appaternoCliente.setText(tablaCliente.getValueAt(fila,2).toString());
               apmaternoCliente.setText(tablaCliente.getValueAt(fila,3).toString());
           }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de seleccion"+e.toString());
       }
    }
    public void pasarProductosVenta(JTable tablaresumen, JTextField idproducto,JTextField nombreProducto, JTextField precioProducto, JTextField cantidadVenta, JTextField cantidadProducto){
       DefaultTableModel modeTR = (DefaultTableModel) tablaresumen.getModel();
       int CantidadDisponible = Integer.parseInt(cantidadProducto.getText());
       String idProducto = idproducto.getText();
       for (int i = 0; i < modeTR.getRowCount(); i++){
        String idExistente = (String) modeTR.getValueAt(i,0);
        if(idExistente.equals(idProducto)){
            JOptionPane.showMessageDialog(null, "El Producto ya esta registrado");
            return;
        }
       }
       String nProducto = nombreProducto.getText();
       double precioUnitario = Double.parseDouble(precioProducto.getText());
       int cantidadVe = Integer.parseInt(cantidadVenta.getText());
       if(cantidadVe > CantidadDisponible){
         JOptionPane.showMessageDialog(null, "La cantidad de venta no puede ser mayor a la Cantidad Disponible");  
         return;
       }
       double subtotal = precioUnitario * cantidadVe;
    modeTR.addRow(new Object[]{idProducto,nProducto,precioUnitario,cantidadVe,subtotal});
    }
    public void eliminarProSeleResumVenta (JTable tablaresumen){
        try{
            DefaultTableModel modeTR = (DefaultTableModel) tablaresumen.getModel();
        int indiceSeleccionado = tablaresumen.getSelectedRow();
        if(indiceSeleccionado !=-1){
            modeTR.removeRow(indiceSeleccionado);
        }else{
           JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar"); 
        }
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Error al Seleccione una fila"+e.toString());   
        }
    }
    public void calcularTotalPagar (JTable tablaresumen, JLabel IVA, JLabel totalPagar){
      DefaultTableModel modeTR = (DefaultTableModel) tablaresumen.getModel();
      double totalSubTotal = 0;
      double iva = 0.18;
      double totaliva = 0;
      
      DecimalFormat formato = new DecimalFormat("#.##");
     for(int i = 0; i < modeTR.getRowCount(); i++){
         totalSubTotal = Double.parseDouble(formato.format(totalSubTotal+(double)modeTR.getValueAt(i, 4)));
         totaliva = Double.parseDouble(formato.format(iva*totalSubTotal));
     } 
     totalPagar.setText(String.valueOf(totalSubTotal));
     IVA.setText(String.valueOf(totaliva));
    }
    public void crearFactura(JTextField codCliente){
        try {
        // Crear una instancia de Factura
        Factura facturas = new Factura();

        // Convertir el texto del JTextField en un número entero para el ID del cliente
        facturas.setId_cliente(Integer.parseInt(codCliente.getText()));

        // Llamar al método de GestorBD para crear la factura
        boolean resultado = GestorBD.crearFacturae(facturas);

        // Verificar si la factura se creó correctamente
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Factura creada exitosamente.");
            //System.out.println("Factura creada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear la factura.");
            //System.out.println("Error al crear la factura.");
        }
    }catch (Exception e) {
        // Manejar cualquier otro tipo de excepción
        JOptionPane.showMessageDialog(null, "Ningun dato ingresado, por favor verificar.");
        //System.out.println("Ocurrió un error al crear la factura: " + e.getMessage());
    }
    }
    public void realizarVenta(JTable tablaresumen) {
    try {
        // Iterar sobre cada fila de la tabla para obtener los datos del producto
        int filas = tablaresumen.getRowCount();
        for (int i = 0; i < filas; i++) {
            // Obtener los valores de la tabla
            int id_producto = Integer.parseInt(tablaresumen.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(tablaresumen.getValueAt(i, 3).toString());
            double precio = Double.parseDouble(tablaresumen.getValueAt(i, 2).toString());
            
            // Crear instancias de DetalleFactura y Producto
            DetalleFactura detallefactura = new DetalleFactura();
            Producto producto = new Producto();
            
            // Configurar los valores de DetalleFactura y Producto
            detallefactura.setCantidad_f(cantidad);
            detallefactura.setPrecioV_f(precio);
            detallefactura.setFk_id_producto(id_producto); // Debe haber un método setIdProducto en DetalleFactura
            
            producto.setId_producto(id_producto);
            producto.setCantidad_producto(cantidad);

            // Llamar al método de GestorBD para ejecutar la venta
            boolean ventaExitosa = GestorBD.realizarVenta(detallefactura, producto);
            
            // Verificar si la venta fue exitosa
            if (!ventaExitosa) {
                System.out.println("Error al procesar la venta del producto con ID: " + id_producto);
            }
        }
        
    } catch (Exception e) {
        System.out.println("ERROR: " + e.getMessage());
        e.printStackTrace();
    }
}
public void MostrarUltimaFactura(JLabel ultimafactura){
   try {
        // Llamar al método de la base de datos para obtener la última factura
        Factura ultimaFactura = GestorBD.UltimaFactura(null); // El parámetro 'null' porque no lo necesitas para la consulta

        // Verificar si la factura fue encontrada
        if (ultimaFactura != null && ultimaFactura.getId_factura() != 0) {
            // Asignar el valor de la última factura al JLabel
            ultimafactura.setText("Última factura: " + ultimaFactura.getId_factura());
        } else {
            // Si no hay facturas, mostrar un mensaje predeterminado
            ultimafactura.setText("No hay facturas registradas.");
        }
    } catch (Exception e) {
        // Manejar cualquier error y mostrar un mensaje en el JLabel
        ultimafactura.setText("Error al obtener la última factura.");
        System.out.println("ERROR: " + e.getMessage());
        e.printStackTrace();
    }
}
public void limpiarcamposdespuesVenta(JTextField buscarCliente,JTable tablaCliente,JTextField buscarProducto,JTable tablaProducto,
                                      JTextField selecIdCliente, JTextField selectNombreCLiente, JTextField selectAppaterno, JTextField selectApmaterno,
                                      JTextField selectIdproducto, JTextField selectCodigoProducto, JTextField selectNombreProducto, JTextField selectMarcaProducto, JTextField selectPrecioProducto, JTextField selectCantidadProducto,
                                      JTextField selectPrecioVentaProducto, JTextField selectCantidadVentaProducto,JTable tablaResumen, JLabel IVA, JLabel total){
   buscarCliente.setText("");
   buscarCliente.requestFocus();
   DefaultTableModel modeloCliente = (DefaultTableModel) tablaCliente.getModel();
   modeloCliente.setRowCount(0);
   
   buscarProducto.setText("");
   DefaultTableModel modeloProducto = (DefaultTableModel) tablaProducto.getModel();
   modeloProducto.setRowCount(0);
   
   selecIdCliente.setText("");
   selectNombreCLiente.setText("");
   selectAppaterno.setText("");
   selectApmaterno.setText("");
   
   selectIdproducto.setText("");
   selectCodigoProducto.setText("");
   selectNombreProducto.setText("");
   selectMarcaProducto.setText("");
   selectPrecioProducto.setText("");
   selectCantidadProducto.setText("");
   
   selectPrecioVentaProducto.setText("");
   selectCantidadVentaProducto.setText("");
   
   IVA.setText("");
   total.setText("");
   DefaultTableModel modelotablaResumen = (DefaultTableModel) tablaResumen.getModel();
   modelotablaResumen.setRowCount(0);
}

}
