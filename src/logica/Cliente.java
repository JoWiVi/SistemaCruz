
package logica;

public class Cliente {
    public static final String CAMPO_ID_CLI = "id_cliente";
    private int id_cliente;
    private String nombre_cliente;
    private String appaterno_cliente;
    private String apmaterno_cliente;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getAppaterno_cliente() {
        return appaterno_cliente;
    }

    public void setAppaterno_cliente(String appaterno_cliente) {
        this.appaterno_cliente = appaterno_cliente;
    }

    public String getApmaterno_cliente() {
        return apmaterno_cliente;
    }

    public void setApmaterno_cliente(String apmaterno_cliente) {
        this.apmaterno_cliente = apmaterno_cliente;
    }
    
}
