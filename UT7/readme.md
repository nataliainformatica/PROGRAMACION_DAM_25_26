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

# Ejercicio 6 - (usando el ejercicio 4 - añadimos funcionalidades) 
El objetivo de este ejercicio es desarrollar una aplicación que permita gestionar una lista de tareas utilizando una clase llamada TodoList.

La lista tiene una longitud máxima definida de 10 tareas, y las operaciones permitidas son añadir, modificar y listar tareas filtradas por una fecha específica.

A continuación, se detallan los requisitos:

Requisitos principales

Clase Tarea

Cada tarea estará representada por una clase Tarea con los siguientes atributos:

titulo: (String) el título de la tarea.

categoria: (enum) la categoría de la tarea, con valores como:

TRABAJO, ESTUDIO, PERSONAL, OTRO.

estado: (enum) el estado de la tarea, con valores como:

PENDIENTE, EN_PROGRESO, COMPLETADA, CANCELADA.

fecha: (LocalDate) la fecha asignada a la tarea.

hora: (LocalTime) la hora asignada a la tarea.

Clase TodoList

La clase TodoList debe manejar una lista de tareas de longitud fija (máximo 10).

Incluir los siguientes métodos:

añadirTarea(Tarea tarea)

Permite añadir una nueva tarea a la lista.

Restricción: No se debe añadir una tarea si ya existe otra con la misma fecha y hora.

Retornar un mensaje indicando si la tarea fue añadida correctamente o no.

modificarTarea(int index, Tarea tarea)

Permite modificar una tarea existente en una posición dada del array.

Validar que el índice esté dentro de los límites de la lista.

Restricción: Al modificar, la nueva fecha y hora no deben entrar en conflicto con otras tareas.

listarTareasPorFecha(LocalDate fecha)

Devuelve todas las tareas que coincidan con una fecha específica.

Clase Principal

Implementar un menú interactivo en la consola con las siguientes opciones:

Añadir tarea: Solicitar al usuario los datos de la tarea y añadirla a la lista.

Modificar tarea: Solicitar el índice de la tarea a modificar y los nuevos datos.

Listar tareas por fecha: Solicitar una fecha y mostrar las tareas correspondientes.

Salir: Finaliza el programa.

Restricciones adicionales

La lista de tareas debe tener un tamaño fijo de 10.

Manejar excepciones para entradas inválidas (por ejemplo, índices fuera de rango o conflictos de fecha y hora).

Mostrar mensajes claros al usuario cuando las operaciones no puedan realizarse (como lista llena o conflictos al añadir/modificar).

Ejemplo de flujo de la app

El usuario selecciona "Añadir tarea" e introduce:

Título: "Estudiar para examen"

Categoría: ESTUDIO

Estado: PENDIENTE

Fecha: 2025-01-20

Hora: 10:00

La tarea se añade correctamente.

El usuario intenta añadir otra tarea con la misma fecha y hora:

Mensaje: "No se puede añadir la tarea. Ya existe una tarea programada en esa fecha y hora."

El usuario selecciona "Listar tareas por fecha" y elige "2025-01-20":

Se muestra la tarea: "Estudiar para examen".

El usuario selecciona "Modificar tarea" y cambia la fecha y hora de la tarea.

Mensaje: "Tarea modificada correctamente."


# Ejercicio 7
EJERCICIO: Herencia básica en Java Tarjetas
Objetivo
Practicar:
•	herencia (extends)
•	uso de protected
•	sobrescritura de métodos
•	super
•	polimorfismo básico
________________________________________
   Clase padre : Tarjeta
•	Una tarjeta tiene número, titular y saldo.
•	El método pagar solo permite pagar si hay saldo suficiente.
•	Devuelve true si el pago se realiza, false si no.

```
public class Tarjeta {

    protected String numero;
    protected String titular;
    protected double saldo;

    public Tarjeta(String numero, String titular, double saldo) {
        this.numero = _____;
        this.titular = _____;
        this.saldo = _____;
    }

    public boolean pagar(double importe) {
        if (_____ >= _____) {
            _____ -= _____;
            return _____;
        }
        return _____;
    }

    public double getSaldo() {
        return _____;
    }

    @Override
    public String toString() {
        return "Tarjeta de " + _____ + " | Saldo: " + _____;
    }
}
```

**Tarjeta de Débito** 
Las tarjetas de débito cobran una comisión fija por cada pago.
Reglas:
•	Hereda de Tarjeta
•	Tiene una comisión fija (por ejemplo, 1 €)
•	Al pagar, se descuenta importe + comisión
•	Si no hay saldo suficiente para ambos, no se paga
```
public class TarjetaDebito extends Tarjeta {

    private double comision;

    public TarjetaDebito(String numero, String titular, double saldo, double comision) {
        super(_____, _____, _____);
        this.comision = _____;
    }

    @Override
    public boolean pagar(double importe) {
        double total = _____ + _____;

        if (_____ >= _____) {
            _____ -= _____;
            return _____;
        }
        return _____;
    }
}
```

**Tarjeta de Crédito**
 Permite pagar aunque el saldo sea insuficiente, hasta un límite.
Reglas:
•	Tiene un límite de crédito
•	El saldo puede quedar negativo
•	Si se supera el límite  el  pago será rechazado
```
public class TarjetaCredito extends Tarjeta {

    private double limiteCredito;

    public TarjetaCredito(String numero, String titular, double saldo, double limiteCredito) {
        super(_____, _____, _____);
        this.limiteCredito = _____;
    }

    @Override
    public boolean pagar(double importe) {
        if (_____ + _____ >= _____) {
            _____ -= _____;
            return _____;
        }
        return _____;
    }
}
```


**Cybertarjeta**
Tarjeta especial para compras online.
Reglas:
•	Tiene un límite por operación
•	Si el importe supera el límite, el  pago es  rechazado
•	Si no, usa el comportamiento normal de Tarjeta

```
public class Cybertarjeta extends Tarjeta {

    private double limiteOperacion;

    public Cybertarjeta(String numero, String titular, double saldo, double limiteOperacion) {
        super(_____, _____, _____);
        this.limiteOperacion = _____;
    }

    @Override
    public boolean pagar(double importe) {
        if (_____ > _____) {
            return _____;
        }
        return _____;
    }
}
```

# Ejercicio 8

Una plataforma de videojuegos permite a los usuarios valorar juegos con una puntuación del 1 al 5. 
Cada uno de los juegos tendrá como atributos, el título del juego, el total acumulado de las valoraciones del usuario

Para cada juego no se guardan las valoraciones individuales, solo: El total acumulado de puntos

El número de valoraciones recibidas 

El programa principal  debe tener métodos para mostrar: 

Las valoraciones medias

El número de valoraciones de cada juego

El juego mejor valorado

# Ejercicio 9 (Falta la solución, estará en los próximos días)

# 📌 Enunciado - Programación Orientada a Objetos (POO) en Java

![image](https://github.com/user-attachments/assets/b7bde352-fc7c-4f72-9a27-f990a376aea6)


## 🛠️ Modelado de Herramientas en Minecraft

Siguiendo los pilares y principios de la **Programación Orientada a Objetos (POO)**, implementa el modelo de clases en base a las siguientes especificaciones:

---

## 🔹 Clase `GestorHerramientas`
- Compuesto por una **lista estática** de herramientas. Inicialmente la lista está vacía. 
- Una vez creado el gestor, **no se podrá modificar la lista** salvo por los siguientes métodos:
  - `addHerramienta(Herramienta herramienta)`: Añade una herramienta a la lista.
  - `removeLastHerramienta()`: Elimina la última herramienta de la lista.

---

## 🔹 Clase `Herramienta`
Toda herramienta se caracteriza por:
- `nombre`: **String** → Representa el nombre de la herramienta.
- `durabilidad`: **int** → Indica cuánta resistencia tiene antes de romperse.

Para crear una herramienta es necesario especificar estas dos características.

**Reglas:**
- Una vez creada la herramienta, **no se podrá modificar su nombre**.
- **Sí se podrá modificar su durabilidad**.
- Se debe llevar la cuenta del número total de herramientas creadas. La clase deberá mantener un **contador estático** consultable en cualquier momento.

---

## 🔹 Tipos de Herramientas

### ⛏️ **Clase `Pico`**
- Además de las características básicas, un pico se define por su **material** (`String`).
- Todo pico **mina**, pero dependiendo del tipo de pico la forma de minar es diferente.
- Implementa el método `minar()`, que solo muestra un mensaje por consola.

#### **Subclases de Pico:**
- `PicoDiamante`: Al minar, muestra el mensaje →  
  _"Soy un pico de diamante y mino cualquier bloque"._
- `PicoHierro`: Al minar, muestra el mensaje →  
  _"Soy un pico de hierro y no puedo minar obsidiana"._

---

### 🪓 **Clase `Hacha`**
- Además de las características básicas, un hacha se define por su **eficiencia** (`float`).
- No requiere métodos adicionales, pero debe permitir su creación y modificación de eficiencia.

---

## 📌 Notas Adicionales:
- Implementa los principios de **encapsulación**, **herencia** y **polimorfismo** correctamente.
- Usa modificadores de acceso adecuados (`private`, `protected`, `public`).
- La estructura de clases debe permitir la extensión para agregar nuevos tipos de herramientas en el futuro.

## 🛠️ Modelado UML

![image](https://github.com/user-attachments/assets/384f5f40-2463-4df4-b752-a8cc7d915a55)

## Para realizar tus pruebas

```
    public static void main(String[] args) throws Exception {
        GestorHerramientas gestor = new GestorHerramientas();

        PicoDiamante pico1 = new PicoDiamante("Pico Pro", 250);
        PicoHierro pico2 = new PicoHierro("Pico Normal", 150);
        Hacha hacha1 = new Hacha("Hacha Rápida", 200, 1.5f);

        gestor.addHerramienta(pico1);
        gestor.addHerramienta(pico2);
        gestor.addHerramienta(hacha1);

        pico1.minar();
        pico2.minar();

        System.out.println("Total de herramientas creadas: " + Herramienta.getTotalHerramientas());

        System.out.println("*TODAS LAS HERRAMIENTAS:");
        System.out.println(gestor.pintaHerramientas());
    }
```

**Debes obtener esto por consola:**

```
Soy un pico de diamante y mino cualquier bloque.
Soy un pico de hierro y no puedo minar obsidiana.
Total de herramientas creadas: 3

*TODAS LAS HERRAMIENTAS:
[
Herramienta [nombre=Pico Pro, durabilidad=250]
Pico [material=Diamante], 
Herramienta [nombre=Pico Normal, durabilidad=150]
Pico [material=Hierro], 
Herramienta [nombre=Hacha Rápida, durabilidad=200]
Hacha [eficiencia=1.5]]
```
___

<img width="472" height="133" alt="image" src="https://github.com/user-attachments/assets/87ada4af-547d-4799-abe8-a36925d79e49" />


# Ejercicio 10 (La solución aparece como Ejercicio9, hasta que lo modifique)


Queremos modelar deportes de los Juegos Olímpicos de Invierno.

1. Crea una CLASE base abstracta **DeporteInvierno** con:

**constructor**
```
public DeporteInvierno(String nombre, int numParticipantes) {
```

**atributos:**

nombre

numParticipantes

**método abstracto:**

double calcularPuntuacion()

**método normal:**

mostrarInfo()

2. Crea dos clases hijas: PatinajeArtistico y EsquiAlpino

CLASE **PatinajeArtistico**

**atributos:**

dificultad (1–10)

ejecucion (1–10)
**constructor**
```
public PatinajeArtistico(String nombre, int numParticipantes,
                             double dificultad, double ejecucion) {
```

**Implementación del método abstracto:**

La puntuación será:
dificultad * 0.6 + ejecucion * 0.4

CLASE **EsquiAlpino**

**atributos:**

tiempoSegundos

penalizaciones

**constructor**
```
public EsquiAlpino(String nombre, int numParticipantes,
                       double tiempoSegundos, int penalizaciones) {
```
                       
                       
**Implementación del método abstracto:**

La puntuación será:
100 - tiempoSegundos - (penalizaciones * 5)

3. CLASE **Principal**

Crea varios deportes. (no hace falta pedir los datos por consola) 

Guárdalos en un ArrayList<DeporteInvierno>.

Recorre la lista y muestra la puntuación usando polimorfismo.

## SEGUNDA PARTE del EJERCICIO 10
Usaremos la interfaz **Evaluable**

```
public interface Evaluable {
    double calcularPuntuacion();
}
```

Clase **Jugador**
Tiene el nombre del jugador
Tiene una lista de deportes de invierno en los que participa.

**constructor**
```
public Jugador(String nombre, ArrayList<DeporteInvierno> deportes) {
        this.nombre = nombre;
        this.deportes = deportes;
    }
```
Y el método mostrarInfo()

Implementa Evaluable de forma que la puntuación total del jugador será la suma de las puntuaciones de los deportes.

Clase **EquipoRelevo**

Tiene una lista de jugadores.

**constructor**
```
    public EquipoRelevo(String nombreEquipo, ArrayList<Jugador> jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
    }
```
Y el método mostrarInfo()

Implementa Evaluable

La puntuación total del equipo será la suma de las puntuaciones de todos sus jugadores.

Probaremos las clases creadas usando el siguiente código en la clase Principal
```
package es.avellaneda.principal;

import java.util.ArrayList;
import es.avellaneda.modelo.*;


public class OlimpiadasApp {

    public static void main(String[] args) {

        // Crear deportes
        PatinajeArtistico pa1 = new PatinajeArtistico("Patinaje femenino", 10, 9.5, 9.0);
        PatinajeArtistico pa2 = new PatinajeArtistico("Patinaje parejas", 6, 8.8, 9.2);
        EsquiAlpino ea1 = new EsquiAlpino("Descenso masculino", 30, 82.3, 1);
        EsquiAlpino ea2 = new EsquiAlpino("Supergigante femenino", 25, 75.5, 0);

        ArrayList<DeporteInvierno> deport = new ArrayList<>();
        deport.add(pa1);
        deport.add(ea1);
        ArrayList<DeporteInvierno> deport2 = new ArrayList<>();
        deport2.add(pa2);
        deport2.add(ea2);
        // Crear jugadores
        Jugador j1 = new Jugador("Juan Pérez", deport);
        Jugador j2 = new Jugador("Ana López", deport2);

        ArrayList<Jugador> jugad = new ArrayList<>();
        jugad.add(j1);
        jugad.add(j2);
        // Crear equipos
        EquipoRelevo equipo1 = new EquipoRelevo("Equipo A", jugad);

        // Lista polimórfica
        ArrayList<Evaluable> evaluables = new ArrayList<>();
        evaluables.add(j1);
        evaluables.add(j2);
        evaluables.add(equipo1);

        // Mostrar ranking
        System.out.println(" Ranking General ");
        int puesto = 1;
        for (Evaluable e : evaluables) {
            System.out.println("Puesto #" + puesto++);
            if (e instanceof Jugador j) {
                j.mostrarInfo();
            } else if (e instanceof EquipoRelevo eq) {
                eq.mostrarInfo();
            }
            System.out.println("Puntuación total: " + e.calcularPuntuacion());
            System.out.println("--------------------------");
        }
    }
}
```

# EJERCICIO 11 (CONTINÚA EL EJERCICIO DEL TEMA 6)

Define la clase Sala con los siguientes atributos

id (tipo int).
nombre (nombre de la sala, tipo String).
capacidad (número máximo de personas, tipo int).
disponible (indica si la sala está disponible, tipo boolean).
propietario(indica el número de empleado que hace la reserva)


Escribe el constructor para inicializar los atributos, sabiendo que la sala está libre en el momento de crearla (disponible = true)  y no tiene propietario (propietario =””). 

Completa el método  reservarSala ,que recibe como parámetro el número de empleado del propietario,  devolverá true, si la sala estaba libre y se ha podido  reservar (disponible = false).

Completa el método  liberarSala , que recibe como parámetro el código del propietario,  devolverá true, si la sala estaba ocupada  por el empleado que recibe como parámetro y se ha podido  liberar (disponible = true, propietario =””).

Completa el método  mostrarInformacion que devuelve un String  los detalles de la sala.

Completa  getters y setters,  solamente los métodos necesarios, sabiendo que una vez creada la sala no es posible cambiar su capacidad ,  nombre o identificador.

## CONTINUACIÓN

Crea una clase SalaConEquipamiento que herede de Sala y añada:

Atributo equipos (lista de equipos extra (String) que se piden con la sala). Los equipos se piden al reservar la sala, cuando se crea no tiene equipos extra..

Método mostrarEquipos para listar los equipos de la sala (si no tiene equipos no se mostrará ninguno)

Método mostrarInformacion que imprima los detalles de la sala, incluyendo los equipos (si no tiene  equipos no mostrará ninguno)

Sobrecarga el método reservarSala, de forma que recibirá el array de equipos pedidos.

Clase **PRINCIPAL** 

Crear una instancia de SalaConEquipamiento.

Muestra la información de la sala. 

Realiza la reserva  pidiendo {“mesas”,”sillas”,”equipo multimedia”}. 

Muestra la información de la sala

# Ejercicio 12
Sistema de Gestión de Vehículos y Cálculo de Tarifas de Parking

Vas a desarrollar un sistema en Java que permita gestionar distintos tipos de vehículos y calcular tanto su coste de mantenimiento como el precio por hora en un parking, siguiendo criterios similares a los que utilizan los ayuntamientos (como antigüedad, tipo de motor, descuentos para vehículos eléctricos, etc.).

Para resolver el ejercicio deberás utilizar:

Herencia

Clases abstractas

Interfaces

Polimorfismo

Colecciones (ArrayList)

Clase abstracta Vehiculo

Representa un vehículo genérico del sistema.  
```
String marca
String modelo
String identificador // que será la matrícula en el caso de coches y un identificador en el caso de las bicicletas
int anioFabricacion
double peso // en kilogramos


Métodos

Constructor para inicializar todos los atributos.

Método concreto:
```
String mostrarInformacion()

//Devuelve una cadena con la información básica del vehículo (marca, modelo, matrícula, año de fabricación y peso).
```

Métodos abstractos (deben ser implementados por las subclases):
```
double calcularCostoMantenimiento()

//Calcula el coste estimado de mantenimiento del vehículo.

double calcularPrecioHora()

// Calcula el precio por hora del vehículo en el parking.
```

###Interfaz Electrico

Define el comportamiento de los vehículos eléctricos.
```
double calcularCostoCarga() // Calcula el coste de una carga completa de batería.

double autonomia() // Devuelve la autonomía estimada del vehículo en kilómetros.

```

###Interfaz Tarificable

Esta interfaz representa cualquier vehículo que tenga una tarifa en el parking.
```
double calcularPrecioHora() // Devuelve el precio por hora en el parking.
```

La clase Vehiculo deberá implementar esta interfaz, obligando a todas las subclases a definir su tarifa.

####Subclases que heredan de Vehiculo
*a) Clase Automovil*

Representa un automóvil convencional o híbrido.

Atributos adicionales
```
int numeroPuertas
boolean esHibrido
double capacidadCombustible // en litros
```

Implementación de calcularCostoMantenimiento()

El coste base se calcula como:

(peso * 0.05) + (capacidadCombustible * 0.1)

Si el automóvil es híbrido: 

reducir el coste total en un 10%
Implementación de calcularPrecioHora()

Precio base:

2 euros por hora

Calcular la antigüedad del vehículo:

antiguedad = añoActual - anioFabricacion

Aplicar las siguientes reglas:

Si tiene más de 10 años, aumentar el precio un 20%.

Si es híbrido, aplicar un descuento del 15%.

*b) Clase BicicletaElectrica*

Hereda de Vehiculo e implementa la interfaz Electrico.
```
Atributos adicionales
double capacidadBateria // en kWh
double consumoPorKm // kWh/km
```

Implementación de calcularCostoMantenimiento()

El coste base se calcula como:

peso * 0.02

Además se añade:

15 euros por mantenimiento de batería

Implementación de calcularPrecioHora()

Las bicicletas eléctricas tienen parking gratuito.El método deberá devolver: 0

Implementación de los métodos de Electrico

Coste de carga

capacidadBateria * 0.20

(Se considera un precio de electricidad de 0.20 €/kWh).

Autonomía

autonomia = capacidadBateria / consumoPorKm

Devuelve la autonomía estimada en kilómetros.

###Clase Parking

Gestiona los vehículos estacionados.

Atributos
```
ArrayList<Vehiculo> vehiculosEstacionados
```

*Métodos*

Agregar vehículo      void agregarVehiculo(Vehiculo vehiculo) // Añade un vehículo al parking.

Mostrar tarifas    void mostrarTarifas() // Recorre la lista de vehículos y muestra el precio por hora de cada uno, utilizando polimorfismo.

Calcular recaudación total       double calcularRecaudacionTotal() // Suma el precio por hora de todos los vehículos estacionados.

Para simplificar el ejercicio, no se tienen en cuenta las horas reales de estancia.

Mostrar vehículos  void mostrarVehiculosElectricos() // Recorre la lista de vehículos y muestra únicamente aquellos que implementen la interfaz Electrico.

### Clase Main

Debe contener el programa principal, para hacer las pruebas de las distintas clases creadas. 

Crear varias instancias de:

Automovil

BicicletaElectrica

Crear un objeto Parking.

Agregar los vehículos al parking.

Mostrar para cada vehículo:

Información del vehículo

Coste de mantenimiento

Precio por hora en el parking

Mostrar la recaudación total del parking.


