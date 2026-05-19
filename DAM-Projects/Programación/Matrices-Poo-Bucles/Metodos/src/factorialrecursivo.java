import java.util.Scanner;

public class factorialrecursivo {
    public static void recursividad(int n, int numerobase, int resultado){

        if (numerobase==n){
            for (int i = 1; i <= numerobase; i++) {
                resultado*=i;
            }
            System.out.println(resultado);
        } else {
            recursividad(n, numerobase+1, resultado);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerobase=1;
        int nfactorial=sc.nextInt();
        int resultado=1;
        recursividad(nfactorial,numerobase, resultado);

    }
}
