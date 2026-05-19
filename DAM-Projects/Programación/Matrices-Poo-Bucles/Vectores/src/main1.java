import java.util.Scanner;

public class main1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int cantcromos=sc.nextInt();
        int max = 68;
        int [] conteoCromos= new int[max+1];
        for (int i = 0; i < cantcromos; i++) {
            int cromo=sc.nextInt();
            if (cromo>0 && cromo<=68){
                conteoCromos[cromo]++;
            }
        }
        for (int i = 1; i <= max; i++) {
            int frecuencia=conteoCromos[i];

            if (frecuencia>1){
                System.out.println(i + ": " + frecuencia);
            }
        }
    }
}
