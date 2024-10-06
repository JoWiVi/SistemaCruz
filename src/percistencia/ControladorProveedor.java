
package percistencia;

import logica.Proveedor;

public class ControladorProveedor {
    private Proveedor proveedor;
    public ControladorProveedor(){
        proveedor = new Proveedor();
    }
    public boolean insertarProve(String nombre_proveedor,String contacto_proveedor){
        getProveedor().setNombre_proveedor(nombre_proveedor);
        getProveedor().setContacto_proveedor(contacto_proveedor);
        return GestorBD.insertarProveedor(getProveedor());
    }
    public boolean mostrarProveedor(){
        proveedor = GestorBD.mostrarProveedor(proveedor);
        return proveedor!=null;
    }
    public boolean actualizarProve(Proveedor nueva_infoprov){
        boolean respuesta = GestorBD.actualizarProveedor(nueva_infoprov);
        if(respuesta){
            proveedor = nueva_infoprov;
        }
        return respuesta;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
}
