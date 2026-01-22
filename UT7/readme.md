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


