import java.util.Random;
import java.util.Scanner;

public class aleatorios {
    public static void main (String[] args) {
        //Numeros aleatorios
        Scanner sc = new Scanner(System.in);
        Random generador = new Random();
        System.out.println("Bienvenido al generador de Números aleatorios");
        System.out.println("Para poder jugar, debes escoger un rango, \na continuación ingresa el valor minimo y maximo que puede tomar el número ");
        System.out.println("Ingresa el valor mínimo del numero:");
        int min = sc.nextInt();
        System.out.println("Ingresa el valor máximo del numero:");
        int max = sc.nextInt();

        int resultado = generador.nextInt(max-min+1) + min;
        //la razon por la cual sumo "min" a esta parte del codigo es, para que
        //me genere numeros a partir del valor minimo; de otro modo, por ejemplo
        //si mi numero min fuera 25 y el maximo 75, (sin la suma del min), los valores
        //aleatorios serian del 0-50 y no del 25-75.
        System.out.println("Su número es: "+resultado);
    }
}
