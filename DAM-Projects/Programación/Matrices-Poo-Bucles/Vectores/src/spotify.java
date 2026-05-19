import java.util.Scanner;

public class spotify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerocanciones = sc.nextInt();
        sc.nextLine();
        String [] arraycanciones = new String[numerocanciones];
        String  [] duracioncanciones = new String[numerocanciones];

        for (int i=0; i<numerocanciones; i++){

            arraycanciones[i]=sc.nextLine().trim();
            duracioncanciones[i]=sc.nextLine().trim();

        }
        System.out.println("--- Lista de Spotify ---");
        for (int i=0; i<numerocanciones; i++){
            int numcancion=i+1;
            System.out.print("Cancion "+numcancion+": ");
            System.out.println(arraycanciones[i]+" - "+duracioncanciones[i]+" min");

        }
    }
}
