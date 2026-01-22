Nota: Ninguna función mostrará nada por pantalla a no ser que se diga lo contrario.
1. Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b) // Devuelve la multiplicación de dos números
2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
3. Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b
4. Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
5. Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
6. Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
7. Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área
8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
9. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
tres) y nos devuelva el máximo de los dos valores.
10. Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
función donde le pasemos los datos y devuelva si es correcta o no.
11. Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número.
12. Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
millas.
13. Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento.
14. Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
15. Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
Luego muestra la suma total y la media. Implementa una función que calcule la suma de un
array y otra que calcule la media de un array.
16. Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
valores aleatorios.
17. Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
pasándole un número entero devuelva si es primo o no.
18. El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI
entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
deberá crear una función a la que se le pase el número y devuelva la letra.
Ejemplo: para el DNI 56321122 el NIF es ‘X’.
19. Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
Por ejemplo: 3 ² + 4 ² = 5 ².
20. Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una función
que reciba un número entero como parámetro e imprima su tabla de multiplicar.
21. Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
oportuno. Implementa las funciones:
int menu() // Muestra el menú y devuelve el número elegido
double pideRadio() // Pide que se introduzca el radio y lo devuelve
double circunferencia(double r) // Calcula la circunferencia y la devuelve
double area(double r) // Calcula el área y la devuelve
Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario
también pueda solicitar el cálculo del volumen. Añade la función:
double volumen(double r) // Calcula el volumen y lo devuelve
Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez
y se muestren los tres cálculos posibles (circunferencia, área y volumen).
Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú ->
realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada “Salir” que terminará
el programa si es elegida.

### 22. Suma de elementos

Crea un programa que almacene 10 números en un array y calcule la suma total.

###  23. Valor máximo y mínimo

Dado un array de 15 números enteros, encuentra el valor máximo y el mínimo, así como sus posiciones.

### 24. Contar números pares e impares

Rellena un array de 20 enteros aleatorios entre 1 y 100 y muestra cuántos son pares y cuántos impares.

### 25. Invertir un array

Pide al usuario 8 números y guárdalos en un array. Luego, muestra los valores en orden inverso.

### 26. Rotación de elementos

Dado un array de 10 números, rota sus elementos una posición a la derecha.
Ejemplo:
[1,2,3,4] → [4,1,2,3]

### 27. Eliminación de un elemento

Crea un array de 10 enteros. Pide al usuario un índice (0–9) y elimina ese elemento desplazando a la izquierda el resto.

### 28. Buscar un valor

Rellena un array con 12 nombres. Pide al usuario un nombre y dile si está en el array y en qué posición.

### 29. Mezclar dos arrays

Dado dos arrays de 10 enteros cada uno, genera un tercero que mezcle alternando los valores:
### Ejemplo:
A = [1,2,3]
B = [4,5,6]
C = [1,4,2,5,3,6]

### 30. Contar ocurrencias

Crea un array de 30 números entre 1 y 5. Indica cuántas veces aparece cada número.

### 31. Array de temperaturas

Pide al usuario las temperaturas de una semana (7 valores), y calcula:

Media semanal

Día más frío (posición)

Día más caluroso (posición)

# ARRAYS BIDIMENSIONALES

### 32. Suma de todos los elementos

Crea una matriz de 4×4 con números enteros aleatorios. Calcula la suma total de todos los elementos.

### 33. Suma por filas y columnas

Dada una matriz de 3×5, muestra la suma de cada fila y de cada columna por separado.

### 34. Matriz identidad

Pide un número N y construye una matriz identidad de tamaño N×N.

Ejemplo para N = 3:

1 0 0
0 1 0
0 0 1

### 35. Matriz transpuesta

Rellena una matriz de 3×3 y crea otra matriz que sea su transpuesta.

### 36. Buscar un elemento

Crea una matriz de 5×5 con caracteres.
Pide al usuario un carácter y di en qué posición(es) aparece.

### 37. Máximo y mínimo con posiciones

En una matriz 4×6 de enteros aleatorios, encuentra el valor máximo y el mínimo y muestra sus coordenadas.

### 38. Suma diagonal principal y secundaria

Usando una matriz cuadrada de tamaño N (p.ej., N = 5):

Suma la diagonal principal

Suma la diagonal secundaria

Indica cuál diagonal tiene mayor valor

### 39. Matriz de multiplicación

Genera una matriz 10×10 donde cada celda contenga el resultado de multiplicar sus índices:
mat[i][j] = i * j

### 40. Contador de vecinos

Rellena una matriz de 6×6 con ceros y unos aleatorios.
Para cada elemento, cuenta cuántos unos tiene a su alrededor (en las 8 posiciones vecinas).
(No hace falta imprimir la matriz completa si no quieres).

### 41. Rotación de matriz 90°

Crea una matriz de 4×4 y genera una nueva matriz rotada 90 grados en sentido horario.

Ejemplo:

1 2 3
4 5 6
7 8 9


Se convierte en:

7 4 1
8 5 2
9 6 3


## 42. Práctica con Arrays

**Explicación del problema a resolver**:  Acabamos de hacer la  una encuesta de evaluación de la práctica docente, se muestran al usuario preguntas, a las que debe responder marcando su respuesta en una escala del 1 al 5.

En en programa que debes realizar en este ejercicio, simularemos la encuesta, mostrando por consola al ususario 10 preguntas. 
Las preguntas se facilitan en la clase Utilidades, mediante el método  public static String[] devolverPreguntas(){….}, que como podrás observar devuelve un array de String,  y cada posición del array es una pregunta de la encuesta. 

El objetivo  es crear una de la aplicación, que mostrará cada una de las preguntas, pidiendo al usuario que dé su valoración (de 1 a 5). 
Debes almacenar adecuadamente las respuestas del usuario, teniendo en cuenta que

Si no se introduce un número (es decir, se escribe una letra u otro caracter), se valorará la pregunta como un **CERO**
Si se introduce cualquier otro valor que no sea del 1 al 5, también  se valorará como un **CERO**. 
(trata de que esta funcionalidad sea una función  private static int introduceNumero()  )

```

Ejemplo que muestra el resultado de la ejecución: 
ENCUESTA DE EVALUACIÓN DOCENTE
*******************************
PREGUNTA Nº1
Al comienzo de cada unidad la profesora presenta lo que se va a trabajar en la misma
Introduce una nota del 1 al 5

PREGUNTA Nº2
La profesora utiliza diferentes recursos para explicar los contenidos
Introduce una nota del 1 al 5
######    se muestran todas las preguntas######
```


Realiza una función que calcule la nota media de cada pregunta, para calcular la nota media, **solo se tendrán en cuenta las preguntas contestadas adecuadamente (con valores de 1 a 5)**. 

Completa una función que una vez finalizada la encuesta, permita mostrar los resultados.  

private static void mostrarResultados(…..){….}.()   

Aquí se mostrará cada pregunta con la nota que le ha dado el usuario y **al final la nota media** de las 10 preguntas.

```

A CONTINUACIÓN SE MUESTRAN LOS RESULTADOS DE LA ENCUESTA
Al comienzo de cada unidad la profesora presenta lo que se va a trabajar en la misma: 5
La profesora utiliza diferentes recursos para explicar los contenidos: 1
Las explicaciones son claras y ordenadas: 5
La profesora responde a las preguntas de los estudiantes sobre la materia: 1
La profesora utiliza ejemplos prácticos para facilitar el aprendizaje: 5
La profesora fomenta la participación activa de los estudiantes: 1
La profesora proporciona retroalimentación constructiva: 5
La profesora utiliza evaluaciones para medir el progreso: 1
La profesora adapta las actividades a las necesidades del grupo: 5
La profesora crea un ambiente de aprendizaje positivo: 1
La nota media de la encuesta es  3.0
SEGUNDA PARTE (TOTAL 3 PUNTOS)
```

### Segunda parte: arrays bidimensionales

Disponemos de  un array bidimensional, con el resultado de podemos recuperarlos mediante el Utilidades.getEncuestas() (este método se facilita en los recursos en la clase Utilidades). 

Al invocarlo, nos devuelve un array bidimensional, con 10 filas,  en el que cada fila tiene 10 columnas.
Cada fila es el resultado de una encuesta, por lo tanto, puedes puedes deducir que el array tiene las respuestas de 10 encuestas. 

Una columna para la respuesta de  cada pregunta de la encuesta.  

```
 int[][] notas = {
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
        };
```

Debes crear el código, para hacer la media cada una de las preguntas (con todos los resultados), de forma que se pueda mostrar el resultado


Ejemplo de la muestra el resultado por consola
```


La media de la pregunta 1 es: 1.0
La media de la pregunta 2 es: 2.0
La media de la pregunta 3 es: 3.0
La media de la pregunta 4 es: 4.0
La media de la pregunta 5 es: 5.0
La media de la pregunta 6 es: 6.0
La media de la pregunta 7 es: 7.0
La media de la pregunta 8 es: 8.0
La media de la pregunta 9 es: 9.0
La media de la pregunta 10 es: 10.0
```


### clase Utilidades

```
public class Utilidades {

    private static String[] preguntas = new String[10];

    public static String[] devolverPreguntas() {

        preguntas[0] = "Al comienzo de cada unidad la profesora presenta lo que se va a trabajar en la misma";
        preguntas[1] = "La profesora utiliza diferentes recursos para explicar los contenidos";
        preguntas[2] = "Las explicaciones son claras y ordenadas";
        preguntas[3] = "La profesora responde a las preguntas de los estudiantes sobre la materia";
        preguntas[4] = "La profesora utiliza ejemplos prácticos para facilitar el aprendizaje";
        preguntas[5] = "La profesora fomenta la participación activa de los estudiantes";
        preguntas[6] = "La profesora proporciona retroalimentación constructiva";
        preguntas[7] = "La profesora utiliza evaluaciones para medir el progreso";
        preguntas[8] = "La profesora adapta las actividades a las necesidades del grupo";
        preguntas[9] = "La profesora crea un ambiente de aprendizaje positivo";
        return preguntas;

    }

    public static int[][] getEncuestas() {
        if (preguntas == null)
            devolverPreguntas();

        int[][] notas = {
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
        };
        return notas;

    }

}
```

# 43. 
Ejercicio para trabajar con arrays bidimiensionales.

Creamun array bidimensional int[][]. Con los siguientes requisitos:

La columna 0 contiene números aleatorios.

La columna 1 contiene el índice original de cada fila.

Ordena el array por la columna 0, manteniendo  toda la  fila, para poder ver cuál era el índice original antes de ordenar.
