import java.util.Scanner;

public class CuentaVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineas=sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < lineas; i++) {
            String palabra=sc.nextLine();
            int vocalesPalabra=0;
            for (int j = 0; j < palabra.length(); j++) {
                char letra = Character.toLowerCase(palabra.charAt(j));

                switch (letra) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                        vocalesPalabra++;
                        break;
                }
            }
            if (vocalesPalabra>0){
                System.out.println(vocalesPalabra);
            } else {
                System.out.println(0);
            }
        }
    }
}
