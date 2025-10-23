## Ejercicio 1

/**
 * Crea una aplicación que tendrá un menú con las siguientes opciones:
 * 1. Calcular nota media
 * 2. Ver el último resultado
 * 3. Salir
 * OPCIÓN1.
 * Se piden por consola los siguientes datos:
 * Partiendo de la premisa de que el alumno tiene 3 módulos
 * Se pedirán las notas de cada uno de los módulos …
 * ¿Qué nota has sacado en el módulo 1?
 * ¿Qué nota has sacado en el módulo 2? ….
 * 
 * Las notas pueden ser mínimo un 1 y máximo un 10, si se introduce cualquier
 * otra nota se debe mostrar un mensaje “esta nota no es válida” y volver a
 * pedir al usuario que introduzca la nota.
 * Al finalizar se mostrará:
 * La nota más alta introducida
 * La nota más baja introducida
 * 
 * La nota media en el siguiente formato:
 * De 0 a 4 No superado
 * Mayor o igual a 5 y menor que 6 : Aprobado
 * Mayor que 6 y menor que 8: Notable
 * Mayor que 8 hasta 10: Sobresaliente
 * OPCIÓN2.
 * Mostrará la última nota media calculada.
 * OPCIÓN3:
 * Finaliza el programa y se muestra FIN DE PROGRAMA
 * 
 */


## Ejercicio1 - versión avanzada con arrays
Sustituyendo el número fijo de módulos por la posibilidad de que el alumno
incluya el número de módulos.

/**
 * Crea una aplicación que tendrá un menú con las siguientes opciones:
 * 1. Calcular nota media
 * 2. Ver el último resultado
 * 3. Salir
 * OPCIÓN1.
 * Se piden por consola los siguientes datos:
 * ¿Cuántos módulos tienes?
 * Se pedirán las notas de cada uno de los módulos …
 * ¿Qué nota has sacado en el módulo 1?
 * ¿Qué nota has sacado en el módulo 2? ….
 * Las notas pueden ser mínimo un 1 y máximo un 10, si se introduce cualquier
 * otra nota se debe mostrar un mensaje “esta nota no es válida” y volver a
 * pedir al usuario que introduzca la nota.
 * Al finalizar se mostrará:
 * La nota más alta introducida
 * La nota más baja introducida
 * La nota media en el siguiente formato:
 * De 0 a 4 No superado
 * Mayor o igual a 5 y menor que 6 : Aprobado
 * Mayor que 6 y menor que 8: Notable
 * Mayor que 8 hasta 10: Sobresaliente
 * OPCIÓN2.
 * Mostrará la última nota media calculada.
 * OPCIÓN3:
 * Finaliza el programa y se muestra FIN DE PROGRAMA
 * 
 */
...

## Ejercicio 2
La cabecera de Google de hoy - 22 de octubre de 2022
   
![RETO](https://github.com/nataliainformatica/PROGRAMACION_DAM_25_26/blob/main/recursos%26imagenes/ecuacionjpg.jpg?raw=true)
     
Tengo que resolver un problema de mates. Cuando un jugador de baloncesto lanza la pelota, esta sigue una parábola. 
     
Quiero hacer un programa para resolverlo usando la ecuación cuadrática. Para calcular la altura máxima que alcanza la pelota, la distancia máxima que alcanza la pelota ** ¿Cómo lo hago? **

La trayectoria de la pelota se puede modelar con la ecuación cuadrática \(y=ax^{2}+bx+c\), donde: 
     
y es la altura de la pelota en ese punto.     
 x es la  distancia horizontal (cuánto ha avanzado la pelota),
     
a es la curvatura de la pelota (controla la velocidad de caída de la pelota, debe ser negativo.Ç Éste valor dependería de la gravedad y de la velocidad inicial)

b es la pendiente inicial, (indica la inclinación de la trayectoria al inicio)

c es la algura desde la que se lanza la pelota

** Ejemplo ** 
```
a = -0.05 
b = 2   // la pelota sube porque b es positivo, y bajará después porque a es negativo
c = 0 // empieza desde el suelo

// además: 
Si a es más grande ,  la parábola es más cerrada (sube y baja rápido).

Si b es más grande,  la pelota sube más alto y más lejos.

Si c > 0,  comienza desde cierta altura, como si se lanzara desde una mesa o una mano.

``` 


El programa calculará:

la altura máxima (el vértice de la parábola),

y la distancia total que recorre antes de volver al suelo (la raíz positiva).
Mostrará si con los valores de  a, b y c facilitados, y la posición de la canasta, se encesta la pelota. 

## Ejercicio 3
La cabecera de Google de hoy - 23 de octubre de 2022

![RETO](https://github.com/nataliainformatica/PROGRAMACION_DAM_25_26/blob/main/recursos%26imagenes/secuenciaADNjpg.jpg?raw=true)

 Me acuerdo de que el ADN tiene A, T, C y G, 
pero ¿cómo se sabe cuál va en cada lugar? 
¿Cómo se arma la secuencia?
Y si se desordena, ¿qué pasa? 
¿Hacemos un programa que compruebe si el emparejamiento es correcto?


## Enunciado :
```
Disponemos de una molécula de ADN formada por dos cadenas complementarias, cada una con 15 bases nitrogenadas.

Queremos comprobar si la molécula está correctamente ordenada (es decir, si las bases se emparejan según las reglas de complementariedad) o si presenta una mutación.

Para ello:

Se pedirá al usuario que introduzca las dos cadenas, carácter a carácter.

El usuario podrá escribir las bases en mayúscula o minúscula (A, T, C, G o a, t, c, g).

El programa comprobará si las dos cadenas son complementarias correctamente:

A ↔ T

T ↔ A

C ↔ G

G ↔ C

Si el apareamiento es correcto, se mostrarán las dos cadenas en mayúsculas, una debajo de la otra.

Si existe alguna mutación (es decir, una base que no cumple la regla de apareamiento), se mostrarán ambas cadenas en mayúsculas, excepto las bases afectadas por la mutación, que se mostrarán en minúsculas.

Ejemplo correcto:

Cadena 1: A T G C A G T T C A T G A C T

Cadena 2: T A C G T C A A G T A C T G A

Ejemplo con mutación:

Cadena 1: A T G C A G T T C A T G A C T

Cadena 2: T A C G T C A A g T A C T G A


```
Para entender el objetivo de nuestro programa, hay que saber qué estamos haciendo, así que... un poco más de información 

¿Qué es el ADN y cómo se ordenan sus bases?

El **ADN (ácido desoxirribonucleico)** es la molécula que contiene la información genética de todos los seres vivos. Está formada por dos cadenas que se enrollan entre sí formando una doble hélice.

Cada cadena del ADN está compuesta por unidades llamadas nucleótidos, y cada nucleótido contiene una de las cuatro bases nitrogenadas:

Adenina (A)

Timina (T)

Citosina (C)

Guanina (G)

Estas bases se emparejan siempre de la misma forma, siguiendo una regla fija conocida como complementariedad de bases:
```

A siempre se une con T

C siempre se une con G
 ```

Este orden o secuencia de las bases es lo que codifica la información genética. Así, el ADN funciona como un manual biológico: su secuencia de letras contiene las instrucciones que determinan cómo funciona y se desarrolla un organismo.

 **El orden de las bases en el ADN** 

El ADN está formado por dos cadenas complementarias, como dos tiras paralelas que encajan perfectamente.
Cada cadena puede tener cualquier secuencia de bases, lo importante es que la otra cadena siga las reglas de apareamiento complementario:

```
Cadena 1: A  T  G  C  A  T
Cadena 2: T  A  C  G  T  A
```
En una cadena, puebe haber cualquier orden de A, T, C, G,lo que debe cumplirse es que su cadena complementaria tenga las bases emparejadas correctamente


