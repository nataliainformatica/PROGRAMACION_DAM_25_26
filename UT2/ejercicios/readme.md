Usar constantes en programación es una práctica recomendada porque aporta varias ventajas, tanto en Java como en otros lenguajes.


1. Evitan errores por cambios accidentales

Una constante no se puede modificar después de inicializarse.

Esto asegura que un valor fijo (como el IVA, la velocidad de la luz, el valor de PI, etc.) no cambie por descuido en otra parte del programa.

2. Mejora la legibilidad del código

Si ves en el código: __precio = precio * 21 / 100;__
no queda claro de dónde viene ese 21.
En cambio __precio = precio * IVA / 100;__ es mucho más comprensible porque el nombre de la constante explica el valor.

3. Facilita el mantenimiento

Si un valor cambia, lo modificas solo en un lugar.

Ejemplo: si el IVA pasa del 21% al 23%, solo cambias el valor de la constante IVA, y el programa entero se actualiza automáticamente.

4. Evita el uso de “números mágicos”

Los "números mágicos" son valores fijos puestos directamente en el código (como 3.1416, 21, 60…).

Usar constantes con nombres descriptivos elimina la confusión y hace el programa más fácil de entender.

5. Buenas prácticas y estandarización

En programación profesional, es casi obligatorio usar constantes para valores fijos porque ayuda a otros desarrolladores (o a ti mismo en el futuro) a entender y modificar el código sin romperlo.

```
public class EjemploConstantes {
    // Declaración de constantes (en mayúsculas por convención)
    public static final double IVA = 21.0;
    public static final int MINUTOS_HORA = 60;
    
    public static void main(String[] args) {
        double precio = 100.0;

        double precioConIVA = precio + (precio * IVA / 100);

        System.out.println("Precio sin IVA: " + precio);
        System.out.println("Precio con IVA: " + precioConIVA);
        System.out.println("Una hora tiene " + MINUTOS_HORA + " minutos.");
    }
}
```


## Ejercicio 1
Completa una aplicación, que mostrará la siguiente información:
"CÁLCULARÉ CUÁNTOS AÑOS TENDRÁS EN EL 2057"

Debes completar el código, pidiendo la información que necesites al usuario, para después informarle: 

"SI AHORA TIENES XXX AÑOS"
"EN EL AÑO 2057 TENDRÁS YYY"

Lógicamente XXX e YYY son valores calculados según la edad que introdudza el usuario. 

Añade al inicio de la aplicación un comentario de varias líneas, explicando el  algoritmo o resolución que vas a utilizar
Añade también un comentario, junto con la definición de la variable, indicando el tipo  de dato que has elegido. 



🔹 Nivel básico (uso de variables enteras)

Suma de tres números
Pide al usuario tres números enteros y muestra su suma, su producto y su promedio.

Edad futura
Pide al usuario su edad actual y calcula cuántos años tendrá dentro de 5, 10 y 20 años (usa constantes para esos intervalos).

Área de un rectángulo
Pide la base y la altura de un rectángulo (dos enteros) y muestra su área y perímetro.

🔹 Con constantes

Conversión de monedas
Pide al usuario una cantidad de euros y convierte a dólares y yenes usando constantes de tipo entero (por ejemplo, 1 € = 2 $ y 1 € = 150 ¥).

Calcular sueldo con horas extra
Pide al usuario:

horas trabajadas en la semana

horas extra trabajadas
Usa una constante para el valor de la hora normal y otra para la hora extra. Calcula y muestra el sueldo total.

Kilómetros recorridos
Pide al usuario los kilómetros recorridos en tres viajes. Usa una constante para el precio por kilómetro y calcula el gasto total.

🔹 Con más de 3 variables

Promedio de calificaciones
Pide al usuario 4 notas enteras y muestra la nota promedio.

Tiempo en minutos y segundos
Pide al usuario la duración de tres canciones en segundos. Calcula y muestra el total en minutos y segundos.

Descuento en compra
Pide al usuario el precio de 3 productos. Usa una constante para el porcentaje de descuento (por ejemplo, 10%) y muestra el precio total sin descuento y con descuento.
