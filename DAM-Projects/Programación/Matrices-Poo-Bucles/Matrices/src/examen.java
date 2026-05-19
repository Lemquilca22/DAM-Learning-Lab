import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila=sc.nextInt(), columna= sc.nextInt();
        String[][] tablero=new String[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero[i][j]=sc.next();
            }
        }
        String itemrequerido=sc.next();
        int cantidadrequerida=sc.nextInt();
        int contador=0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (tablero[i][j].equalsIgnoreCase(itemrequerido)){
                    contador++;
                }
            }
        }
        if (contador>=cantidadrequerida){
            System.out.println("MISSION COMPLETED");
        } else {
            System.out.println("MISSION FAILED");
        }
    }
}
