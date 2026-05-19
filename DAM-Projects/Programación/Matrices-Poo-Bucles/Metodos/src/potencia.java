import java.util.Scanner;

public class potencia {
    public static void recursividad(int base, int enterobase){

        if (base==enterobase){
            if (enterobase <= 1) {
                System.out.println(enterobase);
            } else {
                int a = 0, b = 1;
                for (int i = 2; i <= enterobase; i++) {
                    int temp = a + b;
                    a = b;
                    b = temp;
                }
                System.out.println(b);
            }
        } else {
            recursividad(base+1,enterobase);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base=0;
        int enterobase=sc.nextInt();
        recursividad(base,enterobase);

    }
}
