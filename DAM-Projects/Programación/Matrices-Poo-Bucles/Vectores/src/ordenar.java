import java.util.Scanner;

public class ordenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ptotal=sc.nextInt();
        int[] orden = new int [ptotal];
        int posicionactual;
        int siguientePosición;


        for (int i = 0; i < ptotal; i++) {
            orden[i]=sc.nextInt();
        }
        for (int i = 0; i < ptotal; i++) {
            posicionactual=orden[i];
            int colado=0;
            for (int j = i+1; j < ptotal; j++) {
                siguientePosición=orden[j];
                if (posicionactual>siguientePosición){
                colado++;}

            }
            if (colado>0){
                System.out.println("La persona con el ticket "+posicionactual+" se ha colado por delante de "+colado+" personas.");
            }
        }
    }
}