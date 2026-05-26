package MVC;

import java.util.Scanner;

public class VistaContacto {
    private Scanner sc = new Scanner(System.in);

    public void print(){
        System.out.println("¿Que quiere hacer hoy?");
        System.out.println("1) Añadir contacto"+
                "\n"+"2) Mostrar contactos"+
                "\n"+"3) Modificar contacto"+
                "\n"+"4) Buscar contacto");
    }
    public int pedirEntero(String mensaje){
        System.out.print(mensaje);
        int op = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        return op;
    }
    public String pedirString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
    public void mostrarContacto(Contacto c){
        System.out.println("Nombre: "+c.nombreContacto+
                "\nTelefono: "+c.numeroContacto+"\nCorreo: "+c.correoContacto);
        System.out.println("---------------------");
    }
}
