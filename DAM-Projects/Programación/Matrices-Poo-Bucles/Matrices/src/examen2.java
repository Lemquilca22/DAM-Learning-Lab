import java.util.Scanner;

public class examen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila=sc.nextInt(), columna= sc.nextInt();
        int[][] tablero=new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero[i][j]=sc.nextInt();
            }
        }
        int filabuscar=sc.nextInt(), columnabuscar=sc.nextInt();
        if (tablero[filabuscar][columnabuscar]==2){
            System.out.println("SUPER EFFECTIVE");
        } else if (tablero[filabuscar][columnabuscar]==1) {
            System.out.println("NORMAL");
        } else if (tablero[filabuscar][columnabuscar]==0) {
            System.out.println("NO EFFECT");
        }
    }
}
