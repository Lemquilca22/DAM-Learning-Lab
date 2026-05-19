import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Main {

    public static int salud = 100;
    public static int hambre = 100;
    public static int sed = 100;
    public static int sueno = 100;
    public static int paranoia = 0;
    public static int dia = 1;
    public static int monedas = 10;

    static ArrayList<String> historialEventos = new ArrayList<>();
    static String statsTexto = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            salud = 100; hambre = 100; sed = 100; sueno = 100;
            paranoia = 0; dia = 1; monedas = 10;
            historialEventos.clear();

            System.out.println("===== MADURO SURVIVAL =====");
            System.out.println("\nEra una noche tranquila después de fin de año...");
            System.out.println("El político corrupto Nicolás Maduro dormía en su casa.");
            System.out.println("De repente, su hogar fue bombardeado y él fue secuestrado...");
            System.out.println("Ahora deberá sobrevivir en la prisión que él mismo descuidó.");
            System.out.println("Presiona ENTER para comenzar...");
            sc.nextLine();

            // EVENTO INICIAL
            System.out.println("\n===== LLEGADA A LA PRISIÓN =====");
            Eventos.sucesoLlegada(sc);
            actualizarStatsTexto();

            while (salud > 0) {
                System.out.println("\n===========================");
                System.out.println("        DÍA " + dia);
                System.out.println("===========================");
                mostrarStats();
                System.out.println("Monedas: " + monedas);

                int opcion = leerOpcion(sc, "ACCIONES DISPONIBLES:\n1. Salir al patio (Iniciar 4 eventos)\n2. Ver historial", 1, 2);

                if (opcion == 2) {
                    mostrarHistorial();
                    continue;
                }

                // 3 ALEATORIOS + 1 FIJO AL FINAL ---
                ArrayList<Integer> ordenEventos = new ArrayList<>(Arrays.asList(1, 2, 3));
                Collections.shuffle(ordenEventos); // Barajamos solo los primeros 3
                ordenEventos.add(4); // Añadimos el evento 4 (Dormir) siempre al final

                System.out.println("\n--- COMIENZAN LOS EVENTOS DEL DÍA ---");
                for (int i = 0; i < 4; i++) {
                    if (salud <= 0) break;
                    System.out.println("\n[SITUACIÓN " + (i + 1) + " de 4]");

                    // Llama a los eventos según la lista generada
                    Eventos.sucesoDelDia(sc, ordenEventos.get(i));
                    actualizarStatsTexto();
                }

                if (salud > 0) {
                    tienda(sc);
                    pasarDia();
                    dia++;
                }
            }

            System.out.println("\n☠ HAS MUERTO ☠");
            System.out.println("Sobreviviste " + (dia - 1) + " días.");
            System.out.println("\nPresiona ENTER para volver al inicio...");
            sc.nextLine();
        }
    }

    public static int leerOpcion(Scanner sc, String menu, int min, int max) {
        int eleccion = -1;
        while (true) {
            System.out.println("\n" + menu);
            System.out.print("Selección: ");
            try {
                String input = sc.next();
                eleccion = Integer.parseInt(input);
                sc.nextLine();
                if (eleccion >= min && eleccion <= max) return eleccion;
                else System.out.println("Opción no válida.");
            } catch (Exception e) {
                System.out.println("Introduce un número.");
                sc.nextLine();
            }
        }
    }

    static void pasarDia() {
        hambre -= 15; sed -= 20; sueno -= 20;
        if (hambre <= 0) { hambre = 0; salud -= 10; System.out.println("(!) Debilidad por hambre."); }
        if (sed <= 0) { sed = 0; salud -= 15; System.out.println("(!) Deshidratación crítica."); }
        if (sueno <= 0) { sueno = 0; salud -= 5; System.out.println("(!) Agotamiento extremo."); }
    }

    static void tienda(Scanner sc) {
        System.out.println("\n--- AL FINALIZAR EL DÍA ---");
        int op = leerOpcion(sc, "🛒 MERCADO CLANDESTINO\n1. Pan (+25 Hambre) - 5 monedas\n2. Agua (+25 Sed) - 5 monedas\n3. Pastillas (+20 Salud) - 10 monedas\n4. Calmante (-15 Paranoia) - 8 monedas\n0. No comprar nada", 0, 4);
        switch (op) {
            case 1 -> comprar(5, () -> hambre = Math.min(100, hambre + 25), "Compraste pan");
            case 2 -> comprar(5, () -> sed = Math.min(100, sed + 25), "Compraste agua");
            case 3 -> comprar(10, () -> salud = Math.min(100, salud + 20), "Tomaste pastillas");
            case 4 -> comprar(8, () -> paranoia = Math.max(0, paranoia - 15), "Usaste un calmante");
        }
    }

    static void comprar(int coste, Runnable efecto, String evento) {
        if (monedas >= coste) {
            monedas -= coste;
            efecto.run();
            System.out.println("✔ " + evento);
            guardarEvento(evento);
        } else System.out.println("❌ No tienes monedas.");
    }

    static void mostrarStats() {
        System.out.println("Salud: " + salud + " | Hambre: " + hambre + " | Sed: " + sed);
        System.out.println("Sueño: " + sueno + " | Paranoia: " + paranoia);
    }

    static void actualizarStatsTexto() {
        statsTexto = "Salud: " + salud + " | Hambre: " + hambre + " | Sed: " + sed + " | Paranoia: " + paranoia;
    }

    static void guardarEvento(String evento) {
        historialEventos.add("Día " + dia + " | " + evento + " | " + statsTexto);
    }

    static void mostrarHistorial() {
        System.out.println("\n===== HISTORIAL =====");
        if (historialEventos.isEmpty()) System.out.println("Vacío.");
        else historialEventos.forEach(System.out::println);
    }
}