import java.util.Scanner;

public class galibo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura = sc.nextFloat();
        float cantidadpuentes = sc.nextFloat();
        float altpuente;
        for (int i = 1; i<=cantidadpuentes; i++) {
            altpuente=sc.nextFloat();
            if (altpuente<altura) {
                System.out.println("choca con el puente "+i);
                break;
            }
        }
    }
}