import java.util.Scanner;

public class gemini {

    public static void main(String[] args) {
        // Inicializar el Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 1. Lectura de la cantidad de personas (n)
        int n = scanner.nextInt();

        // 2. Declaración y llenado del array de tickets
        int[] tickets = new int[n];
        for (int i = 0; i < n; i++) {
            tickets[i] = scanner.nextInt();
        }

        // Cerrar el scanner
        scanner.close();

        // 3. Lógica CORREGIDA para identificar los colados

        // Bucle exterior: Itera sobre cada persona 'i' (la persona que podría haberse colado)
        for (int i = 0; i < n; i++) {
            int ticketActual = tickets[i]; // Ticket de la persona que se coló (X)
            int colados = 0;

            // Bucle interior: Itera sobre las personas 'j' que están DETRÁS de 'i'
            // El índice debe empezar en i + 1 para revisar a la gente que viene detrás.
            for (int j = i + 1; j < n; j++) {
                int ticketTrasero = tickets[j]; // Ticket de la persona cortada (Y)

                // CONDICIÓN CORRECTA DE COLADO:
                // Si el ticket de la persona ACTUAL (i) es MAYOR que el ticket TRASERO (j),
                // significa que la persona 'i' se coló por delante de la persona 'j'.
                if (ticketActual > ticketTrasero) {
                    colados++;
                }
            }

            // 4. Salida del resultado
            if (colados > 0) {
                System.out.println("La persona con el ticket " + ticketActual
                        + " se ha colado por delante de " + colados + " personas.");
            }
        }
    }
}