import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila=sc.nextInt(), columna= sc.nextInt();
        String[][] tablero=new String[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero[i][j]=sc.next();
            }
        }
        int nenufaresvalidos=0;
        boolean filasegura=true;
        boolean columnasegura=true;
        for (int i = 0; i < fila; i++) {
            boolean seguro=true;
            int filanenufar=0;
            int columnanenufar=0;
            for (int j = 0; j < columna; j++) {
                if (tablero[i][j].equals("N")){
                    filanenufar=i;
                    columnanenufar=j;
                    for (int k = 0; k < columna; k++) {
                        if (tablero[filanenufar][k].equals("P")){
                            filasegura=false;
                        }
                    }
                    for (int l = 0; l < fila; l++) {
                        if (tablero[l][columnanenufar].equals("P")){
                            columnasegura=false;
                        }
                    }
                    if (!filasegura || !columnasegura){
                        seguro=false;
                    }
                    if (seguro){
                        nenufaresvalidos++;

                    }
                }

            }
        }
        System.out.println(nenufaresvalidos);
    }
}
