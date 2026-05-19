import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿En que año naciste?");
//        while (true){
//            if (sc.hasNextInt()){
//                int num = sc.nextInt();
//                System.out.println("Su edad es: "+num);
//                break;
//            } else {
//                System.out.println("Numero no valido");
//                sc.next();
//            }
//        }

        while (!sc.hasNextInt()){
            System.out.println("Numero no valido");
            sc.next();
        }
        boolean continua = true;
        while (continua) {
            int num2 = sc.nextInt();
            if (num2 > 2025) {
                System.out.println("No creo que seas del futuro, ingresa un numero valido.");
            } else if (num2==2025) {
                System.out.println("Apenas eres un bebé, ingresa un numero valido.");
            } else if (num2<1900) {
                System.out.println("Me vas a disculpar, pero no creo que puedas escribir desde el más allá.");
            } else {
                int edad = 2025 - num2;
                System.out.println("Tienes " + edad+" años.");
                continua=false;
            }
        }

    }
}
