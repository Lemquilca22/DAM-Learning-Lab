import java.time.LocalDate;
import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su año de nacimiento: ");
        int anioNacimiento = sc.nextInt();

        int anioActual = LocalDate.now().getYear();
        int edad = anioActual - anioNacimiento;

        System.out.println("Tienes " + edad + " años.");
    }
}
