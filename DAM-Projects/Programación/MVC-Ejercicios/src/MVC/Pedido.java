package MVC;

public class Pedido {
    private Persona persona;
    private String hamburguesa;
    private String bebida;
    private double total;

    public Pedido(Persona persona, String hamburguesa,
                  String bebida, double total) {

        this.persona = persona;
        this.hamburguesa = hamburguesa;
        this.bebida = bebida;
        this.total = total;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getHamburguesa() {
        return hamburguesa;
    }

    public String getBebida() {
        return bebida;
    }

    public double getTotal() {
        return total;
    }
}
