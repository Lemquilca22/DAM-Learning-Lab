package MVCvers1;

public class ComidaControlador {

    private Comida modelo;
    private ComidaVista vista;

    public ComidaControlador(Comida modelo, ComidaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        vista.mostrarMenu("══════════════════════════════\n" +
                "         🍔 HAMBURGUESAS      \n" +
                "══════════════════════════════\n" +
                "1. Whopper ............... 8.0€\n" +
                "2. Whopper con Queso ..... 8.5€\n" +
                "3. Big King .............. 7.5€\n" +
                "4. Big King XXL .......... 8.5€\n" +
                "5. Hamburguesa con Queso . 4.0€\n" +
                "6. Chicken Royale ........ 8.0€\n" +
                "7. Long Chicken .......... 8.0€\n" +
                "8. Crispy Chicken ........ 7.5€\n" +
                "9. Hamburguesa Vegetal ... 8.0€\n" +
                "══════════════════════════════");

        int numHamburguesa = vista.pedirComida();

        vista.mostrarBebidas("══════════════════════════════\n" +
                "           🥤 BEBIDAS         \n" +
                "══════════════════════════════\n" +
                "1. Coca-Cola ............. 2.5€\n" +
                "2. Fanta Naranja ......... 2.5€\n" +
                "3. Sprite ................ 2.5€\n" +
                "4. Nestea ................ 2.5€\n" +
                "5. Agua .................. 2.0€\n" +
                "6. Cerveza ............... 3.0€\n" +
                "7. Batido Chocolate ...... 3.5€\n" +
                "8. Batido Vainilla ....... 3.5€\n" +
                "9. Batido Fresa .......... 3.5€\n" +
                "══════════════════════════════");

        int numBebida = vista.pedirBebida();

        Comida comida = new Comida(numHamburguesa, numBebida);
        ComidaVista.mostrarComida(comida);
    }
}