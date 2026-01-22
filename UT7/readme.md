# Ejercicio 4 ( del tema 6 - actualizado a tema 7 con @Override de  métodos de Object
Vamos a crear una clase **TAREA**:

Cada tarea estará representada por una clase Tarea con los siguientes atributos:

titulo: (String) el título de la tarea.

categoria: (enum) la categoría de la tarea, con valores como:

TRABAJO, ESTUDIO, PERSONAL, OTRO.

estado: (enum) el estado de la tarea, con valores como:

PENDIENTE, EN_PROGRESO, COMPLETADA, CANCELADA.

fecha: (LocalDate) la fecha asignada a la tarea.

hora: (LocalTime) la hora asignada a la tarea.

Añadiremos un método a la clase Tarea, que devolverá un booleano: 
true, si la tarea está vencida respecto a la fecha y hora actual. 
false, si no está vencida. 

Se define el criterio de que dos tareas son iguales si la fecha y hora son iguales, y la categoría. El título podría ser distinto, así como el estado. 

En la clase principal, crearemos un array de tarea. 
Añadiremos un método a la clase principal que nos permita añadir tareas, sin embargo no permitirá añadir tareas duplicadas. 

Probaremos a listar en la consola todas las tareas.
Probaremos a listar solamente las tareas que están pendientes. 

# Ejercicio 5 (para hacer en clase)
Clase Producto:

Contiene atributos comunes a todos los productos (nombre y precio). Tiene un método mostrarInformacion que las subclases pueden extender.

**Clase ProductoPerecedero:**

Añade el atributo diasParaCaducar. Incluye el método devolverFechaCaducidad.

Incluye el método calcularPrecioFinal que calcula un descuento según los días restantes.

Si quedan menos de tres días se hace un descuento del 50%

Si queda menos de un día se hace un 75 % de descuento.

**Clase ProductoNoPerecedero:**

Añade el atributo descuento.

Añade el atributo tipo ( ejemplo "educativo", "electrónico", etc.).

Tiene un método aplicarPromocion que simula un descuento en el precio.

Clase Principal: Crea instancias de ambas subclases (ProductoPerecedero y ProductoNoPerecedero). Muestra la información y llama a los métodos específicos de cada subclase.
