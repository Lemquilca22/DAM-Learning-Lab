package Vista;

import Modelo.Comida;
import Modelo.Bebida;
import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);

    public void mostrarMensaje(String m) { System.out.println(m); }

    public String pedirString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        int op = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        return op;
    }

    public void mostrarRecibo(Bebida b, Comida c) {
        System.out.println("\n========================================");
        System.out.println("          🍔 TICKET DE PEDIDO           ");
        System.out.println("========================================");
        System.out.println("HAMBURGUESA: " + c.getNomhamburguesa());
        System.out.println("Detalle: " + c.getTamanioH() + " | Carne: " + c.getTipocarne());
        System.out.println("Ingredientes: " + c.getIngredientes1() + " y " + c.getIngredientes2());
        System.out.println("Panes: Inf: " + c.getPanbottom1() + " / Sup: " + c.getPanTop());
        System.out.println("----------------------------------------");
        System.out.println("BEBIDA: " + b.getNombreBebida() + " (" + b.getPrecioBebida() + "€)");
        System.out.println("========================================\n");
    }
}