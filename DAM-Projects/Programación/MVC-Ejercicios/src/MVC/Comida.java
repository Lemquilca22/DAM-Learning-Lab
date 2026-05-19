package MVC;

public class Comida {
    private String[] hamburguesas = {
            "Whopper", "Whopper con Queso", "Big King",
            "Big King XXL", "Hamburguesa con Queso",
            "Chicken Royale", "Long Chicken",
            "Crispy Chicken", "Hamburguesa Vegetal"
    };

    private double[] precioHamburguesas = {
            8.00, 8.50, 7.50, 8.50, 4.00,
            8.00, 8.00, 7.50, 8.00
    };

    private String[] bebidas = {
            "Coca-Cola", "Fanta Naranja", "Sprite",
            "Nestea", "Agua", "Cerveza",
            "Batido Chocolate", "Batido Vainilla", "Batido Fresa"
    };

    private double[] precioBebidas = {
            2.50, 2.50, 2.50,
            2.50, 2.00, 3.00,
            3.50, 3.50, 3.50
    };



    public String getBebida(int opcion) {
        return bebidas[opcion - 1];
    }

    public double getPrecioBebida(int opcion) {
        return precioBebidas[opcion - 1];
    }

    public int cantidadHamburguesas() {
        return hamburguesas.length;
    }

    public int cantidadBebidas() {
        return bebidas.length;
    }

}
