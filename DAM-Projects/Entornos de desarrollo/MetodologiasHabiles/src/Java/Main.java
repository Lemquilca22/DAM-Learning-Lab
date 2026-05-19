package Java;

public class Main {
    static void main(String[] args) {
        Mago mago = new Mago("Dolfor");
        Guerrero guerrero =new Guerrero("Kalse");
        int numero = 1;

        while (guerrero.estaVivo() && mago.estaVivo()) {
            System.out.println("TURNO NUMERO " + numero);

            guerrero.turnoguerrero(mago);

            if (!mago.estaVivo()) break;

            mago.turnoMago(guerrero);

            System.out.println("------------------------");
            System.out.println("Estadisticas del guerrero -- Vida: " + guerrero.getVidaMaxima() + " | Furia: " + guerrero.getFuria() + " | Energia: " + guerrero.getEnergia());
            System.out.println("Estadisticas del mago -- Vida: " + mago.getVidaMaxima() + " | Energia: " + mago.getEnergia());
            System.out.println();

            numero++;
        }

        if (guerrero.estaVivo()) {
            System.out.println("Gana el Guerrero");
        } else {
            System.out.println("Gana el Mago");
        }
    }
}
