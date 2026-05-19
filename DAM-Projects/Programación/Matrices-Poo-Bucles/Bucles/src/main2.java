import java.util.Scanner;

public class main2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir=true;
        int nivel=sc.nextInt();
        int proxnivel;
        int contador=0;
        while(salir){
            if (nivel ==-1){
                salir  =false;
            } else {
                proxnivel=sc.nextInt();
                if (nivel<proxnivel){
                    contador++;
                }
                nivel=proxnivel;
            }

        }
        System.out.println(contador);
    }
}

