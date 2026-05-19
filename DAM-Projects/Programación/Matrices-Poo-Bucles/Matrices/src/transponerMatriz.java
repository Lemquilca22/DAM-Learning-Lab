import java.util.Scanner;

public class transponerMatriz {
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
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(posicion[j][i]+" ");
            }
            System.out.println();
        }
    }
}
