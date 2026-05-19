package Gestion_Coches;

public class Coche {
    private String marca;
    private String modelo;
    private double precio;
    private int velocidadMaxima;
    private Rueda delanteraDerecha;
    private Rueda delanteraIzquierda;
    private Rueda traseraDerecha;
    private Rueda traseraIzquierda;

    public Coche(String marca, String modelo, double precio, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.velocidadMaxima = velocidadMaxima;
        this.delanteraDerecha = new Rueda(75,"semi-nuevo");
        this.delanteraIzquierda = new Rueda(75,"semi-nuevo");
        this.traseraDerecha = new Rueda(75,"semi-nuevo");
        this.traseraIzquierda = new Rueda(75,"semi-nuevo");
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", velocidadMaxima=" + velocidadMaxima +
                ", delanteraDerecha=" + delanteraDerecha +
                ", delanteraIzquierda=" + delanteraIzquierda +
                ", traseraDerecha=" + traseraDerecha +
                ", traseraIzquierda=" + traseraIzquierda +
                '}';
    }


}
