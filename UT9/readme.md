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

String mostrarInformacion()   devuelve matrícula, hora de entrada y salida.

protected long calcularHorasFacturables() devuelve la diferencia entre hora de entrada y salida, descontando 2 horas si lavado == true.

public abstract double calcularPrecioParking()  cada subclase implementa la tarifa por hora.
**FUNCIONALIDAD AÑADIDA**
método para la salida del vehículo del parking
finAparcar()
comprueba que la  hora de salida es null para, si es != null actualiza la hora de salida

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
Al invocar a calcularPrecio, modifica el boolean lavado =true

Precio lavado: 12 €

#### b) Clase Moto (opcional si quieres mantener solo coches, pero se puede incluir)

Atributos adicionales:

int cilindrada

Implementación de calcularPrecioParking():

Precio base: 1.5 €/hora
Si `lavado == true`: se descuentan 2 horas

Implementación de Lavable:
Al invocar a calcularPrecio, modifica el boolean lavado =true

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

## Ejercicio 3 Sistema de gestión de participantes en eventos

Una empresa organiza distintos eventos tecnológicos y necesita una aplicación en consola para gestionar participantes y listas de asistencia.

El sistema trabajará con dos tipos de colecciones:

Lista general de personas registradas.

Pparticipantes confirmados para un evento ( **evitando  duplicados**).

Clase Participante

```
id

nombre

email
```

}
Estructuras de datos

En el programa principal tendrás:

ArrayList<Participante> registrados = new ArrayList<>();

HashSet<Participante> asistentesEvento = new HashSet<>();

Menú del programa

Crear un menú con estas opciones.

1. Registrar participante

2. Mostrar participantes registrados

3. Confirmar asistencia al evento

El usuario introduce el id del participante.

Si está registrado:  se añade al HashSet de asistentes

4.  Mostrar asistentes al evento

Mostrar el contenido del HashSet.

5. Cancelar registro. 


Eliminar participante del evento, si había confirmado la asistencia no se podrá cancelar. 

6. Mostrar asistencia al evento ordenados por nombre  (implementando Comparable)

# Ejercicio4 : ORDENACIÓN DE PRODUCTOS

## Objetivos

- Uso de clases, uso método toString() para mostrar datos. 

- Uso de arrays (ArrayList)  de objetos. 

- Argumentos por referencia.

- Uso de interfaces Comparable y Comparator. 

- Uso del **patrón DAO** para abstraer y encapsular todos los accesos a la fuente de datos.

## Problema a resolver

Nos piden hacer la lógica que podrá ordenar (por distintos parámetros) una colección de Productos. 

Para esto completaremos la clase **Ordenaciones** que  implementará tres métodos con las siguientes firmas: 

```
public interface Ordenable{

public static ArrayList<Producto> ordenarAltoProducto(  ArrayList<Producto>   coleccion);
  

public static ArrayList<Producto> ordenarAnchoProducto(  ArrayList<Producto>   coleccion);
  

public static ArrayList<Producto> ordenarLargoProducto(  ArrayList<Producto>   coleccion); 
}  
```

### La clase Producto

- Se ordenará por **criterio natural** por el atributo de **nombre**. 
- Es posible crear un Producto con el nombre, de forma que las medidas por defecto son las mínimas expresadas a continuación.
- Los datos del paquete no podrán ser modificados una vez creados.
- Todos los productos están empaquetados en cajas con medidas que no superan los siguientes límites: 

```
(Si se pasan valores superiores o inferiores se  truncará al valor mínimo o máximo)

Alto: desde 2 cm hasta 30 cm 

Ancho: desde 2 cm hasta 10 cm 

Largo: desde 2 cm hasta 10 cm 
```

Podremos **ordenar los productos** por cualquiera de estas tres medidas, siempre de mayor a menor. 


### Pruebas

Mostraremos el catálogo de productos en el siguiente orden:
- sin ordenar
- ordenados por nombre
- sin ordenar
- ordenados por alto
- sin ordenar
- ordenados por ancho
- sin ordenar
- ordenados por largo

##Usando un **Iterador** 
Muestra de nuevo los productos sin ordenar, eliminando los productos con nombre : "xxxx" (elige un nombre de producto que exista en el dao)

# AMPLIACIÓN: PRÁCTICA GUIADA: con Servicio de Ordenación y Patrón Singleton
Singleton - también llamado instancia única
![https://refactoring.guru/es/design-patterns/singleton

Aprenderemos a crear un servicio de ordenación (una única instancia)
privte static ArrayList<T> listaClonada;
```
private static ServicioOrdenacion instance;
    
    private ServicioOrdenacion(){
        listaClonada = new ArrayList<>();
    }
    
    public static ServicioOrdenacion getInstance(){
        if (instance == null)
            instance = new ServicioOrdenacion();
        return instance;
    }
```

```
ServicioOrdenacion servicio = ServicioOrdenacion.getInstance();
...
servicio.ordenarAltoProducto(productos);
...
servicio.ordenarAnchoProducto(productos);# Ejercicio2 : ORDENACIÓN DE PRODUCTOS

## Objetivos

- Uso de clases, uso método toString() para mostrar datos. 

- Uso de arrays (ArrayList)  de objetos. 

- Argumentos por referencia.

- Uso de interfaces Comparable y Comparator. 

- Uso del **patrón DAO** para abstraer y encapsular todos los accesos a la fuente de datos.

## Problema a resolver

Nos piden hacer la lógica que podrá ordenar (por distintos parámetros) una colección de Productos. 

Para esto completaremos la clase **Ordenaciones** que  implementará tres métodos con las siguientes firmas: 

```
public interface Ordenable{

public static ArrayList<Producto> ordenarAltoProducto(  ArrayList<Producto>   coleccion);
  

public static ArrayList<Producto> ordenarAnchoProducto(  ArrayList<Producto>   coleccion);
  

public static ArrayList<Producto> ordenarLargoProducto(  ArrayList<Producto>   coleccion); 
}  
```

### La clase Producto

- Se ordenará por **criterio natural** por el atributo de **nombre**. 
- Es posible crear un Producto con el nombre, de forma que las medidas por defecto son las mínimas expresadas a continuación.
- Los datos del paquete no podrán ser modificados una vez creados.
- Todos los productos están empaquetados en cajas con medidas que no superan los siguientes límites: 

```
(Si se pasan valores superiores o inferiores se  truncará al valor mínimo o máximo)

Alto: desde 2 cm hasta 30 cm 

Ancho: desde 2 cm hasta 10 cm 

Largo: desde 2 cm hasta 10 cm 
```

Podremos **ordenar los productos** por cualquiera de estas tres medidas, siempre de mayor a menor. 


### Pruebas

Mostraremos el catálogo de productos en el siguiente orden:
- sin ordenar
- ordenados por nombre
- sin ordenar
- ordenados por alto
- sin ordenar
- ordenados por ancho
- sin ordenar
- ordenados por largo

##Usando un **Iterador** 
Muestra de nuevo los productos sin ordenar, eliminando los productos con nombre : "xxxx" (elige un nombre de producto que exista en el dao)

# AMPLIACIÓN: PRÁCTICA GUIADA: con Servicio de Ordenación y Patrón Singleton
Singleton - también llamado instancia única
![https://refactoring.guru/es/design-patterns/singleton

Aprenderemos a crear un servicio de ordenación (una única instancia)
privte static ArrayList<T> listaClonada;
```
private static ServicioOrdenacion instance;
    
    private ServicioOrdenacion(){
        listaClonada = new ArrayList<>();
    }
    
    public static ServicioOrdenacion getInstance(){
        if (instance == null)
            instance = new ServicioOrdenacion();
        return instance;
    }
```

```
ServicioOrdenacion servicio = ServicioOrdenacion.getInstance();
...
servicio.ordenarAltoProducto(productos);
...
servicio.ordenarAnchoProducto(productos);
...
servicio.ordenarLargoProducto(productos);

```
...
servicio.ordenarLargoProducto(productos);

```
