import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlumnos = sc.nextInt();
        int aprobados=0;
        int suspendidos=0;
        float notasTotales=0;

        for (int i = 0; i < numAlumnos; i++) {
            float notaAlumno = sc.nextFloat();
            if (notaAlumno>=5){
                notasTotales+=notaAlumno;
                aprobados++;
            }else {suspendidos++;
            notasTotales+=notaAlumno;}
        }
        float mediaNotas=notasTotales/numAlumnos;
        System.out.println("APROBADOS: "+aprobados+"\nSUSPENDIDOS: "+suspendidos+"\nMEDIA: "+mediaNotas);


    }
}
