import java.util.Scanner;

public class preexamen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia = sc.nextDouble();
        double estancia = sc.nextDouble();
        double precioxkilometro = 0.35;
        double descuento = 0;
        double tarifanormal = 0;
        double pagocondescuento;

        if (distancia>800 && estancia>7 ) {
            tarifanormal=precioxkilometro*distancia;
            descuento = (800*30)/100;
            pagocondescuento=tarifanormal-descuento;
            System.out.println(pagocondescuento);
        } else {
            tarifanormal=precioxkilometro*distancia;
            System.out.println(tarifanormal);
        }
    }
}
