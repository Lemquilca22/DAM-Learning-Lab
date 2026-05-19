package Personaje_videjuego;

import java.util.Random;

public class Main {
    static void main(String[] args) {
        Guerrero guerrero=new Guerrero("Aña",20,20,30,50);
        Mago mago=new Mago("Electricity",15,10,100,25);

//        System.out.println(guerrero);System.out.println();
//        System.out.println(mago);

        while (mago.getVida()>0 && guerrero.getVida()>0){

            //Comienza el mago
            int daniomago = mago.getAtaque() +5; // dañomagico
            guerrero.setVida(guerrero.getVida()-daniomago);

            if (guerrero.getVida()<0){
                guerrero.setVida(0);
            }
            System.out.println(mago.getNombre()+ " ataca por "+daniomago);
            System.out.println("vida del guerrero: "+ guerrero.getVida());

            if (guerrero.getVida()<=0){
                break;
            }
            //Turno del guerrero
            int danioGuerrero = guerrero.getAtaque();
            mago.setVida(mago.getVida()-danioGuerrero);

            if (mago.getVida()<0){
                mago.setVida(0);
            }
            System.out.println(guerrero.getNombre() + " ataca por " + danioGuerrero);
            System.out.println("Vida del mago: " + mago.getVida());

            System.out.println("------------------");
        }
        if (mago.getVida()>0){
            System.out.println("Gana el mago");
        } else {
            System.out.println("Gana el guerrero");
        }

    }

}
