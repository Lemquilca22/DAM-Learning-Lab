import java.util.InputMismatchException;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] estante = {7,4,6,3,5} ;//en cada posicion hay un número de cajas
        int accederEstante = 0;
        boolean salir=false;
        String resp;
        int cantcajas;
        //EJECUCION DEL PROGRAMA
        while (!salir) {
            System.out.println("Estos son los estantes y la cantidad de cajas que hay en ellos");
            for (int i = 0; i < estante.length; i++) {
                System.out.println(i + ") " + estante[i]);
            }
            System.out.println("¿A que estante deseas acceder?");
            try {
                accederEstante = sc.nextInt();
                System.out.println("Accediste al estante "+accederEstante+" donde hay "+estante[accederEstante]+" cajas");


            } catch (InputMismatchException e) {
                System.out.println("Error, no puedes ingresar texto, vuelve a intentarlo.");
                sc.next();
            } catch (Exception e){
                System.out.println("Error, no existe ese estante");
                System.out.println(e);
            }
            System.out.println("Deseas retirar cajas? (si/no)");
            resp=sc.next();
            if (resp.equalsIgnoreCase("si")){
                System.out.println("Cuantas cajas retirarás?");
                cantcajas=sc.nextInt();
                estante[accederEstante]-=cantcajas;
            } else if (resp.equalsIgnoreCase("no")) {
                salir=true;
            }
        }

    }
}
