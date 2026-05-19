import java.util.Scanner;

public class enero {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int tamarray=sc.nextInt();
        int [] cultivos= new int[tamarray];
        int dias=6;
        int tiempoMinimo=-1;
        int tiempoMaximo = -1;

        for (int i = 0; i < cultivos.length; i++) {
            cultivos[i]=sc.nextInt();
        }

        for (int i = 0; i < cultivos.length; i++) {
            int tiempo= cultivos[i];

            if (i==0){
                tiempoMinimo=tiempo;
                tiempoMaximo=tiempo;
                continue;
            }
            if (tiempo<tiempoMinimo) {
                tiempoMinimo=tiempo;
            }
            if (tiempo > tiempoMaximo) {
                tiempoMaximo=tiempo;
            }


        }
        System.out.println(tiempoMinimo+dias);
        System.out.println(tiempoMaximo+dias);
        System.out.println(tiempoMaximo+dias);
    }
}
