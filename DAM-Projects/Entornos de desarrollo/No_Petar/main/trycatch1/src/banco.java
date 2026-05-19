import java.util.InputMismatchException;
import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dineroBanco=0;
        int resp;
        int ingresar=0;
        int retirar=0;
        boolean salir=false;

        while (!salir){

                System.out.println("Bienvenido al banco LEGO");
                System.out.println("Su estado de cuenta actual es: "+dineroBanco);

                System.out.println("¿Qué desea hacer? (1) Ingresar dinero o 2) Retirar dinero)");
                resp=sc.nextInt();

                    if (resp==2){
                        System.out.println("¿Cuanto desea retirar?");
                        try {
                            retirar=sc.nextInt();
                        if (retirar<1){
                                throw new Exception("No puedes retirar dinero en negativo, vuelve a intentarlo.");
                            }
                        if (dineroBanco==0 || retirar>dineroBanco){
                            throw new Exception("No se puede realizar esta operación, fondos insfucicientes.");
                        }
                        if (retirar>1000){
                            throw new ArithmeticException("Error, el valor maximo que puedes retirar es 1000 euros.");
                        }
                        dineroBanco-=retirar;
                        System.out.println("Ha retirado "+retirar+" Euros.");
                        System.out.println("Estado actual de cuenta: "+dineroBanco);
                        } catch (InputMismatchException e){
                            System.out.println("No puedes ingresar texto, vuelve a intentarlo.");
                            sc.next();
                        } catch (Exception a){
                            System.out.println(a);
                        }
                    } else if (resp==1) {
                        System.out.println("¿Cuanto desea ingresar?");
                        try {
                            ingresar=sc.nextInt();
                            if (ingresar<0) {
                                throw new ArithmeticException("No se puede realizar esta operación, no puedo ingresar valores negativos.");
                            }
                            if (ingresar<10){
                                throw new ArithmeticException("Error, el valor minimo para ingresar es 10 euros.");
                            }
                            dineroBanco += ingresar;
                            System.out.println("Ha ingresado " + ingresar + " Euros.");
                            System.out.println("Estado actual de cuenta: " + dineroBanco);
                        } catch (InputMismatchException e) {
                            System.out.println("No puedes ingresar texto, vuelve a intentarlo.");
                            sc.next();
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }


        }
    }
}
