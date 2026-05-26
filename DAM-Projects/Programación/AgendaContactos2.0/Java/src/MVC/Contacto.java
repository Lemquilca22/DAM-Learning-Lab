package MVC;

public class Contacto {
    String nombreContacto;
    int numeroContacto;
    String correoContacto;

    public Contacto(String nombreContacto, int numeroContacto, String correoContacto) {
        this.nombreContacto = nombreContacto;
        this.numeroContacto = numeroContacto;
        this.correoContacto = correoContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public void mostrarContacto(){
        System.out.println("Nombre: "+nombreContacto+
                "\nTelefono: "+numeroContacto+"\nCorreo: "+correoContacto);
        System.out.println("---------------------");
    }
}
