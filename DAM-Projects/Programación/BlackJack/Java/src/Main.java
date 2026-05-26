import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void crearpersonaje(Scanner sc, Persona p){
        System.out.print("Ingresa tu nombre: ");
        String nom = sc.next();
        p.setNom(nom);
    }
    public static void generarCartas(ArrayList<Carta> lista){
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "As"};

        for (String p : palos) {
            for (String v : valores) {
                // Se agregan las cartas a la lista que recibimos por parámetro
                lista.add(new Carta(v, p));
            }
        }
    }
    public static void ejecutarTurnoIA(Persona ia, ArrayList<Carta> mazo) {
        System.out.println("\n--- Turno de la IA ---");
        while (ia.calcularPuntuacion() < 17) {
            ia.pedirCarta(mazo);
            System.out.println("La IA roba... Puntos: " + ia.calcularPuntuacion());
        }
        ia.plantarse();
    }
    public static void determinarGanador(Persona j, Persona cpu) {
        int puntosJugador = j.calcularPuntuacion();
        int puntosIa = cpu.calcularPuntuacion();

        System.out.println("\n============================");
        System.out.println("      RESULTADO FINAL       ");
        System.out.println("============================");
        System.out.println(j.getNom() + ": " + puntosJugador + " puntos.");
        System.out.println(cpu.getNom() + ": " + puntosIa + " puntos.");

        if (puntosJugador > 21) {
            System.out.println("GANA LA IA (Te pasaste).");
        } else if (puntosIa > 21) {
            System.out.println("¡GANASTE! (La IA se pasó).");
        } else if (puntosJugador > puntosIa) {
            System.out.println("¡GANASTE por puntuación!");
        } else if (puntosIa > puntosJugador) {
            System.out.println("GANA LA IA por puntuación.");
        } else {
            System.out.println("¡EMPATE!");
        }
    }
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Persona jugador = new Persona("");
        Persona ia = new Persona("PC");
        ArrayList<Carta> mazo = new ArrayList<>();

        generarCartas(mazo);
        Collections.shuffle(mazo);

        boolean jugar=true;
        crearpersonaje(sc,jugador);

        while (jugar){

            jugador.pedirCarta(mazo);
            int puntosActuales = jugador.calcularPuntuacion();
            System.out.println("Tu mano actual: " + jugador.getMano()+"\n Puntos: "+puntosActuales);
            if (puntosActuales > 21) {
                System.out.println("¡Te has pasado de 21! Has perdido.");
                jugar = false;
            } else if (puntosActuales == 21) {
                System.out.println("¡Blackjack! Te plantas automáticamente.");
                jugador.plantarse();
                jugar = false;
            } else {
                System.out.print("¿Quieres otra carta? (s/n): ");
                String respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("n")) {
                    jugador.plantarse(); // Cerramos el turno oficialmente
                    jugar = false;
                }
            }
        }
        if (jugador.calcularPuntuacion() <= 21) {
            ejecutarTurnoIA(ia, mazo);
        }
        determinarGanador(jugador,ia);
        System.out.println("GAME OVER");
    }
}
