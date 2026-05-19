import java.util.ArrayList;

public class Tienda {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Cliente> clientes;

    public Tienda() {
        pedidos= new ArrayList<>();
        clientes= new ArrayList<>();
    }

    public void añadirCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void añadirPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    @Override
    public String toString() {
        return "------ TIENDA ------\n" +
                "------ CLIENTE ------\n" + clientes +
                "\n------ PEDIDO -------\n" + pedidos ;
    }
}
