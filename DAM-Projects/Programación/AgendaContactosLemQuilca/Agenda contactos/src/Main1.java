import java.util.Scanner;

public class Main1 {
    static void print(){
        System.out.println("¿Que quiere hacer hoy?"+ " Selecciona una opcion");
        System.out.println("1) Añadir contacto"+"\n"+"2) Mostrar contactos"+"\n"+"3) Modificar contacto"+"\n"+"4) Buscar contacto");
    }
    static void añadircontacto(String[] arraycontacto, int[] arraynumero, int numerocontactoañadidos, Scanner sc){
        System.out.println("Ingrese el numero de telefono: ");
        arraynumero[numerocontactoañadidos]=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre que le quiere asignar: ");
        arraycontacto[numerocontactoañadidos]=sc.nextLine();

    }
    static void listadecontacto(String[]arraycontacto, int[]arraynumero){
        System.out.println("Esta es tu lista de contactos: ");
        for (int i = 0; i < 100; i++) {
            if (arraycontacto[i]== null) {
                continue;
            } else {
                System.out.println((i)+") Nombre: "+arraycontacto[i]+" Numero: "+arraynumero[i]);
            }
        }
    }
    static void modificarcontacto(String[]arraycontacto, Scanner sc, int[]arraynumero){
        System.out.println("Que contacto quieres modificar?");
        for (int i = 0; i < 100; i++) {
            if (arraycontacto[i]== null) {
                continue;
            } else {
                System.out.println((i)+") Nombre: "+arraycontacto[i]+" Numero: "+arraynumero[i]);
            }
        }
        int modificar = sc.nextInt();
        System.out.println("Perfecto, encontré a "+arraycontacto[modificar]);
        System.out.println("¿Quieres modificar el numero o el nombre?");
        String respuesta=sc.next();
        if (respuesta.equalsIgnoreCase("nombre")) {
            System.out.println("cual deseas que sea el nuevo nombre?");
            String nuevoNombre=sc.next();
            arraycontacto[modificar]=nuevoNombre;
            System.out.println("Haz modificado el contacto a "+nuevoNombre);
        } else if (respuesta.equalsIgnoreCase("numero")) {
            System.out.println("cual deseas que sea el nuevo numero?");
            int nuevonumero=sc.nextInt();
            arraynumero[modificar]=nuevonumero;
            System.out.println("Haz modificado el contacto a "+nuevonumero);
        }
    }
    static void buscarcontacto(Scanner sc,String[]arraycontacto, int[] arraynumero){
        System.out.println("Ingresa el nombre del contacto que buscas");
        sc.nextLine();
        String buscar=sc.nextLine();
        for (int i = 0; i < 100; i++) {
            if (arraycontacto[i].equalsIgnoreCase(buscar)){
                System.out.println("El contacto que busca si está en la base de datos\nSu número es: "+arraynumero[i]);
                return;
            } else {
                System.out.println("Ese contacto no existe");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Implementar un menu con 4 opciones
        boolean salir = true;
        String rpta;
        String [] arraycontacto = new String[100];
        int [] arraynumero = new int[100];
        int numerocontactoañadidos=0;
        while(salir) {
            print();
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    añadircontacto(arraycontacto,arraynumero,numerocontactoañadidos, sc);
                    numerocontactoañadidos++;
                    break;
                case 2:
                    listadecontacto(arraycontacto,arraynumero);
                    break;
                case 3:
                    modificarcontacto(arraycontacto, sc, arraynumero);

                    break;
                case 4:
                    buscarcontacto(sc,arraycontacto,arraynumero);
                    break;
            }
//            scan.next();
            System.out.println("Deseas realizar otra operación (SI/NO)");
            rpta= sc.next();
            if (rpta.equalsIgnoreCase("NO")){
                salir=false;
                System.out.println("Gracias, nos vemos pronto ");
            }
        }




    }
}

