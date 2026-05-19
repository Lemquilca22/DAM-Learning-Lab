# Maduro Survival

**Maduro Survival** es un juego en desarrollo basado en los acontecimientos recientes a inicios de 2026.  

En este juego, el usuario deberá tomar diferentes decisiones de forma que deberá sobrevivir durante un periodo de días donde sus **stats** se verán modificadas de forma progresiva según su toma de decisiones.

---

## Mecánicas del Juego

### Duración
En este juego deberás sobrevivir por **10 días**, pero al estar en fase beta, solo los primeros días están disponibles.

### Toma de Decisiones
El usuario deberá tomar una decision (de 3 posibles) durante los  eventos que aparecerán en el día (4 eventos diarios) que ya se que sean buenas afectarán a las **stats** de forma positiva o negativamente.  

| STAT  | 1-100 |
| ------------- | ------------- |
| salud  | 100  |
| hambre  | 100 |
| sed  | 100  |
| sueno  | 100  |
| paranoia  | 0  |


### Evento Tienda
Al final de cada día se presentará un evento llamado **tienda**, donde tendrá la opción de adquirir un objeto que afectará a las **stats** de forma que se beneficie de este.  
Debido a diferentes complejidades dentro del código, la tienda funciona como un evento más.

### Condición de Derrota/Victoria
Si el jugador consigue que **2 stats lleguen a 0**, este perderá automáticamente y deberá volver a empezar, por el contrario si sobrevives los 10 ganarás inmediatamente, en este punto fuerzas mayores se han compaginado a tu favor y eres librado de prisión. 

¿Cómo volver a Jugar? Ya sea que pierdas o ganes, el juego comenzará nuevamente narrando la historia y todas las **stats** se reiniciarán.

---

## Estructura del Código

El juego consta de diferentes estructuras a nivel de código que se encuentran definidas dentro del mismo:

- Bucles
- Trycatchs
- Métodos

