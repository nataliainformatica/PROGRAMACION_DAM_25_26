,
# EJERCICIO 1

Mini Laberinto con Condicionales

En este ejercicio vamos a construir un mini-laberinto en Java, usando condicionales (if/else).

El objetivo es que el jugador pueda tomar decisiones respondiendo con true o false, y que en función de sus respuestas el programa muestre diferentes finales.

 __¿Cuál es nuestro objetivo de aprendizaje?__

Practicar el uso de condicionales simples y anidados.

Entender cómo una decisión cambia el flujo de un programa.

Familiarizarse con la entrada de datos mediante Scanner.

## Descripción del problema

El jugador está dentro de un laberinto misterioso.

El programa va a ir mostrando preguntas, y el jugador tendrá que responder con __true__ (sí) o __false__ (no).

Cada respuesta llevará a un camino diferente:

      Puede encontrar la salida secreta,

      Quedarse en un callejón sin salida,

      O caer en una trampa mortal.

El laberinto tendrá al menos dos niveles de decisiones (es decir, una pregunta inicial y otra según la primera respuesta)   ==> condicionales anidados.

 Instrucciones de funcionamiento del juego

Crea una clase llamada MiniLaberinto.

Muestra un mensaje de bienvenida al jugador.

Haz una primera pregunta, por ejemplo:

"Estás en la entrada del laberinto. ¿Quieres ir a la izquierda? (true/false)"
(usa colores de consola para resaltar (true/false)

Si el jugador responde true:

Haz una segunda pregunta relacionada, como por ejemplo:

"Avanzas por la izquierda y encuentras una puerta. ¿Quieres abrirla? (true/false)"

Según la respuesta, decide si gana o pierde.

Si el jugador responde false en la primera pregunta:

Haz otra pregunta distinta, por ejemplo:

"Vas hacia la derecha y llegas a un puente. ¿Quieres cruzarlo? (true/false)"

Según la respuesta, define otro desenlace.


Ejemplo de salida del programa:

```
Bienvenido al Mini Laberinto

Responde con true (sí) o false (no).

Estás en la entrada del laberinto. ¿Quieres ir a la izquierda? (true/false)

true

Avanzas por la izquierda y encuentras una puerta. ¿Quieres abrirla? (true/false)

true

¡Has encontrado la salida secreta! ¡Ganaste!


```

otro posible ejemplo
```
Bienvenido al Mini Laberinto
Responde con true (sí) o false (no).

Estás en la entrada del laberinto. ¿Quieres ir a la izquierda? (true/false)
false
Vas hacia la derecha y llegas a un puente. ¿Quieres cruzarlo? (true/false)
true
El puente se rompe y caes en un río subterráneo. Fin del juego.

```


