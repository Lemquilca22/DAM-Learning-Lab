package MVC;

import java.util.ArrayList;

public class ControladorContacto {
    private Contacto modeloContacto;
    private VistaContacto vista;
    ArrayList<Contacto> listaContactos = new ArrayList<>(); //Este array guarda objetos

    public ControladorContacto(VistaContacto vista) {
        this.modeloContacto = new Contacto("",0,"");
        this.vista = vista;
    }

    public void crearcontacto(ArrayList<Contacto>listaContactos){
        String nombre= vista.pedirString("Nombre: ");
        int telefono= vista.pedirEntero("Telefono: ");
        String correo= vista.pedirString("Correo: ");
        listaContactos.add(new Contacto(nombre,telefono,correo));
    }
    public void modificarcontacto(ArrayList<Contacto>listaContactos){
        String buscarNom= vista.pedirString("Contacto a modificar: ");

        boolean encontrado=false;
        for (Contacto c: listaContactos){
            if (c.getNombreContacto().equalsIgnoreCase(buscarNom)){
                System.out.println("Lo encontré\n");
                String nuevoNombre= vista.pedirString("Nuevo nombre:");
                int nuevoTelefono= vista.pedirEntero("Nuevo telefono: ");
                String nuevoCorreo= vista.pedirString("Nuevo email: ");
                //Utilizo este set para modificar los datos.
                c.setNombreContacto(nuevoNombre);
                c.setNumeroContacto(nuevoTelefono);
                c.setCorreoContacto(nuevoCorreo);
                System.out.println("Se modificó correctamente");
                encontrado=true;
                break;
            }

        }
        if (!encontrado){
            System.out.println("No encontré ese contacto");
        }
    }
    public void buscarcontacto(ArrayList<Contacto>listaContactos){
        String contactoBuscar= vista.pedirString("¿A quién estas buscando?: ");
        boolean existe=false;
        for (Contacto c : listaContactos){
            if (c.getNombreContacto().equalsIgnoreCase(contactoBuscar)){
                System.out.println("Aquí está la informacion del contacto que buscas: ");
                existe=true;
                c.mostrarContacto();
            }
        }
        if (!existe){
            System.out.println("Ese contacto no existe");
        }
    }

    public void iniciar(){
        boolean salir = true;
        while (salir) {
            vista.print();
            int opcion = vista.pedirEntero("Selecciona una opcion: ");
            switch (opcion) {
                case 1:
                    crearcontacto(listaContactos);
                    break;
                case 2:
                    for (Contacto a : listaContactos) {
                        vista.mostrarContacto(a);
                    }
                    break;
                case 3:
                    modificarcontacto(listaContactos);
                    break;
                case 4:
                    buscarcontacto(listaContactos);
                    break;
            }
        }
    }

}
