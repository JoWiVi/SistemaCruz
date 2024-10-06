
package logica;

public class Proveedor {
    public static final String CAMPO_ID_PROV = "id_proveedor";
    private int id_proveedor;
    private String nombre_proveedor;
    private String contacto_proveedor;
    
    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getContacto_proveedor() {
        return contacto_proveedor;
    }

    public void setContacto_proveedor(String contacto_proveedor) {
        this.contacto_proveedor = contacto_proveedor;
    }
}
