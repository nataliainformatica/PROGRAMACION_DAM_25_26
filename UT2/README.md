# PROGRAMACION_DAM_25_26
Código del módulo Programación

# 1. IMPRIMIR EN CONSOLA
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
