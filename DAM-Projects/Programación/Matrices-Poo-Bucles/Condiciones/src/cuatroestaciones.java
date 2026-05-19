import java.util.Scanner;

public class cuatroestaciones {
    public static void main (String[] args){

        //Primavera = primavera 21/3 -- 21/6
        //estiu = verano 21/6--23/9
        //tardor = otono 23/9--21/12
        //hivern = invierno 21/12 -- 21/3
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();

        if ((mes>=3 && mes<6) && dia<=21) {
            System.out.println("Primavera");
            System.out.println("Otono");
        } else if (mes==4){
            System.out.println("Primavera");
            System.out.println("Otono");
        } else if (mes==5){
            System.out.println("Primavera");
            System.out.println("Otono");
        } else if (mes==6 && dia<21){
            System.out.println("Primavera");
            System.out.println("Otono");
        } else {}

        if (mes==6 && dia>=21) {
            System.out.println("Verano");
            System.out.println("Invierno");
        } else if (mes==7){
            System.out.println("Verano");
            System.out.println("Invierno");
        } else if (mes==8){
            System.out.println("Verano");
            System.out.println("Invierno");
        } else if (mes==9 && dia<23){
            System.out.println("Verano");
            System.out.println("Invierno");
        } else {}

        if (mes==9 && dia==23) {
            System.out.println("Otono");
            System.out.println("Primavera");
        } else if (mes==10){
            System.out.println("Otono");
            System.out.println("Primavera");
        } else if (mes==11){
            System.out.println("Otono");
            System.out.println("Primavera");
        } else if (mes==12 && dia<21){
            System.out.println("Otono");
            System.out.println("Primavera");
        } else {}


        if (mes==12 && dia==21) {
            System.out.println("Invierno");
            System.out.println("Verano");
        } else if (mes==1 ){
            System.out.println("Invierno");
            System.out.println("Verano");
        } else if (mes==2 ){
            System.out.println("Invierno");
            System.out.println("Verano");
        } else if (mes==3 && dia<21){
            System.out.println("Invierno");
            System.out.println("Verano");
        } else {}

    }
}

