package Lol;

public class Habilidad {
    String nombre;
    String descripcion;
    String tecla;
    int costerecurso;
    int enfriamiento;
    int nivel;

    public Habilidad(String tecla,String nombre, String descripcion, int costerecurso, int enfriamiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tecla = tecla;
        this.costerecurso = costerecurso;
        this.enfriamiento = enfriamiento;
        this.nivel = 0;
    }


}
