import java.util.Scanner;

public class si {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        String mov;
        int posicion=1;
        while (contador<4){
            mov=sc.next();
            contador++;
            if (mov.equalsIgnoreCase("l")){
                if (posicion==1){
                    posicion=3;
                } else {
                    posicion--;
                }
            }
            if (mov.equalsIgnoreCase("r")){
                if (posicion==3){
                    posicion=1;
                } else {
                    posicion++;
                }
            }
        }
        if (posicion==1){
            System.out.println("* _ _");
        } else if (posicion==2){
            System.out.println("_ * _");
        } else if (posicion==3){
            System.out.println("_ _ *");
        }

        }
    }

