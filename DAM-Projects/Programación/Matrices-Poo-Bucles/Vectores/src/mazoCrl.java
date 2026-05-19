import java.util.Scanner;

public class mazoCrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float suma = 0;
        float promedio;
        int [] cartas = new int[8];

        for (int i=0; i< cartas.length; i++){
            cartas[i]= scanner.nextInt();
            suma+=cartas[i];
        }
        System.out.println("--- Mazo de Clash Royale ---");
        for (int i=0; i< cartas.length; i++){
            int numcarta=i+1;
            System.out.print("Carta "+numcarta+": ");
            System.out.println(cartas[i]+" elixir");
        }

        promedio=(suma/8);
        System.out.println("\nCoste medio del mazo: " + promedio+ " elixir");
    }

}
