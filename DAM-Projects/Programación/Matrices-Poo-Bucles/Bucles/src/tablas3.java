import java.util.Scanner;

public class tablas3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1= sc.nextInt();
        int num2=sc.nextInt();

        for (int i=num1; i<=num2;i++){
            if(i<=num2){
                System.out.println("Tabla del "+num1);
                for (int j=0; j<=10; j++){
                    int resultado=i*j;
                    System.out.println(num1+" x "+j+ " = "+ resultado);
                }
                System.out.println();
            }
            num1++;

        }
    }


}

