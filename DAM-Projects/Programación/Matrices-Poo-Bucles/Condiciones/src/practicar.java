import java.util.Random;
import java.util.Scanner;

public class practicar {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int horactual = sc.nextInt();
        int minutosactuales = sc.nextInt();
        String modoactivacion = sc.next();
        Random generador = new Random();

        if (modoactivacion.equalsIgnoreCase("automatic") && minutosactuales == 0) {
            System.out.println("RING");
        }
        if (modoactivacion.equalsIgnoreCase("automatic") && minutosactuales!=0) {
            System.out.println("---");}

        if (modoactivacion.equalsIgnoreCase("alarma")) {
                System.out.println("RING RING RING");
            }
        if (modoactivacion.equalsIgnoreCase("manual")) {
                int opcion1y2 = generador.nextInt(2) + 1;
                if (opcion1y2 == 1) {
                    System.out.println("RING");
                } else {
                    System.out.println("RING RING RING");
                }
            }
        }
    }
