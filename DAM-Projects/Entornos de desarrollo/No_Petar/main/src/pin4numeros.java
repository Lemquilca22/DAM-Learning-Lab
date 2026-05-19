import java.util.Scanner;

public class pin4numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un pin de cuatro numeros");

      while (!sc.hasNextInt()){
        System.out.println("Pin no valido");
        sc.next();
      }
     boolean cumple=true;
       while (cumple) {
           int num2 = sc.nextInt();

           if (String.valueOf(num2).length() == 4) {
               System.out.println("Numero valido: " + num2);
               System.out.println("Longitud: " + String.valueOf(num2).length());
               cumple=false;
           } else if (String.valueOf(num2).length() < 4) {
               System.out.println("Longitud: " + String.valueOf(num2).length());
               System.out.println("La longitud debe ser de 4 caracteres, escribe un Pin que cumpla con esa condición");
           } else if (String.valueOf(num2).length() > 4) {
               System.out.println("Longitud: " + String.valueOf(num2).length());
               System.out.println("La longitud debe ser de 4 caracteres, escribe un Pin que cumpla con esa condición");
           }

       }
}
}
