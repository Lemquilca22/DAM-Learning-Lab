import java.util.Scanner;

public class fibonacci {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int a=0;
    int b=1;
    int resultadofinal=0;

    if (num==0){
        resultadofinal=0;
    } else if (num==1) {
        resultadofinal=1;
    } else {
        for (int i = 2; i <=num; i++){
            resultadofinal=a+b;

            a=b;
            b=resultadofinal;
        }
    }
    System.out.println(resultadofinal);

}

}
