import java.util.Scanner;

public class calculadora3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int r1 = 0,r2=0,r3=0,r4=0,r5=0,r6=0,r7=0,r8=0,r9=0,r10=0;

        for (int i=num1; i<=num2;i++){
            if(i<=num2){
                r1=num1; r2=num1*2; r3=num1*3; r4=num1*4; r5=num1*5; r6=num1*6; r7=num1*7; r8=num1*8; r9=num1*9; r10=num1*10;
                System.out.println("Tabla del "+num1);
                System.out.println(num1+" x"+" 1 = "+ r1);
                System.out.println(num1+" x"+" 2 = "+ r2);
                System.out.println(num1+" x"+" 3 = "+ r3);
                System.out.println(num1+" x"+" 4 = "+ r4);
                System.out.println(num1+" x"+" 5 = "+ r5);
                System.out.println(num1+" x"+" 6 = "+ r6);
                System.out.println(num1+" x"+" 7 = "+ r7);
                System.out.println(num1+" x"+" 8 = "+ r8);
                System.out.println(num1+" x"+" 9 = "+ r9);
                System.out.println(num1+" x"+" 10 = "+ r10);
                System.out.println();
            }
            num1++;

        }
        }


    }

