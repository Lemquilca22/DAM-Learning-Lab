package MVCvers1;

import java.util.Scanner;

public class ComidaVista {

    private Scanner scanner = new Scanner(System.in);

    public int pedirComida() {
        System.out.print("Introduce el número de la Hamburguesa: ");
        return scanner.nextInt();
    }

    public int pedirBebida() {
        System.out.print("Ingresa el número de la gaseosa que deseas beber: ");
        return scanner.nextInt();
    }

    public void mostrarMenu(String menu) {
        System.out.println(menu);
    }

    public void mostrarBebidas(String bebidas) {
        System.out.println(bebidas);
    }

    public static void mostrarComida(Comida comida) {
        System.out.println("\n══════════════════════════════");
        System.out.println("        🧾 TU ORDEN           ");
        System.out.println("══════════════════════════════");
        System.out.println("🍔 Hamburguesa : " + comida.getNombreHamburguesa()
                + " - " + comida.getPrecioHamburguesa() + "€");
        System.out.println("🥤 Bebida      : " + comida.getNombreBebida()
                + " - " + comida.getPrecioBebida() + "€");
        System.out.println("──────────────────────────────");
        System.out.println("💰 TOTAL       : " + comida.getTotal() + "€");
        System.out.println("══════════════════════════════");
    }
}