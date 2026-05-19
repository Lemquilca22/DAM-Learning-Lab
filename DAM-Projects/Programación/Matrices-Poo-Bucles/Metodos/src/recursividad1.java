import java.util.Scanner;

public class recursividad1 {
    public static void recursividad(int n, int numerobase){

        if (numerobase==n){
            System.out.println(n);
        } else {
            System.out.print(numerobase+" ");
            recursividad(n, numerobase+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerobase=1;
        int n=sc.nextInt();
        recursividad(n,numerobase);

    }
}
