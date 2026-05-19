import java.util.Scanner;

public class secuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secuencia1 = sc.nextInt();
        int [] numeros1 = new int[secuencia1];
        int resultado;
        for (int i = 0; i < secuencia1; i++) {
            numeros1[i]=sc.nextInt();
        }
        int secuencia2 = sc.nextInt();
        int [] numeros2 = new int[secuencia1];
        for (int i = 0; i < secuencia2; i++) {
            numeros2[i]=sc.nextInt();
        }

        for (int i = 0; i < secuencia1; i++) {
            resultado=numeros1[i]+numeros2[i];
            System.out.print(resultado+" ");
        }
    }
}
