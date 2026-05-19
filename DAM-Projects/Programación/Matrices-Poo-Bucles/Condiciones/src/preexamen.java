import java.util.Scanner;

public class preexamen {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String letra = sc.next();


        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
        letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")
        || letra.equalsIgnoreCase("l") || letra.equalsIgnoreCase("n") || letra.equalsIgnoreCase("r") ||
        letra.equalsIgnoreCase("s") || letra.equalsIgnoreCase("t")){
            System.out.println("1");
        }
        if (letra.equalsIgnoreCase("d") || letra.equalsIgnoreCase("g") ) {
            System.out.println("2");
        }
        if (letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c") || letra.equalsIgnoreCase("m") || letra.equalsIgnoreCase("p") ) {
            System.out.println("3");
        }

        if (letra.equalsIgnoreCase("f") || letra.equalsIgnoreCase("h") || letra.equalsIgnoreCase("v") || letra.equalsIgnoreCase("w") ||
        letra.equalsIgnoreCase("y")) {
            System.out.println("4");
        }
        if (letra.equalsIgnoreCase("k")){
            System.out.println("5");
        }
        if (letra.equalsIgnoreCase("j") || letra.equalsIgnoreCase("x")){
            System.out.println("8");
        }
        if (letra.equalsIgnoreCase("q") || letra.equalsIgnoreCase("z")){
            System.out.println("10");
        }

    }
}
