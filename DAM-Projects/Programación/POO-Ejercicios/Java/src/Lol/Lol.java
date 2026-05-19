package Lol;

public class Lol {
    static void main(String[] args) {
        Personaje ahri = new Personaje("Ahri", "Mago", "Media", "Maná", 2090, 53, 0, 24, 30);

        Habilidad p = new Habilidad("Pasiva", "Esencia de ladrona", "Cura al golpear enemigos", 0, 0);
        Habilidad q = new Habilidad("Q", "Orbe del engaño", "Lanza un orbe que va y vuelve", 60, 7);
        Habilidad w = new Habilidad("W", "Fuego zorruno", "Lanza tres llamas", 40, 9);
        Habilidad e = new Habilidad("E", "Encanto", "Lanza un beso que enamora", 60, 12);
        Habilidad r = new Habilidad("R", "Impulso espiritual", "Se desplaza y lanza rayos", 100, 130);

        ahri.setHabilidades(p,q,w,e,r);
        ahri.mostrafichaPersonaje();
    }

}
