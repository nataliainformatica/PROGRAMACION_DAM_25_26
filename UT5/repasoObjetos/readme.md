##  Ejercicio 1: 
Taquilla de Cine 

Queremos crear una aplicación para gestionar la venta de entradas de una sala de cine.
La sala se identifica mediante la clase SalaCine.

Al iniciar la aplicación, la sala estará vacía. El precio de la entrada se establece en el momento de crear la sala. 
El número de entradas disponibles se establece en el momento de la entrada, y no se podrá modificar después.
Cada vez que se vende una entrada, aumentará el número de entradas vendidas.

Debe implementarse la clase **SalaCine** con los siguientes métodos:

public boolean venderEntrada()
Registra una entrada vendida, si hay entradas disponibles. 

public void cambiarPrecioEntrada(double precio)
Establece el nuevo  precio de la entrada (solamente para las que se vendan después)

public int mostrarEntradasVendidas()
Devuelve el número de entradas vendidas

public int mostrarEntradasDisponibles()
Devuelve el número de entradas disponibles

public double totalRecaudado()
Devuelve el total recaudado hasta el momento, los precios de las entradas se aplican en el momento de la venta. 

public void reiniciarSala()
Reinicia la sala: borra todas las entradas vendidas y deja la sala vacía.

El programa principal debe mostrar un menú con opciones para:

Mostrar cuántas entradas se han vendido

Mostrar recaudación total

Mostrar el número de entradas vendidas

Registrar venta de una entrada

Reiniciar la sala

Salir

Completa la clase añadiendo los atributos, getters, setters y constructor necesarios.

##  Ejercicio 2:
Parking de Bicicletas 

Se desea controlar un único aparcamiento de bicicletas mediante la clase ParkingBicis.

Al iniciar el programa, el parking estará vacío. Tiene una capacidad de 10 bicicletas.
Cada vez que entra una bicicleta se registra su númeroClave de candado (string).
Cuando sale una bicicleta, se elimina su candado del registro.

Implementar:

public void registrarEntrada(String candado)

public boolean registrarSalida(String candado)

public String mostrarBicicletas()
Muestra las claves de los candados de las bicicletas aparcadas.

public int totalBicicletas()
Muestra el total de bicicletas aparcadas.

Programa principal con menú:

Mostrar bicicletas en el parking

Mostrar número total

Registrar entrada

Registrar salida

Salir

## Ejercicio 3: Biblioteca Personal 

Queremos gestionar una pequeña biblioteca formada por un único estante, representado por la clase EstanteLibros.

Debe permitir guardar títulos de libros (solo el título).

Métodos obligatorios:

public void agregarLibro(String titulo)

public boolean quitarLibro(String titulo)

public String listarLibros()

public int totalLibros()

public void vaciarEstante()

El estante tiene una capacidad máxima, que se indica en el constructor.

Programa principal:

Mostrar libros

Añadir libro

Quitar libro

Vaciar estante

Número total de libros

Salir

##  Ejercicio 4: Depósito de Agua

Simular un depósito de agua mediante la clase DepositoAgua.

El depósito tiene una capacidad máxima y un nivel actual.

Métodos:

public void llenar(double litros)

public void vaciar(double litros)

public double nivelActual()

public boolean estaVacio()

public boolean estaLleno()

public void vaciarCompleto()

Reglas:

El nivel nunca puede sobrepasar la capacidad.

El nivel nunca puede bajar de 0.

Programa principal:

Mostrar nivel actual

Llenar depósito

Vaciar depósito

Vaciar completamente

Comprobar si está vacío

Comprobar si está lleno

Salir

##  Ejercicio 5:
Cajero de Tienda

Simular una caja registradora con la clase CajaTienda.

Debe permitir registrar productos vendidos (nombre y precio).

Métodos:

public void registrarProducto(String nombre, double precio)

public String mostrarProductos()

public double totalVenta()

public void reiniciarCaja()

Programa principal:

Registrar producto

Mostrar productos

Mostrar total venta

Reiniciar caja

Salir
