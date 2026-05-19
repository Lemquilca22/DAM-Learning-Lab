package Pokedex;

public class Pokedex {
    String nombre;
    String tipo;
    int generacion;
    boolean captura;
    int numeropokedex;
    String evolucion;
    String involucion;

    public Pokedex(String nombre, String tipo, int generacion, boolean captura, int numeropokedex, String evolucion, String involucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.generacion = generacion;
        this.captura = captura;
        this.numeropokedex = numeropokedex;
        this.evolucion = evolucion;
        this.involucion = involucion;
    }

    public void evolucion(){
        System.out.println("La evolución de "+nombre+" es "+evolucion);
    }
    public void involucion(){
        System.out.println("La involución de "+nombre+" es "+involucion);
    }

}
