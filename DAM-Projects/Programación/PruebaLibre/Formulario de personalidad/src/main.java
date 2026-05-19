import java.util.Scanner;

public class main {
    public static void main(String[] args){

        boolean continuarJugando;
        String jugar;
        do {
            System.out.println("Bienvenido al test de personalidad");
            System.out.println("A continuacion tendrás que escoger alternativas que apareceran por pantalla");
            System.out.println("Responde con total sinceridad, al final podrás ver tus resultados");
            Scanner sc = new Scanner(System.in);
            int puntuacion = 0;
            System.out.println("Pregunta 1: Cuando tienes un problema, normalmente…");
            System.out.println("a) Lo enfrentas inmediatamente");
            System.out.println("b) Esperas un poco antes de actuar");
            System.out.println("c) Evitas enfrentarlo hasta que sea necesario");
            String rpta1 = sc.next();
            if (rpta1.equals("a")) {
                puntuacion = puntuacion + 3;
            } else if (rpta1.equals("b")) {
                puntuacion = puntuacion + 2;
            } else {
                puntuacion = puntuacion + 1;
            }
            System.out.println("Pregunta 2: Tu forma de tomar decisiones se basa principalmente en…");
            System.out.println("a) La lógica y el análisis");
            System.out.println("b) La combinación de lógica e intuición");
            System.out.println("c) La intuición y los sentimientos");
            String rpta2 = sc.next();
            if (rpta2.equals("a")) {
                puntuacion = puntuacion + 3;
            } else if (rpta2.equals("b")) {
                puntuacion = puntuacion + 2;
            } else {
                puntuacion = puntuacion + 1;
            }
            System.out.println("Pregunta 3: En reuniones sociales, tú…");
            System.out.println("a) Sueles hablar y tomar la iniciativa");
            System.out.println("b) Participas solo cuando te preguntan");
            System.out.println("c) Prefieres mantenerte en un segundo plano");
            String rpta3 = sc.next();
            if (rpta3.equals("a")) {
                puntuacion = puntuacion + 3;
            } else if (rpta3.equals("b")) {
                puntuacion = puntuacion + 2;
            } else {
                puntuacion = puntuacion + 1;
            }
            System.out.println("Pregunta 4: En reuniones sociales, tú…");
            System.out.println("a) Planificar todo con detalle antes de empezar");
            System.out.println("b) Tener un plan básico y ajustarlo sobre la marcha");
            System.out.println("c) Improvisar según la situación");
            String rpta4 = sc.next();
            if (rpta4.equals("a")) {
                puntuacion = puntuacion + 3;
            } else if (rpta4.equals("b")) {
                puntuacion = puntuacion + 2;
            } else {
                puntuacion = puntuacion + 1;
            }
            System.out.println("Pregunta 5: Frente a situaciones nuevas, tú…");
            System.out.println("a) Te emocionas y buscas explorar");
            System.out.println("b) Te adaptas pero con cierta cautela");
            System.out.println("c) Te sientes incómodo y prefieres evitarlas");
            String rpta5 = sc.next();
            if (rpta5.equals("a")) {
                puntuacion = puntuacion + 3;
            } else if (rpta5.equals("b")) {
                puntuacion = puntuacion + 2;
            } else {
                puntuacion = puntuacion + 1;
            }


            System.out.println("Tu puntuación final es: " + puntuacion);

            if (puntuacion >= 5 && puntuacion < 8) {
                System.out.println("5–7 puntos: Eres una persona más reservada e introspectiva. Prefieres la seguridad y la planificación, y tiendes a analizar las cosas antes de actuar.");
            } else if (puntuacion >= 8 && puntuacion < 11) {
                System.out.println("8–11 puntos: Tienes un equilibrio entre la acción y la reflexión. Puedes adaptarte a distintas situaciones y combinar la lógica con la intuición.");
            } else {
                System.out.println("12–15 puntos: Eres extrovertido y proactivo. Te gusta tomar la iniciativa, explorar nuevas experiencias y enfrentar desafíos con energía y confianza.");
            }
            System.out.println("deseas volver a jugar(si/no)?");
            jugar=sc.next();
            continuarJugando = jugar.equalsIgnoreCase("si");

        } while (continuarJugando);
        System.out.println("Gracias por jugar!");
    }
}
