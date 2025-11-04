# Ejercicio 1

![RETO](https://github.com/nataliainformatica/PROGRAMACION_DAM_25_26/blob/main/recursos%26imagenes/pac_man.jpg?raw=true)

Haz un programa que simule a Pac-Man moviéndose por un tablero de texto (por ejemplo, una matriz 5x5).

Pac-Man puede moverse con las teclas w, a, s, d y debe comer las bolitas (.).

Cada vez que come una bolita, gana puntos (1 punto por cada bola)

Ejemplo:
```
. . . . .
. P . . .
. . . . .
. . . . .
. . . . .

Movimiento (w/a/s/d): d
. . . . .
. . P . .
. . . . .
. . . . .
. . . . .

Puntos: 1

```

## Siguiente nivel: 
Además de las bolitas, hay un fantasma (F) que se mueve aleatoriamente.
Si Pac-Man choca con el fantasma,  pierde.

## Siguiente nivel: 
Ahora añadiremos la dificultad en el juego de que las bolitas se generen aleatoriamente así como  muros (#), al comenzar el juego. 

Pac-Man (P) se mueve hasta que come todas las bolitas, sin chocarse con ningún muro, o lo atrapa el fantasma (F).


En cualquiera de los niveles, al finalizar el juego deberás mostrar la puntuación alcanzada. 

# Ejercicio 2
![Doodle](https://github.com/nataliainformatica/PROGRAMACION_DAM_25_26/blob/main/recursos%26imagenes/monarcas.jpg)
**Homenaje a la llegada de la mariposa monarca** El Doodle de Google del martes 4 de noviembre, rinde homenaje a la migración de más de 7700 kilómetros de la mariposa monarca desde Canadá y EE. UU. hasta México.   

La mariposa monarca (**Danaus plexippus**) realiza una de las migraciones más impresionantes del reino animal. Su recorrido cubre miles de kilómetros y abarca Canadá, Estados Unidos y México.
Existen dos grandes poblaciones migratorias en América del Norte:
1. Población oriental:  con su origen en el sur de Canadá y norte de Estados Unidos (principalmente en los Grandes Lagos y el noreste de EE.UU.) con destino,  los bosques de oyamel en las montañas del centro de México, principalmente en el Estado de Michoacán y parte del Estado de México.
2. Población occidental: con su origen en el  oeste de las Montañas Rocosas (California, Oregón, Washington) con destino a  zonas costeras de California, donde hibernan en bosques de eucalipto, pino y ciprés, especialmente en Monarch Grove (Pismo Beach) y Santa Cruz.

## ACTIVIDAD EN JAVA
Crea un programa en Java que use arrays estáticos para simular el recorrido migratorio de la mariposa monarca desde Canadá hasta México. Definiremos 3 arrays estáticos , el primero con las etapas, el segundo con el país al que pertenece la etapa, el tercero con las distancias. 
Programaremos un menú, de forma que el usuario podrá ver los siguientes datos.
1. Nombre de la etapa, preguntará al usuario qué número de etapa quiere ver, recordándole que el recorrido de la mariposa tiene 4 etapas.
2. País de la etapa, preguntará al usuario de qué etapa quiere conocer el pais (el usuario, introducirá un nombre de etapa, no un número).
3. Distancia entre las etapas, preguntará dos etapas del recorrido, y mostrará la distancia total.

```
String[] etapas = {
    "Ontario (Canadá)",
    "Kansas (EE.UU.)",
    "Texas (EE.UU.)",
    "Monarca (México)"
};

int[] distancias = { 1200, 1000, 800 }; // km entre cada etapa
```

   
