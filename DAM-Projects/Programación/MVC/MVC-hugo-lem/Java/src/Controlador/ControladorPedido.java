package Controlador;

import Modelo.Comida;
import Modelo.Bebida;
import Vista.Vista;

public class ControladorPedido {
    private Vista vista;
    private Comida modeloAux;

    public ControladorPedido(Vista vista) {
        this.vista = vista;
        this.modeloAux = new Comida("", "", "", "", "", "", "");
    }

    public void iniciar() {
        // 1. Nombre
        String nombre = vista.pedirString("Nombre de la hamburguesa: ");

        // 2. Tamaño
        vista.mostrarMensaje("\n--- Escoge Tamaño ---");
        for (int i = 0; i < modeloAux.cantidadTamanios(); i++)
            System.out.println(i + ". " + modeloAux.gettamanio(i));
        String tam = modeloAux.gettamanio(vista.pedirEntero("Opción: "));

        // 3. Pan Abajo
        vista.mostrarMensaje("\n--- Pan Inferior ---");
        for (int i = 0; i < modeloAux.cantidadPan(); i++)
            System.out.println(i + ". " + modeloAux.getPan(i));
        String pInf = modeloAux.getPan(vista.pedirEntero("Opción: "));

        // 4. Ingrediente 1
        vista.mostrarMensaje("\n--- Ingrediente 1 ---");
        for (int i = 0; i < modeloAux.cantidadIngredientes(); i++)
            System.out.println(i + ". " + modeloAux.getingrediente(i));
        String ing1 = modeloAux.getingrediente(vista.pedirEntero("Opción: "));

        // 5. Carne
        vista.mostrarMensaje("\n--- Tipo de Carne ---");
        for (int i = 0; i < modeloAux.cantidadCarnes(); i++)
            System.out.println(i + ". " + modeloAux.getcarne(i));
        String carne = modeloAux.getcarne(vista.pedirEntero("Opción: "));

        // 6. Ingrediente 2
        vista.mostrarMensaje("\n--- Ingrediente 2 ---");
        for (int i = 0; i < modeloAux.cantidadIngredientes(); i++)
            System.out.println(i + ". " + modeloAux.getingrediente(i));
        String ing2 = modeloAux.getingrediente(vista.pedirEntero("Opción: "));

        // 7. Pan Arriba
        vista.mostrarMensaje("\n--- Pan Superior ---");
        for (int i = 0; i < modeloAux.cantidadPan(); i++)
            System.out.println(i + ". " + modeloAux.getPan(i));
        String pSup = modeloAux.getPan(vista.pedirEntero("Opción: "));

        // --- Bebida ---
        vista.mostrarMensaje("\n--- Selecciona Bebida ---");
        String[] bNom = Bebida.getBebidas();
        double[] bPre = Bebida.getPrecios();
        for (int i = 0; i < bNom.length; i++)
            System.out.println((i + 1) + ". " + bNom[i] + " (" + bPre[i] + "€)");
        int selB = vista.pedirEntero("Número: ");


        Comida hFinal = new Comida(nombre, tam, pSup, ing1, carne, ing2, pInf);
        Bebida bFinal = new Bebida(Bebida.getNombre(selB), Bebida.getPrecio(selB), "Mediana", true);

        vista.mostrarRecibo(bFinal, hFinal);
    }
}