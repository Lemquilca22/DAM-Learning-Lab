import java.util.Scanner;

public class intervalo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2=sc.nextInt();

        for (int i=num1;i<num2;i++){
            System.out.print(i);
        }

    }

}
