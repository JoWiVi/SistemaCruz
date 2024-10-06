
package percistencia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import logica.Cliente;
import logica.DetalleFactura;
import logica.Factura;
import logica.Producto;
import logica.Proveedor;
import logica.Usuario;
import logica.constantes.Conexion;
import logica.constantes.Consulta;

public class GestorBD {
    public static Usuario validarUsuario(Usuario usuario){
     Connection conn;
     Statement stmt;
     ResultSet rs = null;
     Usuario respuesta = null;
     
     try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         stmt = conn.createStatement();
         rs = stmt.executeQuery(Consulta.ValidarUsuario(usuario));
         
         if(rs.next()){
             respuesta = new Usuario();
             respuesta.setId_usuario(rs.getInt("id_User"));
             respuesta.setNombre_usuario(rs.getString("nombre_User"));
             respuesta.setContraseña_usuario(rs.getString("contraseña_user"));
             respuesta.setRol_empleado(rs.getString("rol_empleado"));
         }
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return respuesta;
    }
    public static boolean usuarioExiste(Usuario usuario) {
        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
        try {
        Class.forName(Conexion.DRIVER);
        conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
        pe = conn.prepareStatement(Consulta.usuarioExiste(usuario));
        rs = pe.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);  // Obtener el número de filas encontradas
            return count > 0;  // Si count > 0, el usuario ya existe
        }
        conn.close();
    } catch(Exception e){
             System.out.println("ERROR: "+e);
     }
    return false;
    }
    public static boolean insertarUsuario(Usuario usuario){
        
        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
        
         try{
             Class.forName(Conexion.DRIVER);
             conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
             pe = conn.prepareStatement(Consulta.crearInserUsuario(usuario),Statement.RETURN_GENERATED_KEYS);
             pe.executeUpdate();
             rs = pe.getGeneratedKeys();
             if(rs.next()){
                     return rs.getInt(1)>1;
                 }
             conn.close();
         }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return false;
    }
    public static Usuario mostrarUsuario(Usuario usuario){
     Connection conn;
     Statement stmt;
     ResultSet rs = null;
     Usuario respuesta = null;
     
     try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         stmt = conn.createStatement();
         System.out.println(Consulta.traerUsuario(usuario));
         rs = stmt.executeQuery(Consulta.traerUsuario(usuario));
         
         if(rs.next()){
             respuesta = new Usuario();
             respuesta.setId_usuario(rs.getInt("id_User"));
             respuesta.setNombre_usuario(rs.getString("nombre_User"));
             respuesta.setContraseña_usuario(rs.getString("contraseña_user"));
             respuesta.setRol_empleado(rs.getString("rol_empleado"));
         }
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return respuesta;
    }
    public static boolean actualizarUsuario(Usuario usuario){
     Connection conn;
     PreparedStatement pe;
     ResultSet rs = null;
     boolean respuesta = false;
     
     try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         System.out.println(Consulta.modificarUpdaUsuario(usuario));
         pe = conn.prepareStatement(Consulta.modificarUpdaUsuario(usuario));
         pe.execute();
         respuesta = pe.getUpdateCount()>0;
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
     }
      return respuesta;
    }
    public static boolean borrarUsuario(Usuario usuario){
        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        boolean resultado = false;
        try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         stmt = conn.createStatement();
         System.out.println(Consulta.eliminarDeleUsuario(usuario));
         stmt.execute(Consulta.eliminarDeleUsuario(usuario));
         resultado = stmt.getUpdateCount()>0;
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
     }
      return resultado;
    }
    public static boolean insertarProducto(Producto producto){
        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
         try{
             Class.forName(Conexion.DRIVER);
             conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
             pe = conn.prepareStatement(Consulta.crearInserProducto(producto),Statement.RETURN_GENERATED_KEYS);
             pe.executeUpdate();
             rs = pe.getGeneratedKeys();
             if(rs.next()){
                     return rs.getInt(1)>1;
                 }
             conn.close();
         }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return false;
    }
    public static boolean codigoExiste(Producto producto) {
        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
        try {
        Class.forName(Conexion.DRIVER);
        conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
        pe = conn.prepareStatement(Consulta.codigoExiste(producto));
        rs = pe.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);  // Obtener el número de filas encontradas
            return count > 0;  // Si count > 0, el usuario ya existe
        }
        conn.close();
    } catch(Exception e){
             System.out.println("ERROR: "+e);
     }
    return false;
    }
    public static Producto mostrarProducto(Producto producto){
     Connection conn;
     Statement stmt;
     ResultSet rs = null;
     Producto respuesta = null;
     
     try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         stmt = conn.createStatement();
         System.out.println(Consulta.traerProducto(producto));
         rs = stmt.executeQuery(Consulta.traerProducto(producto));
         
         if(rs.next()){
             respuesta = new Producto();
             respuesta.setId_producto(rs.getInt("id_producto"));
             respuesta.setCodigo_producto(rs.getString("codigo_producto"));
             respuesta.setNombre_producto(rs.getString("nombre_producto"));
             respuesta.setMarca_producto(rs.getString("marca_producto"));
             respuesta.setPrecio_producto(rs.getDouble("precio_producto"));
             respuesta.setCantidad_producto(rs.getInt("cantidad_producto"));
         }
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return respuesta;
    }
        
    public static boolean actualizarProducto(Producto producto){
     Connection conn;
     PreparedStatement pe;
     ResultSet rs = null;
     boolean respuesta = false;
     
     try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         System.out.println(Consulta.modificarUpdaProducto(producto));
         pe = conn.prepareStatement(Consulta.modificarUpdaProducto(producto));
         pe.execute();
         respuesta = pe.getUpdateCount()>0;
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
     }
      return respuesta;
    }
    public static boolean insertarCliente(Cliente cliente){
        
        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
        
         try{
             Class.forName(Conexion.DRIVER);
             conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
             pe = conn.prepareStatement(Consulta.crearInserCliente(cliente),Statement.RETURN_GENERATED_KEYS);
             pe.executeUpdate();
             rs = pe.getGeneratedKeys();
             if(rs.next()){
                     return rs.getInt(1)>1;
                 }
             conn.close();
         }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return false;
    }
    public static Cliente mostrarCliente(Cliente cliente){
     Connection conn;
     Statement stmt;
     ResultSet rs = null;
     Cliente respuesta = null;
     
     try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         stmt = conn.createStatement();
         System.out.println(Consulta.traerCliente(cliente));
         rs = stmt.executeQuery(Consulta.traerCliente(cliente));
         
         if(rs.next()){
             respuesta = new Cliente();
             respuesta.setId_cliente(rs.getInt("id_cliente"));
             respuesta.setNombre_cliente(rs.getString("nombres_cliente"));
             respuesta.setAppaterno_cliente(rs.getString("appaterno_cliente"));
             respuesta.setApmaterno_cliente(rs.getString("apmaterno_cliente"));
         }
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return respuesta;
    }
    public static boolean actualizarCliente(Cliente cliente){
     Connection conn;
     PreparedStatement pe;
     ResultSet rs = null;
     boolean respuesta = false;
     
     try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         System.out.println(Consulta.modificarUpdaCliente(cliente));
         pe = conn.prepareStatement(Consulta.modificarUpdaCliente(cliente));
         pe.execute();
         respuesta = pe.getUpdateCount()>0;
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
     }
      return respuesta;
    }
    public static boolean borrarCliente(Cliente cliente){
        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        boolean resultado = false;
        try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         
         stmt = conn.createStatement();
         System.out.println(Consulta.eliminarDeleCliente(cliente));
         stmt.execute(Consulta.eliminarDeleCliente(cliente));
         resultado = stmt.getUpdateCount()>0;
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
     }
      return resultado;
    }
    
    public static boolean insertarProveedor(Proveedor proveedor){
        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
        try{
             Class.forName(Conexion.DRIVER);
             conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
             pe = conn.prepareStatement(Consulta.crearInserProveedor(proveedor),Statement.RETURN_GENERATED_KEYS);
             pe.executeUpdate();
             rs = pe.getGeneratedKeys();
             if(rs.next()){
                     return rs.getInt(1)>1;
                 }
             conn.close();
         }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return false;
    }
    public static Proveedor mostrarProveedor(Proveedor proveedor){
     Connection conn;
     Statement stmt;
     ResultSet rs = null;
     Proveedor respuesta = null;
     
     try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         stmt = conn.createStatement();
         System.out.println(Consulta.traerProveedor(proveedor));
         rs = stmt.executeQuery(Consulta.traerProveedor(proveedor));
         
         if(rs.next()){
             respuesta = new Proveedor();
             respuesta.setId_proveedor(rs.getInt("id_proveedor"));
             respuesta.setNombre_proveedor(rs.getString("nombre_proveedor"));
             respuesta.setContacto_proveedor(rs.getString("contacto_proveedor"));
         }
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return respuesta;
    }
    public static boolean actualizarProveedor(Proveedor proveedor){
     Connection conn;
     PreparedStatement pe;
     ResultSet rs = null;
     boolean respuesta = false;
     
     try{
         Class.forName(Conexion.DRIVER);
         conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
         System.out.println(Consulta.modificarUpdaProveedor(proveedor));
         pe = conn.prepareStatement(Consulta.modificarUpdaProveedor(proveedor));
         pe.execute();
         respuesta = pe.getUpdateCount()>0;
         conn.close();
     }catch(Exception e){
             System.out.println("ERROR: "+e);
     }
      return respuesta;
    }
    public static List<Producto> buscarLikProducto(Producto producto){
        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
        List<Producto> productos = new ArrayList<>();
         try{
            Class.forName(Conexion.DRIVER);
            conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
            pe = conn.prepareStatement(Consulta.buscarLikProducto(producto));

            // Establecer el valor del parámetro para el LIKE
            pe.setString(1, "%" + producto.getNombre_producto() + "%");
            rs = pe.executeQuery();
            while (rs.next()){
                Producto p = new Producto();
                p.setId_producto(rs.getInt("id_producto"));
                p.setCodigo_producto(rs.getString("codigo_producto"));
                p.setNombre_producto(rs.getString("nombre_producto"));
                p.setMarca_producto(rs.getString("marca_producto"));
                p.setPrecio_producto(rs.getDouble("precio_producto"));
                p.setCantidad_producto(rs.getInt("cantidad_producto"));
                
                productos.add(p);  // Agregar producto a la lista
            }
         }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return productos;  // Devolver la lista de productos encontrados
    } 
    public static List<Cliente> buscarLikCliente(Cliente cliente){
        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
        List<Cliente> clientes = new ArrayList<>();
         try{
            Class.forName(Conexion.DRIVER);
            conn = DriverManager.getConnection(Conexion.URL,Conexion.USER,Conexion.PASS);
            pe = conn.prepareStatement(Consulta.buscarLikCliente(cliente));
            
            //pe.execute();
            // Establecer el valor del parámetro para el LIKE
            pe.setString(1, "%" + cliente.getNombre_cliente() + "%");
            rs = pe.executeQuery();
            while (rs.next()){
                Cliente c = new Cliente();
                c.setId_cliente(rs.getInt("id_cliente"));
                c.setNombre_cliente(rs.getString("nombres_cliente"));
                c.setAppaterno_cliente(rs.getString("appaterno_cliente"));
                c.setApmaterno_cliente(rs.getString("apmaterno_cliente"));
                clientes.add(c);  // Agregar producto a la lista
            }
         }catch(Exception e){
             System.out.println("ERROR: "+e);
         }
         return clientes;  // Devolver la lista de productos encontrados
    }
    public static boolean crearFacturae(Factura factura){
         Connection conn = null;
         CallableStatement pe = null;

    try {
        // Cargar el driver y establecer conexión
        Class.forName(Conexion.DRIVER);
        conn = DriverManager.getConnection(Conexion.URL, Conexion.USER, Conexion.PASS);
        
        // Obtener la consulta generada por Consulta.crearInserFacturas()
        String sql = Consulta.crearInserFacturas();  // No pasamos 'factura' aquí, solo obtenemos la consulta
        
        // Crear el CallableStatement para la inserción de la factura
        pe = conn.prepareCall(sql);
        
        // Establecer el parámetro del ID del cliente
        pe.setInt(1, factura.getId_cliente());
        
        // Ejecutar la consulta
        int rowsAffected = pe.executeUpdate();
        
        // Verificar si la inserción fue exitosa
        return rowsAffected > 0;
        
    } catch (Exception e) {
        System.out.println("ERROR: " + e.getMessage());
        e.printStackTrace();
    } finally {
        // Cerrar los recursos de la base de datos de manera segura
        try {
            if (pe != null) pe.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            System.out.println("ERROR al cerrar los recursos: " + e.getMessage());
        }
    }
    return false;
    }
public static boolean realizarVenta(DetalleFactura detallefactura, Producto producto) {
    Connection conn = null;
    PreparedStatement peDetalle = null;
    PreparedStatement peProducto = null;

    try {
        // Configurar la conexión a la base de datos
        Class.forName(Conexion.DRIVER);
        conn = DriverManager.getConnection(Conexion.URL, Conexion.USER, Conexion.PASS);

        // Preparar la consulta para insertar en detallefactura
        String sqlDetalle = Consulta.insertarDetalleFac(detallefactura);
        peDetalle = conn.prepareStatement(sqlDetalle);
        peDetalle.setInt(1, detallefactura.getFk_id_producto());
        peDetalle.setInt(2, detallefactura.getCantidad_f());
        peDetalle.setDouble(3, detallefactura.getPrecioV_f());
        
        // Preparar la consulta para actualizar la cantidad de productos
        String sqlProducto = Consulta.actualizarCantidadPro(producto);
        peProducto = conn.prepareStatement(sqlProducto);
        peProducto.setInt(1, producto.getCantidad_producto());
        peProducto.setInt(2, producto.getId_producto());

        // Ejecutar las consultas
        peDetalle.executeUpdate();
        peProducto.executeUpdate();
        
        return true; // Venta exitosa
        
    } catch (Exception e) {
        System.out.println("ERROR: " + e.getMessage());
        e.printStackTrace();
        return false; // Venta fallida
    } finally {
        // Cerrar los recursos
        try {
            if (peDetalle != null) peDetalle.close();
            if (peProducto != null) peProducto.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            System.out.println("ERROR al cerrar los recursos: " + e.getMessage());
        }
    }
}
public static Factura UltimaFactura(Factura factura) {
    Connection conn = null;
    PreparedStatement pe = null;
    ResultSet rs = null;
    Factura respuesta = null;
    try {
        // Configurar la conexión a la base de datos
        Class.forName(Conexion.DRIVER);
        conn = DriverManager.getConnection(Conexion.URL, Conexion.USER, Conexion.PASS);
        pe = conn.prepareStatement(Consulta.mostrarUltimaFac(factura));
        rs = pe.executeQuery();
        if(rs.next()){
            respuesta = new Factura();
            respuesta.setId_factura(rs.getInt("UltimaFactura"));
        }
        conn.close();
    }catch(Exception e){
             System.out.println("ERROR: "+e);
    }
    return respuesta;
    }
public static Factura BuscarFacturaCliente(Factura factura, Cliente cliente) {
    Connection conn = null;
    PreparedStatement pe = null;
    ResultSet rs = null;
    Factura respuesta = null;
    try {
        // Configurar la conexión a la base de datos
        Class.forName(Conexion.DRIVER);
        conn = DriverManager.getConnection(Conexion.URL, Conexion.USER, Conexion.PASS);
        pe = conn.prepareStatement(Consulta.buscarFacturaCliente(factura, cliente));
        
        // Pasar el ID de la factura a la consulta
        pe.setInt(1, factura.getId_factura());
        
        rs = pe.executeQuery();
        
        if (rs.next()) {
            // Crear una nueva instancia de Factura y Cliente
            respuesta = new Factura();
            cliente = new Cliente();
            
            // Llenar los datos de la factura
            respuesta.setId_factura(rs.getInt("id_factura"));
            respuesta.setFecha_factura(rs.getDate("fecha_factura"));
            
            // Llenar los datos del cliente
            cliente.setNombre_cliente(rs.getString("nombres_cliente"));
            cliente.setAppaterno_cliente(rs.getString("appaterno_cliente"));
            cliente.setApmaterno_cliente(rs.getString("apmaterno_cliente"));
            
            // Asociar el cliente a la factura (si la clase Factura tiene ese campo)
            respuesta.setId_clientef(cliente); 
        }
    } catch (Exception e) {
        System.out.println("ERROR: " + e.getMessage());
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (pe != null) pe.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar recursos: " + e.getMessage());
        }
    }
    return respuesta;
}
public static List<Factura> BuscarFacturaProducto(Factura factura) {
    Connection conn;
    PreparedStatement pe;
    ResultSet rs;
    List<Factura> facturas = new ArrayList<>();

    try {
        Class.forName(Conexion.DRIVER);
        conn = DriverManager.getConnection(Conexion.URL, Conexion.USER, Conexion.PASS);
        pe = conn.prepareStatement(Consulta.buscarFacturaProducto(factura));

        // Establecer el valor del parámetro para el LIKE
        pe.setInt(1, factura.getId_factura());
        rs = pe.executeQuery();

        while (rs.next()) {
            Producto p = new Producto();
            DetalleFactura dfp = new DetalleFactura();
            
            p.setNombre_producto(rs.getString("nombre_producto"));
            dfp.setCantidad_f(rs.getInt("cantidad_f"));
            dfp.setPrecioV_f(rs.getDouble("precioV_f"));
            dfp.setProducto(p); // Asegúrate de que DetalleFactura tenga un método para establecer un Producto
            
            // Crear una nueva factura para cada resultado o agregar a una existente
            Factura nuevaFactura = new Factura();
            nuevaFactura.setId_factura(factura.getId_factura());
            nuevaFactura.addDetalle(dfp); // Añadir detalle a la factura

            // Verifica si ya existe una factura en la lista y agrégale el detalle si es así
            boolean found = false;
            for (Factura f : facturas) {
                if (f.getId_factura() == nuevaFactura.getId_factura()) {
                    f.addDetalle(dfp);
                    found = true;
                    break;
                }
            }
            // Si no existe, añade la nueva factura a la lista
            if (!found) {
                facturas.add(nuevaFactura);
            }
        }
    } catch (Exception e) {
        System.out.println("ERROR: " + e);
    }
    return facturas; // Devolver la lista de facturas encontradas
}
public static List<Factura> BuscarPorFechaFac(Factura factura) {
    Connection conn;
    PreparedStatement pe;
    ResultSet rs;
    List<Factura> facturas = new ArrayList<>();

    try {
        Class.forName(Conexion.DRIVER);
        conn = DriverManager.getConnection(Conexion.URL, Conexion.USER, Conexion.PASS);
        pe = conn.prepareStatement(Consulta.buscarporfechas(factura));
        java.util.Date fechaDesde = factura.getFecha_factura();
        java.util.Date fechaHasta = factura.getFecha_factura();
        java.sql.Date fechaDesdeSQL = new java.sql.Date(fechaDesde.getTime());
        java.sql.Date fechaHastaSQL = new java.sql.Date(fechaHasta.getTime());
        
        // Establecer el valor del parámetro para el LIKE
        pe.setDate(1, fechaDesdeSQL);
        pe.setDate(2, fechaHastaSQL);
        
        //pe.setInt(1, factura.getId_factura());
        rs = pe.executeQuery();

        while (rs.next()) {
            Producto p = new Producto();
            Factura f = new Factura();
            DetalleFactura dfp = new DetalleFactura();
            f.setId_factura(rs.getInt("id_factura"));
            f.setFecha_factura(rs.getDate("fecha_factura"));
            p.setNombre_producto(rs.getString("nombre_producto"));
            dfp.setCantidad_f(rs.getInt("cantidad_f"));
            dfp.setPrecioV_f(rs.getDouble("precioV_f"));
            dfp.setProducto(p); // Asegúrate de que DetalleFactura tenga un método para establecer un Producto
            
            // Crear una nueva factura para cada resultado o agregar a una existente
            Factura nuevaFactura = new Factura();
            nuevaFactura.setId_factura(factura.getId_factura());
            nuevaFactura.addDetalle(dfp); // Añadir detalle a la factura

            // Verifica si ya existe una factura en la lista y agrégale el detalle si es así
            boolean found = false;
            /*for (Factura f : facturas) {
                if (f.getId_factura() == nuevaFactura.getId_factura()) {
                    f.addDetalle(dfp);
                    found = true;
                    break;
                }
            }*/
            // Si no existe, añade la nueva factura a la lista
            if (!found) {
                facturas.add(nuevaFactura);
            }
        }
    } catch (Exception e) {
        System.out.println("ERROR: " + e);
    }
    return facturas; // Devolver la lista de facturas encontradas
}
}
