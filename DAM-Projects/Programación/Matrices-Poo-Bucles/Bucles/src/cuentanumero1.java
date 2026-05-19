import java.util.Scanner;

public class cuentanumero1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean variable = true;
        int contador=0;
        int num;

        while (variable) {
            num=sc.nextInt();
            if (num==0) {
                variable=false;
                break;
            }
            contador++;

        }
        System.out.println(contador);
    }
}
