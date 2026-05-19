package Personaje_videjuego;

public class Mago extends Personaje {
    private int mana;
    private int podermagico;

    public Mago(){
    }

    public Mago(String nombre, int ataque, int defensa, int mana, int podermagico) {
        super(nombre, ataque, defensa);
        this.mana = mana;
        this.podermagico = podermagico;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPodermagico() {
        return podermagico;
    }

    public void setPodermagico(int podermagico) {
        this.podermagico = podermagico;
    }

    @Override
    public String toString() {
        return "Mago stats"+
                "\nNombre: "+getNombre()+
                "\nVida: "+getVida()+
                "\nAtaque: "+getAtaque()+
                "\nDefensa: "+getDefensa()+
                "\nMana: "+getMana()+
                "\nPoder magico: " +getPodermagico();
    }
}
