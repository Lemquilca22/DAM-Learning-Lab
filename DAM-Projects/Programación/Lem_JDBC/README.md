# Gestión de Productos - Hipermercado

Esta aplicación es una herramienta en Java diseñada para gestionar el inventario de un hipermercado mediante una conexión directa a una base de datos MySQL. Permite realizar operaciones CRUD (crear, leer, eliminar) de forma sencilla a través de la terminal.

## Funcionalidades

* **Consulta de productos:** Permite buscar artículos por ID, filtrar por categoría (sección) o listar productos según su marca.
* **Registro de inventario:** Alta de nuevos productos detallando precios, stock, información nutricional y datos logísticos.
* **Baja de productos:** Eliminación de registros en el sistema utilizando el ID del producto.

## Arquitectura del Proyecto

El código está organizado en tres clases principales para mantener el orden:

* **Main.java:** Gestiona la interfaz con el usuario. Es el punto de entrada y contiene el menú interactivo para capturar los datos desde la consola.
* **HipermercadoDAO.java:** Es la capa de acceso a datos. Contiene todas las sentencias SQL necesarias para comunicarse con la base de datos de forma segura.
* **Producto.java:** Actúa como modelo de datos. Define la estructura de los productos para organizar la información antes de ser guardada o procesada.

## Requisitos y Configuración

1. **Base de datos:** Necesitas una base de datos MySQL llamada `hipermercado`.
2. **Conexión:** Revisa en `HipermercadoDAO.java` que los valores de `url`, `usuario` y `contraseña` coincidan con tu configuración local.
3. **Ejecución:** Ejecuta la clase `Main` para iniciar el menú interactivo.

## Consideraciones de uso

Al registrar nuevos productos, ten en cuenta lo siguiente:

* **Fechas:** Deben introducirse obligatoriamente con el formato `YYYY-MM-DD`.
* **Decimales:** Utiliza el punto (.) para separar los decimales en los campos de precio y peso.
* **Campos lógicos:** Los campos como "es novedad" o "activo" funcionan como interruptores; introduce 1 para sí y 0 para no.
