package Entender;

public class main {
    static void main(String[] args) {
        Usuario modelo= new Usuario("",0);
        UsuarioVista vista = new UsuarioVista();
        UsuarioControlador controlador = new UsuarioControlador(modelo,vista);

        controlador.iniciar();
    }
}
