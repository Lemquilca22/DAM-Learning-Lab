import java.util.Scanner;

public class vendingmachine {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int disponible=sc.nextInt();
        float precio=sc.nextFloat();
        boolean funciona=true;
        String accion;
        float ingresar;
        float dinero=0;
        System.out.println("Insert coin");
        while (funciona){
            accion=sc.next();
            if(accion.equalsIgnoreCase("OFF")){
                funciona=false;
                System.out.println("Insert coin");
            }
            ingresar=sc.nextFloat();
            if(accion.equalsIgnoreCase("INSERT")){
                dinero+=ingresar;
                System.out.println("Balance:"+dinero);
            }
            if(accion.equalsIgnoreCase("EXPEND")){
                if (precio<=dinero){
                    dinero-=precio;
                    System.out.println("Your water, thanks");
                    System.out.println("Balance:"+dinero);
                    System.out.println("Refund:"+dinero);
                } else {
                    System.out.println("Price:"+precio);
                }
            }
        }
    }
}
