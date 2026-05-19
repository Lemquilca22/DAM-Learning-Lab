import java.sql.SQLOutput;
import java.util.Scanner;

public class calculadora {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean verdadero= true;
        String operador;
        float num;
        float respuesta = 0;
        int contador=0;


        while (verdadero){
            operador=sc.next();

            if (operador.equalsIgnoreCase("END")){
                if (contador==0) {
                    System.out.println("0.0");
                }
                break;
            }

            if (operador.equalsIgnoreCase("+")){
                num=sc.nextFloat();
                respuesta += num;
                System.out.println(respuesta);
            } else if (operador.equalsIgnoreCase("-")){
                num=sc.nextFloat();
                respuesta -= num;
                System.out.println(respuesta);
            } else if (operador.equalsIgnoreCase("*")){
                num=sc.nextFloat();
                respuesta *= num;
                System.out.println(respuesta);
            } else if (operador.equalsIgnoreCase("/")){
                num=sc.nextFloat();
                respuesta /= num;
                System.out.println(respuesta);
            }
            contador++;





        }
    }
}
