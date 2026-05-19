import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int dias = 1+(h-a)/(a-b);

        if (b>a) {
            System.out.println("error");
        } else {
            System.out.println(dias);
        }
        }
    }
