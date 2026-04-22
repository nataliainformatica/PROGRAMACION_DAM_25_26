Enunciado

Se desea desarrollar un programa en Java que modele la gestión básica de pedidos en una tienda online aplicando los principios de la programación orientada a objetos.

El sistema debe permitir representar productos y pedidos, así como la relación existente entre ellos, donde un pedido puede contener varios productos.

Se pide:

Definir una clase Producto con los siguientes atributos:

nombre (cadena de texto)
precio (número decimal)
Un constructor que inicialice todos los atributos
Métodos getters para acceder a los atributos
Un método toString() que devuelva una representación textual del producto
La clase debe incluir:

Definir una clase Pedido con los siguientes atributos:

id (entero)
listaProductos (colección de tipo ArrayList que almacene objetos de tipo Producto)
Un constructor que inicialice el identificador y la lista de productos
Un método agregarProducto(Producto p) que permita añadir un producto al pedido
Un método calcularTotal() que devuelva la suma de los precios de todos los productos del pedido
Un método mostrarPedido() que muestre por pantalla el identificador del pedido, el listado de productos y el total a pagar
La clase debe incluir:

En la clase principal (Main), se deberá:
Crear al menos tres objetos de tipo Producto con datos reales (por ejemplo, ropa o calzado)
Crear un objeto de tipo Pedido
Añadir los productos creados al pedido
Mostrar la información completa del pedido utilizando los métodos definidos
El programa debe compilar y ejecutarse correctamente, mostrando por pantalla el contenido del pedido y el importe total calculado a partir de los productos añadidos.
