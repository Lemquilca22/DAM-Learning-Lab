import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String operacion = scanner.next();
        int y = scanner.nextInt();


        if (operacion.equals("+")) {
            System.out.println(x + y);
            if (((x + y) % 2) == 0) {
                System.out.println("El resultado de la suma es un numero es par");
            } else {
                System.out.println("impar");
            }
        } else if (operacion.equals("-")) {
                System.out.println(x-y);
                if (((x-y)%2)==0) {
                    System.out.println("El resultado de la resta es un numero es par");
                }else {
                    System.out.println("impar");
                }
        } else if (operacion.equals("*")) {
            System.out.println(x*y);
            if (((x * y) % 2) == 0) {
                System.out.println("El numero es par la division");
            } else {
                System.out.println("impar");
            }
        }else if (operacion.equals("/")) {
            System.out.println(x/y);
            if ((x / y) % 2 == 0) {
                System.out.println("El resultado de la division es un numero es par");
            } else {
                System.out.println("impar");
            }
        }else if  (operacion.equals("junta")) {
                    String juntos = String.valueOf(x) + String.valueOf(y);
                    System.out.println(juntos);
                    if ((x*10+y)%2==0) {
                        System.out.println("El numero junto es par");
                    }else {
                        System.out.println("impar");
                    }
        } else {
            System.out.println("error");
        }
    }
    }
