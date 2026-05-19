import java.util.Scanner;

public class texamen {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int numdias=0;
        int areal=0;
        boolean si=true;

        while (si) {
            areal+=a;
            if (areal>=h){
                si=false;
            }
            areal-=b;
            numdias++;
        }
        System.out.println(numdias);
    }
}
