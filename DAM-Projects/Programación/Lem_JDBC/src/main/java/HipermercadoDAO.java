import java.sql.*;

public class HipermercadoDAO {

    // Datos de conexión como constantes o variables de clase
    private final String url = "jdbc:mysql://localhost:3306/hipermercado";
    private final String usuario = "root";
    private final String contraseña = "root";

    // Método precio minimo
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
        String sql = "SELECT id_producto, nombre, precio, peso_ml, unidad_medida FROM productos WHERE id_producto = ?";

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
}