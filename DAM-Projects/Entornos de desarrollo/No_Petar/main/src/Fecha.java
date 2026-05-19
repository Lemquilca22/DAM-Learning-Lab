import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia=0;
        int mes=0;
        boolean funciona=true;
        while (funciona) {
            System.out.println("Ingresa una fecha en números (dia, mes, año)");
            System.out.println("Ingresa el dia: ");
            dia = sc.nextInt();
            System.out.println("Ingresa el mes: ");
            while (!sc.hasNextInt()) {
                System.out.println("Ese no es un número");
                sc.next();
            }
            mes = sc.nextInt();
            if ( mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia > 30) {
                    System.out.println("Este mes solo tiene 30 dias, ingrese un numero valido");
                    funciona=true;
                } else if (dia < 1) {
                    System.out.println("Ingrese un dia valido");
                    funciona=true;
                } else {
                    break;
                }
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 12) {
                if (dia > 31) {
                    System.out.println("Este mes tiene 31 dias, ingrese un numero valido");
                    funciona=true;
                } else if (dia < 1) {
                    System.out.println("Ingrese un dia valido");
                    funciona=true;
                } else {
                    break;
                }
            } else if (mes==2) {
                if (dia > 28) {
                    System.out.println("Este mes tiene 28 dias, ingrese un numero valido");
                    funciona=true;
                } else if (dia < 1) {
                    System.out.println("Ingrese un dia valido");
                    funciona=true;
                } else {
                    break;
                }
            }

        }
            boolean añovalido=true;
            while (añovalido){
                System.out.println("Ingrese el año: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Ese no es un número");
                    sc.next();
                }
                int año = sc.nextInt();
                if (String.valueOf(año).length() == 4) {
                    System.out.println("Numero valido: " + año);
                    System.out.println("La fecha es "+dia+" "+mes+" "+ año);
                    añovalido=false;
                } else if (String.valueOf(año).length() < 4) {
                    System.out.println("Longitud: " + String.valueOf(año).length());
                    System.out.println("La longitud debe ser de 4 caracteres, escribe un año que cumpla con esa condición");
                } else if (String.valueOf(año).length() > 4) {
                    System.out.println("Longitud: " + String.valueOf(año).length());
                    System.out.println("La longitud debe ser de 4 caracteres, escribe un año que cumpla con esa condición");
                }
            }



    }
}
