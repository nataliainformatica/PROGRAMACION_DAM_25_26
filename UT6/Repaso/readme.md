
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

 

