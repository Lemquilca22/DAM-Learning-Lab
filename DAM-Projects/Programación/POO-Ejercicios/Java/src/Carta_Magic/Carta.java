package Carta_Magic;

public class Carta {
   String nombre;
   int costemana;
   String imagen;
   String tipocarta;
   String subtipo;
   String Habilidad;
   String rareza;
   String expansion;
   String artista;
   int fuerza;
   int resistencia;

    public Carta(String nombre, int costemana, String imagen, String tipocarta, String subtipo, String habilidad, String rareza, String expansion, String artista, int fuerza, int resistencia) {
        this.nombre = nombre;
        this.costemana = costemana;
        this.imagen = imagen;
        this.tipocarta = tipocarta;
        this.subtipo = subtipo;
        Habilidad = habilidad;
        this.rareza = rareza;
        this.expansion = expansion;
        this.artista = artista;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
    }
}
