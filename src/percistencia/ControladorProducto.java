package percistencia;

import logica.Producto;

public class ControladorProducto {
    
    private Producto producto;
    public ControladorProducto(){
        producto = new Producto();
    }
    public boolean insertarPro(String codigo_producto,String nombre_producto,String marca_producto, double precio_producto, int cantidad_producto){
        getProducto().setCodigo_producto(codigo_producto);
        getProducto().setNombre_producto(nombre_producto);
        getProducto().setMarca_producto(marca_producto);
        getProducto().setPrecio_producto(precio_producto);
        getProducto().setCantidad_producto(cantidad_producto);
         // Verificar si el usuario ya existe
        if (GestorBD.codigoExiste(getProducto())) {
            return false; // El usuario ya existe
        } else {
            return GestorBD.insertarProducto(getProducto()); // Inserta el nuevo usuario
        }
    }
    public boolean mostrarProducto(){
        producto = GestorBD.mostrarProducto(producto);
        return producto!=null;
    }
    public boolean actualizarPro(Producto nueva_info){
        boolean respuesta = GestorBD.actualizarProducto(nueva_info);
        if(respuesta){
            producto = nueva_info;
        }
        return respuesta;
    }
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
