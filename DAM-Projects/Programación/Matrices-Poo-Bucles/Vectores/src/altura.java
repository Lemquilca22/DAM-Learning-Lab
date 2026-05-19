import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        float [] array = new float [len];
        float alturamin;

        for (int i= 0; i < len; i++) {
            array[i]= scanner.nextFloat();
        }
        alturamin= scanner.nextFloat();
        for (int i =0; i<len;i++){
            if (array[i]>=alturamin){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
