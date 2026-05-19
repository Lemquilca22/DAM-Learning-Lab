public class Cliente {
    String nombre;
    String email;
    String direccion;

    public Cliente(String nombre, String email, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente:" +
                "\nnombre: " + nombre +
                "\nemail: " + email +
                "\ndireccion: " + direccion;
    }
}
