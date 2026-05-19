package practicar1;

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
    public String pedirMarca(){
        System.out.print("Ingresa marca de tu coche: ");
        return scanner.nextLine();
    }
    public void mostrarUsuario(String nombre, int edad,Coche coche){
        System.out.println("\nDatos del usuario");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Coche: "+coche.getMarca());
    }
    public void  mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
