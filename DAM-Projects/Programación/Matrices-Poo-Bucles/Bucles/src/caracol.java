import java.util.Scanner;

public class caracol {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir=true;
        int h = sc.nextInt();
        int a=sc.nextInt(); //avance durante el dia
        int b=sc.nextInt(); //resbala en la noche
        int areal=0;
        int numdias=0;
        while (salir){
            areal+=a;
            if (h<=areal){
                salir = false;
            }
            areal-=b;

            numdias++;
        }
        System.out.println(numdias);

    }
}
