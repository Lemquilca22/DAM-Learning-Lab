package MVCvers1;

public class Main {
    static void main(String[] args) {
        Comida modelo= new Comida(0,0);
        ComidaVista vista = new ComidaVista();
        ComidaControlador controlador= new ComidaControlador(modelo, vista);
        controlador.iniciar();
    }
}
