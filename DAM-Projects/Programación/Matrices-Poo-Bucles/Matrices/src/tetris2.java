import java.util.Scanner;

public class tetris2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila = sc.nextInt();
        int columna = sc.nextInt();
        int[][] posicion = new int[fila][columna];
        //GUARDAR MATRIZ
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                posicion[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < fila; i++) {
            int contador= 0;
            for (int j = 0; j < columna; j++) {
                if (posicion[i][j]==0){
                    break;
                }
                contador+=1;
            }
            if (contador!=columna){
                for (int j = 0; j < columna; j++) {
                    System.out.print(posicion[i][j]+" ");
                }
                System.out.println();
            }
        }
}
}
