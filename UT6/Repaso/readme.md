
# Ejercicios de repaso - 

https://github.com/lionel-ict/ApuntesProgramacion/blob/master/Unidad%208%20POO%20(I)/ud8_Ejercicios.pdf

# EJERCICIO - Práctica del RA4 - 
Crea una clase Publicacion que represente publicaciones de usuarios en una red social. 

Cada publicación tiene los siguientes atributos: 

•	idUsuario (int): identificador del usuario que crea la publicación.

•	contenidos (Lista de Strings): con los contenidos de la publicación, máximo 10 Strings.

•	fechaHoraPublicacion (LocalDateTime): la fecha y hora en que se creó la publicación. Se asigna automáticamente al crear la publicación y no puede modificarse posteriormente.

•	fechaHoraModificacion(LocalDateTime): la fecha y hora en la que se modifica la lista de contenidos, ya sea añadiendo o eliminando. Si no se añade o modifica  ningún contenido, será la misma que la fecha de publicación. 

Requisitos de la clase Publicacion:

1.	Se debe poder crear de una de estas dos formas:
   
o	Solamente con idUsuario.

o	Con idUsuario y un contenido inicial.

2.	Permitir consultar los atributos (idUsuario, , fechaHoraPublicacion y fechaHoraModificacion).
   
3.	Permitir agregar más contenido mediante agregarContenido(String contenido).
   
Devolver true o false y actualizar fechaModificacion

4.	Permitir eliminar el último contenido agregado con eliminarUltimoContenido().
   
Devolver true o false y actualizar fechaModificacion

5.	Implementar mostrarFeeds(), que muestre:
   
o	ID de usuario

o	Fecha y hora de la modificación.

o	Todos los contenidos de la publicación

6.	Implementar el método equals(Object obj) de forma que dos publicaciones sean consideradas iguales si:
   
o	Tienen el mismo idUsuario y

o	Tienen exactamente el mismo contenido (en orden y cantidad).

Crea también una clase Principal para probar la clase Publicacion.

•	Crea una instancia de Publicacion.

•	Agregar contenido.

•	Elimina el último contenido. 

•	Muestre el contenido usando mostrarFeeds().


# EJERCICIO 2– Gestión de Pedidos 

Una tienda online necesita modelar pedidos. 

## Clase Producto 

Atributos privados: 

Id. (código incremental, gestionado por la base de datos, en este ejercicio el DAO) 

codigo 

nombre 

precio 

**Requisitos**

Constructor 

Getters 

Sobrescribir toString() 

Sobrescribir equals() (igualdad por código) 

Sobrescribir hashCode() 

##  Clase Pedido 
Siempre se crean los pedidos vacíos, para añadir productos se usarán los métodos establecidos. 

**Atributos privados:** 

numeroPedido 

fecha 

productos (ArrayList<Producto>) 

**Métodos:** 

agregarProducto(Producto p)

calcularTotal() . Devuelve el total del importe del pedido, con la suma de productos. 

toString() sobrescrito 


## **Parte B – DAO**

Crear clase PedidoDAO con los siguientes métodos. 

guardar(Pedido p) 

public  Pedido buscarPorNumero(String numero) 

public String listar() 

## En la clase Main: 

Crear al menos 2 pedidos 

Añadir productos 

Guardarlos usando el DAO 

Mostrar el total de cada pedido 

 
# Ejercicio 3


Una tienda online necesita un sistema para gestionar los pedidos de sus clientes. 

Necesita tener una lista de **Producto**  que el usuario podrá seleccionar. 

Cada pedido puede contener varios productos, que el usuario podrá elegir mediante una lista  y se desea poder consultar información sobre los pedidos y calcular totales.

Requisitos funcionales

## Productos

Cada producto tiene un código único, un nombre y un precio. ( extra- atributo ENUM)

No puede haber dos productos con el mismo código dentro de un mismo pedido.

El sistema debe poder permitir añadir productos a la lista. 

## Pedidos

Cada pedido tiene un número único y una fecha de creación.

Es posible añadir productos a un pedido.

El sistema debe poder calcular el total del pedido sumando los precios de todos los productos incluidos.

El sistema debe permitir mostrar toda la información del pedido, incluyendo el número, la fecha, la lista de productos y el total.

## Gestión de pedidos

Es posible guardar varios pedidos en el sistema.

Se puede buscar un pedido mediante su número.

Se puede listar todos los pedidos registrados en el sistema.

## atributos EXTRA tipo ENUM

Productos

Además de los requisitos anteriores, ahora:

Cada producto debe pertenecer a una categoría.

Las categorías posibles son:

ROPA

CALZADO

COMPLEMENTOS

ELECTRONICA

Esta categoría debe estar limitada únicamente a esos valores.

2️Pedidos

Se añade un nuevo requisito:

Cada pedido tendrá un estado que podrá ser:

PENDIENTE

ENVIADO

ENTREGADO

CANCELADO

El sistema debe permitir:

Consultar el estado del pedido.

Mostrar el estado al visualizar la información del pedido.


# Ejercicio  4
El objetivo es realizar una aplicación para un centro de formación que necesita modelar su sistema de cursos. La aplicación tendrá una clase GestionAlumnos que se facilita en el aula virtual y que deberás completar (4 puntos)  con  código y con el modelado correspondiente de clases para que se cumplan sus funcionalidades.  

 

La clase principal mostrará un menú: 

``` 

===== MENÚ CENTRO ===== 

1. Crear curso 

2. Listar cursos 

3. Matricular alumno 

4. Listar matriculaciones 

5. Salir 

Seleccione una opción:

```


Forma 

Modelado de clases 

1. Crear la clase Alumno

Debe contener: 

 
Atributos privados: 
 

dni (String) 

nombre (String) 

email (String) 

 

Requisitos obligatorios: 

Crea los constructores , getters y setters que creas necesarios. En un comentario en el código EXPLICA u razonamiento para la definición de estos métodos. 

 

Ten en cuenta que dos alumnos son iguales si tienen el mismo dni. 

 

2. Crear la clase Curso 

  

Atributos privados: 

 

codigo (String) 

nombre (String) 

horas (int) 

NivelCurso(enumerado) :  BASICO, INTERMEDIO, AVANZADO 

alumnosMatriculados (ArrayList<Alumno>) 

Cuando se crea un curso, nunca tiene alumnos matriculados. 

 

Ten en cuenta que dos cursos son iguales si tienen el mismo código. 

Requisitos: 

Crea los constructores , getters y setters que creas necesarios. En un comentario en el código explica tu razonamiento para la definición de estos métodos. 

 

Método matricularAlumno(Alumno a) 

 

Permite añadir el alumno a la lista de alumnos matriculados. Se asegura de que no haya alumnos repetidos.  

 
 

Método buscarAlumnoPorDni(String dni) 

Devuelve el alumno con el dni que se recibe por parámetro.  

  

 Relación entre clases 

Un Curso contiene varios Alumno 

La relación debe implementarse mediante colección (ArrayList) 

 

DAO 

Crear la clase  CursoDAO : NO se permite el uso de STATIC en esta clase 

 

Esta clase simulará una base de datos en memoria.  

 

Atributo privado: 

private ArrayList<Curso> listaCursos; 

 

Métodos obligatorios: 

Void guardar(Curso c):  

Guarda el curso en listaCursos, pero evitando duplicados.   

Curso buscarPorCodigo(String codigo) 

String listar()  

Devolverá un String con la lista de cursos (fíjate en la traza para saber el formato). Si no hay cursos, mostrará el mensaje “No hay cursos disponibles.” 

 

TRAZAS DE PRUEBA DE FUNCIONAMIENTO DE LA APLICACIÓN 
```
Si no hay cursos y listamos.  

===== MENÚ CENTRO ===== 

1. Crear curso 

2. Listar cursos 

3. Matricular alumno 

4. Listar matriculaciones 

5. Salir 

Seleccione opción: 2 

  

LISTA CURSOS: No hay cursos disponibles. 

 

 

Si intentamos matricular a un alumno en un curso que no existe 

 

===== MENÚ CENTRO ===== 

1. Crear curso 

2. Listar cursos 

3. Matricular alumno 

4. Listar matriculaciones 

5. Salir 

Seleccione opción: 3 

DNI: 111111X 

Nombre: Natalia 

Email: natalia@gmail.com 

Código curso: 6 

Curso no existe 

 

 

Creamos un curso 

===== MENÚ CENTRO ===== 

1. Crear curso 

2. Listar cursos 

3. Matricular alumno 

4. Listar matriculaciones 

5. Salir 

Seleccione opción: 1 

Código: 1 

Nombre: Programación 

Horas: 270 

Curso creado correctamente 

 

Si al crear un curso ya existe, mostrará el mensaje de “El código ya existe” 

 

Matriculamos un alumno 

 

===== MENÚ CENTRO ===== 

1. Crear curso 

2. Listar cursos 

3. Matricular alumno 

4. Listar matriculaciones 

5. Salir 

Seleccione opción: 3 

DNI: 11111111x 

Nombre: Natalia 

Email: natalia@gmail.com 

Código curso: 1 

Alumno matriculado correctamente 

Si el alumno ya está matriculado, mostrará el mensaje, “El alumno ya estaba matriculado” 

 

Mostramos la lista de cursos (solo hay uno en este ejemplo) 

===== MENÚ CENTRO ===== 

1. Crear curso 

2. Listar cursos 

3. Matricular alumno 

4. Listar matriculaciones 

5. Salir 

Seleccione opción: 2 

  

LISTA CURSOS: 

Código: 1 Nombre: Programación Horas: 270 

 

Mostramos los alumnos matriculados en el curso 1 

===== MENÚ CENTRO ===== 

1. Crear curso 

2. Listar cursos 

3. Matricular alumno 

4. Listar matriculaciones 

5. Salir 

Seleccione opción: 4 

Código curso: 1 

ALUMNOS MATRICULADOS: 

Alumno{dni='11111111x', nombre='Natalia', email='natalia@gmail.com'}

```

 
EJERCICIO – Sistema de Gestión de Reservas de Biblioteca

Una biblioteca necesita una aplicación para gestionar las reservas de libros realizadas por los usuarios. 

El sistema debe permitir registrar libros, crear reservas y consultar la información almacenada.

El objetivo es garantizar que las reservas se gestionen correctamente y evitar inconsistencias.

1. Libros

Cada **libro** debe tener:

Un código único

Un título

Un autor

Un género, que solo puede ser uno de los siguientes:

NOVELA

ENSAYO

CIENCIA

HISTORIA

OTROS

No puede haber dos libros con el mismo código en el sistema.

2. Reservas

Cada **reserva** debe tener:

Un número de reserva único

El nombre de la persona

La fecha de la reserva

El libro reservado

Un estado, que puede ser:

ACTIVA

COMPLETADA

CANCELADA

3. Gestión de reservas

El sistema debe permitir:

Registrar una nueva reserva

Buscar una reserva por su número

Mostrar todas las reservas

Consultar el libro asociado a una reserva

Reglas del sistema **(IMPORTANTE)**

El sistema debe controlar las siguientes situaciones:

No se puede registrar una reserva con un número que ya exista.

No se puede buscar una reserva que no exista.

Si ocurre alguna de estas situaciones, el sistema debe informar del problema.

Persistencia de la información (en memoria....)

El sistema debe disponer de un **componente** de acceso a datos encargado de:

Guardar reservas

Buscar reservas

Listar reservas

``` 
Trazas de funcionamiento esperadas
Ejemplo 1 – Registro correcto
Reserva creada correctamente:
Número: R001
Persona: Ana López
Libro: El Quijote
Estado: ACTIVA
Ejemplo 2 – Registro duplicado
Error: ya existe una reserva con ese número
Ejemplo 3 – Búsqueda correcta
Reserva encontrada:
Número: R001
Persona: Ana López
Libro: El Quijote
Estado: ACTIVA
Ejemplo 4 – Búsqueda incorrecta
Error: reserva no encontrada
Ejemplo 5 – Listado
LISTADO DE RESERVAS

R001 – Ana López – El Quijote – ACTIVA
R002 – Juan Pérez – Historia del tiempo – ACTIVA
Requisitos técnicos implícitos que el alumno deberá resolver


``` 
*Debes tomar la decisióon de  cómo implementar:*

*La estructura de los libros*

*La estructura de las reservas*

*El sistema de almacenamiento*

*El control de duplicados*

*La gestión de errores*

*La representación de los géneros*

*La representación de los estados*

## VERSIÓN 2 CON Ampliaciones opcionales 

Cancelar una reserva

Cambiar el estado de una reserva

Mostrar reservas por género

Contar número total de reservas activas


 
