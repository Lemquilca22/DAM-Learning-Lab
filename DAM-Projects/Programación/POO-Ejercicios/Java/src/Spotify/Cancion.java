package Spotify;

public class Cancion {
    String titulo;
    String artista;
    String album;
    double duracion;
    String genero;
    int numeroreproducciones;

    public Cancion(String titulo, String artista, String album, double duracion, String genero, int numeroreproducciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
        this.genero = genero;
        this.numeroreproducciones = numeroreproducciones;
    }
    public String obtenerDetalles() {
        return String.format("[%s] - %s | Álbum: %s | %s", titulo, artista, album, genero);
    }
}
