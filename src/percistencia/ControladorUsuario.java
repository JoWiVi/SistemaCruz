package percistencia;
import logica.Usuario;
public class ControladorUsuario {
    
    private Usuario usuario;
    
    public ControladorUsuario(){
        usuario = new Usuario();
    }
   
    public boolean insertar(String nombre_usuario,String contraseña_usuario, String rol_empleado){
        
        getUsuario().setNombre_usuario(nombre_usuario);
        getUsuario().setContraseña_usuario(contraseña_usuario);
        getUsuario().setRol_empleado(rol_empleado);
        
         // Verificar si el usuario ya existe
        if (GestorBD.usuarioExiste(getUsuario())) {
            return false; // El usuario ya existe
        } else {
            return GestorBD.insertarUsuario(getUsuario()); // Inserta el nuevo usuario
        }
    }
    
    public boolean actualizar(Usuario nueva_info){
        boolean respuesta = GestorBD.actualizarUsuario(nueva_info);
        if(respuesta){
            usuario = nueva_info;
        }
        return respuesta;
    }
    public boolean borrarUsuario(Usuario usuario){
        return GestorBD.borrarUsuario(usuario);
    }
    public boolean mostrarUsuario(){
        usuario = GestorBD.mostrarUsuario(usuario);
        return usuario!=null;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
