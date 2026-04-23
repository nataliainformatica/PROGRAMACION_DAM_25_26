# Ejercicio: Alumnos de un instituto

Vas a desarrollar una pequeña aplicación de consola para un instituto.

El programa permitirá registrar alumnos de dos tipos — presencial y online —, consultar su información, y persistir los datos entre ejecuciones mediante serialización.


**Modelo de datos**
Interfaz Alumno (extiende Serializable)

Debe **declarar** (no implementar) los siguientes métodos métodos. 

String getNombre() — devuelve el nombre completo del alumno
String getCurso() — devuelve el curso en el que está matriculado
double getNotaMedia() — devuelve la nota media actual
double getMatricula() — calcula y devuelve el importe de matrícula
String getResumen() — devuelve una línea con toda la info relevante del alumno


**Clase AlumnoPresencial** 

nombre (String)
curso (String)
notaMedia (double)
numModulos (int) — número de módulos matriculados
familaNumerosa (boolean)

Lógica de matrícula:

Precio base por módulo: 30 €
Si es familia numerosa: 50% de descuento


**Clase AlumnoOnline**

nombre (String)
curso (String)
notaMedia (double)
numModulos (int)
factorParticipacion (double) — valor entre 0.0 y 1.0 que representa el nivel de participación en foros y entregas

Lógica de matrícula:

Precio base por módulo: 20 € (más barato que presencial)

Lógica de nota media ponderada:

La nota que devuelve getNotaMedia() no es la nota en bruto, sino: notaMedia * factorParticipacion
Esto significa que un alumno con un 9 pero participación 0.5 obtiene un 4.5 efectivo


## Persistencia

Los datos se guardan en un fichero **alumnos.ser** usando ObjectOutputStream
Al arrancar la aplicación, si el fichero existe, se carga automáticamente con ObjectInputStream
Al salir del programa, se guardan todos los datos automáticamente

```
Menú de la aplicación
=== INSTITUTO ===
1. Añadir alumno presencial
2. Añadir alumno online
3. Listar todos los alumnos
4. Buscar alumno por nombre
5. Mostrar alumno con mayor nota media
6. Mostrar importe total de matrículas
0. Salir (guarda automáticamente)


```

Detalle de cada opción:

Opción 1 y 2 — piden los datos por consola y crean el objeto correspondiente, añadiéndolo a la lista en **memoria**
Opción 3 — recorre la lista e imprime getResumen() de cada alumno, indicando si es presencial u online
Opción 4 — pide un nombre por consola y busca coincidencia parcial (con contains), imprime el resumen si lo encuentra
Opción 5 — recorre la lista y localiza el alumno con mayor valor de getNotaMedia() (recordar que en online está ponderada)
            También puedes usar una implementación de Comparable o un Comparator, para ordenar la lista por nota.
Opción 6 — suma getMatricula() de todos los alumnos y muestra el total


Requisitos técnicos

Usar try-with-resources en toda operación de I/O
La carga del fichero debe manejar FileNotFoundException por separado (fichero nuevo, primera ejecución) del resto de excepciones
El cast de readObject() debe ir acompañado de @SuppressWarnings("unchecked")
No usar instanceof en el menú ni en el listado — todo debe funcionar a través de la interfaz


```
Salida esperada (ejemplo opción 3)
[PRESENCIAL] Ana García | DAM2 | Nota: 7.50 | Módulos: 5 | Matrícula: 150.00 €
[ONLINE]     Luis Pérez  | DAW1 | Nota: 6.30 | Módulos: 4 | Matrícula: 80.00 €
```
