
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
