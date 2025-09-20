# PROGRAMACION_DAM_25_26
Código del módulo Programación

# 1. IMPRIMIR EN CONSOLA
```
1. Código ASCII

ASCII (American Standard Code for Information Interchange) es un estándar de codificación de caracteres creado en los años 60 para representar texto en computadoras y dispositivos de comunicación.

Cada carácter (letra, número, símbolo, control) se representa con un número entero entre 0 y 127 (7 bits).

Ejemplos comunes:

65 → A

97 → a

48 → 0

32 → espacio " "

También existen los caracteres de control (0–31), que no son imprimibles sino órdenes:

10 → LF (Line Feed → salto de línea)

13 → CR (Carriage Return → retorno de carro)

9 → TAB
```
```
Símbolos y códigos ANSI

Normalmente se refiere a secuencias de escape ANSI, usadas en terminales para colores, estilos y movimientos del cursor.

¿Cómo funcionan?

Se basan en códigos de escape que empiezan con:

\033[   (o \x1B[ en notación hexadecimal, donde 0x1B es ESC)


Luego se agregan códigos numéricos separados por ; y se terminan con una letra de comando.

Ejemplos comunes:

Colores de texto y fondo:

\033[31m → texto rojo

\033[42m → fondo verde

\033[0m → reset (volver a normal)

Estilos de texto:

\033[1m → negrita

\033[4m → subrayado

Movimientos del cursor:

\033[2J → limpiar pantalla

\033[H → mover cursor al inicio (fila 1, col 1)

```

## Ejemplo de uso de caracteres ANSI 

Fichero ColoresConsolaDirecto.java

Fichero ColoresConsola.java




## 2. El uso de comentarios
Introducción al uso de comentarios en programación

Los comentarios en programación son fragmentos de texto dentro del código que no son interpretados por el compilador ni por la máquina, sino que están destinados a los humanos que leen y mantienen el programa. Su función principal es explicar la intención del código, aclarar decisiones de diseño o señalar aspectos relevantes para su comprensión y mantenimiento.

El uso de comentarios es importante porque:

Facilitan la legibilidad del código para otros desarrolladores (o para uno mismo en el futuro).

Sirven como documentación rápida sin necesidad de consultar manuales externos.

Ayudan a entender la lógica detrás de decisiones complejas o poco evidentes.

Pueden marcar pendientes, advertencias o limitaciones en el código.

No obstante, existe una máxima muy difundida entre programadores:

“Un código bien escrito necesita pocos comentarios.”

Esta idea se fundamenta en que un código claro, con nombres de variables, funciones y clases descriptivas, una estructura ordenada y una lógica comprensible, debería ser casi autoexplicativo. Los comentarios no deben sustituir a un buen diseño, sino complementar en los casos donde el código, por su naturaleza, pueda resultar ambiguo o complejo.

En otras palabras: los comentarios son útiles y necesarios, pero el mejor comentario es un buen código.

```

/*
Comentarios de una línea (// ...).

Comentarios de varias líneas (/* ... */).

Los comentarios no afectan al funcionamiento del programa.
Se pueden usar para explicar pasos simples, como declarar variables o mostrar resultados.
*/

public class HolaMundo {
    public static void main(String[] args) {
        // Este es un comentario de una sola línea
        // El siguiente comando mostrará un mensaje en pantalla
        System.out.println("¡Hola, mundo!");

        /*
         * Esto es un comentario de varias líneas.
         * Sirve para explicar cosas más largas o dejar notas importantes.
         */

        // Ejemplo con variables
        int numero1 = 5;  // guardamos el número 5 en la variable numero1
        int numero2 = 3;  // guardamos el número 3 en la variable numero2

        // Sumamos las dos variables y guardamos el resultado
        int suma = numero1 + numero2;

        // Mostramos el resultado en pantalla
        System.out.println("La suma es: " + suma);
    }
}
```


## Ejercicios propuestos

### 1. Hola mundo clásico

### 2. Imprime en pantalla: Hola Mundo.

### 3. Imprimir nombre en varias líneas

### 4. Muestra tu nombre y apellidos, cada uno en una línea distinta.

### 5. Imprimir números en una misma línea

### 6. Imprime los números del 1 al 5 en la misma línea separados por espacios. Usando una sola sentencia
Variante. Usando 5 sentencia 

### 7. Imprimir números en líneas distintas

### 8 Imprime los números del 1 al 5, cada uno en una línea.

### 9. Dibujo con caracteres

Usa * para imprimir un cuadrado de 4x4.

****
****
****
****


### 10. Triángulo simple

Haz un triángulo de 3 líneas usando #.

#
##
###


### 11. Tabla de multiplicar

Imprime la tabla de multiplicar del 3 (del 3x1 hasta el 3x10).

### 12 Uso de secuencias de escape. Cita célebre

Imprime una frase entre comillas, usando el carácter de escape \" en la cadena.
Ejemplo:

"La imaginación es más importante que el conocimiento." \  Einstein


### 13. Secuencia con tabulaciones

Imprime tres palabras separadas por tabuladores (\t).
Ejemplo:

Perro    Gato    Ratón


### 14. Uso de salto de línea dentro de la cadena de texto

Imprime un mensaje multilínea usando \n.
Ejemplo:

Línea 1
Línea 2
Línea 3


