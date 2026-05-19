import java.util.Scanner;

public class Calculdora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        char operacion;

        System.out.print("Ingresa el primner digito");
        num1 = sc.nextDouble();//Primera cifra de la operación

        System.out.print("Ingresa el segundo digito");
        num2 = sc.nextDouble();//Segunda cifra de la operación

        System.out.print("Elige una operación (+, -, *, /): ");
        operacion = sc.next().charAt(0);//Que operación hara

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println(resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
}