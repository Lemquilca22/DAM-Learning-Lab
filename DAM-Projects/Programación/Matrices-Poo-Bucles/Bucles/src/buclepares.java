import java.util.Scanner;

public class buclepares {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int cantnume=sc.nextInt();
        int scanner;
        int suma=0;
        for (int i =0; i<cantnume; i++){
            scanner=sc.nextInt();
            if (scanner%2==0){
                System.out.println(scanner);
                suma += scanner;}
        }
        System.out.println("Suma: "+suma);

    }
}
