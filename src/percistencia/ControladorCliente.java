
package percistencia;

import logica.Cliente;

public class ControladorCliente {
    
   private Cliente cliente;
   
   public ControladorCliente(){
        cliente = new Cliente();
    }
   public boolean insertarCliente(String nombre_cliente,String appaterno_cliente, String apmaterno_cliente){
        
        getCliente().setNombre_cliente(nombre_cliente);
        getCliente().setAppaterno_cliente(appaterno_cliente);
        getCliente().setApmaterno_cliente(apmaterno_cliente);
        
        return GestorBD.insertarCliente(getCliente());
    }
    
    public boolean actualizarCliente(Cliente nueva_infoCli){
        boolean respuesta = GestorBD.actualizarCliente(nueva_infoCli);
        if(respuesta){
            cliente = nueva_infoCli;
        }
        return respuesta;
    }
    public boolean borrarCliente(Cliente cliente){
        return GestorBD.borrarCliente(cliente);
    }
    public boolean mostrarCliente(){
        cliente = GestorBD.mostrarCliente(cliente);
        return cliente!=null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
