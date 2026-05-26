import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String jugarDeNuevo;
        do {
            int puntuacion = 0;
            //Tu propia aventura
            System.out.println("¿Sabes más que un niño de primaria?");
            System.out.println("Responde las preguntas escribiendo la letra de la opcion correcta");

            //=== Pregunta 1 ===
            System.out.println("1) Cuál es el país más grande del mundo en superficie?");
            System.out.println("a) Canadá");
            System.out.println("b) Rusia");
            System.out.println("c) China");
            System.out.println("d) Estados Unidos");
            System.out.println("Tu respuesta: ");
            String r1 = sc.nextLine();

            if (r1.equalsIgnoreCase("b")) {
                System.out.println("respuesta correcta 👌");
                puntuacion++;
            } else {
                System.out.println("respuesta incorrecta 😓");
            }
            System.out.println();

            //=== Pregunta 2 ===
            System.out.println("2) ¿En que continente se encuentra la cordillera de los andes?");
            System.out.println("a) África);");
            System.out.println("b) Asia");
            System.out.println("c) América del Sur");
            System.out.println("d) Europa");
            System.out.println("Tu respuesta: ");
            String r2 = sc.nextLine();

            if (r2.equalsIgnoreCase("c")) {
                System.out.println("respuesta correcta 😎");
                puntuacion++;
            } else {
                System.out.println("respuesta incorrecta 😣");
            }
            System.out.println();

            //=== Pregunta 3 ===

            System.out.println("3) ¿Cuál es el animal terrestre más rápido del mundo?");
            System.out.println("a) Tigre");
            System.out.println("b) Corre caminos");
            System.out.println("c) Guepardo");
            System.out.println("d) Águila");
            System.out.println("Tu respuesta: ");
            String r3 = sc.nextLine();

            if (r3.equalsIgnoreCase("c")) {
                System.out.println("respuesta correcta 😁");
                puntuacion++;
            } else {
                System.out.println("respuesta incorrecta 😕");
            }
            System.out.println();


            //=== Pregunta 4 ===

            System.out.println("¿4) Qué científico propuso la teoría de la relatividad?");
            System.out.println("a) Isaac Newton");
            System.out.println("b) Albert Einstein");
            System.out.println("c) Galileo Galilei");
            System.out.println("d) Marie Curie");
            System.out.println("Tu respuesta: ");
            String r4 = sc.nextLine();

            if (r4.equalsIgnoreCase("b")) {
                System.out.println("respuesta correcta 🥳");
                puntuacion++;
            } else {
                System.out.println("respuesta incorrecta 😶‍🌫️");
            }
            System.out.println();

            //=== Pregunta 5 ===

            System.out.println("5) ¿Qué elemento químico tiene el símbolo (O)?");
            System.out.println("a) Oro");
            System.out.println("b) Oxígeno");
            System.out.println("c) Osmio");
            System.out.println("d) Ozono");
            System.out.println("Tu respuesta: ");
            String r5 = sc.nextLine();

            if (r5.equalsIgnoreCase("b")) {
                System.out.println("respuesta correcta 🥵");
                puntuacion++;
            } else {
                System.out.println("respuesta incorrecta 🥶");
            }
            System.out.println();


            //=== Pregunta 6 ===

            System.out.println("6) ¿Cuál es el río más largo del mundo (según las últimas mediciones)?");
            System.out.println("a) Amazonas");
            System.out.println("b) Nilo");
            System.out.println("c) Misisipi");
            System.out.println("d) Yangtsé");
            System.out.println("Tu respuesta: ");
            String r6 = sc.nextLine();

            if (r6.equalsIgnoreCase("a")) {
                System.out.println("respuesta correcta 🤓");
                puntuacion++;
            } else {
                System.out.println("respuesta incorrecta 💀");
            }
            System.out.println();

            //=== Pregunta 7 ===

            System.out.println("7) ¿En qué año llegó Cristóbal Colón a América?");
            System.out.println("a) 1492");
            System.out.println("b) 1500");
            System.out.println("c) 1512");
            System.out.println("d) 1458");
            System.out.println("Tu respuesta: ");
            String r7 = sc.nextLine();

            if (r7.equalsIgnoreCase("a")) {
                System.out.println("respuesta correcta 😼");
                puntuacion++;
            } else {
                System.out.println("respuesta incorrecta 😿");
            }
            System.out.println();

            //=== resultados ===
            System.out.println("Fin del juego!!");
            System.out.println("Has acertado " + puntuacion + " de 7 preguntas");
            if (puntuacion == 7) {
                System.out.println("Bien hecho, eres un maestro de cultura general ");
            } else if (puntuacion >= 3) {
                System.out.println("No esta mal, pero debes repasar un poco 🫡");

            } else {
                System.out.println("Hay que volver a la escuela 😶");
            }

            // === Preguntar si quiere volver a jugar ===
            System.out.print("\n¿Quieres volver a jugar? (si/no): ");
            jugarDeNuevo = sc.nextLine();

            System.out.println();

        }while (jugarDeNuevo.equalsIgnoreCase("si"));

        System.out.println("👋 ¡Gracias por jugar!");
        sc.close();





    }
}
