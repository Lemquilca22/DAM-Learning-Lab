package practicar1;

public class UsuarioControlador {
    private Usuario modelo;
    private UsuarioVista vista;

    public UsuarioControlador(Usuario modelo, UsuarioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar(){
        vista.mostrarMensaje("Registro de usuario");

        String nombre= vista.pedirNombre();
        int edad= vista.pedirEdad();
        String marca= vista.pedirMarca();

        modelo.getCoche().setMarca(marca);

        modelo.setNombre(nombre);
        modelo.setEdad(edad);
        vista.mostrarUsuario(modelo.getNombre(), modelo.getEdad(),modelo.getCoche());
    }
}
