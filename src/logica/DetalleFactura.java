package logica;

public class DetalleFactura {
    public static final String CAMPO_ID_DF = "id_dfactura";
    private int id_dfactura;
    private int fk_id_factura;
    private int fk_id_producto;
    private int cantidad_f;
    private double precioV_f;
    private Producto producto;
    public int getId_dfactura() {
        return id_dfactura;
    }

    public void setId_dfactura(int id_dfactura) {
        this.id_dfactura = id_dfactura;
    }

    public int getFk_id_producto() {
        return fk_id_producto;
    }

    public void setFk_id_producto(int fk_id_producto) {
        this.fk_id_producto = fk_id_producto;
    }

    public int getCantidad_f() {
        return cantidad_f;
    }

    public void setCantidad_f(int cantidad_f) {
        this.cantidad_f = cantidad_f;
    }

    public double getPrecioV_f() {
        return precioV_f;
    }

    public void setPrecioV_f(double precioV_f) {
        this.precioV_f = precioV_f;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getFk_id_factura() {
        return fk_id_factura;
    }

    public void setFk_id_factura(int fk_id_factura) {
        this.fk_id_factura = fk_id_factura;
    }
    
}
