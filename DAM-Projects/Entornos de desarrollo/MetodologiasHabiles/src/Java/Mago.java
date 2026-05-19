package Java;

import java.util.Random;
import java.util.Scanner;

public class Mago extends Combate {
    private int ataqueMagicoMago = 20;

    public Mago(String nombre) {
        super(nombre);
    }

    public int getAtaqueMagicoMago() {
        return ataqueMagicoMago;
    }
    public void setAtaqueMagicoMago(int ataqueMagicoMago) {
        this.ataqueMagicoMago = ataqueMagicoMago;
    }

    public void turnoMago(Guerrero guerrero) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int esquivo = random.nextInt(5) + 1;

        boolean volver = true;
        while (volver) {
            System.out.print("Que acción desea realizar el mago (1. Ataque normal | 2. Ataque magico): ");
            int eleccion = sc.nextInt();

            switch (eleccion) {
                case 1:
                    if (esquivo == 3) {
                        System.out.println("El guerrero ha esquivado el ataque");
                    } else {
                        System.out.println("El mago ha realizado un ataque y le ha hecho " + getAtaque() + " de daño a " + guerrero.getNombre() + ".");
                        guerrero.setVidaMaxima(guerrero.getVidaMaxima() - getAtaque());
                    }
                    volver = false;
                    break;

                case 2:
                    if (getEnergia() < 20) {
                        System.out.println("El mago no dispone de suficiente energía. Vuelve a escoger.");

                    } else if (esquivo == 3) {
                        System.out.println("El guerrero ha esquivado el ataque");
                        volver = false;
                    } else {
                        System.out.println("El mago ha realizado un ataque mágico y le ha hecho " + getAtaqueMagicoMago() + " de daño a " + guerrero.getNombre() + ".");
                        guerrero.setVidaMaxima(guerrero.getVidaMaxima() - ataqueMagicoMago);
                        setEnergia(getEnergia() - 30);
                        volver = false;
                    }
                    break;
            }
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
