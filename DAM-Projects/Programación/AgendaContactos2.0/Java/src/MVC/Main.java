package MVC;

public class Main {
    static void main(String[] args) {
        VistaContacto vista = new VistaContacto();
        ControladorContacto controlador = new ControladorContacto(vista);
        controlador.iniciar();

    }
}
