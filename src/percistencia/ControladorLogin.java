
package percistencia;

import logica.Usuario;

public class ControladorLogin {
    private Usuario usuario;
    
    public ControladorLogin(){
        usuario = new Usuario();
    }
    public Usuario validarUsuario(String nombre_usuario,String contraseña_usuario){
        usuario.setNombre_usuario(nombre_usuario);
        usuario.setContraseña_usuario(contraseña_usuario);
        
        return GestorBD.validarUsuario(usuario);
    }
}
