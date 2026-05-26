import java.util.Scanner;

public class Main {
    private static void registrarProductoDesdeConsola(HipermercadoDAO dao, Scanner sc) {
        Producto p = new Producto();

        System.out.println("--- Registro de nuevo producto ---");
        System.out.print("Nombre: "); p.nombre = sc.nextLine();
        System.out.print("Descripción: "); p.descripcion = sc.nextLine();
        System.out.print("ID Sección (número): "); p.idSeccion = Integer.parseInt(sc.nextLine());
        System.out.print("ID Marca (número): "); p.idMarca = Integer.parseInt(sc.nextLine());
        System.out.print("Precio (decimal): "); p.precio = Double.parseDouble(sc.nextLine());
        System.out.print("Precio Kg/L (decimal): "); p.precioKgL = Double.parseDouble(sc.nextLine());
        System.out.print("Peso o Volumen (decimal): "); p.pesoMl = Double.parseDouble(sc.nextLine());
        System.out.print("Unidad de medida (ej: ml, g, kg, l): "); p.unidadMedida = sc.nextLine();
        System.out.print("Stock (número): "); p.stock = Integer.parseInt(sc.nextLine());
        System.out.print("Descuento % (número): "); p.descuentoPct = Integer.parseInt(sc.nextLine());
        System.out.print("Es novedad (1 sí / 0 no): "); p.esNovedad = Integer.parseInt(sc.nextLine());
        System.out.print("Es Bio (1 sí / 0 no): "); p.esBio = Integer.parseInt(sc.nextLine());
        System.out.print("Sin Gluten (1 sí / 0 no): "); p.sinGluten = Integer.parseInt(sc.nextLine());
        System.out.print("Vegano (1 sí / 0 no): "); p.vegano = Integer.parseInt(sc.nextLine());
        System.out.print("Calorías (número): "); p.calorias = Integer.parseInt(sc.nextLine());
        System.out.print("Fecha de Caducidad (YYYY-MM-DD): "); p.fechaCaducidad = sc.nextLine();
        System.out.print("Código de Barras (texto): "); p.codigoBarras = sc.nextLine();
        System.out.print("Activo (1 sí / 0 no): "); p.activo = Integer.parseInt(sc.nextLine());

        // Enviamos el objeto completo al DAO
        dao.insertarProducto(p);

        System.out.println("\n¡Producto registrado correctamente!");
    }
    public static void main(String[] args) {
        HipermercadoDAO dao = new HipermercadoDAO();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MENÚ HIPERMERCADO ===");
            System.out.println("1. Buscar producto por ID");
            System.out.println("2. Registrar nuevo producto");
            System.out.println("3. Filtrar por categoría (sección)");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar productos por marca");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID del producto: ");
                    dao.mostrarProductoPorId(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Iniciando registro de producto...");
                    registrarProductoDesdeConsola(dao,sc);
                    break;
                case 3:
                    System.out.print("ID de la categoría/sección: ");
                    dao.filtrarProductoPorCategoria (sc.nextInt());
                    break;
                case 4:
                    System.out.print("ID del producto a eliminar: ");
                    dao.eliminarProducto(sc.nextInt());
                    break;
                case 5:
                    System.out.print("ID de la marca: ");
                    dao.mostrarProductosPorMarca(sc.nextInt());
                    break;
                case 6:
                    salir = true;
                    System.out.println("Cerrando sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}