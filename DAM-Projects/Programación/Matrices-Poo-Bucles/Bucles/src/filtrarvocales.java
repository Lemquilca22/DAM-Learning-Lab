import java.util.Scanner;

public class filtrarvocales {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numletras = sc.nextInt();
        String letra;

        for (int i =0; i<numletras; i++) {
            letra=sc.next();
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")||
            letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
                System.out.println(letra);
            }
        }
    }
}
