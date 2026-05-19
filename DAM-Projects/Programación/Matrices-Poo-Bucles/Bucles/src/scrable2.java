import java.util.Scanner;

public class scrable2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra=sc.next().toUpperCase();
        int puntuación=0;

        for (char i: palabra.toCharArray()){
            if (i=='A' || i=='E' || i=='I' || i=='O'|| i=='U' || i=='L' || i=='N' || i=='R' || i=='S' || i=='T') {
                puntuación += 1;
            } else if (i=='D' || i=='G') {
                puntuación +=2;
            } else if (i=='B' || i=='C' || i=='M' || i=='P') {
                puntuación +=3;
            } else if (i=='F' || i=='H' || i=='V' || i=='W' || i=='Y') {
                puntuación +=4;
            } else if (i=='K') {
                puntuación +=5;
            } else if (i=='J' || i=='X') {
                puntuación +=8;
            } else if (i=='Q' || i=='Z') {
                puntuación +=10;
            }
        }
        System.out.println(puntuación);


    }

}
