package Gestion_Coches;

public class CocheDeportivo extends Coche{
    private int caballos;
    private boolean modocarrera;

    public CocheDeportivo(String marca, String modelo, double precio, int velocidadMaxima, int caballos, boolean modocarrera) {
        super(marca, modelo, precio, velocidadMaxima);
        this.caballos = caballos;
        this.modocarrera = modocarrera;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public boolean isModocarrera() {
        return modocarrera;
    }

    public void setModocarrera(boolean modocarrera) {
        this.modocarrera = modocarrera;
    }


}
