# Ejercicio 1. Gestión de alumnos con ArrayList

Se desea implementar una Clase- DAOalumno que gestione una lista de alumnos.
La clase tendrá métodos estáticos. 
Cada alumno tendrá los atributos: id (int), nombre (String) y edad (int).

Se pide:

Crear una clase Alumno correctamente encapsulada.
Almacenar varios objetos Alumno en un ArrayList, en DAOalumno
Implementar un método que recorra la lista y devuelve un String con el detalle de  todos los alumnos.
Implementar un método que devuelva una **nueva** lista con una copia de las instancias de los alumnos mayores de 18 años.
Buscar un alumno por su id utilizando . 

# Ejercicio 2. Eliminación de duplicados con HashSet

A partir de la clase Alumno del ejercicio anterior, se quiere evitar que existan alumnos duplicados en una colección.

Se pide:

Sobrescribir los métodos equals y hashCode en la clase Alumno, considerando que dos alumnos son iguales si tienen el mismo id.
Insertar varios objetos Alumno (incluyendo duplicados) en un HashSet.
Comprobar que los duplicados no se almacenan.
Explicar qué ocurre si no se sobrescriben equals y hashCode.

# Ejercicio 3. Conteo de objetos con HashMap

Se desea contar cuántas veces aparece cada alumno en una lista (por ejemplo, alumnos repetidos por error en un sistema).

Se pide:

Utilizar un HashMap<Alumno, Integer> donde la clave sea el alumno y el valor el número de apariciones.
Recorrer una lista de alumnos e ir actualizando el contador.
Mostrar el contenido del mapa.
Reflexionar sobre la importancia de equals y hashCode en este caso.

# Ejercicio 4. Ordenación de objetos con TreeSet
**AVANZADO-- EXTRA**

Se quiere almacenar alumnos en una colección ordenada automáticamente por edad.

Se pide:

Hacer que la clase Alumno implemente la interfaz Comparable<Alumno>.
Definir el criterio de ordenación por edad y, en caso de empate, por nombre.
Insertar varios alumnos en un TreeSet.
Mostrar los elementos y comprobar que están ordenados.
Explicar qué ocurre si compareTo considera iguales a dos objetos diferentes.

# Ejercicio 5. Uso de Comparator - 
**AVANZADO**

Se desea ordenar alumnos por nombre sin modificar el criterio natural definido en Comparable.

Se pide:

Crear un Comparator<Alumno> que ordene por nombre.
Utilizar este comparador para ordenar un ArrayList mediante Collections.sort.
Comparar este enfoque con el uso de Comparable.

# Ejercicio 6. Gestión de agenda con Map

Se quiere implementar una agenda donde cada fecha tiene asociadas varias citas. Cada cita tendrá: fecha (String o LocalDate) y descripción.

Se pide:

Crear una clase Cita.
Utilizar un HashMap<String, List<Cita>> donde la clave sea la fecha.
Añadir varias citas a distintas fechas.
Mostrar todas las citas de una fecha concreta.
Comprobar el uso de métodos como containsKey, get, put y computeIfAbsent.

# Ejercicio 7. Eliminación segura de elementos

Dada una colección de alumnos almacenada en un ArrayList, se desea eliminar aquellos alumnos menores de edad.

Se pide:

Eliminar elementos usando un Iterator correctamente.
Intentar hacerlo con un bucle for-each y observar qué ocurre.
Explicar por qué se produce una excepción y cómo evitarla.

# Ejercicio 8. Uso combinado de colecciones

Se desea gestionar un sistema donde:

Un HashMap almacena cursos (String) como clave.
Cada curso tiene un Set<Alumno> asociado (sin duplicados).

Se pide:

Añadir alumnos a distintos cursos.
Evitar duplicados dentro de cada curso.
Mostrar todos los cursos con sus alumnos.
Explicar por qué es adecuado usar un Set en lugar de una lista en este caso.
