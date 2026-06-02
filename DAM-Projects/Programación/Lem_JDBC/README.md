# Lem_JDBC - Gestión de Hipermercado

Gestión de Hipermercado es una aplicación en **Java** que se conecta directamente a una base de datos **MySQL** usando JDBC. Básicamente, sirve para tener control total sobre los productos, marcas y categorías sin complicaciones, todo manejado desde la terminal.

## ¿Qué puedes hacer con esto?

* **Control de Productos:** Puedes registrar cosas nuevas, buscar por ID, filtrar por secciones, ver cuáles tienen mucho o poco stock, y borrar los que ya no sirven.
* **Gestión de Marcas:** También permite dar de alta o quitar marcas del catálogo.
* **Fácil de usar:** He diseñado un menú paso a paso para no perderse navegando entre las opciones.

## ¿Cómo está organizado el código?

No quería que fuera un lío, así que lo separé en tres partes:

* **Main.java:** Es la cara del programa. Aquí es donde te aparece el menú y donde el `Scanner` se encarga de escuchar lo que escribes.
* **HipermercadoDAO.java:** Es la parte "inteligente" que habla con la base de datos. Aquí están todas las consultas SQL (`INSERT`, `SELECT`, `DELETE`) que hacen el trabajo sucio.
* **Producto.java / Marca.java:** Son solo los moldes. Definen qué datos tiene cada producto o marca para que Java sepa cómo manejarlos.



## Para ponerlo en marcha

1. **La base de datos:** Necesitas tener MySQL instalado y una base de datos llamada `hipermercado`.
2. **Conexión:** Antes de ejecutarlo, abre `HipermercadoDAO.java` y pon tu usuario y contraseña de MySQL.
3. **Driver:** Asegúrate de tener el `mysql-connector-java` en tu proyecto, si no, no se podrán hablar Java y la base de datos.

## Consejos para que no falle

* **Fechas:** Escríbelas siempre así: `AAAA-MM-DD`.
* **Precios:** Si algo cuesta 1,50, ponlo con punto (`1.50`), no con coma.
* **Opciones sí/no:** Cuando el programa pregunte por "novedad" o "activo", escribe `1` para sí y `0` para no.
