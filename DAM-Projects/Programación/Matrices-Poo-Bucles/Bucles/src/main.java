import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir=true;
        int nivel;
        int proxnivel;
        int contador=0;
        while(salir){
            nivel=sc.nextInt();
            if (nivel ==-1){
                salir  =false;
            } else {
                proxnivel=sc.nextInt();
                if (nivel<proxnivel){
                    contador++;
                }
            }

        }
        System.out.println(contador);
    }
    }

