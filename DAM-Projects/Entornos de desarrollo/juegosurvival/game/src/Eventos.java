import java.util.Scanner;

public class Eventos {

    public static void sucesoLlegada(Scanner sc) {
        System.out.println("\nTe arrojan a una celda húmeda y oscura. El sonido de los cerrojos retumba.");
        int op = Main.leerOpcion(sc, "1. Dormir en el suelo\n2. Mantenerte firme\n3. Gritar ayuda", 1, 3);

        switch (op) {
            case 1 -> { Main.sueno = Math.min(100, Main.sueno + 15); Main.paranoia += 5; System.out.println("Intentas descansar."); }
            case 2 -> { Main.salud = Math.min(100, Main.salud + 5); Main.paranoia -= 10; System.out.println("Te mantienes firme."); }
            case 3 -> { Main.salud -= 10; Main.paranoia += 15; System.out.println("Tus gritos se pierden."); }
        }
        Main.guardarEvento("Llegada a la prisión");
    }

    public static void sucesoDelDia(Scanner sc, int eventoID) {
        switch (eventoID) {
            case 1 -> sucesoComedor(sc);
            case 2 -> sucesoGuardia(sc);
            case 3 -> sucesoHallazgo(sc);
            case 4 -> sucesoDormirFijo(sc); // ESTE SIEMPRE SERÁ EL ÚLTIMO
        }
    }

    // EVENTO 4: FIJO AL FINAL DE CADA DÍA
    static void sucesoDormirFijo(Scanner sc) {
        System.out.println("\nSUCESO: El día termina y el silencio inunda la prisión. Necesitas descansar.");
        int op = Main.leerOpcion(sc, "1. Dormir en el suelo\n2. Mantenerte firme\n3. Gritar ayuda", 1, 3);

        switch (op) {
            case 1 -> {
                Main.sueno = Math.min(100, Main.sueno + 45);
                Main.paranoia += 5;
                System.out.println("Cierras los ojos y logras dormir un par de horas.");
            }
            case 2 -> {
                Main.paranoia -= 10;
                Main.sueno -= 5;
                System.out.println("No duermes, vigilas la puerta toda la noche.");
            }
            case 3 -> {
                Main.salud -= 5;
                Main.paranoia += 15;
                System.out.println("Tus gritos nocturnos molestan a los demás. No descansas nada.");
            }
        }
        Main.guardarEvento("Descanso nocturno");
    }

    static void sucesoComedor(Scanner sc) {
        System.out.println("\nSUCESO: El comedor está agitado hoy.");
        int op = Main.leerOpcion(sc, "1. Ahorrar fuerzas\n2. Robar pan\n3. Pelear por comida", 1, 3);
        switch (op) {
            case 1 -> { Main.hambre -= 10; System.out.println("Te alejas del lío."); }
            case 2 -> { Main.hambre += 20; Main.paranoia += 10; System.out.println("Consigues un trozo extra."); }
            case 3 -> { Main.salud -= 15; Main.hambre -= 20; System.out.println("Terminas herido y hambriento."); }
        }
        Main.guardarEvento("Comedor");
    }

    static void sucesoGuardia(Scanner sc) {
        System.out.println("\nSUCESO: Un guardia te ordena limpiar las letrinas con las manos.");
        int op = Main.leerOpcion(sc, "1. Obedecer\n2. Negarte\n3. Soborno (5 monedas)", 1, 3);
        switch (op) {
            case 1 -> { Main.salud -= 5; Main.paranoia += 5; System.out.println("Es humillante, pero no te golpean."); }
            case 2 -> { Main.salud -= 20; System.out.println("Te llevas una paliza por desobediente."); }
            case 3 -> {
                if (Main.monedas >= 5) { Main.monedas -= 5; System.out.println("El guardia se ríe y se va."); }
                else { Main.salud -= 25; System.out.println("¡No tienes dinero! Te golpea con fuerza."); }
            }
        }
        Main.guardarEvento("Incidente Guardia");
    }

    static void sucesoHallazgo(Scanner sc) {
        System.out.println("\nSUCESO: Alguien olvidó un objeto en el patio.");
        int op = Main.leerOpcion(sc, "1. Tomarlo rápido\n2. Avisar a un guardia\n3. Dejarlo ahí", 1, 3);
        switch (op) {
            case 1 -> { Main.monedas += 10; System.out.println("¡Es dinero!"); }
            case 2 -> { Main.salud += 10; System.out.println("Te premian con una medicina."); }
            case 3 -> { Main.paranoia -= 5; System.out.println("Ignoras el cebo."); }
        }
        Main.guardarEvento("Hallazgo");
    }
}