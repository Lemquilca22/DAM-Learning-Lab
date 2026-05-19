import java.util.Scanner;

public class tipoexamen {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        String mov;
        int posicion=1;
        while (contador<4){
            mov=sc.next();
            contador++;

            if (mov.equalsIgnoreCase("L")){
                if (posicion==1){
                    posicion=3;
                } else {
                    posicion-=1;
                }
            }
            if (mov.equalsIgnoreCase("R")){
                if (posicion==3){
                    posicion=1;
                } else {
                    posicion+=1;
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

