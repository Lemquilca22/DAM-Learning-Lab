package Gestion_Coches;

public class CocheElectrico extends Coche {
    private int autonomia;
    private int tiempoCarga;
    private Rueda delanteraDerecha;

    public CocheElectrico(String marca, String modelo, double precio, int velocidadMaxima, int autonomia, int tiempoCarga) {
        super(marca, modelo, precio, velocidadMaxima);
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "autonomia=" + autonomia +
                ", tiempoCarga=" + tiempoCarga  + super.toString();
    }
}
