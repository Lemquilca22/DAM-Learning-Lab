import java.util.Scanner;

public class buscaminas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] posicion = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                posicion[i][j] = sc.nextInt();
            }
        }

        while (true){
            int p1=sc.nextInt();
            int p2=sc.nextInt();

            if (p1 == 0 && p2 == 0){
                break;
            }
            p1-=1;
            p2-=1;
            if (posicion[p1][p2]==1){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }


        }
    }
}
