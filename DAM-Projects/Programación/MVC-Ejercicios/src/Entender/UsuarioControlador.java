package Entender;

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

//        modelo.setNombre(nombre);
//        modelo.setEdad(edad);
//
//        vista.mostrarUsuario(modelo.getNombre(), modelo.getEdad());
        modelo=new Usuario(nombre,edad);
        vista.mostrarUsuario(nombre,edad);

    }
}
