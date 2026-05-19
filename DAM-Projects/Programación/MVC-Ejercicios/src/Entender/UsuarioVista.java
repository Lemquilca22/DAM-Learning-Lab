package Entender;

import java.util.Scanner;

public class UsuarioVista {
    private Scanner scanner = new Scanner(System.in);

    //Metodos que devuelven el valor para el Controlador
    public String pedirNombre(){
        System.out.print("Introduce tu nombre: ");
        return scanner.nextLine();
    }

    public int pedirEdad(){
        System.out.print("Introduce tu edad: ");
        return scanner.nextInt();
    }

    public void mostrarUsuario(String nombre, int edad){
        System.out.println("\nDatos del usuario");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+edad);
    }
    public void  mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
