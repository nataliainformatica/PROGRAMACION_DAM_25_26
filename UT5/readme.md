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

