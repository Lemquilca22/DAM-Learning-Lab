package Modelo;

public class Bebida {
    private String nombreBebida;
    private double precioBebida;
    private String tamanoBebida;
    private boolean temperaturaBebida;

    public Bebida(String nombre, double precio, String tamano, boolean temperatura) {
        this.nombreBebida = nombre;
        this.precioBebida = precio;
        this.tamanoBebida = tamano;
        this.temperaturaBebida = temperatura;
    }

    private static String[] bebidas = {"Coca-Cola", "Fanta", "Sprite", "Nestea", "Agua", "Cerveza"};
    private static double[] precios = {2.50, 2.50, 2.50, 2.50, 2.00, 3.00};

    public static String[] getBebidas() { return bebidas; }
    public static double[] getPrecios() { return precios; }
    public static String getNombre(int opcion) { return bebidas[opcion - 1]; }
    public static double getPrecio(int opcion) { return precios[opcion - 1]; }

    public String getNombreBebida() { return nombreBebida; }
    public double getPrecioBebida() { return precioBebida; }
    public String getTamanoBebida() { return tamanoBebida; }
}