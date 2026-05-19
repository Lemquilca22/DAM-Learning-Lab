import java.util.Scanner;

public class parImpar {
    static String paroimpar(int num1){
        String respuesta;
        if (num1%2!=0){
            respuesta="IMPAR";
        } else {
            respuesta="PAR";
        }
        return respuesta;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println(paroimpar(num1));
    }

}
