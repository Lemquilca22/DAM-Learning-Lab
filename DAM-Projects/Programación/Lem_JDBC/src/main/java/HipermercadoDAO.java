import java.sql.*;
import java.util.Scanner;

public class HipermercadoDAO {

    // Datos de conexión como constantes o variables de clase
    private final String url = "jdbc:mysql://localhost:3306/hipermercado";
    private final String usuario = "root";
    private final String contraseña = "root";

    // Método mostrar producto por Id
    public void mostrarProductoPorId(int idBuscar) {
        String sql = "SELECT id_producto, nombre, precio, peso_ml, unidad_medida FROM productos WHERE id_producto = ?";

        // Usamos try-with-resources para cerrar la conexión automáticamente
        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            System.out.println("Conexión realizada correctamente");

            ps.setInt(1, idBuscar);

            // Ejecutar consulta
            try (ResultSet resultado = ps.executeQuery()) {


                while (resultado.next()) {
                    int id = resultado.getInt("id_producto");
                    String nombre = resultado.getString("nombre");
                    double precio = resultado.getDouble("precio");
                    double peso = resultado.getDouble("peso_ml");
                    String unidadMedida = resultado.getString("unidad_medida");

                    System.out.println("ID: " + id + " | Nombre: " + nombre + " | precio: " + precio+ " | peso: " + peso + " | unidadMedida: " + unidadMedida);
                    System.out.println("-------------------------");
                }
            }

            System.out.println("Conexión cerrada");

        } catch (SQLException e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
        }
    }
    public void mostrarProductosPorMarca(int idMarca){
        String sql = "SELECT id_producto, nombre,id_marca, precio, peso_ml, unidad_medida FROM productos WHERE id_marca = ?";

        // Usamos try-with-resources para cerrar la conexión automáticamente
        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            System.out.println("Conexión realizada correctamente");

            ps.setInt(1, idMarca);

            // Ejecutar consulta
            try (ResultSet resultado = ps.executeQuery()) {


                while (resultado.next()) {
                    int id = resultado.getInt("id_producto");
                    String nombre = resultado.getString("nombre");
                    int idMarcaDB= resultado.getInt("id_marca");
                    double precio = resultado.getDouble("precio");
                    double peso = resultado.getDouble("peso_ml");
                    String unidadMedida = resultado.getString("unidad_medida");

                    System.out.println("ID: " + id + " | Nombre: " + nombre + " | marca: "+ idMarcaDB + " | precio: "  + precio+ " | peso: " + peso + " | unidadMedida: " + unidadMedida);
                    System.out.println("-------------------------");
                }
            }

            System.out.println("Conexión cerrada");

        } catch (SQLException e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
        }
    }
    public void filtrarProductoPorCategoria(int idSeccion){
        String sql = "SELECT id_producto, nombre,id_seccion ,id_marca, precio, peso_ml, unidad_medida FROM productos WHERE id_seccion = ?";

        // Usamos try-with-resources para cerrar la conexión automáticamente
        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            System.out.println("Conexión realizada correctamente");

            ps.setInt(1, idSeccion);

            // Ejecutar consulta
            try (ResultSet resultado = ps.executeQuery()) {


                while (resultado.next()) {
                    int id = resultado.getInt("id_producto");
                    String nombre = resultado.getString("nombre");
                    int idSeccionDB= resultado.getInt("id_seccion");
                    int idMarcaDB= resultado.getInt("id_marca");
                    double precio = resultado.getDouble("precio");
                    double peso = resultado.getDouble("peso_ml");
                    String unidadMedida = resultado.getString("unidad_medida");

                    System.out.println("ID: " + id + " | Nombre: " + nombre+ " | categoria: "+ idSeccionDB + " | marca: "+ idMarcaDB + " | precio: "  + precio+ " | peso: " + peso + " | unidadMedida: " + unidadMedida);
                    System.out.println("-------------------------");
                }
            }

            System.out.println("Conexión cerrada");

        } catch (SQLException e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
        }
    }

    public void insertarMarca(Marca m){
        String sql = "INSERT INTO marcas (nombre, pais, premium)"+"VALUES(?, ?, ?)";
        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, m.nombre);
            ps.setString(2, m.pais);
            ps.setInt(3, m.premium);

            ps.executeUpdate(); // Metodo para insertar datos o eliminar datos de la DB
            System.out.println("Marca '" + m.nombre + "' insertado con éxito.");

        } catch (SQLException e){
            System.out.println("Error al insertar la Marca");
            e.printStackTrace();
        }
    }
    public void insertarProducto(Producto p) {

        String sql = "INSERT INTO productos (nombre, descripcion, id_seccion, id_marca, precio, " +
                "precio_kg_l, peso_ml, unidad_medida, stock, descuento_pct, es_novedad, " +
                "es_bio, sin_gluten, vegano, calorias_100g, fecha_caducidad, codigo_barras, activo) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, p.nombre);
            ps.setString(2, p.descripcion);
            ps.setInt(3, p.idSeccion);
            ps.setInt(4, p.idMarca);
            ps.setDouble(5, p.precio);
            ps.setDouble(6, p.precioKgL);
            ps.setDouble(7, p.pesoMl);
            ps.setString(8, p.unidadMedida);
            ps.setInt(9, p.stock);
            ps.setInt(10, p.descuentoPct);
            ps.setInt(11, p.esNovedad);
            ps.setInt(12, p.esBio);
            ps.setInt(13, p.sinGluten);
            ps.setInt(14, p.vegano);
            ps.setInt(15, p.calorias);
            ps.setString(16, p.fechaCaducidad); // Formato esperado: "YYYY-MM-DD"
            ps.setString(17, p.codigoBarras);
            ps.setInt(18, p.activo);

            ps.executeUpdate(); // Metodo para insertar datos o eliminar datos de la DB
            System.out.println("Producto '" + p.nombre + "' insertado con éxito.");

        } catch (SQLException e) {
            System.out.println("Error al insertar el producto");
            e.printStackTrace();
        }
    }
    public void eliminarProducto(int idProducto) {

        String sql = "DELETE FROM productos WHERE id_producto = ?";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idProducto);

            // executeUpdate devuelve cuántas filas fueron borradas
            int filasBorradas = ps.executeUpdate();

            if (filasBorradas > 0) {
                System.out.println("Éxito: El producto con ID " + idProducto + " ha sido eliminado.");
            } else {
                System.out.println("Aviso: No se encontró ningún producto con ID " + idProducto + ".");
            }

        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar el producto.");
            e.printStackTrace();
        }

    }
    public void eliminarMarca(int idMarca) {
        String sql = "DELETE FROM marcas WHERE id_marca = ?";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idMarca);

            int filasBorradas = ps.executeUpdate();

            if (filasBorradas > 0) {
                System.out.println("Éxito: La marca con ID " + idMarca + " ha sido eliminada.");
            } else {
                System.out.println("Aviso: No se encontró ninguna marca con ID " + idMarca + ".");
            }

        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar la marca.");
            e.printStackTrace();
        }
    }
    public void filtrarProductoPorStock(int i_stock, String operador) {

        // Validamos el operador por seguridad
        if (!operador.equals(">") && !operador.equals("<") && !operador.equals("=")) {
            System.out.println("Operador no válido. Usa '>', '<' o '='");
            return;
        }

        String sql = "SELECT id_producto, nombre, precio, peso_ml, unidad_medida, stock FROM productos WHERE stock " + operador + " ?";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            System.out.println("Conexión realizada correctamente");
            ps.setInt(1, i_stock);

            try (ResultSet resultado = ps.executeQuery()) {
                while (resultado.next()) {
                    int id = resultado.getInt("id_producto");
                    String nombre = resultado.getString("nombre");
                    double precio = resultado.getDouble("precio");
                    double peso = resultado.getDouble("peso_ml");
                    String unidadMedida = resultado.getString("unidad_medida");
                    int stock = resultado.getInt("stock");

                    System.out.println("ID: " + id + " | Nombre: " + nombre + " | precio: " + precio +
                            " | peso: " + peso + " | unidadMedida: " + unidadMedida +
                            " | Stock: " + stock);
                    System.out.println("-------------------------");
                }
            }

            System.out.println("Conexión cerrada");

        } catch (SQLException e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
        }
    }





}