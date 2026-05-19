import java.util.Scanner;

public class unosyceros {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tamy = sc.nextInt();
        int tamx = sc.nextInt();
        int [][] posicion = new int[tamy][tamx];

        for (int i = 0; i < tamy; i++) {
            for (int j = 0; j <tamx ; j++) {
                posicion[i][j] = sc.nextInt();
            }
        }
        int sumaCeros=0;
        int sumaUno=0;
        for (int i = 0; i < tamy; i++) {
            for (int j = 0; j <tamx ; j++) {
                if (posicion[i][j]==0){
                    sumaCeros++;
                }
                if (posicion[i][j]==1){
                    sumaUno++;
                }
            }
        }
        System.out.print(sumaCeros+" "+sumaUno);
    }
}
