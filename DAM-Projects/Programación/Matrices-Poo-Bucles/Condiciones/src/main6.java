import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia = sc.nextDouble();
        double dias = sc.nextInt();
        double descuento;
        double precio = 0.35;
        double sindescuento;
        double condescuento;

        if (dias>7 && distancia>800) {
            sindescuento= distancia*precio;
            descuento=(sindescuento*30)/100;
            condescuento=sindescuento-descuento;
            System.out.println(condescuento);
        } else {
            sindescuento= distancia*precio;
            System.out.println(sindescuento);
        }

    }
}
