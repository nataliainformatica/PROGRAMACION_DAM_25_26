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

# Ejercicio 6 - (usando el ejercicio 4 - añadimos funcinalidades) 
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

# Ejercicio 9

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
