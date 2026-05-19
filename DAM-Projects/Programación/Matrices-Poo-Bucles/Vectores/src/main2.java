import java.util.Scanner;

public class main2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String [] nombrescartas = new String[100];
        int [] numeros = new int[100];

        for (int i = 0; i < nombrescartas.length; i++) {
            nombrescartas[i]=sc.nextLine();
            numeros[i]=sc.nextInt();
            sc.nextLine();
        }
        // COMENZAR A ORDENAR USANDO BUBBLE SORT
        int n = nombrescartas.length;
        String temp;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (nombrescartas[j].compareTo(nombrescartas[j+1])>0){
                    //Intercambiar posiciones
                    temp=nombrescartas[j];
                    nombrescartas[j]=nombrescartas[j+1];
                    nombrescartas[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(nombrescartas[i]);
        }
    }
}
