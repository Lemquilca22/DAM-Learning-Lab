import java.util.InputMismatchException;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int resultado;
        System.out.println("Bienvenido a la calculadora");
        boolean salir=false;
        while (!salir) {

            try {
                System.out.println("Ingresa el primer numero: ");
                n1 = sc.nextInt();
                System.out.println("Ingresa el segundo numero: ");
                n2 = sc.nextInt();
                if (n1<0 || n2<0) {
                    throw new Exception("No pueden ser números negativos");
                }
            } catch (InputMismatchException e){
                System.out.println("Error, los datos no son numericos, vuelve a intentarlo");
                sc.next();
            } catch (Exception e){
                System.out.println("Error: "+e);
            }
            try {
                System.out.println("Ingresa la operacion que quieres realizar (+),(-),(*),(/)");
                String operador = sc.next();
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
            } catch (ArithmeticException e){
                System.out.println("No se puede dividir un numero entre 0");
                System.out.println("Error: "+e);
            } catch (Exception a) {
                System.out.println(a);
            }
        }
    }
}
