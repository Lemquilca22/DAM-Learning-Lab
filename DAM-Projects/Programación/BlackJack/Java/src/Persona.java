import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nom;
    private ArrayList<Carta> mano;

    public Persona(String nom) {
        this.nom = nom;
        this.mano = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public  void pedirCarta(ArrayList<Carta> mazo){
        if (!mazo.isEmpty()){
            //No sabía como funcionaba remove, sirve para tomar del index del Array de mazo
            Carta cartarobada = mazo.remove(0);
            this.mano.add(cartarobada);
            System.out.println(nom+" has robado "+ cartarobada);
        } else {
            System.out.println("No hay mas cartas en el mazo");
        }
    }
    public int calcularPuntuacion(){
        int puntos = 0;
        int ases = 0;

        for (Carta c : mano) {
            String valor = c.getValor();
            if (valor.equals("As")) {
                ases++;
                puntos += 11;
            } else if (valor.equals("J") || valor.equals("Q") || valor.equals("K")) {
                puntos += 10;
            } else {
                puntos += Integer.parseInt(valor);
            }
        }

        // La IA me ayudó con esta logica para el valor de las ases
        while (puntos > 21 && ases > 0) {
            puntos -= 10;
            ases--;
        }
        return puntos;
    }
    public int plantarse(){
        int total= calcularPuntuacion();
        System.out.println(this.nom + " se planta con " + total + " puntos.");
        return total;
    }


}
