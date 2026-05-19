import java.util.Scanner;

public class Conversor {public static void main(String[] args) {
    Scanner grados = new Scanner(System.in);
    double gradosC, gradosF;

    System.out.print("Ingresa los grados Celsius: ");
    gradosC = grados.nextDouble();
    gradosF = (gradosC * 9 / 5) + 32;
    System.out.println(gradosC + " En grados Celsius son " + gradosF + " grados Fahrenheit.");
//de celsius a fahrenheit
    System.out.print("Ingresa los grados Fahrenheit: ");
    gradosF = grados.nextDouble();
    gradosC = (gradosF - 32) * 5 / 9;
    System.out.println(gradosF + " En  grados Fahrenheit son " + gradosC + " grados Celsius.");
//de fahrenheit a celsius

}
}