Desarrolla una aplicación que nos ayude en la gestión de una sala de cine. 
Deberás crear las siguientes clases: 

**Clase SesionSala**
Tendrá un array estático bidimensional, de x filas con x Asitento cada una. 
Al arrancar la aplicación, la salda tendrá todos los asientos libres. 

Constructor
public Sala(inf filas, int columnas, int precioEntrada, int numSesion){}
Tendrá los siguientes métodos de comportamiento: 

mostrarSala(): Devolverá un String con el estado de la sala
reservarAsiento(int fila int columna): reservará el asiento solamente si estaba libre. Devuelve un booleano con el resultado de la reserva. 
Debes tener en cuenta, que si recibe  posiciones fuera del array, no se permitirá  hacer la reserva y devolverá false. 

liberarAsiento(int idReserva): Devuelve un booleano con el resultado de liberar la reserva. 
Debes tener en cuenta, que si el idRserva no existe no se permitirá  hacer la liberación reserva y devolverá false. 
mostrarRecaudacion(). devuelve el importe total de la recaudación  de asientos ocupados. 

**Clase Asiento**
Dispondrá de un atributo para mostrar si está (Libre "L" u Ocupado "O")
Tendrá un atributo para añadir el id de reserva. 




En la clase Principal tendremos un menú interactivo para poder: 
Mostrar estado de la sala
Reservar asiento
Liberar asiento
Ver número de ocupados
Salir

Debes asegurar que se tratan todas las posibles excepciones, y que la aplicación en ningún momento tendrá una salida inesperada. 



