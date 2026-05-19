import java.util.Scanner;

public class apruebaoNo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int alumnos = sc.nextInt();
        String nomalum;
        String apellido;
        float nota;

        for ( int i = 0; i <alumnos; i++ ) {
            nomalum = sc.next();
            apellido = sc.next();
            nota = sc.nextFloat();
            if (nota>=5) {
                System.out.println(nomalum+" "+apellido+": aprobado");
            } else {
                System.out.println(nomalum+" "+apellido+": suspende");
            }
        }

    }
}
