package MVC;

public class Controlador {
    private Vista vista;
    private Comida comidas;

    public  Controlador(Vista vista) {
        this.vista = vista;
        this.comidas = new Comida();
    }

    public void iniciar() {

        String nombre = vista.pedirNombre();
        Persona persona = new Persona(nombre);

        vista.mostrarMenu(comidas);

        int opcionHamburguesa = vista.pedirHamburguesa();

        vista.mostrarBebidas(comidas);

        int opcionBebida = vista.pedirBebida();

        String hamburguesa = comidas.getHamburguesa(opcionHamburguesa);
        double precioH = comidas.getPrecioHamburguesa(opcionHamburguesa);

        String bebida = comidas.getBebida(opcionBebida);
        double precioB = comidas.getPrecioBebida(opcionBebida);

        double total = precioH + precioB;

        Pedido pedido = new Pedido(persona, hamburguesa, bebida, total);

        vista.mostrarResumen(pedido);
    }

}
