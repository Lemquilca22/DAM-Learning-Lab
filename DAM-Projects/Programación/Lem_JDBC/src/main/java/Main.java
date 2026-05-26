import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HipermercadoDAO dao = new HipermercadoDAO();

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE PRODUCTOS ===");
        System.out.print("Introduce el ID del producto que deseas buscar: ");

        int idIngresado = sc.nextInt();

        // Llama al método de nuestro DAO
        dao.mostrarProductoPorId(idIngresado);

        sc.close();
    }
}