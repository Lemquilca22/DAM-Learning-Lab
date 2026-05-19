import java.util.InputMismatchException;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora");
        boolean salir=false;
        while (!salir) {

            try {
                System.out.println("Ingresa el primer numero: ");
                int n1 = sc.nextInt();
                System.out.println("Ingresa la operacion que quieres realizar (+),(-),(*),(/)");
                String operador = sc.next();
                System.out.println("Ingresa el segundo numero: ");
                int n2 = sc.nextInt();
                int resultado;
                if (operador.equalsIgnoreCase("+")) {
                    resultado = n1 + n2;
                    System.out.println("El resultado de " + n1 + "+" + n2 + " es: " + resultado);
                } else if (operador.equalsIgnoreCase("-")) {
                    resultado = n1 - n2;
                    System.out.println("El resultado de " + n1 + "-" + n2 + " es: " + resultado);
                } else if (operador.equalsIgnoreCase("*")) {
                    resultado = n1 * n2;
                    System.out.println("El resultado de " + n1 + "*" + n2 + " es: " + resultado);
                } else if (operador.equalsIgnoreCase("/")) {
                    resultado = n1 / n2;
                    System.out.println("El resultado de " + n1 + "/" + n2 + " es: " + resultado);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, los datos no son numericos, vuelve a intentarlo");
                System.out.println("Error: " + e);
                sc.next();
            } catch (ArithmeticException e){
                System.out.println("No se puede dividir un numero entre 0");
                System.out.println("Error: "+e);
            } catch (Exception a) {
                System.out.println(a);
            }
        }
    }
}
