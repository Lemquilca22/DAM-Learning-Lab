import java.util.Scanner;

public class verticalesiguales {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int [][] posicion = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <columnas ; j++) {
                posicion[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < columnas; i++) {
            int valorinicial= posicion[0][i];
            int contador=1;
            for (int j= 1; j <filas ; j++) {
                    if (posicion[j][i]==valorinicial){
                        contador++;
                    }
            }
            if (contador == filas){
                System.out.println("La columna "+i+" te tots els numeros iguals.");
                return;
            }
        }
        System.out.println("No hi ha cap columna amb els numeros iguals.");
    }
}
