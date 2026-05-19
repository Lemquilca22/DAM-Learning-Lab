import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean luz1 = sc.next().equalsIgnoreCase("true");
        boolean luz2 = sc.next().equalsIgnoreCase("true");
        boolean luz3 = sc.next().equalsIgnoreCase("true");

        if (luz1 && luz2 && luz3 ) {
            System.out.println("Todas las luces estan encendidas");
        } else if(luz1 || luz2 || luz3) {
            System.out.println("Solo hay una luz encendida.");
        } else {
            System.out.println("No se ha encendido ninguna luz.");
        }
    }
}
