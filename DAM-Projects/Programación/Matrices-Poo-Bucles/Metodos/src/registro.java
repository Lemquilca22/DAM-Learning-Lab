import java.util.Scanner;

public class registro {
    static void print(String nombre, String apellido, int edad){
        System.out.println("Paciente registrado");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        if (edad<18){
            System.out.println("Categoria: MENOR DE EDAD");
        } else if (edad>=18 && edad<=64) {
            System.out.println("Categoria: ADULTO");
        } else {
            System.out.println("Categoria: ADULTO MAYOR");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre=sc.next(), apellido= sc.next();
        int edad=sc.nextInt();
        print(nombre,apellido,edad);
    }
}
