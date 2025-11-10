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
