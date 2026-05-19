import java.util.Scanner;

public class examen2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] estanque = new int[n];

        for (int i = 0; i < n; i++) {
            estanque[i] = sc.nextInt();
        }

        if (estanque[0] == 1) {
            System.out.println(false);
            System.out.println("0");
            return;
        }

        int aguasSeguidas = 0;

        for (int i = 0; i < n; i++) {
            if (estanque[i] == 1) {
                aguasSeguidas++;
                if (aguasSeguidas >= 2) {
                    System.out.println(false);
                    System.out.println(i);
                    return;
                }
            } else {
                aguasSeguidas = 0;
            }
        }

        System.out.println(true);
    }
}
