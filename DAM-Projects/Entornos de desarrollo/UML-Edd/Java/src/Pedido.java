import java.util.ArrayList;

public class Pedido {
    String fechapedido;
    private ArrayList<Producto> producto;
    Cliente cliente;

    public Pedido(String fechapedido,Cliente cliente) {
        this.fechapedido = fechapedido;
        producto=new ArrayList<>();
        this.cliente= cliente;
    }

    public void añadirProducto(Producto productos){
        producto.add(productos);
    }

    @Override
    public String toString() {
        return "Pedido:\n" +
                "Nombre del cliente: "+cliente.nombre+
                "\nfecha pedido: " + fechapedido +
                "\nproducto: " + producto;

    }


}
