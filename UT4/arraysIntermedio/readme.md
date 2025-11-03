8. Crea un programa que cree un array con 100 números enteros aleatorios entre 0 y 200,
utilizando Math.random()- o la clase Random, y luego le pida al usuario un valor entero E. Por último, mostrará cuántos valores del array son igual o superiores a E.

10. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N.

11. Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media.

12. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
15. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
distintas opciones:

a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
hasta que el usuario elija la opción ‘c’ que terminará el programa.

13. Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
usuario V, I además de N (nº de valores a crear).

14. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla.
NOTA : Utiliza los métodos de la clase ‘Arrays’ para ayudarte a resolver los siguientes ejercicios.

15. Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N
que contenga M en todas sus posiciones. Luego muestra el array por pantalla.

16. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().

17. Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
si son iguales o no.

18. Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0
y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
pantalla.

19. Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de
ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los
jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las
puntuaciones en orden descendente (de la más alta a la más baja).

20. Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
mostrará por pantalla si N existe en el array, además de cuantas veces.
21. Utilizando arrays
Pedimos al usuario que introduzca una cadena de caracteres que tenga una longitud de 25 caracteres
 Si la candena no tiene longitud 25, se completará con ****

Después  vamos a hacer el cifrado siguiente: sustituye las 'a' por 'e' y las 'e' por 'a'

22. Liga de Superhéroes
Eres el programador encargado de gestionar la lista de superhéroes que forman parte de una liga.

Cada superhéroe tiene un nombre y un puntaje de fuerza. Debes escribir un programa en Java que:

Declare y llene dos arrays estáticos:

Un array de tipo String que contenga los nombres de 5 superhéroes.

Un array de tipo int que contenga el puntaje de fuerza correspondiente de cada superhéroe.

Muestre la lista de superhéroes y sus puntuaciones.

Encuentre al superhéroe más fuerte (el que tiene puntuación  más alta) y muestre su nombre.

Calcule el promedio de fuerza de todos los superhéroes y muestre un mensaje indicando si cada superhéroe está por encima o por debajo del promedio.

## 23. Gestión de reservas en un hotel (
Eres el encargado de un pequeño hotel con 10 habitaciones. Debes gestionar las reservas de los huéspedes. El hotel inicialmente tiene todas sus habitaciones vacías (representadas como valores nulos en un array).

Tu tarea es escribir un programa que permita:

Inicializar un array estático de tamaño 10 con valores null, donde cada posición representa una habitación.

Permitir que el usuario:

Reserve una habitación, indicando su nombre. La reserva se debe asignar a la primera habitación disponible (nula). Si no hay habitaciones libres, muestra un mensaje indicando que el hotel está lleno.
Cancelar una reserva, indicando el número de habitación (de 1 a 10). La habitación se debe liberar (colocar null).
Mostrar el estado actual del hotel, indicando si cada habitación está ocupada (nombre del huésped) o vacía.
Controlar que no se pueda reservar una habitación ya ocupada ni cancelar una reserva de una habitación vacía.


## 24. Gestión de reservas en un hotel (versión orientada a objetos)
    
Eres el encargado de un pequeño hotel con 10 habitaciones.

Cada habitación estará representada por un objeto de la clase  Habitacion, que tendrá los siguientes atributos:

numero (entero): el número de la habitación (1 a 10).

huesped (cadena): el nombre del huésped que ocupa la habitación, o null si está vacía.

La tarea es escribir un programa en Java que permita:

Crear una clase Habitacion con los atributos mencionados y métodos para:

Reservar una habitación asignándole un huésped.

Cancelar una reserva, dejando la habitación vacía.

Mostrar el estado de la habitación (ocupada o vacía).

En la clase principal realizaremos las siguientes operaciones:  

Inicializar un array estático de 10 objetos de tipo Habitacion, con habitaciones vacías al inicio.

Permitir al usuario realizar las siguientes acciones:

Mostrar el estado del hotel: Ver todas las habitaciones indicando si están vacías o quién las ocupa.

Reservar una habitación: Asignar un huésped a la primera habitación disponible.

Cancelar una reserva: Indicar el número de habitación a liberar.

Gestionar los casos en los que no se pueda realizar la acción, como:

Intentar reservar cuando todas las habitaciones están ocupadas.

Intentar cancelar la reserva de una habitación que ya está vacía.


## Ejercicio 25
Crea un programa en Java que registre los likes de 7 canciones populares en un array.
El array estará en una clase aparte. 

Luego, el programa debe:

Calcular y mostrar el promedio de likes.

Mostrar cuántas canciones tienen más likes que el promedio.

Indicar qué canción tiene el menor número de likes y su posición (por ejemplo, "Canción 3").

Mostrar la lista de canciones ordenada de menor a mayor según los likes.
PRÁCTICA DEL MÉTODO DE LA BURBUJA-


Detalles adicionales:

Puedes usar un array para almacenar los likes y otro array para los nombres de las canciones.  O  puedes utilizar un array bidimensional. 

// detalles de la implementación y repaso 
Usa bucles for para recorrer el array y realizar cálculos.
Usa condicionales if para comparar valores y encontrar el mínimo.



LA APP ARRANCA Y MUESTRA UN MENÚ
¿QUÉ QUIERES HACER?
1. MOSTRAR CANCIONES CON DATOS
2. VOTAR CANCIONES
3. Calcular y mostrar el promedio de likes.
4.  Indicar qué canción tiene el menor número de likes y su posición (por ejemplo, "Canción 3").
5.  Mostrar cuántas canciones tienen más likes que el promedio.

6.  SALIR

   LA OPCIÓN 2 VOTAR CANCIONES: 
   Irá mostrando una a una las canciones, y preguntando los votos que se le dan. 
   
