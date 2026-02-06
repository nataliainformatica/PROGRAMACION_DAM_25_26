# Ejercicio ampliación 1
Sistema de Gestión de Vehículos y Cálculo de Tarifas de Parking

Vas a desarrollar un sistema en Java que permita gestionar distintos tipos de vehículos y calcular tanto su coste de mantenimiento como el precio por hora en un parking, siguiendo criterios similares a los que utilizan los ayuntamientos (como antigüedad, tipo de motor, descuentos para vehículos eléctricos, etc.). Utilizarás herencia, clases abstractas, interfaces y polimorfismo.

Requisitos:

Clase abstracta Vehiculo:

Atributos:

String marca

String modelo

String matricula

int anioFabricacion

double peso (en kilogramos)

Métodos:

Constructor para inicializar todos los atributos.

Método concreto String mostrarInformacion(): muestra la información básica del vehículo.

Método abstracto double calcularCostoMantenimiento(): debe ser implementado por cada subclase para calcular el coste de mantenimiento.

Método abstracto double calcularPrecioHora(): debe ser implementado por cada subclase para calcular el precio por hora en el parking según las características del vehículo.

Interfaz Electrico:

Métodos:

double calcularCostoCarga(): calcula el costo de cargar la batería.

double autonomia(): devuelve la autonomía del vehículo eléctrico en kilómetros.

Subclases que heredan de Vehiculo:

a) Clase Automovil:

Atributos adicionales:

int numeroPuertas

boolean esHibrido

double capacidadCombustible (en litros)

Implementación del método calcularCostoMantenimiento():

El costo base se calcula como: (peso * 0.05) + (capacidadCombustible * 0.1).

Si el automóvil es híbrido (esHibrido == true), reducir el costo total en un 10%.

Implementación del método calcularPrecioHora():

Precio base: 2 euros por hora.

Si el automóvil tiene más de 10 años de antigüedad, añadir un 20% al precio.

Si es híbrido, aplicar un descuento del 15%.

b) Clase BicicletaElectrica (implementa Electrico):

Atributos adicionales:

double capacidadBateria (en kWh)

double consumoPorKm (en kWh/km)

Implementación del método calcularCostoMantenimiento():

El costo base se calcula como: (peso * 0.02).

Agregar un costo fijo de 15 euros por mantenimiento de la batería.

Implementación del método calcularPrecioHora():

Las bicicletas eléctricas tienen parking gratuito.

Implementación de los métodos de Electrico:

calcularCostoCarga(): se calcula como (capacidadBateria * 0.20).

autonomia(): se calcula como (capacidadBateria / consumoPorKm).

Clase Parking:

Atributos:

ArrayList /< Vehiculo /> vehiculosEstacionados

Métodos:

void agregarVehiculo(Vehiculo vehiculo): agrega un vehículo al parking.

void mostrarTarifas(): recorre la lista de vehículos y muestra el precio por hora de cada uno usando polimorfismo. double calcularRecaudacionTotal(): suma el precio por hora de todos los vehículos estacionados para obtener la recaudación total.

Clase Main:

Crear instancias de Automovil y BicicletaElectrica.

Agregar estas instancias al Parking.

Mostrar la información de cada vehículo, su costo de mantenimiento y su precio por hora.

Mostrar la recaudación total del parking.

Ejercicio adicional: Si el vehículo implementa la interfaz Electrico, mostrar también el costo de carga y la autonomía usando instanceof y casting.
