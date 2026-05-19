import java.util.Scanner;

public class cromos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numcromos = sc.nextInt();
        int [] cromos = new int[numcromos];
        int cromoactual;
        int cromosiguiente;

        for (int i = 0; i < numcromos; i++) {
            cromos[i]= sc.nextInt();
        }

        for (int i = 0; i < numcromos; i++) {
            cromoactual=cromos[i];
            int repitecromos=1;

            for (int j = i+1; j < numcromos; j++) {
               cromosiguiente=cromos[j];

               if (cromosiguiente==cromoactual){
                   repitecromos++;
               }
            }
            if (repitecromos>1){
                System.out.println(cromoactual+": "+repitecromos);
            }
        }

    }
}
