package practicar1;

public class main {
    static void main(String[] args) {
        Coche coche1= new Coche("");
        Usuario modelo= new Usuario("",0,coche1);
        UsuarioVista vista = new UsuarioVista();
        UsuarioControlador controlador = new UsuarioControlador(modelo,vista);

        controlador.iniciar();
    }
}
