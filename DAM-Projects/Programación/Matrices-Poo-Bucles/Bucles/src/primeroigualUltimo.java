import java.util.Scanner;

public class primeroigualUltimo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean variable = true;
        int primernumero=sc.nextInt();
        int ultimonumero = primernumero;
        int num;

        while (variable) {
            num = sc.nextInt();
            if (num==0) {
                variable=false;
                break;
            }
            ultimonumero=num;
        }
        if (primernumero==ultimonumero) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
}
// El break termina uno antes de llegar al 0 por eso
// es el ultimo numero que escoge lo guardamos en la varible ultimo num.