import java.util.Scanner;

public class monedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio de monedas usando solo IF como nacho explicó
        int monedas = sc.nextInt();
        int restante=0;
        int monedas500 = 0;
        int monedas100 = 0;
        int monedas50=0;
        int monedas5=0;
        int monedas1=0;

        if (monedas>500){
            monedas500=monedas/500;
            restante=monedas%500;
        }

        if (restante>=100) {
            monedas100=restante/100;
            restante=restante%100;
        }

        if (restante>=50) {
            monedas50=restante/50;
            restante=restante%50;
        }

        if (restante>=5) {
            monedas5=restante/5;
            restante=restante%5;
        }

        if (restante>=1) {
            monedas1=restante/1;
            restante=restante%1;
        }

        if (monedas500==1){
            System.out.println(monedas500+" moneda de 500");
        } else if (monedas500>1) {
            System.out.println(monedas500+" monedas de 500");
        } else {

        }
        if (monedas100==1){
            System.out.println(monedas100+" moneda de 100");
        } else if (monedas100>1) {
            System.out.println(monedas500+" monedas de 100");
        } else {

        }
        if (monedas50==1){
            System.out.println(monedas50+" moneda de 50");
        } else if (monedas50>1) {
            System.out.println(monedas50+" monedas de 50");
        } else {

        }

        if (monedas5==1){
            System.out.println(monedas5+" moneda de 5");
        } else if (monedas5>1) {
            System.out.println(monedas5+" monedas de 5");
        } else {

        }
        if (monedas1==1){
            System.out.println(monedas1+" moneda de 1");
        } else if (monedas1>1) {
            System.out.println(monedas1+" monedas de 1");
        } else {

        }



    }
}
