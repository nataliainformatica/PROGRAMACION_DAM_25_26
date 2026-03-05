# TEMA 9 COLECCIONES
## PRIMER EJEMPLO: 

El objetivo es hacer un pequeño programa para comprobar el funcionamiento de las colecciones:

ArrayList<>

HashSet<>

Debes crear una clase Servidor que tiene los atributos: nombre, ip (ambos string)

// añade los métodos que sean necesarios

// dos servidores son iguales si tienen el mismo nombre y la misma ip

Crea también un DAO que tendrá dos métodos uno para para devolver 
la colección de ArrayList y otro para devolver la colección de HashSet

// una con arraylist y otra con hashset

// usaremos las mismas instancias en las dos colecciones

// en las dos añadiremos un servidor repetido

// incluir 5 instancias de Servidor

Crea la clase Principal, que llamará al DAO para conseguir las dos colecciones y mostrarlas por pantalla

# Ejercicio 2 
**Sistema de Gestión de Parking con Servicio de Lavado**

Vas a desarrollar un sistema en Java para gestionar vehículos estacionados en un parking que ofrece un servicio opcional de lavado.

El sistema permitirá:

Registrar la entrada y salida de vehículos (coches) por matrícula.

Calcular el coste del estacionamiento según la hora de entrada y salida.

Aplicar un descuento de 2 horas si se lava el vehículo.

Gestionar los vehículos que pueden lavarse mediante una interfaz Lavable.

Consultar la cantidad de coches actualmente aparcados y el importe acumulado de los coches que ya han salido.

Para resolver el ejercicio deberás utilizar:

Clases abstractas

Herencia

Interfaces

Polimorfismo

Colecciones

Excepciones personalizadas

###1. Excepción MatriculaInvalida

Se lanzará si la matrícula no cumple el formato correcto (4 dígitos + 3 letras mayúsculas).
```
   private boolean comprobarMatricula(String m){
    // si la matrícula coincide con el patrón devuelve true
  return m.matches("\\d{4}[A-Z]{3}");}
```

Debe almacenar la matrícula y la hora de entrada que generó el error.

La clase puede llamarse MatriculaInvalida.

### 2. Clase abstracta VehiculoAparcado

Representa un vehículo estacionado.

Atributos
```
String matricula
LocalTime horaEntrada
LocalTime horaSalida
boolean lavado

```

Constructor


Recibe matrícula y hora de entrada.

Inicializa lavado a false.

Si la matrícula es inválida, lanza MatriculaInvalida.

La hora de salida puede inicializarse a 0 o null, indicando que aún está dentro del parking.

Métodos

String mostrarInformacion() → devuelve matrícula, marca, modelo, hora de entrada y salida.

protected long calcularHorasFacturables() → devuelve la diferencia entre hora de entrada y salida, descontando 2 horas si lavado == true.

public abstract double calcularPrecioParking() → cada subclase implementa la tarifa por hora.

### 3. Interfaz Lavable

Contiene únicamente el método:

double calcularPrecioLavado();

Será usada para indicar que un vehículo puede recibir un lavado.

No tiene atributos ni conocimiento del estado del vehículo.


### 4. Subclases de VehiculoAparcado
   
#### a) Clase Coche

Atributos adicionales:

int numeroPuertas
boolean esSUV

Implementación de calcularPrecioParking():

Precio base: 2.5 €/hora
Si es SUV: +20% al precio
Si `lavado == true`: se descuentan 2 horas

Implementación de Lavable:

Precio lavado: 12 €

#### b) Clase Moto (opcional si quieres mantener solo coches, pero se puede incluir)

Atributos adicionales:

int cilindrada

Implementación de calcularPrecioParking():

Precio base: 1.5 €/hora
Si `lavado == true`: se descuentan 2 horas

Implementación de Lavable:

Precio lavado: 5 €

### 5. Clase DAOParking

Gestiona los vehículos y el servicio de lavado.

Atributos

ArrayList<VehiculoAparcado> vehiculos //  lista de todos los vehículos registrados.

Métodos

void agregarVehiculo(VehiculoAparcado v) // registra un vehículo que entra al parking.

VehiculoAparcado buscarVehiculo(String matricula) / devuelve el vehículo con esa matrícula o null.

double lavarVehiculo(Lavable v) //recibe un Lavable, aplica el lavado y actualiza lavado = true en la instancia de VehiculoAparcado correspondiente; devuelve el precio del lavado.

double calcularIngresosParking() //suma el precio de todos los vehículos que ya han salido.

int cantidadVehiculosAparcados()// devuelve el número de vehículos que están actualmente en el parking (horaSalida == 0 o null).

### 6. Clase Main con menú de pruebas

Debe permitir simular:

Entrada de un vehículo por matrícula (crear instancia de Coche y añadir al DAO).

Salida de un vehículo por matrícula (registrar hora de salida y calcular precio de parking).

Lavado de un vehículo por matrícula (actualiza el atributo lavado y aplica descuento).

Mostrar cuántos vehículos hay actualmente aparcados.

Mostrar importe acumulado de los vehículos que ya han salido.

Sugerencia de estructura del menú:
``` 

1. Registrar entrada
2. Registrar salida
3. Lavar vehículo
4. Mostrar vehículos aparcados
5. Mostrar ingresos acumulados
6. Salir

``` 

El Main puede usar un ArrayList<Lavable> para almacenar los vehículos lavables, y cuando se selecciona el lavado, llama a DAOParking.lavarVehiculo(Lavable v) para actualizar la instancia.

### 7. Consideraciones

Las horas se manejan como enteros (horas enteras, sin minutos).

El descuento por lavado es siempre de 2 horas.

Si la matrícula es inválida, no se crea el vehículo y se informa el error mediante MatriculaInvalida.

Se debe utilizar polimorfismo en el cálculo de precios y interfaces para el lavado.
