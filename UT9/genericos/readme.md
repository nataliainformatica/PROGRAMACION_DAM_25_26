Se desea desarrollar una pequeña aplicación que gestione diferentes tipos de objetos (por ejemplo, usuarios y productos) utilizando el patrón DAO (Data Access Object).

Para evitar duplicar código, se pide implementar una solución basada en genéricos.


Interfaz DAO genérica

Crea una interfaz genérica Dao<T> que declare los siguientes métodos:
^``` 

void guardar(T t)
T obtener(int id)
void eliminar(int id)
List<T> obtenerTodos()

```
**Implementa una clase DaoMemoria<T> que:**

Implemente la interfaz Dao<T>

Almacene los datos en memoria utilizando una estructura adecuada, por ejemplo un HashMap

Genere automáticamente un identificador para cada objeto almacenado.

Crea al menos dos clases distintas:

Usuario (con atributo nombre)
Producto (con atributo nombre)

Ambas deben tener:

Constructor
Método toString()

**Programa principal**

Desarrolla una clase Main que:

Cree un DAO para Usuario

Cree un DAO para Producto

Inserte varios objetos en cada uno

Muestre por pantalla todos los elementos almacenados

