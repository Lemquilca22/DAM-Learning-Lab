import java.util.Random;
import java.util.Scanner;

public class CONTARLETRAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine(); //Lee una palabra introducida por el usuario
        String[] palabras = texto.split(" "); //Salta los espacios para no contarlos como palabra
        int numeroDePalabras = palabras.length; //Cuenta las palabras que hay

        if (numeroDePalabras == 1) {
            System.out.println("La palabra tiene " + numeroDePalabras + " palabra."); //Si solo hay una palabra imprime esto
        } else {
            System.out.println("La palabra tiene " + numeroDePalabras + " palabras."); //Si hay mas de una palabra imprime esto
        }
    }
}