import java.util.Locale;
import java.util.Scanner;

public class main {
    static float area(String figura, Scanner sc){

        float area=0;
        if (figura.equalsIgnoreCase("circulo")){
            double radio= sc.nextFloat();
            area = (float) (Math.pow(radio, 2) * Math.PI);
        } else if (figura.equalsIgnoreCase("triangulo")) {
            double base=sc.nextFloat();
            double altura=sc.nextInt();
            area= (float) ((base*altura)/2);
        } else if (figura.equalsIgnoreCase("cuadrado")) {
            double lado=sc.nextFloat();
            area= (float) (lado*lado);
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figura=sc.nextLine();
        float resultado= area(figura,sc);

        if (!(figura.equalsIgnoreCase("circulo"))){
            System.out.println("Area del "+figura+": "+resultado);
        } else {
            System.out.printf(Locale.US, "Area del %s: %.2f%n", figura, resultado);
        }


    }
}
