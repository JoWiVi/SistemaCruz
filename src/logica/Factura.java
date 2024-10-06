
package logica;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
   public static final String CAMPO_ID_FAC = "id_factura";
    private int id_factura;
    private Date fecha_factura;
    private double total_factura;
    private int id_cliente;
    private Cliente id_clientef;
    private List<DetalleFactura> detalles;
    
    public Factura() {
        detalles = new ArrayList<>(); // Inicializa la lista de detalles aquí
    }
    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public double getTotal_factura() {
        return total_factura;
    }

    public void setTotal_factura(double total_factura) {
        this.total_factura = total_factura;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente getId_clientef() {
        return id_clientef;
    }

    public void setId_clientef(Cliente id_clientef) {
        this.id_clientef = id_clientef;
    }

    public List<DetalleFactura> getDetalles() {
        return detalles;
    }

    public void addDetalle(DetalleFactura detalle) {
        detalles.add(detalle);
    }
    
}
