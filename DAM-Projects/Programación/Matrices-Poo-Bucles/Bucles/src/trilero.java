import java.util.Scanner;

public class trilero {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        String mov;
        int posicion = 1;
        while (contador<4){
            contador++;
            mov=sc.next();
            if (mov.equals("L")) {
                if (posicion==1) {
                    posicion=3;
                } else {posicion--;}
            }
            //Hacer lo mismo de arriba para R
            if (mov.equalsIgnoreCase("R")) {
                if (posicion==3) {
                    posicion=1;
                } else {posicion++;}

            }
        }
        //Hacer para cada posicion final.
        if (posicion==1) {
            System.out.println("* _ _");
        } else if (posicion==2) {
            System.out.println("_ * _");

        } else if (posicion==3) {
            System.out.println("_ _ *");
        }
    }
}
