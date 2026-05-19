import java.util.Scanner;

public class SALUDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine(); //Lee el nombre introducido por el usuario
        System.out.println("¡Hola " + nombre + " !");
    }
}