package Spotify;

public class Aplicacion {
    static void main(String[] args) {
        Cancion c1 = new Cancion("Starboy", "The Weeknd", "Starboy", 3.50, "R&B",2);
        Cancion c2 = new Cancion("Bohemian Rhapsody", "Queen", "A Night at the Opera", 5.55, "Rock",4);

        // Creamos el Usuario
        Usuario user = new Usuario("Maria_Music", "maria@mail.com", "Gratuita", "10/02/2026");

        // Añadimos las canciones
        user.agregarCancion(c1);
        user.agregarCancion(c2);

        // Mostramos el contenido
        user.mostrarlista();
    }
}
