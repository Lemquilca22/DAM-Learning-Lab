import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero = sc.nextInt();
        //En el principio las monedas restantes son igual al total,
        //lo usare para entender mejor las operaciones.
        int monedasrestantes = dinero;
        int valor500 = 500;
        //Estas variables son para asignar cuantas monedas de cada tipo hay
        int mon500;
        int mon100;
        int mon50;
        int mon5;
        int mon1;
        mon500 = monedasrestantes / valor500;
        if (mon500 == 1) {
            System.out.println("1 moneda de 500");
        } else {
            System.out.println(mon500 + " monedas de 500");
        }
        monedasrestantes = monedasrestantes % 500;
        int valor100 = 100;
        mon100 = monedasrestantes / valor100;

        if (mon100==1) {
                System.out.println("1 moneda de 100");
            } else {
                System.out.println(mon100+" monedas de 100");
            }
        monedasrestantes=monedasrestantes%100;

        int valor50 = 50;
        mon50=monedasrestantes/valor50;
        if (mon50==1) {
            System.out.println("1 moneda de 50");
        }else {
            System.out.println(mon50+" monedas de 50");
        }



    }
}
