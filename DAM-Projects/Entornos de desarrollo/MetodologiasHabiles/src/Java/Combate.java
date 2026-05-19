package Java;

public class Combate {
    private String nombre;
    private int energia;
    private int vidaMaxima;
    private int ataque;

    public Combate() {
    }

    public Combate(String nombre) {
        this.nombre = nombre;
        this.energia = 80;
        this.vidaMaxima = 100;
        this.ataque = 15;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void recibirdanio(double danio) {
        vidaMaxima -= danio;
    }
}

