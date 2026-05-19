import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        //utilizar substring y cadenas de texto
        Scanner sc = new Scanner(System.in);
        String vsd = sc.next();
        char viernes = vsd.charAt(0);
        char sabado = vsd.charAt(1);
        char domingo = vsd.charAt(2);
        int ventasviernes = Character.getNumericValue(viernes);
        int ventassabado = Character.getNumericValue(sabado);
        int ventasdomigno = Character.getNumericValue(domingo);

        int totalvendidos = ventasviernes+ventasdomigno+ventassabado;

        if (ventasviernes>ventassabado && ventasviernes>ventasdomigno){
            System.out.println("La cantidad total de libros vendidos es: "+totalvendidos);
            System.out.println("El dia con mas ventas ha sido: Viernes");
        } else if(ventassabado>ventasviernes && ventassabado>ventasdomigno) {
            System.out.println("La cantidad total de libros vendidos es: "+totalvendidos);
            System.out.println("El dia con mas ventas ha sido: Sabado");
        } else {
            System.out.println("La cantidad total de libros vendidos es: "+totalvendidos);
            System.out.println("El dia con mas ventas ha sido: Domingo");
        }


    }
}
