package Personaje_videjuego;

public class Guerrero extends Personaje{
    private int fuerza;
    private int armadura;

    public Guerrero(){

    }
    public Guerrero(String nombre, int ataque, int defensa, int fuerza, int armadura) {
        super(nombre, ataque, defensa);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    @Override
    public String toString() {
        return "Guerrero stats"+
                "\nNombre: "+getNombre()+
                "\nVida: "+getVida()+
                "\nAtaque: "+getAtaque()+
                "\nDefensa: "+getDefensa()+
                "\nFuerza: "+getFuerza()+
                "\nArmadura: " +getArmadura();
    }
}
