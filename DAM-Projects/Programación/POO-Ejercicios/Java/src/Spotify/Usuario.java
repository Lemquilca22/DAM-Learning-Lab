package Spotify;

public class Usuario {
    String nomusuario;
    String correo;
    String tipocuenta;
    String fecharegistro;
    private Cancion[] listareproduccion;
    private int contadorCanciones;

    public Usuario(String nomusuario, String correo, String tipocuenta, String fecharegistro) {
        this.nomusuario = nomusuario;
        this.correo = correo;
        this.tipocuenta = tipocuenta;
        this.fecharegistro = fecharegistro;
        this.listareproduccion = new Cancion[50];
        this.contadorCanciones = 0;
    }

    public void agregarCancion(Cancion cancion) {
        if (contadorCanciones < listareproduccion.length) {
            listareproduccion[contadorCanciones] = cancion;
            contadorCanciones++;
            System.out.println("Canción añadida!");
        } else {
            System.out.println("Lista llena");
        }
    }
    public void mostrarlista(){
        System.out.println("Lista de: "+nomusuario+" ");
        if (contadorCanciones==0){
            System.out.println("No hay canciones en la lista");
        } else {
            for (int i = 0; i < contadorCanciones; i++) {
                System.out.println((i+1)+". "+listareproduccion[i].obtenerDetalles());
            }
        }
    }
}
