import java.util.Scanner;

public class buscarletras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra= sc.nextLine().charAt(0);
        String palabra = sc.nextLine();
        char [] array = palabra.toCharArray();
        int contador=0;
        for (int i =0; i<array.length;i++){
            char caracteractual = array[i];
            if (caracteractual==letra) {
                contador++;
            }

        }
        System.out.println(contador);
    }
}
