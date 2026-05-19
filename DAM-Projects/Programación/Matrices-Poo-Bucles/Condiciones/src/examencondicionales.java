import java.util.Scanner;

public class examencondicionales {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU:\n" +
                "1.- DESAYUNOS\n" +
                "2.- COMIDAS\n" +
                "3.- MERIENDAS\n" +
                "4.- CENAS\n");

        int opcion = sc.nextInt();
        int cantA = sc.nextInt();
        int cantB = sc.nextInt();
        int total = cantB+cantA;
        if (opcion==1){
            System.out.println("Total DESAYUNOS "+"del restaurante A y B: "+total);
        } else if (opcion==2){
            System.out.println("Total COMIDAS "+"del restaurante A y B: "+total);
        } else if (opcion==3){
            System.out.println("Total MERIENDAS "+"del restaurante A y B: "+total);
        } else if (opcion==4){
            System.out.println("Total CENAS "+"del restaurante A y B: "+total);
        } else {
            System.out.println("OPCION INEXISTENTE !!");
        }
    }
}
