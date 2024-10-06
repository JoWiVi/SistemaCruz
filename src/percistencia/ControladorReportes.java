
package percistencia;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import logica.Cliente;
import logica.DetalleFactura;
import logica.Factura;
import logica.Producto;

public class ControladorReportes {
    public void BuscarFacturaMostrarDatosCliente(JTextField numeroFactura, JLabel numeroFacturaEncontrado, JLabel fechaFacturaEncontrado, JLabel nombreCliente,
                                             JLabel AppaternoCliente, JLabel ApmaternoCliente) {
    try {
        // Obtener el ID de la factura desde el JTextField
        int idFactura = Integer.parseInt(numeroFactura.getText());
        
        // Crear instancias de Factura y Cliente
        Factura factura = new Factura();
        Cliente cliente = new Cliente();
        
        // Establecer el ID de la factura
        factura.setId_factura(idFactura);
        
        // Llamar al método BuscarFacturaCliente para obtener los datos
        Factura resultado = GestorBD.BuscarFacturaCliente(factura, cliente);
        
        // Verificar si se encontró una factura
        if (resultado != null) {
            // Mostrar los datos en los JLabels correspondientes
            numeroFacturaEncontrado.setText(String.valueOf(resultado.getId_factura()));
            fechaFacturaEncontrado.setText(resultado.getFecha_factura().toString());
            nombreCliente.setText(resultado.getId_clientef().getNombre_cliente());
            AppaternoCliente.setText(resultado.getId_clientef().getAppaterno_cliente());
            ApmaternoCliente.setText(resultado.getId_clientef().getApmaterno_cliente());
        } else {
            // Mostrar un mensaje de error si no se encontró la factura
            JOptionPane.showMessageDialog(null, "No se encontró la factura con el número ingresado.");
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Numero de factura invalido.");
    } catch (Exception e) {
        System.out.println("ERROR: " + e.getMessage());
    }
}
// Ejemplo de uso en tu método
public void BuscarFacturaMostrarDatosProducto(JTextField numeroFactura, JTable tablaProductos, JLabel IVA, JLabel total) {
    // Limpiar el JTextField y etiquetas
    IVA.setText("IVA: 0.00");
    total.setText("Total: 0.00");

    // Obtener el número de factura del JTextField
    String numero = numeroFactura.getText().trim();
    
    if (numero.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de factura válido.");
        return; // Salir si no se ingresa un número
    }

    // Crear una nueva instancia de Factura para buscar
    Factura factura = new Factura();
    factura.setId_factura(Integer.parseInt(numero)); // Convertir a entero

    // Crear una instancia de GestorBD para interactuar con la base de datos
    GestorBD gestorBD = new GestorBD();
    
    // Obtener los detalles de la factura
    List<Factura> facturas = gestorBD.BuscarFacturaProducto(factura); // Método que ejecuta la consulta

    // Verificar si se encontró la factura
    if (facturas.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontró la factura con el número ingresado.");
        return; // Salir si no se encuentra la factura
    }

    // Crear un nuevo modelo de tabla
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre Producto");
    modelo.addColumn("Cantidad");
    modelo.addColumn("Precio Unitario");
    modelo.addColumn("Subtotal");
    
    // Variables para calcular IVA y total
    double totalFactura = 0.0;
    double totalIVA = 0.0;
    double ivaRate = 0.18; // Por ejemplo, 18% de IVA

    // Iterar sobre las facturas encontradas (usualmente debería ser solo una)
    for (Factura f : facturas) {
        for (DetalleFactura detalle : f.getDetalles()) {
            // Obtener los datos del producto
            String nombreProducto = detalle.getProducto().getNombre_producto();
            int cantidad = detalle.getCantidad_f();
            double precioUnitario = detalle.getPrecioV_f();
            double subtotal = precioUnitario * cantidad;

            // Calcular IVA y total
            totalFactura += subtotal;
            totalIVA += subtotal * ivaRate;

            // Agregar los datos a la tabla
            modelo.addRow(new Object[]{nombreProducto, cantidad, precioUnitario, subtotal});
        }
    }

    // Actualizar los JLabel con el IVA y el total
    IVA.setText(String.format("IVA: %.2f", totalIVA));
    total.setText(String.format("Total: %.2f", totalFactura + totalIVA));

    // Establecer el modelo a la tabla
    tablaProductos.setModel(modelo);
}
}
