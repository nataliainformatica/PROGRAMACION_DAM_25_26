# Selección múltiple

Enunciado: ¿Cuáles de las siguientes estructuras corresponden a bucles?

do-while

switch

if-then-else

while

for

# Selección simple

Enunciado: ¿Cuándo deja de ejecutarse el cuerpo de un bucle while?

a) Cuando se llega a la última línea de código

b) Cuando la condición toma el valor 0

c) Cuando la condición toma el valor false

d) Cuando la condición toma el valor true


# Selección simple


Enunciado: ¿Cuándo se evalúa la condición de un bucle while?

a) Antes de ejecutar cada instrucción del cuerpo del bucle

b) Después de ejecutarse la primera línea del cuerpo del bucle

c) Antes de ejecutarse la última línea del cuerpo del bucle

d) A la entrada de la propia estructura y después de cada ejecución de la última línea del cuerpo del bucle


# Selección simple

Enunciado: ¿Qué diferencia hay entre los bucles while y los bucles do-while?

a) El código de un bucle while puede no ejecutarse nunca, mientras que en un bucle do-while se ejecuta al menos una vez

b) Ninguna

c) El código de un bucle do-while puede no ejecutarse nunca, mientras que en un bucle while se ejecuta al menos una vez

d) El código de un bucle while siempre está controlado por un contador

# Selección múltiple


Enunciado: ¿Qué condición debo poner en el bucle del siguiente código para que se muestren por consola todos los números enteros entre 1 y 10 inclusive?

```
int x = 1;
while (condición) {
    System.out.println(x);
    x++;
}
x < 10

x <= 10

x >= 10

x < 11

x == 10
``` 
# Selección múltiple


Enunciado: ¿Qué condición debo poner en el bucle del siguiente código para que se muestren por consola todos los números enteros entre 1 y 10 inclusive?

```
int x = 1;
do {
    System.out.println(x);
    x++;
} while (condición);
x < 10

x <= 10

x >= 10

x < 11

x == 10
```

# Texto con respuesta abierta


Enunciado: Qué números se muestran por pantalla cuando se ejecuta el siguiente bloque de instrucciones:

```
int x = 1;
do {
    System.out.println(x);
    x += 2;
} while (x <= 10);
Respuesta:
```

# Texto con respuesta abierta


Enunciado: Qué números se muestran por pantalla cuando se ejecuta el siguiente bloque de instrucciones:

``` 
int x = 1;
while (x < 5) {
    int y = 1;
    while (y < x) {
        System.out.println(y);
        y++;
    }
    x++;
}
```

Respuesta:


# Selección simple


Enunciado: De las tres partes que forman el paréntesis de control de un bucle for, son obligatorias:

a) Las tres

b) Ninguna

c) La de la condición

d) La de incrementos


#  Selección simple


Enunciado: Qué ocurre si dejamos vacía la condición en un bucle for: 

a) Se produce un bucle infinito y el ordenador se queda “colgado”

b) No se ejecuta ninguna iteración

c) El bloque de instrucciones solo se ejecuta una vez

d) El bucle solo puede terminar con una salida anticipada

#  Selección simple


Enunciado: ¿Qué diferencia hay entre declarar los índices de control del bucle dentro de la estructura for y declararlas fuera, antes de ejecutarse el bucle?

a) Si se declaran dentro, son variables locales al bucle. Si no, siguen existiendo fuera del bucle

b) Ninguna

c) Si se declaran fuera no existen dentro del bucle

d) Hay que declararlas dos veces, dentro y fuera

# Selección simple


Enunciado: Si dejamos vacía la zona de incrementos en el paréntesis de control de un bucle for: 

a) Se produce un bucle infinito

b) Se incrementan automáticamente los índices

c) Hay que alterar los índices dentro del bloque de instrucciones para que no se produzca un bucle infinito

d) No se ejecuta el bucle ninguna vez

# Selección simple


Enunciado: ¿Cuántos índices se pueden declarar dentro de la zona de inicialización de un bucle for?

a) Uno

b) Los que se quieran

c) Ninguno

d) Dos

# Texto con respuesta abierta


Enunciado: ¿Cuál debe ser la condición en:

```
while (condición) {
    ...
}
para que sea equivalente a:
```
....
``` 
   
for (;;) {
    ...
}
si el bloque de instrucciones es el mismo?

```
Respuesta:

# Texto con respuesta abierta



Enunciado: ¿Qué diferencia hay entre:

```
while (true) {
    ...
}
y


for (;;) {
    ...
}


```
si el bloque de instrucciones es el mismo?
Respuesta:

#  Texto con respuesta abierta



Enunciado: Qué números se muestran por consola después de ejecutar el siguiente código:

```

for (int i = 0, j = 0; i < 5 && j < 5; i++, j++) {
    System.out.println(i + j);
}
```

Respuesta:

#  Texto con respuesta abierta


Enunciado: Qué números se muestran por consola al ejecutar el siguiente código:

```

for (int i = 0, j = 10; i < j; i++, j--) {
    System.out.println(i);
    System.out.println(j);
}
``` 
Respuesta:

S#  elección simple



Enunciado: Si queremos que, a mitad del bloque de instrucciones de un bucle, la ejecución salte al principio de la siguiente iteración, usaremos la instrucción:

a) break

b) continue

c) goto

d) jump

#  Selección simple



Enunciado: Si queremos que, a mitad de una iteración, la ejecución salte a la primera sentencia que sigue al bucle, usaremos:

a) jump

b) continue

c) finish

d) break

#  Texto con respuesta abierta



Enunciado: Cuál es el último número que aparece por consola después de ejecutar el siguiente código:

```
for (int i = 1, j = 1; i < 5 && j < 5; i++, j++) {
    System.out.println(i + j);
    if ((i + j) % 3 == 0) {
        break;
    }
}
```
Respuesta:

# Texto con respuesta abierta



Enunciado: Qué números se muestran por consola al ejecutar el siguiente código:

```
for (int i = 0; i < 10; i++) {
    if (i % 3 == 0) {
        continue;
    }
    System.out.println(i);
}
```
Respuesta:

#  Selección simple



Enunciado: Cuántas veces se ejecuta el bloque de instrucciones del bucle interior en el código:

``` 
for (int i = 0; i < 6; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.println("i: " + i + "   j: " + j);
    }
}
```
a) 6
b) 3
c) 9
d) 18

# Selección múltiple



Enunciado: ¿En cuáles de las siguientes expresiones de la condición2 los bucles anidados son dependientes?

```
for (int i = 0; condición1; i++) {
    for (int j = 0; condición2; j++) {
        ...
    }
}
j < 10

j < i

i + j < 10

j > 0

j < 1 - i
```

#  Selección simple

 

Enunciado: Cuántas veces se ejecuta el bloque de instrucciones del bucle interior en el código:

```

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < i; j++) {
        ...
    }
}
a) 6
b) 4
c) 8
d) 16
```
#  Selección simple

 
Enunciado: Cuántas veces se ejecuta el bloque de instrucciones del bucle interior en el código:

```
for (int i = 0; i < 4; i++) {
    for (int j = 0; j + i < 4; j++) {
        ...
    }
}
```

a) 6

b) 10

c) 9

d) 16
