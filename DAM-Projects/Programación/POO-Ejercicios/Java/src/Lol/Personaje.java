package Lol;

public class Personaje {
    String nom;
    String rolprincipal;
    String dificultad;
    String recursoutiliza;
    int vidamaxima;
    int danoataque;
    int poderhabilidad;
    int armadura;
    int resistenciamagica;
    private Habilidad[] habilidad;

    public Personaje(String nom, String rolprincipal, String dificultad, String recursoutiliza, int vidamaxima, int danoataque, int poderhabilidad, int armadura, int resistenciamagica) {
        this.nom = nom;
        this.rolprincipal = rolprincipal;
        this.dificultad = dificultad;
        this.recursoutiliza = recursoutiliza;
        this.vidamaxima = vidamaxima;
        this.danoataque = danoataque;
        this.poderhabilidad = poderhabilidad;
        this.armadura = armadura;
        this.resistenciamagica = resistenciamagica;
        this.habilidad= new Habilidad[5];
    }

    public void setHabilidades(Habilidad p, Habilidad q, Habilidad w, Habilidad e, Habilidad r){
        habilidad[0]=p;
        habilidad[1]=q;
        habilidad[2]=w;
        habilidad[3]=e;
        habilidad[4]=r;
    }
    public void mostrafichaPersonaje(){
        System.out.println("CAMPEON:" +nom);
        System.out.println("ROL: "+rolprincipal+ "| Dificultad: "+dificultad);
        System.out.println("ESTADISTICAS: VIDA"+vidamaxima+" | AD: "+danoataque+" | AP: "+poderhabilidad);
        System.out.println("RECURSO: "+recursoutiliza);
        System.out.println("HABILIDADES:");
        for (Habilidad h: habilidad){
            if (h!=null){
                System.out.println("TECLA:"+h.tecla);
                System.out.println(h.nombre);
                System.out.println(h.descripcion);
                System.out.println(h.costerecurso);
                System.out.println();
            }
        }
    }
}
