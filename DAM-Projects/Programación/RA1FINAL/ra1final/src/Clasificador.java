import java.util.Scanner;

public class Clasificador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
//Introduce el nuemro a classificar
        if (num > 0)
            System.out.println(num + " es positivo.");
        else if (num < 0)
            System.out.println(num + " es negativo.");
        else
            System.out.println("El número es cero.");
//Comprobación de valores psotivos o negattivos o zero
        if (num % 2 == 0)
            System.out.println(num + " es par.");
        else
            System.out.println(num + " es impar.");
//Comprobación de pares
        boolean primo = true;
        if (num < 2) primo = false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo)
            System.out.println(num + " es primo.");
        else
            System.out.println(num + " no es primo.");
//Classifica el numero como primo o no
        sc.close();
    }
}
