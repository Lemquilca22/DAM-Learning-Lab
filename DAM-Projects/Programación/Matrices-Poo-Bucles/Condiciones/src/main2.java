import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String idioma = sc.nextLine().toLowerCase();
        if (idioma.equals("french")) {
            System.out.println("Bonjour");
        }else if (idioma.equals("spanish")){
            System.out.println("Hola");
        } else if (idioma.equals("russian")){
            System.out.println("Zdravstvuyte");
        } else if (idioma.equals("chinese")){
            System.out.println("Nin hao");
        } else if (idioma.equals("chino")){
            System.out.println("Nin hao");
        } else if (idioma.equals("german")){
            System.out.println("Guten Tag");
        } else if (idioma.equals("portugues")){
            System.out.println("Ola");
        } else {
            System.out.println("No conozco tu idioma, como se dice hola?");
            String palabra = sc.nextLine();
            System.out.println(palabra);
        }


    }
}
