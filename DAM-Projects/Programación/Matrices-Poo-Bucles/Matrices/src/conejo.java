import java.util.Scanner;

public class conejo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado = sc.nextInt();
        int[][] posicion = new int[lado][lado];
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                posicion[i][j] = sc.nextInt();
            }
        }
        //Posicion del conejo
        int posicionfila=lado/2;
        int posicioncolumna=lado/2;
        int pasos=0;

        for (int orden = 1; orden <=(lado*lado) ; orden++) {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {

                    if (posicion[i][j]==orden){

                        pasos+= Math.abs(posicionfila-i)+ Math.abs(posicioncolumna-j);
                        //posicion actual del conejo:
                        posicionfila=i;
                        posicioncolumna=j;

                        i = lado;
                        break;
                    }
                }
            }
        }
        System.out.println(pasos);
    }
}
