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

        // Con este metodo se envia el objeto completo al DAO
        dao.insertarProducto(p);

        System.out.println("\n¡Producto registrado correctamente!");
    }
    private static void registrarMarcaDC(HipermercadoDAO dao, Scanner sc ){
        Marca marca =new Marca();
        System.out.println("Registro de nueva Marca");
        System.out.print("Nombre: "); marca.nombre=sc.nextLine();
        System.out.print("País: "); marca.pais=sc.nextLine();
        System.out.print("Premium (1 sí/ 0 no): "); marca.premium=sc.nextInt();

        dao.insertarMarca(marca);
        System.out.println("\n¡Marca registrada correctamente!");

    }
    private static void menuProductos(HipermercadoDAO dao, Scanner sc) {
        System.out.println("\n--- GESTIÓN PRODUCTOS ---");
        System.out.println("1. Buscar por ID | 2. Registrar | 3. Filtrar Categoría | 4. Filtrar Stock | 5. Eliminar");
        int op = Integer.parseInt(sc.nextLine());

        switch(op) {
            case 1:
                System.out.print("Id del producto: "); dao.mostrarProductoPorId(sc.nextInt()); break;
            case 2:
                System.out.print("Iniciando registro del producto: "); registrarProductoDesdeConsola(dao,sc); break;
            case 3:
                System.out.print("Id de la seccion: "); dao.filtrarProductoPorCategoria (sc.nextInt()); break;
            case 4:
                System.out.print("Introduce la cantidad de Stock: "); int stockPro =sc.nextInt();sc.nextLine();
                System.out.println("¿Qué filtro aplicar? (>, <, =): "); String opcion =sc.nextLine();
                dao.filtrarProductoPorStock(stockPro, opcion);
                break;

            case 5:
                System.out.println(); dao.eliminarProducto(sc.nextInt());

        }
    }
    private static void menuMarcas(HipermercadoDAO dao, Scanner sc){
        System.out.println("\n--- GESTIÓN MARCAS ---");
        System.out.println("1. Buscar por ID | 2. Registrar | 3. Eliminar");
        int op = Integer.parseInt(sc.nextLine());

        switch(op) {
            case 1: dao.mostrarProductosPorMarca(sc.nextInt()); break;
            case 2: registrarMarcaDC(dao, sc); break;
            case 3: dao.eliminarMarca(sc.nextInt()); break;
        }
    }

    public static void main(String[] args) {
        HipermercadoDAO dao = new HipermercadoDAO();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir){
            System.out.println("\n=== MENÚ HIPERMERCADO ===");
            System.out.println("1. Gestionar productos");
            System.out.println("2. Gestionar marcas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcionTablas=sc.nextInt();
            sc.nextLine();

            switch (opcionTablas){
                case 1:
                    menuProductos(dao,sc); break;
                case 2:
                    menuMarcas(dao, sc); break;
                case 3:
                    salir=true;
                    System.out.println("Cerrando gestor de BD");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }



    }
}