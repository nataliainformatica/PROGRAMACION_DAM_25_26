## Ejercicio 1
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