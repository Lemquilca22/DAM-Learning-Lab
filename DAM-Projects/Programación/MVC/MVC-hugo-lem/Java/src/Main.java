import Controlador.ControladorPedido;
import Vista.Vista;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos la vista
        Vista vista = new Vista();

        // 2. Instanciamos el controlador pasándole la vista
        ControladorPedido controlador = new ControladorPedido(vista);

        // 3. Arrancamos el proceso de pedido
        controlador.iniciar();
    }
}