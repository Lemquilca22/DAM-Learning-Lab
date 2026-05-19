import java.util.Scanner;

public class Cajero {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean operar=true;
        String operacion;
        double cant;
        double saldo=0;
        while(operar){

            operacion=sc.next();
            if (operacion.equalsIgnoreCase("sortir")){
                operar=false;
            }
            cant=sc.nextDouble();
            if (operacion.equalsIgnoreCase("INGRESSAR")){
                saldo+=cant;
                System.out.println("Ingres realitzat: "+cant);
            } else if (operacion.equalsIgnoreCase("RETIRAR")) {
                if (saldo>=cant) {
                    saldo-=cant;
                    System.out.println("Retirar diners -> "+cant);
                } else {
                    System.out.println("Saldo insuficient");
                }

            }
            System.out.println(">> Saldo: "+saldo);
        }

    }
}
