Desarrolla una aplicación que nos ayude en la gestión de un cine

**Clase SesionSala**
Tendrá un array estático bidimensional, de x filas con x Asitento cada una. 

Constructor
public SesionSala(inf filas, int columnas, double  precioEntrada, int numSesion){}

La sala se instancia con todos los asientos libres. 

Si el número de filas es mayor a 15 o el número de asientos es mayor a 20, el constructor propagará la excepción ErrorEnCantidadAsientos, con el mensaje ("La sala no puede tener x filas) o ("La sala no puede tener x asientos)

Tendrá los siguientes métodos de comportamiento: 

mostrarSala(): Devolverá un String con el estado de la sala

reservarAsiento(int fila int columna): reservará el asiento solamente si estaba libre. Devuelve un booleano con el resultado de la reserva. 

Debes tener en cuenta, que si recibe  posiciones fuera del array, no se permitirá  hacer la reserva y devolverá false. 

liberarAsiento(int idReserva): Devuelve un booleano con el resultado de liberar la reserva. 

Debes tener en cuenta, que si el idRserva no existe no se permitirá  hacer la liberación reserva y devolverá false. 

mostrarRecaudacion(). devuelve el importe total de la recaudación  de asientos ocupados. 

**Clase Asiento**

Dispondrá de un atributo para mostrar si está (Libre "L" u Ocupado "O")

Tendrá un atributo para añadir el id de reserva (int). 

Constructor:  
El id  de reserva, será un número consecutivo, generado mediante el constructor, que irá contando el número de instancias creadas. 

DAOsalas - completa un DAO con varias instancias de SesionSala,
```
new Sala(10,10, int 5,25, 1)

new Sala(10,10, int 6,25, 2)

new Sala(10,10, int 3,25, 3)
```

En la clase Principal. 
Usa el DAO creado para tener las salas disponibles. 

```

Mostrar estado de la sala.
Reservar asiento
Liberar asiento
Ver la recaudación de la sala
Salir
```
Para mostrar el estado de la sala pedirá el número de la sesión de la la sala. 

Para reservar un asiento, pedirá  la fila y número de asiento, además del número de la sesión de la sala

Para liberar un asiento, solamente pedirá el número de reserva

Para ver la recaudación de la sala, pedirá el número de la sesión de la  sala


Debes asegurar que se tratan todas las posibles excepciones, y que la aplicación en ningún momento tendrá una salida inesperada. 





