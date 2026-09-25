import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPalabras = sc.nextInt();

        for (int i = 0; i < numPalabras; i++) {
            String palabra= sc.next();
            palabra = palabra.toLowerCase();

            int inicio = 0;
            int fin= palabra.length()-1;
            boolean esPalindromo=true;

            while (inicio<fin){
                if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                    esPalindromo= false;
                    break;
                }
                inicio++;
                fin--;
            }
            if (esPalindromo ){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
