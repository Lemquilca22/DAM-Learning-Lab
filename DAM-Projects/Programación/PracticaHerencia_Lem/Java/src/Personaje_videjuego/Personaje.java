package Personaje_videjuego;

public class Personaje {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    public Personaje(String nombre, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = 100;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    public Personaje(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
}
