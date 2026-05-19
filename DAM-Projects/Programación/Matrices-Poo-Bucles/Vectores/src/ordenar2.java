import java.util.Scanner;

public class ordenar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numpersonas = sc.nextInt();
        int [] arrayPosicion = new int[numpersonas];
        int ticketactual=0;
        int tickettrasero;
//        int colados=0;

        for (int i = 0; i < numpersonas; i++) {
            arrayPosicion[i]=sc.nextInt();
        }
        for (int i = 0; i < numpersonas; i++) {
                 ticketactual=arrayPosicion[i];
                 int colados=0;

            for (int j = i+1; j < numpersonas ; j++) {
                tickettrasero= arrayPosicion[j];

                if (ticketactual>tickettrasero){
                    colados++;
                }
            }
            if (colados>0) {
                System.out.println("La persona con el ticket "+ ticketactual+" se ha colado por delante de "+colados+" personas");
            }
        }
//        for (int i = parar; i < arrayPosicion.length; i++) {
//            contador++;
//        }
//
//        System.out.print(contador+" personas");
    }
}
