# Ejercicio 1
Notas de un Examen en un Colegio

En un colegio se registran las notas de los alumnos de varias asignaturas.
Se desea calcular la suma total y el promedio de cada alumno y de cada módulo.

Los módulos son: {"Programación", "Bases de Datos","Sistemas Informáticos","Entornos de Desarrollo", 
"Lenguajes de Marcas", "Computación en la nube", "IPE1"}
{"PR", "BD","SI","ED","LM","CN"}

El número de alumnos es variable. 

Las notas deben almacenarse en un array bidimensional  del tamaño necesario. 

Cada fila representa un alumno (x alumnos).

Cada columna representa un módulo.

El programa pedirá al usuario  completar las notas de todos los alumnos, para todos los módulos.

Las notas son  valores enteros entre 0 y 10 .

Después de introducir las notas, aparecerá un menú que permitirá: 

Calcula y muestra:

🔹 La suma y promedio de cada alumno (fila).

🔹 La suma y promedio de cada módulo (columna).

🔹 La nota media general del grupo.

Presenta los resultados de manera clara y legible.
```
Ejemplo de salida esperada:
Matriz de notas:
Alumno\Asig |  PR     BD    ED ....
------------------------------ 
Alumno 1    |   8     6     9 ..... 
Alumno 2    |   7     5     6 ....
Alumno 3    |   9     8     10 .... 
Alumno 4    |   6     7     5   ....

Suma y promedio por alumno:
Alumno 1 -  Suma: 23  Promedio: 7.67
Alumno 2 - Suma: 18  Promedio: 6.00
Alumno 3 - Suma: 27  Promedio: 9.00
Alumno 4 - Suma: 18  Promedio: 6.00

Suma y promedio por asignatura:
PR - Suma: 30  Promedio: 7.5
BD - Suma: 26  Promedio: 6.5
ED - Suma: 30  Promedio: 7.5

Promedio general del grupo: 7.17
```

# Ejercicio 2 - SOPA DE LETRAS 
![TEMA PARA LA SOPA](https://github.com/nataliainformatica/PROGRAMACION_DAM_25_26/blob/main/recursos%26imagenes/lunes_10noviembre.jpg?raw=true)


El objetivo de este ejercicio es crear una sopa de letras,  (un array bidimensional).
Usando una  colección de palabras, debes crear el array bidimensional  de 10x10, completándolo con caracteres aleatorios. 
Puedes usar como tema  la fotosíntesis.


Después se colocarán  las palabras de la colección, de forma horizontal, y con lectura de  izquierda a derecha (tradicional), emplezando en una posición aleatoria. 

#  Ejercicios Repaso 
R1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25 y luego muestre la matriz por pantalla.

R3. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.

R5. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son menores que cero y cuántos son igual a cero.

R7. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno.

R9. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse


## R11

/**
 * Haz el código que cree un array bidimensional de 5x5
 * que se rellenará en las filas pares con un 1 
 * y en las filas impares con un 2
 * Muestra el array completo

 */

## R13
/**
 * Haz un ejercicio que tenga una función para sumar las filas del array bidimensional
 * Y otra para sumar las columnas
 * Muestra los resultados

 */
 # Ejercicio R14
/*
 * Crearemos la matriz de la clase
 * asumimos el número de pcs, por tanto 6 filas y 3 columnas
 * Demos hacer una función para hacer un sorteo, nos devolverá el
 * alumno al que le ha tocado el sorteo
 * 
 * Crea una función que recibe el nombre de un alumno, y devuelve
 * el true/false, dependiendo de si está o no
 * 
 * 
 * Crea una función que pasará lista a todos los alumnos, de forma que mostrará
 * el nombre de cada uno de los alumnos, y dependiendo de la respuesta ("si"/"no")
 * mantendrá el nombre del alumno, o lo dejará vacío si la respuesta es  "NO"
 */


# Ejercicio R15 Batalla de la Estrella de la Muerte

![](https://github.com/nataliainformatica/PROGRAMACION_DAM_25_26/blob/main/recursos%26imagenes/radar.jpg?raw=true)
El objetivo de la aplicación es simular un mapa de la Estrella de la Muerte representado como una matriz bidimensional, donde se ubican naves rebeldes y tropas imperiales.

El programa deberá:

Generar aleatoriamente el campo de batalla (la matriz). La matriz será, por ejemplo, de tamaño 10x10. Pero si cambiamos las dimensiones del mapa, el programa  debe funcionar de la misma forma.

Cada posición puede contener: {"R","I","."}

"R" → Nave Rebelde

"I" → Tropas Imperiales

"." → Espacio vacío

Completa toda la matriz (de forma aleatoria) con uno de esos tres tipos.

Despues muestra el mapa por consola.  Cuenta cuántas naves rebeldes y tropas imperiales hay.

Detectar si los rebeldes han logrado infiltrarse (es decir, si hay una nave rebelde en el borde del mapa).

