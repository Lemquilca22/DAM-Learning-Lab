import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean chasisok = sc.next().equalsIgnoreCase("true");
        boolean ruedasok = sc.next().equalsIgnoreCase("true");
        boolean motorok = sc.next().equalsIgnoreCase("true");
        boolean electronicaok = sc.next().equalsIgnoreCase("true");
        boolean lucesok = sc.next().equalsIgnoreCase("true");
        String estadochasis = chasisok ? "correcto" : "defectuoso";
        String estadoruedas = ruedasok ? "correcto" : "defectuoso";
        String estadomotor = motorok ? "correcto" : "defectuoso";
        String estadoelectronica = electronicaok ? "correcto" : "defectuoso";
        String estadoluces = lucesok ? "correcto" : "defectuoso";
        String estadoGeneralcoche;

        if (chasisok && ruedasok && motorok && electronicaok && lucesok){
            estadoGeneralcoche = "correcto";
        } else {
            estadoGeneralcoche = "defectuoso";
        }

        System.out.println("El estado del chasis es: " + estadochasis);
        System.out.println("El estado de las ruedas es: " + estadoruedas);
        System.out.println("El estado del motor es: " + estadomotor);
        System.out.println("El estado de la electronica es: " + estadoelectronica);
        System.out.println("El estado de las luces es: " + estadoluces);
        System.out.println("El estado general del coche es: " + estadoGeneralcoche);










        }
}
