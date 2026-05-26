package Tienda;

import Personajes.Personaje;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemigoIA {
    // El inventario guarda TODOS los personajes comprados permanentemente
    private ArrayList<Personaje> inventario; // Máximo 10 personajes
    private ArrayList<Personaje> equipoCombate; // Los 5 que salen a pelear
    private final int MAX_INV = 10;

    public EnemigoIA() {
        this.inventario = new ArrayList<>();
        this.equipoCombate = new ArrayList<>();
    }

    public void comprarDeTienda(Tienda tienda) {
        tienda.hacerRoll();//Llamamos al metodo para obtener personajes que hicieron Juanma y Lex
        List<Personaje> slotsDisponibles = tienda.getSlotsPersonajes(); // Obtenemos la lista actual de la tienda

        int compradosEstaVez = 0;
        // El enemigo compra 3 en cada ronda
        for (Personaje p : slotsDisponibles) {
            if (p != null && compradosEstaVez < 3 && inventario.size() < MAX_INV) {
                inventario.add(p);
                compradosEstaVez++;
            }
        }
    }
    //La logica antes era elige los personajes que tenemos en inventario (Si tenemos 10 escogera 5) al comenzar con 3 no hay problema.
    //Decidimos cambiarlo para que sea menos codigo
    public void seleccionarEquipoCombate() {
        equipoCombate.clear();

        // Ahora el equipo de combate es todo lo que está dentro de mi array
        for (Personaje p : inventario) {
            equipoCombate.add(p);
        }

        System.out.println("El enemigo sale con: " + equipoCombate.size() + " personajes.");
    }

    public ArrayList<Personaje> getEquipoCombate() {
        return equipoCombate;
    }
}