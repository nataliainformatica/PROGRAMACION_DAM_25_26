Juego del Ahorcado en Java
Objetivo: Desarrollar un juego del ahorcado en consola donde el usuario debe adivinar una palabra. Se le proporcionarán ciertas ayudas y se registrarán los mejores puntajes en un fichero binario.

Requisitos:

Selección del dibujo del ahorcado
Al inicio del juego, el usuario podrá elegir entre diferentes estilos de dibujos del ahorcado. (los dibujos, estarán en un fichero en la carpeta dibujos, en la ruta de la aplicación, de forma que se mostrará el nombre de todos los ficheros que haya en esta carpeta, para que el usuario elija uno), por ejemplo
```

   List<String> lista2=  new ArrayList<>(Arrays.asList(
            "  +----+",
            "  |    |",
            "  (x_x) |",
            "  /|\\  |",
            "  / \\  |",
            "       |",
            "========="
        ));
```
Dependiendo del dibujo elegido (número de líneas), se determinará la cantidad de intentos permitidos antes de perder la partida.

2. Gestión de palabras

Las palabras estarán almacenadas en un fichero de texto (palabras.txt).

Se seleccionará una palabra al azar al inicio de la partida.

3. Reglas del juego

Se mostrará la palabra oculta con guiones (_) representando las letras.

Las vocales se mostrarán siempre automáticamente y no cuentan como intentos.

El jugador puede ingresar una letra en cada turno:

Si acierta, la letra se muestra en su posición.

Si falla, se descuenta un intento y se actualiza el dibujo del ahorcado.

Se mostrará un listado de las letras ya intentadas.

4. Registro del jugador

Al inicio, el usuario ingresará su alias.

Al finalizar la partida, se guardarán en un fichero binario (ranking.dat) los siguientes datos:

Alias

Fecha de juego

Puntuación obtenida

5. Sistema de puntuación

La puntuación se calculará en función de:

Cantidad de intentos restantes (más intentos = más puntos).

Longitud de la palabra (palabras más largas dan más puntos).

Dificultad elegida (más intentos permitidos reducen la puntuación).

La decisión de cómo se asignan y cuántos se asignan es libre

6. Consulta del ranking

El juego tendrá una opción para mostrar las 10 mejores puntuaciones guardadas en el fichero binario. Ordenadas de mayor a menor. Se mostrará la puntuación, el alias del usuario y la fecha
