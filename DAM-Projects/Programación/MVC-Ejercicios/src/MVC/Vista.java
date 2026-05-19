package MVC;

import java.util.Scanner;

public class Vista {
    private Scanner scanner = new Scanner(System.in);

    public String pedirNombre() {
        System.out.print("Introduce tu nombre: ");
        return scanner.nextLine();
    }

    public int pedirHamburguesa() {
        System.out.print("Elige número de hamburguesa: ");
        return scanner.nextInt();
    }

    public int pedirBebida() {
        System.out.print("Elige número de bebida: ");
        return scanner.nextInt();
    }

    public void mostrarMenu(Comida comidas) {

        System.out.println("══════ 🍔 HAMBURGUESAS ══════");
        for (int i = 1; i <= comidas.cantidadHamburguesas(); i++) {
            System.out.println(i + ". " +
                    comidas.getHamburguesa(i) +
                    " - " +
                    comidas.getPrecioHamburguesa(i) + "€");
        }
    }
    public void mostrarBebidas(Comida comidas){
        System.out.println("\n══════ 🥤 BEBIDAS ══════");
        for (int i = 1; i <= comidas.cantidadBebidas(); i++) {
            System.out.println(i + ". " +
                    comidas.getBebida(i) +
                    " - " +
                    comidas.getPrecioBebida(i) + "€");
        }
    }

    public void mostrarResumen(Pedido pedido) {
        System.out.println("\n══════ RESUMEN ══════");
        System.out.println("Cliente: " + pedido.getPersona().getNombre());
        System.out.println("Hamburguesa: " + pedido.getHamburguesa());
        System.out.println("Bebida: " + pedido.getBebida());
        System.out.println("----------------------");
        System.out.println("TOTAL: " + pedido.getTotal() + "€");
    }
}
