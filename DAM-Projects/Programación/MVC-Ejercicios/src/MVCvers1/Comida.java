package MVCvers1;

public class Comida {
    private int numeroHamburguesa;
    private int numeroBebida;

    private static final String[] nombresHamburguesas = {
            "Whopper", "Whopper con Queso", "Big King", "Big King XXL",
            "Hamburguesa con Queso", "Chicken Royale", "Long Chicken",
            "Crispy Chicken", "Hamburguesa Vegetal"
    };

    private static final String[] nombresBebidas = {
            "Coca-Cola", "Fanta Naranja", "Sprite", "Nestea", "Agua",
            "Cerveza", "Batido Chocolate", "Batido Vainilla", "Batido Fresa"
    };

    private static final double[] preciosHamburguesas = {
            8.0, 8.50, 7.50, 8.50, 4.0, 8.0, 8.0, 7.50, 8.0
    };

    private static final double[] preciosBebidas = {
            2.50, 2.50, 2.50, 2.50, 2.0, 3.0, 3.50, 3.50, 3.50
    };

    public Comida(int numeroHamburguesa, int numeroBebida) {
        this.numeroHamburguesa = numeroHamburguesa;
        this.numeroBebida = numeroBebida;
    }


    public int getNumeroHamburguesa() { return numeroHamburguesa; }
    public int getNumeroBebida() { return numeroBebida; }


    public String getNombreHamburguesa() {
        return nombresHamburguesas[numeroHamburguesa - 1];
    }

    public String getNombreBebida() {
        return nombresBebidas[numeroBebida - 1];
    }


    public double getPrecioHamburguesa() {
        return preciosHamburguesas[numeroHamburguesa - 1];
    }

    public double getPrecioBebida() {
        return preciosBebidas[numeroBebida - 1];
    }

    // Suma total
    public double getTotal() {
        return getPrecioHamburguesa() + getPrecioBebida();
    }
}