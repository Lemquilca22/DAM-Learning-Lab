import java.util.Scanner;

public class CifradoCesar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();

        String mensaje = sc.nextLine();

        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder cifrado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            int posicionActual = abecedario.indexOf(letra);

            if (posicionActual == -1) {
                cifrado.append(letra);
            } else {

                int nuevaPosicion = posicionActual + k;

                if (nuevaPosicion >= 26) {
                    nuevaPosicion = nuevaPosicion - 26;
                }

                cifrado.append(abecedario.charAt(nuevaPosicion));
            }
        }

        System.out.println(cifrado.toString());
        sc.close();
    }
}
