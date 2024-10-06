
package logica.constantes;
import logica.Cliente;
import logica.DetalleFactura;
import logica.Factura;
import logica.Producto;
import logica.Proveedor;
import logica.Usuario;

public class Consulta {
    public static final String TODOS_LOS_USUARIOS = "SELECT * FROM usuarios;";
    public static final String TODOS_LOS_PRODUCTOS = "SELECT * FROM productos;";
    
    /*TABLA USUARIOS*/
    public static String crearInserUsuario(Usuario usuario){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO `usuarios`(`id_User`, `nombre_User`, `contraseña_user`, `rol_empleado`) VALUES");
        sql.append("(NULL, '"+usuario.getNombre_usuario()+"','"+usuario.getContraseña_usuario()+"','"+usuario.getRol_empleado()+"');");
        return sql.toString();
    }
    public static String usuarioExiste(Usuario usuario){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT COUNT(*) FROM usuarios");
        sql.append(" WHERE nombre_User = '"+usuario.getNombre_usuario()+"';");
        return sql.toString();
    }
    public static String modificarUpdaUsuario(Usuario usuario){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE `usuarios` SET");
        sql.append(" `nombre_User` = '"+usuario.getNombre_usuario()+"', ");
        sql.append(" `contraseña_user` = '"+usuario.getContraseña_usuario()+"'");
        sql.append(" WHERE `id_User` = "+usuario.getId_usuario()+";");
        return sql.toString();
    }
    public static String eliminarDeleUsuario(Usuario usuario){
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM `usuarios`");
        sql.append("WHERE `id_User` = "+usuario.getId_usuario()+";");
        return sql.toString();
    }
    public static String ValidarUsuario(Usuario usuario){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM usuarios WHERE ");
        sql.append("nombre_User = '").append(usuario.getNombre_usuario()).append("' ");
        sql.append("AND contraseña_user = '").append(usuario.getContraseña_usuario()).append("';");
        return sql.toString();
    }
    public static String traerUsuario(Usuario usuario){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM usuarios WHERE ");
        sql.append(" nombre_User = '"+usuario.getNombre_usuario()+"';");
        return sql.toString();
    }
    
    /*TABLA: PRODUCTOS*/
    public static String crearInserProducto(Producto producto){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO `productos`(`id_producto`, `codigo_producto`, `nombre_producto`, `marca_producto`, `precio_producto`,`cantidad_producto`) VALUES");
        sql.append("(NULL,'"+producto.getCodigo_producto()+"','"+producto.getNombre_producto()+"','"+producto.getMarca_producto()+"','"+producto.getPrecio_producto()+"','"+producto.getCantidad_producto()+"');");
        return sql.toString();
    }
    public static String codigoExiste(Producto producto){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT COUNT(*) FROM productos");
        sql.append(" WHERE codigo_producto = '"+producto.getCodigo_producto()+"';");
        return sql.toString();
    }
    public static String traerProducto(Producto producto){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM productos WHERE ");
        sql.append(" nombre_producto = '"+producto.getNombre_producto()+"';");
        return sql.toString();
    }
    public static String modificarUpdaProducto(Producto producto){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE `productos` SET");
        sql.append(" `nombre_producto` = '"+producto.getNombre_producto()+"',");
        sql.append(" `marca_producto` = '"+producto.getMarca_producto()+"',");
        sql.append(" `precio_producto` = "+producto.getPrecio_producto()+",");
        sql.append(" `cantidad_producto` = "+producto.getCantidad_producto()+" ");
        sql.append("WHERE `id_producto` = "+producto.getId_producto());
        return sql.toString();
    }
    
    public static String buscarLikProducto(Producto producto){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM `productos` WHERE ");
        sql.append("nombre_producto LIKE ?");
        return sql.toString();
    }
    /*TABLA CLIENTE*/
    public static String crearInserCliente(Cliente cliente){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO `cliente`(`id_cliente`, `nombres_cliente`, `appaterno_cliente`, `apmaterno_cliente`) VALUES");
        sql.append("(NULL, '"+cliente.getNombre_cliente()+"','"+cliente.getAppaterno_cliente()+"','"+cliente.getApmaterno_cliente()+"');");
        return sql.toString();
    }
    public static String modificarUpdaCliente(Cliente cliente){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE `cliente` SET");
        sql.append(" `nombres_cliente` = '"+cliente.getNombre_cliente()+"', ");
        sql.append(" `appaterno_cliente` = '"+cliente.getAppaterno_cliente()+"',");
        sql.append(" `apmaterno_cliente` = '"+cliente.getApmaterno_cliente()+"'");
        sql.append(" WHERE `id_cliente` = "+cliente.getId_cliente()+";");
        return sql.toString();
    }
    public static String eliminarDeleCliente(Cliente cliente){
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM `usuarios`");
        sql.append("WHERE `id_User` = "+cliente.getId_cliente()+";");
        return sql.toString();
    }
    public static String traerCliente(Cliente cliente){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM cliente WHERE ");
        sql.append(" nombres_cliente = '"+cliente.getNombre_cliente()+"';");
        return sql.toString();
    }
    public static String buscarLikCliente(Cliente cliente){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM `cliente` WHERE ");
        sql.append("nombres_cliente LIKE ?");
        return sql.toString();
    }
    /*TABLA PROVEEDOR*/
    public static String crearInserProveedor(Proveedor proveedor){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO `proveedores`(`id_proveedor`,`nombre_proveedor`, `contacto_proveedor`) VALUES");
        sql.append("(NULL,'"+proveedor.getNombre_proveedor()+"','"+proveedor.getContacto_proveedor()+"');");
        return sql.toString();
    }
    public static String traerProveedor(Proveedor proveedor){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM proveedores WHERE ");
        sql.append(" nombre_proveedor = '"+proveedor.getNombre_proveedor()+"';");
        return sql.toString();
    }
    public static String modificarUpdaProveedor(Proveedor proveedor){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE `proveedores` SET");
        sql.append(" `nombre_proveedor` = '"+proveedor.getNombre_proveedor()+"',");
        sql.append(" `contacto_proveedor` = '"+proveedor.getContacto_proveedor()+"'");
        sql.append("WHERE `id_proveedor` = "+proveedor.getId_proveedor());
        return sql.toString();
    }
    /*TABLA FACTURA*/
    public static String crearInserFacturas(){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO `factura`(`id_factura`, `fecha_factura`, `fk_id_cliente`) VALUES");
        sql.append("(NULL, curdate(), ?)");
        return sql.toString();
    }
    /*DETALLE FACTURA*/
    public static String insertarDetalleFac(DetalleFactura detallefactura){
        StringBuilder sqlde = new StringBuilder();
        //StringBuilder sqlpd = new StringBuilder();
        sqlde.append("INSERT INTO `detallefactura`(`fk_id_factura`, `fk_id_producto`, `cantidad_f`, `precioV_f`) VALUES ((SELECT MAX(id_factura) FROM factura),?,?,?);");     
        return sqlde.toString();
    }
    public static String actualizarCantidadPro(Producto producto){
        StringBuilder sqlpd = new StringBuilder();
        sqlpd.append("UPDATE productos SET productos.cantidad_producto = cantidad_producto - ? WHERE id_producto = ?;");
        return sqlpd.toString();
    }
    public static String mostrarUltimaFac(Factura factura){
        StringBuilder sqlpd = new StringBuilder();
        sqlpd.append("SELECT MAX(id_factura) AS UltimaFactura FROM factura");
        return sqlpd.toString();
    }
    /*REPORTE FACTURAS*/
    public static String buscarFacturaCliente(Factura factura, Cliente cliente){
        StringBuilder sqlpd = new StringBuilder();
        sqlpd.append("SELECT factura.id_factura, factura.fecha_factura, cliente.nombres_cliente,cliente.appaterno_cliente,cliente.apmaterno_cliente FROM factura INNER JOIN cliente ON cliente.id_cliente = factura.fk_id_cliente WHERE factura.id_factura = ?");
        return sqlpd.toString();
    }
    public static String buscarFacturaProducto(Factura factura){
        StringBuilder sqlpd = new StringBuilder();
        sqlpd.append("SELECT productos.nombre_producto,detallefactura.cantidad_f,detallefactura.precioV_f FROM detallefactura ");
        sqlpd.append("INNER JOIN factura ON factura.id_factura = detallefactura.fk_id_factura ");
        sqlpd.append("INNER JOIN productos ON productos.id_producto = detallefactura.fk_id_producto ");
        sqlpd.append("WHERE factura.id_factura = ?");
        return sqlpd.toString();
    }
    public static String buscarporfechas(Factura factura){
        StringBuilder sqlpd = new StringBuilder();
        sqlpd.append("SELECT factura.id_factura, factura.fecha_factura,productos.nombre_producto,detallefactura.cantidad_f,detallefactura.precioV_f FROM detallefactura ");
        sqlpd.append("INNER JOIN factura ON factura.id_factura = detallefactura.fk_id_factura ");
        sqlpd.append("INNER JOIN productos ON productos.id_producto = detallefactura.fk_id_producto ");
        sqlpd.append("WHERE factura.fecha_factura BETWEEN ? AND ?");
        return sqlpd.toString();
    }
}
