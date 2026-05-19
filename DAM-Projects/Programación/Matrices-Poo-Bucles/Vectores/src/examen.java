import java.util.Scanner;

public class examen {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int tambucle=sc.nextInt();
        int [] movimiento= new int[tambucle];
        int posicionActual;
        int siguientePosicion = 0;

        for (int i = 0; i < tambucle; i++) {
            movimiento[i]=sc.nextInt();
        }
        for (int i = 0; i < tambucle; i++) {
            posicionActual=movimiento[i];
//            siguientePosicion=movimiento[i+1];
//            if (i==0){
            if (movimiento[i]==1){
                System.out.println("false");
                System.out.println(i);
                break;
            }else if (movimiento[i]==0 && movimiento[i+2]==movimiento[i]) {
                System.out.println("true");
                break;
            }
            else {
                System.out.println("false");
                System.out.println(i+2);
                break;
            }

//            }



        }
    }
}
