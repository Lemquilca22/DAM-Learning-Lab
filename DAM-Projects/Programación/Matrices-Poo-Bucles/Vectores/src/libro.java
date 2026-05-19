import java.util.Scanner;

public class libro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiposlibros = sc.nextInt();
        sc.nextLine();
        String [] arraylibro = new String[tiposlibros];
        int  [] arraycantidad = new int[tiposlibros];
        int cantidadminima=0;
        for (int i=0; i<tiposlibros; i++){
            arraylibro[i]=sc.next();
        }
        for (int i = 0; i < tiposlibros; i++) {
            arraycantidad[i]=sc.nextInt();

            if(i==0){
                cantidadminima= arraycantidad[i];
            }
            else if (arraycantidad[i] < cantidadminima) {
                cantidadminima=arraycantidad[i];
            }
        }
        System.out.println("el listado de libros que menos tenemos son:");

        for (int i = 0; i < tiposlibros; i++) {
            if (arraycantidad[i]== cantidadminima) {
                System.out.println(arraylibro[i] + " " + arraycantidad[i]);
            }
        }
    }
}
