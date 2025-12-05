# Ejercicio 1
Calendario de Adviento en Java

![RETO](https://github.com/nataliainformatica/PROGRAMACION_DAM_25_26/blob/main/recursos%26imagenes/temporadaNavide%C3%B1a.jpg?raw=true)

El **Calendario de Adviento** es una tradición nacida en Alemania a mediados del siglo XIX. En aquella época, muchas familias querían ayudar a los niños a contar los días que faltaban para Navidad, así que marcaban cada día desde el 1 hasta el 24 de diciembre.

Al principio era algo muy sencillo:

Se encendía una vela cada día,  o se hacía una marca en una pizarra,  o se pegaba una imagen navideña en la pared.

Con el tiempo, la idea fue evolucionando y, a principios del siglo XX, aparecieron los primeros calendarios impresos, que incluían ventanitas. Detrás de cada ventana había una ilustración religiosa o invernal.

Más adelante, alrededor de los años 50, llegaron los calendarios con dulces, especialmente chocolate, que se convirtieron en un símbolo muy querido por los niños. Desde entonces han ido apareciendo calendarios con juguetes, mensajes motivadores, mini regalos… incluso versiones digitales e interactivas. Y por supuesto, no nos olvidamos, de los calendarios con chocolatinas que ya hay en todos los supermercados. 

Hoy en día, el Calendario de Adviento no solo sirve para contar los días hasta Navidad, sino también para crear ilusión. 

Por eso es un tema perfecto para un ejercicio de programación, practicar con objetos y **fechas**: un calendario donde cada día esconde algo diferente, como en la tradición original.

Clase DiaAdviento

Cada día tendrá:

número del día (1–24)

una sorpresa aleatoria

estado: abierto / cerrado (boolean)

En otra clase Utilidades, tendremos una colección con la lista de sorpresas, que mezclaremos para conseguir que sean aleatorias. 
```
 // 1. Lista de sorpresas
        String[] sorpresas = {
            "ChocolateS", "Caramelos", "Figuras de nieve", "Risas con amigos",
            "Mini puzzles", "Bombones", "Galletas", "Sticker navideños",
            "Campanitas", "Muñecos pequeños", "Té especial", "Carbón dulce",
            "Gorro de Papá Noel", "Bola del árbol", "Un ejercicio de Java",
            "Chocolate blanco", "Mini juguete", "Abrazos gratis",
            "Un Calcetín navideño", "Un Chicle", "Turrón", "Choco-menta",
            "Un Dibujo sorpresa", "Un bonito día de Navidad ¡Feliz Navidad!"
        };
```

Además usaremos LocalDate para saber el día actual, del  1 al 24 de diciembre se puede abrir ese día. Si no, solamente se mostrarán los días abiertos (del día de hoy hacia atrás). 

Tendremos un menú, que nos dará las siguientes opciones: 

1. Mostrar el calendario
2. Abrir el día de hoy
3. Salir

   
Ejemplo opción 1.
```
Día 1: [ABIERTO] CARAMELOS
Día 2: [CERRADO]
.....
```
sin mostrar las sorpresas de los días que aún están cerrados.

Ejemplo Opción 2
```
Hoy es 1 de diciembre de 2025 quedan 24 días para Navidad.
Lo celebraremos con CARAMELOS
```

# Ejercicio 2
![](https://github.com/nataliainformatica/PROGRAMACION_DAM_25_26/blob/main/recursos%26imagenes/clase.jpg)

El azar nos ordena en clase

Vamos a hacer una aplicación para intercambiar los sitios en clase, dejando el orden al azar. 
Para poder hacer una asignación aleatoria, necesitaremos hacer un mapa de la clase, para ello, identificaremos las mesas que tenemos distribuidas en filas en la clase, como si fuera un tablero de 6 filas por 4 columnas. (Entre la columna 3 y 4 está el pasillo)
De esta forma tendremos una asignación de 24 sitios, en clase somos más,... más adelante en la siguiente versión, definiremos qué hacer. Para esta primera versión, haremos una asignación de como máximo 24 alumn@s. La columna 3 de nuestra clase, se reserva a sitios para portátiles (puesto que en ese sitio no hay equipo  fijo)

Haremos una clase Puesto, que tendrá  como atributos, ocupado, asignadoA, tipo (fijo/portátil).
Al arrancar nuestra aplicación, deberemos crear nuestra matriz bidimensional de Puesto,  al arrancar la aplicación tendremos todos nuestros puestos libres, las columnas 1, 2 y 4 (físicas, que no corresponden con el índice en el array) será de tipo "fijo" y la columnna 3 de tipo "portátil". 

Tendremos una lista de personas (String) que serán las que asignaremos en una primera versión, de forma secuencial a nuestra matriz bidimensional.

Al finalizar la asignación, mostraremos el estado de asignación de la matriz de Puestos. 

# Ejercicio 3

Ejercicio: Calendario de Retos Fitness

Completa la clase ** DiaReto** 

Cada día tendrá:

numeroDia (1–30)

reto (String)

completado (boolean)

Clase **Utilidades**

Tendrá una colección con los retos disponibles, que se mezclarán aleatoriamente al crear el calendario.

// Ejemplo de lista de retos
String[] retos = {
    "10 flexiones", "15 sentadillas", "20 abdominales",
    "5 minutos de estiramientos", "1 km de caminata",
    "30 segundos plancha", "10 saltos de tijera",
    "15 zancadas", "20 saltos de cuerda", "5 minutos de yoga",
    "10 burpees", "15 mountain climbers", "20 segundos meditación",
    "10 sentadillas con salto", "1 km en bicicleta",
    "15 push-ups modificadas", "20 abdominales bicicleta",
    "5 minutos de respiración profunda", "10 burpees con salto",
    "15 minutos de caminata rápida", "20 flexiones de tríceps",
    "30 segundos plancha lateral", "10 jumping jacks",
    "5 minutos de movilidad articular", "15 minutos de estiramientos",
    "20 abdominales oblicuos", "10 sentadillas sumo",
    "15 saltos en estrella", "20 segundos plank con levantamiento de brazo",
    "10 burpees modificados"
};

**Reglas del calendario**

Se puede “abrir” un día solo si es igual o anterior a la fecha actual.

Los días completados se marcarán como [COMPLETADO] y mostrarán el reto.

Los días no abiertos solo mostrarán [CERRADO].

**Menú**

1. Mostrar calendario
Ejemplo:

Día 1: [COMPLETADO] 10 flexiones
Día 2: [CERRADO]
Día 3: [CERRADO]
...
Día 30: [CERRADO]


2. Mostrar el reto de hoy
Ejemplo:

Hoy es 5 de diciembre de 2025.
Tu reto de hoy es: 20 abdominales

3.Salir

