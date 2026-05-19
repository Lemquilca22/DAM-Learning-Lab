import java.util.Random;
import java.util.Scanner;

public class dados {
    public static void main (String[] args) {
        //Simulador de dados
        Scanner sc = new Scanner(System.in);
        Random generador = new Random(); //Importe la libreria de random porque permite generar
                                        //numeros aleatorios y eso es lo que un dado hace.
        System.out.println("Bienvenido al smiluador de dados");
        System.out.println("Puedes usar 1 a 6 dados para jugar");
        System.out.println("Con cuantos dados quieres jugar?");
        int dados = sc.nextInt();
        int resultado1, resultado2, resultado3, resultado4, resultado5, resultado6;
        int total;

        switch (dados) {
            case 1:
                resultado1 = generador.nextInt(6) + 1;
                total = resultado1;
                System.out.println("Al tirar un solo dado obtuviste: "+total);
                break;
            case 2:
                resultado1 = generador.nextInt(6) + 1;
                resultado2 = generador.nextInt(6) + 1;
                total = resultado1+resultado2;
                System.out.println("El resultado del dado 1 es: "+resultado1);
                System.out.println("El resultado del dado 2 es: "+resultado2);
                System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                break;
            case 3:
                resultado1 = generador.nextInt(6) + 1;
                resultado2 = generador.nextInt(6) + 1;
                resultado3 = generador.nextInt(6) + 1;
                total = resultado1+resultado2+resultado3;
                System.out.println("El resultado del dado 1 es: "+resultado1);
                System.out.println("El resultado del dado 2 es: "+resultado2);
                System.out.println("El resultado del dado 3 es: "+resultado3);
                System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                break;
            case 4:
                resultado1 = generador.nextInt(6) + 1;
                resultado2 = generador.nextInt(6) + 1;
                resultado3 = generador.nextInt(6) + 1;
                resultado4 = generador.nextInt(6) + 1;
                total = resultado1+resultado2+resultado3+resultado4;
                System.out.println("El resultado del dado 1 es: "+resultado1);
                System.out.println("El resultado del dado 2 es: "+resultado2);
                System.out.println("El resultado del dado 3 es: "+resultado2);
                System.out.println("El resultado del dado 4 es: "+resultado2);
                System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                break;

            case 5:
                resultado1 = generador.nextInt(6) + 1;
                resultado2 = generador.nextInt(6) + 1;
                resultado3 = generador.nextInt(6) + 1;
                resultado4 = generador.nextInt(6) + 1;
                resultado5 = generador.nextInt(6) + 1;
                total = resultado1+resultado2+resultado3+resultado4+resultado5;
                System.out.println("El resultado del dado 1 es: "+resultado1);
                System.out.println("El resultado del dado 2 es: "+resultado2);
                System.out.println("El resultado del dado 3 es: "+resultado3);
                System.out.println("El resultado del dado 4 es: "+resultado4);
                System.out.println("El resultado del dado 5 es: "+resultado5);
                System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                break;
            case 6:
                resultado1 = generador.nextInt(6) + 1;
                resultado2 = generador.nextInt(6) + 1;
                resultado3 = generador.nextInt(6) + 1;
                resultado4 = generador.nextInt(6) + 1;
                resultado5 = generador.nextInt(6) + 1;
                resultado6 = generador.nextInt(6) + 1;
                total = resultado1+resultado2+resultado3+resultado4+resultado5+resultado6;
                System.out.println("El resultado del dado 1 es: "+resultado1);
                System.out.println("El resultado del dado 2 es: "+resultado2);
                System.out.println("El resultado del dado 3 es: "+resultado3);
                System.out.println("El resultado del dado 4 es: "+resultado4);
                System.out.println("El resultado del dado 5 es: "+resultado5);
                System.out.println("El resultado del dado 6 es: "+resultado6);
                System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                break;
        }
    }
}
