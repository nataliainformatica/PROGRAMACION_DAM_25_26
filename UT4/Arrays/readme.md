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
1. Nombre de la etapa, preguntará al usuario qué número de etapa quiere ver, recordándole  el número de etapas del recorrido de la mariposa (en este ejemplo tiene 4 etapas).
2. País de la etapa, preguntará al usuario de qué etapa quiere conocer el pais (el usuario, introducirá un nombre de etapa, no un número).
3. Distancia entre las etapas, preguntará dos etapas del recorrido (puedes hacerlo por nombre o por número) , y mostrará la distancia total entre esas dos etapas.

**En todos los casos debes controlar posibles errores y no permitir que el programa finalice por un error del usuario**

```
String[] etapas = {
    "Ontario",
    "Kansas",
    "Texas",
    "Monarca"
};
String[] paises = {
    "Canadá",
    "EE.UU.",
    "EE.UU.",
    "México"
};

int[] distancias = { 1200, 1000, 800 }; // km entre cada etapa
```

Debes realizar el código, de forma que se puedan ampliar las rutas con más datos, de forma que sustituyendo los arrays, el código debe seguir funcionando: 
```
String[] etapas = {
            "Toronto",
            "Chicago",
            "Kansas",
            "Dallas",
            "Monterrey",
            "San Luis Potosí ",
            "Santuario Monarca(Michoacán)"
        };
String[] paises = {
            "Canadá",
            "EE.UU)",
            "EE.UU.",
            "México",
            "México",
            "México"
        };
int[] distancias = {700, 900, 700, 600, 400, 300}; // km entre etapas
```

# Ejercicio 3
![5_11_2025](https://github.com/nataliainformatica/PROGRAMACION_DAM_25_26/blob/main/recursos%26imagenes/bonfireNight.jpg)
```
La historia del Complot de la Pólvora (**Gunpowder Plot**) es una de las más famosas de Inglaterra, y su aniversario se celebra
todos los 5 de noviembre desde hace más de 400 años.

A comienzos del siglo XVII, Inglaterra era un país protestante.
El rey Jacobo I (James I) había sucedido a Isabel I en 1603. Muchos católicos esperaban que fuera más tolerante con ellos,
ya que habían sido perseguidos bajo el reinado anterior.
Pero no fue así: las leyes contra los católicos continuaron, y la tensión aumentó.
Un grupo de católicos ingleses decidió actuar. Su idea era volar el Palacio de Westminster (donde se reuniría el Parlamento)
durante la apertura oficial del 5 de noviembre de 1605.
De esa manera, pretendían matar al rey, a su familia y a los miembros del gobierno,
con la esperanza de restaurar un monarca católico en el trono.
El grupo estaba liderado por Robert Catesby, pero el más famoso de todos fue **Guy Fawkes** (también conocido como Guido Fawkes),
un experto en explosivos que había luchado en el extranjero. 

Los conspiradores alquilaron una bodega debajo del Parlamento y almacenaron 36 barriles de pólvora.
Esperaban detonar todo justo cuando el rey Jacobo I diera su discurso de apertura.
Sin embargo, el plan se vino abajo cuando alguien —probablemente un conspirador arrepentido—
envió una carta anónima a un miembro del Parlamento, advirtiéndole que no asistiera ese día.
Las autoridades registraron el edificio en la noche del 4 de noviembre
y encontraron a Guy Fawkes vigilando los barriles de pólvora, con mechas y fósforos listos.
```

## ACTIVIDAD EN JAVA
Debes hacer el código para un juego que llamaremos **Atrapa a Guy Fawkes**
Será un  minijuego que se ejecutará en la consola:

Hay varias habitaciones numeradas (este dato se preguntará antes de comenzar el juego) debajo del Parlamento.
Vamos a imaginar para esta primera versión, que las habitaciones están en un pasillo largo, por lo que están ordenadas en fila. 
El guardia tiene un número limitado de posibilidades de búsqueda antes de que amanezca, que se calcularán como (int)númeroHabitaciones*0,55,  (ejemplo, si son 10 habitaciones serán 5 posibilidades)

En una está escondido Guy Fawkes con la pólvora.

El **jugador** es un guardia que tiene que inspeccionar las  habitaciones, buscando a Guy Fawkes.

Cada turno el jugador elige una habitación (si elige una habitación que no existe el juego finaliza), según lo cerca o lejos que esté la habitación elegida,  el programa responde con pistas ("oyes ruidos y  hay un fuerte olor a póvora", “hueles pólvora cerca”, “silencio total”...). Si  la habitación siguiente (por la derecha o izquierda) es en la que está escondido Guy, dará el primer mensaje "oyes ruidos y  hay un fuerte olor a póvora", si pasada una habitación (a la derecha  o izquierda) está escondido Guy, se mostrará el mensaje: “hueles pólvora cerca”, si hay más de una habitación entre la que revisa el guardia y en la que está escondido Guy mostrará:  “silencio total”. 

Si el guardia lo encuentra antes del amanecer  gana, si no lo encuentra el parlamento.... 


   
