package Java;

import java.util.Random;
import java.util.Scanner;

public class Guerrero extends Combate {
    private int escudo;
    private int furia;

    public Guerrero(String nombre) {
        super(nombre);
        this.escudo = 50;
        this.furia = 1;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getFuria() {
        return furia;
    }

    public void setFuria(int furia) {
        this.furia = furia;
    }

    public void turnoguerrero(Mago enemigo){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Que acción desea realizar el guerrero (1. Ataque  | 2. Aumentar furia): ");
        int eleccion = sc.nextInt();
        double danio=0;

        switch (eleccion) {
            case 1:
                int numeroaleatorio= random.nextInt(5)+1;
                if (numeroaleatorio<=4){
                    danio= getAtaque()*getFuria();
                    enemigo.recibirdanio(danio);
                    System.out.println("El guerrero ha realizado un ataque y le ha hecho " + danio + "de daño a " + enemigo.getNombre() + ".");

                } else if (numeroaleatorio==3) {
                    danio=(getAtaque()*1.5)*getFuria();
                    enemigo.recibirdanio(danio);
                    System.out.println("¡El guerrero ha realizado un golpe crítico y le ha hecho " + danio + "de daño a " + enemigo.getNombre() + "!");

                } else {
                    System.out.println("El guerrero ha fallado su ataque.");
                }
                break;

            case 2:
                furia += 1;
                System.out.println("Tu furia ahora es: " + furia);
                setEnergia(getEnergia() - 50);
                break;

        }
        sc.nextLine();
        if(getEnergia()<=80){
            setEnergia(getEnergia() + 10);
        }

    }
    public boolean estaVivo() {
        return getVidaMaxima() > 0;
    }
}
