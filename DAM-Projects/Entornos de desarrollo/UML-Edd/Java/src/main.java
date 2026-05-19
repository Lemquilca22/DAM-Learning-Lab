public class main {
    static void main(String[] args) {

        Producto producto1=new Producto("Iphone 17",700,true);
        Producto producto2=new Producto("Airpods",300,false);
        Cliente cliente1= new Cliente("Pepito","pepito@mail.com","Calle francia 16");
        Tienda tienda = new Tienda();
        tienda.añadirCliente(cliente1);
        Pedido pedido1=new Pedido("22/02/26",cliente1);
        pedido1.añadirProducto(producto1); pedido1.añadirProducto(producto2);
        tienda.añadirPedido(pedido1);
        System.out.println(tienda.toString());

    }
}
