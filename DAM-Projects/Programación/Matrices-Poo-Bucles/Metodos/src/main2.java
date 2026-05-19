import java.util.Scanner;

public class main2 {
   static String hayProducto(int fila, int columna){
       String disponibilidad="";
       int[][] maquina= {
               {5, 3, 0},
               {2, 0, 1},
               {0, 4, 6}
       };
       if (maquina[fila][columna]==0){
           disponibilidad="Producto agotado";
       } else {
           disponibilidad="Producto disponible";
       }
       return disponibilidad;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila=sc.nextInt();
        int columna=sc.nextInt();
        System.out.println(hayProducto(fila, columna));
    }
}
