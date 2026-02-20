
<img width="454" height="117" alt="image" src="https://github.com/user-attachments/assets/50498a43-d1df-4231-b431-44f5084eaf24" />

El Nordic Combined (en español, combinada nórdica) es un deporte de invierno que combina dos disciplinas del esquí:
1.	Salto de esquí
2.	Esquí de fondo (cross-country)
Es una prueba muy exigente porque mezcla potencia y técnica aérea con resistencia física.
¿Cómo funciona la competición?
Primero, los atletas realizan un salto de esquí desde un trampolín.
Se puntúa según:
•	Distancia del salto
•	Estilo en el aire y aterrizaje
Después compiten en una carrera de esquí de fondo.
Los resultados del salto determinan el orden de salida en la carrera:
•	El que mejor saltó sale primero.
•	Los demás salen con retraso según su puntuación.
El primero en cruzar la meta en la carrera de fondo gana.
En la prueba de Juegos Olímpicos de Invierno, la combinada nórdica utiliza el método llamado Gundersen para calcular los retrasos en la carrera de esquí de fondo.
¿Cómo se calculan los retrasos?
1.	Cada atleta obtiene una puntuación en el salto de esquí.
2.	El atleta con mayor puntuación sale primero en la carrera de fondo.
3.	La diferencia de puntos entre cada atleta y el líder se convierte en segundos de retraso.
Regla básica de conversión
Normalmente:
•	1 punto de diferencia = 1.5 segundos de retraso
```
diferencia = puntosLider - puntosAtleta
retraso = Math.round(diferencia * 1.5) // en segundos
 ```` 

Tu tarea es hacer un programa, que tendrá la lista de atletas inscritos (clase Atleta)  en la carrera  que ya han recibido la puntuación del salto de esquí en trampolín, también tiene un atributo con la hora de salida de la carrera de esquí de fondo. 
La clase Atleta debe tener los atributos: 
•	String nombre
•	double puntuacionSalto
•	LocalTime horaComienzo

Para la lista de atletas inscritos, crea una clase DAOatletas, que devolverá una lista con estos datos: 
```
Johansen      128.5
Frenzel       130.0
Lamparter     125.0
Rehrl         129.0
```

El programa, tendrá un método que: 

Teniendo en cuenta la puntuación más alta,  debe calcular el retraso de cada atleta, y actualizar su hora de salida. 
Devolverá lista con la parrilla de salida, ordenada por tiempo/hora  de salida.
Si hay un empate, el método no podrá calcular la parrilla de salida, y devolverá una excepción controlada (Exception).  

A continuación se muestran capturas de muestra del posible funcionamiento del programa: 
``` 
*** DATOS DE PRUEBA**
Johansen   128.5
Frenzel    130.0
Lamparter  125.0
Rehrl      129.0

```

========================================
  JUEGOS DE INVIERNO- NORDIC COMBINED
  Método Gundersen - Cálculo de Salidas
========================================

Cargando atletas desde DAOatletas...
OK - 4 atletas cargados correctamente.

Hora base de salida: 15:00:00

Calculando puntuación máxima...

Puntuación líder detectada: 130.0 (Frenzel)

Calculando retrasos:

Johansen:
  Diferencia = 130.0 - 128.5 = 1.5
  Retraso = Math.round(1.5 * 1.5) = 2 segundos

Frenzel:
  Diferencia = 0
  Retraso = 0 segundos

Lamparter:
  Diferencia = 130.0 - 125.0 = 5.0
  Retraso = Math.round(5.0 * 1.5) = 8 segundos

Rehrl:
  Diferencia = 130.0 - 129.0 = 1.0
  Retraso = Math.round(1.0 * 1.5) = 2 segundos


           **PARRILLA DE SALIDA**

1. Frenzel     | 130.0 pts | 15:00:00
2. Johansen    | 128.5 pts | 15:00:02
3. Rehrl       | 129.0 pts | 15:00:02
4. Lamparter   | 125.0 pts | 15:00:08

¡Listos para la carrera de fondo!


**Observa que**: Johansen y Rehrl salen a la misma hora, pero no es empate en puntuación máxima , es el mismo retraso aplicado, el programa funciona correctamente.
CAPTURA DEL POSIBLE CASO DE EMPATE – CAPTURA DE LA EXCEPCIÓN
```
****DATOS DE PRUEBA
Johansen   130.0
Frenzel    130.0
Lamparter  125.0
Rehrl      129.0
```

Calculando puntuación máxima...

ERROR: Existe empate en la puntuación máxima (130.0)

No es posible calcular la parrilla de salida.
Se requiere desempate según normativa oficial.

Programa finalizado.




## Ejercicio 1: Propagación de excepción con throws
Crear una clase que simule una operación bancaria en la que se intenta realizar un retiro de dinero
de una cuenta. Si el saldo es insuficiente, se debe lanzar una excepción que se propaga.


## Ejercicio 2: Propagación de excepciones en múltiples niveles
Simular un proceso de compra en una tienda, donde diferentes métodos podrían lanzar excepciones
y estas se propagan hasta el método main.

## Ejercicio 3: Uso de excepciones en una jerarquía de clases
Crear una jerarquía de clases para gestionar una empresa con trabajadores y excepciones
relacionadas con salarios.

## Ejercicio 4: Propagación de excepciones entre clases
Crear una clase Cajero que realice una operación de pago y que propague excepciones si los datos
ingresados no son correctos.

## Ejercicio 5: Excepciones personalizadas con try-catch y finally
Crear una clase para manejar un sistema de inventarios con excepciones personalizadas. Al final de
cada operación, imprimir un mensaje de cierre con el bloque finally.

# Ejercicios para trabajar con excepciones propias checked (comprobadas)

## Ejercicio 6: PhoneNumberAlreadyExistsException 

### Versión 1
1. Descarga los fuente iniciales que están en Git.
   Dispones de la clase principal RegisterClientApp, en la que haremos las pruebas registrando un cliente con la clase PhoneNumberRegisterService (que deberás completar). 
3. Crea la excepción PhoneNumberAlreadyExistsException en el paquete es.daw.poo2.exceptions.
4. En el método **validatePhone** de la clase PhoneNumberRegisterService implementa el código para comprobar si el número existe en la lista de números proporcionados. Observa cómo se crea el List.

**NUEVO:** método contains de ArrayList, para comprobar si existe el número. 

5. Cuando dicha lista contenga el número recibido como argumento, debe crear, lanzar y propagar la excepción con el mensaje "El número de teléfono XXXXX está en uso por otro cliente!"
6. En la clase principal haz la prueba con varios números de teléfono, uno que no esté repetido y otro que lo esté ("+34 222 222 222", "+34 111 111 113")
7. Implementa en la clase PhoneNumberRegisterService la funcionalidad que permite consultar la lista de números de teléfono.
8. Desde la clase RegisterClientApp prueba a recorrer la lista de teléfonos y mostrándolos por pantalla.
   

Deberás obtener algo similar a esto:

<img width="635" alt="image" src="https://github.com/user-attachments/assets/ee5ba4a8-0741-45e3-b157-fc2dff7f97e4" />



### Versión 2: trabajando con objetos cliente
Vamos a ampliar el ejercicio anterior.

Para ello vamos a crear la **clase Client** (es.daw.poo2.model) en base al siguiente **ClientDAO** que debes crear en el paquete es.daw.poo2.dao:

```
package es.daw.poo2.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import es.daw.poo2.model.Client;

public class ClientDAO {
    private ArrayList<Client> clients;

    public ClientDAO() {
        clients = new ArrayList<>();
        clients.add(new Client("2A", "Cliente2", "+34 111 111 112",LocalDate.parse("2024-02-28")));
        clients.add(new Client("1A", "Cliente1", LocalDate.parse("2024-02-27")));
        clients.add(new Client("3A", "Cliente3", "+34 111 111 113",LocalDate.parse("2024-02-29")));
        clients.add(new Client("4B", "Cliente4", "+34 111 111 114",LocalDate.parse("2024-02-29")));
    }

    public ArrayList<Client> select(){
        //return (ArrayList<Cliente>)clientes.clone();
        return new ArrayList<>(clients);
    }
    
}

```

Debes tener en cuenta que para dar de alta un cliente se puede hacer de dos formas:
- Con el código, nombre, número de teléfono y fecha de registro.
- Con el código, nombre y fecha de registro

En el caso de que un cliente se de de alta sin número de teléfono deberá indicarse "WITHOUT_PHONE" en dicho atributo.

Solo el número de teléfono podrá modificarse una vez creado el cliente en el sistema.

En el método **validatePhone** de la clase PhoneNumberRegisterService implementa el código para comprobar si el número existe un cliente con un teléfono en cuestión. La firma del método será:

```
public void validatePhone(ArrayList<Client> clients, String phoneNumber) throws PhoneNumberAlreadyExistsException
```

# EJERCICIO 7: Nos piden hacer que gestionemos una serie de productos.

Los productos tienen los siguientes atributos:

- Nombre
- Precio

Tenemos dos tipos de productos:

- *Perecedero:* tiene un atributo llamado días a caducar
- *No perecedero:* tiene un atributo llamado tipo con solo uno de estos dos valores ("Sin devolución", "Permite devolución");

Crea sus constructores, getters, setters y toString.

## Función calcular
Tendremos una función llamada *calcular*, que según cada clase hará una cosa u otra, a esta función le pasaremos un entero, siendo este parámetro la cantidad de productos.

En **No perecedero**, simplemente seria multiplicar el precio por la cantidad de productos pasados.

En **Perecedero**, aparte de lo que hace producto, el precio se reducirá según los días a caducar:

- Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
- Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
- Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.

En **NoPerecedero**, hace lo mismo que en producto.

## Pruebas: 

Crea una clase ejecutable y crea un array de productos y muestra el precio total de vender 5  productos de cada uno. Crea tú mismo los elementos del array.

## Pregunta: ¿Utilizarías una clase abstracta? Razona la respuesta

## NUEVOS REQUISITOS

### REQUISITO 1
Debemos ampliar el programa anterior de tal forma que se podrá consultar si el producto tiene devolución (true o false), siguiendo el siguiente criterio.

- Si son **perecederos** solo pueden devolverse cuando le queda más de 5 días para caducar.
- Si **no son perecederos** solo pueden devolverse en el caso de que el tipo sea "Permite devolución".



#### Pregunta: ¿Utilizarías una clase abstracta? ¿Qué método sería abstracto? Razona la respuesta


### REQUISITO 2
Todos los productos, al igual que todos los clientes y proveedores (producto, cliente y proveedor son clases del programa de gestión de la tienda) deben poder exportarse a formato XML.

Para ello cada producto debe tener implementado el método **convert2XML()**

Este método devuelve un String con el formato del xml de cada objeto.

El xml en el que se convierten los productos, clientes y proveedores son diferentes.

#### Ejemplos de String devuelto por cada clase:

##### XML de productos

&lt;producto&gt;bla bla bla&lt;producto&gt;
  
##### XML de clientes
&lt;cliente&gt;bla bla bla&lt;cliente&gt;
  
##### XML de proveedores
&lt;proveedor&gt;bla bla bla&lt;proveedor&gt;

#### Pregunta: ¿Utilizarías una interface? Razona tu respuesta

No se pide programar las clases Cliente, Proveedor..... pero sí la interface y su implementación en la clase Producto.

## ORDENACIÓN

### Ordenación natural: interfaz Comparable

Ahora queremos establecer el criterio natural de ordenación de todos los productos.

Los productos se ordenarán de forma natural por el precio (siempre por defecto ascendente).

Con el uso de la interface **Comparable** implementa dicha funcionalidad y muestra los productos ordenados.

### Otras ordenaciones: interfaz Comparator (para la tercera evaluación)

Necesitamos generar un informe de los productos ordenados por nombre de forma descendente.

Con el uso de la interface **Comparator** implementa dicha funcionalidad y muestra los productos ordenados por nombre de forma descendente.

## Ejercicio 8
Escribe Un programa en Java que:

Pide un día de la semana al usuario. Ésta funcionalidad deberás completarla en un método aparte,  en el caso de que el valor introducido no sea un valor válido (LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES), el método propagará la excepción. 

public DiaSemana introducirDia(){...}

Calcula cuántas veces aparece ese día en en mes. Esta funcionalidad también se realizará en un método aparte.  Trabajaremos las siguientes clases:

LocalDate
   LocalDate.now()
   
   LocalDate.getYear()
   
   LocalDate.getMonth()
   
   LocalDate.getDayofWeek()
   
YearMonth
   YearMonth.of(mes, anño)
   
   YearMonth.lengthOfMonth
   
   YearMonth.atDay(index)
   

   public int calcularNumero(DiaSemana, int mes, int anio){....}

Completa una función que recibiendo el día de la semana, devolverá  el número de días que tiene el mes de la fecha actual. Si el mes tiene más de 4 días del día de la semana facilitado (por ejemplo, abril tiene 5 martes), el método creará una excepción MesLargoException, que capturará el mes y dia de la semana, la lanzará y la propagará. 

La excepción MesLargoException extiende de RunTimeException. 

Completa la clase Principal y haz algunas pruebas para comprobar si has escrito bien el código. 

## Ejercicio 9

Nuestro objetivo es realizar la aplicación para la gestión de las citas 
(las citas de un solo día) de un centro de salud.  
Para ello dispondremos de una clase **GestionCentro**  que implementará **Gestionable** 

(esta interface se proporciona en la plantilla del proyecto).

public interface Gestionable {
    public ArrayList<ConsultaMedica> devolverListaConsultasMedico();
    
    public ArrayList<ConsultaMedica> devolverConsultasMedicoOrdenadas();
    
    public String mostrarDetallesConsultaMedica(String numHistorial);
    
    public String imprimirTicket(String numHistorial);
    
    public ArrayList<ConsultaMedica> buscarCitas(Paciente paciente);
    
    public Analisis buscarAnalisis(String numHistorial) throws HistorialNoEncontrado; 
    


Se debe tener en cuenta que las citas del centro pueden ser de dos tipos,  **ConsultaMedica** o  **Analisis**. 

Se entrega junto con la plantilla una clase **DAO_citas**,  con los datos de prueba de las citas de una  fecha  concreta que se deben gestionar. 
La clase **GestionCentro** recibe en el momento de crearse, las citas de ese día.  

**IMPORTANTE**: esta clase DAO no se puede modificar.  

La cita de consulta médica debe tener los siguientes atributos, todos ellos imprescindibles para poder crear esta cita. 

**ConsultaMedica**

    private Paciente paciente; ( no es necesario encapsular  este atributo)
    
    private String sala; 
    
    private String resultadoCita;
    
    private LocalDateTime horaCita; // este atributo define el orden natural
    

La cita de **Analisis** tendrá los siguientes atributos, todos ellos imprescindibles para poder crear esta cita Analisis

   private String numHistorial;
   
    private String tipo;
    
    private LocalDateTime horaAnalisis;
    

La clase **Paciente** debe tener los siguientes atributos, todos imprescindibles para poder crear el paciente. 

    private String numHistorial;
    
    private String nombreApellidos;
    
    private int edad;
    

**ConsultaMedica**  y **Analisis** deberán implementar la interface **Citable**(que se entrega en la plantilla del proyecto): 


public interface Citable {
    public String consultarDetalle();
    // devolverá el número de historial y la hora de cita 
}


Completa las clases anteriores, incluyendo el **TestMain**,  con el código necesario para conseguir el comportamiento de **GestionCentro** con los métodos que se describen a continuación:

1.	    public ArrayList<ConsultaMedica> devolverListaConsultasMedico(); 

Devuelve una colección con las todas las consultas médicas que tiene programadas el centro de salud. 
EJEMPLO:” MOSTRAR TODAS LAS CONSULTAS MÉDICAS “

```
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A1, resultadoCita=pendiente confirmar, horaCita=2022-10-02T08:00}
Consulta Médica{
Paciente{numHistorial=NH000002, nombreApellidos=nombreapellidos2, edad=30}
, sala=A1, resultadoCita=pendiente confirmar, horaCita=2022-10-02T10:00}
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A3, resultadoCita=pendiente confirmar, horaCita=2022-10-02T09:00}
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A4, resultadoCita=pendiente confirmar, horaCita=2022-10-02T11:00}
```

2.	    public ArrayList<ConsultaMedica> devolverConsultasMedicoOrdenadas();


Devuelve una colección con todas las consultas médicas ordenadas por la hora de la cita. 
```
Ejemplo:”MOSTRAR TODAS LAS CONSULTAS MÉDICAS ORDENADAS”
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A1, resultadoCita=pendiente confirmar, horaCita=2022-10-02T08:00}
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A3, resultadoCita=pendiente confirmar, horaCita=2022-10-02T09:00}
Consulta Médica{
Paciente{numHistorial=NH000002, nombreApellidos=nombreapellidos2, edad=30}
, sala=A1, resultadoCita=pendiente confirmar, horaCita=2022-10-02T10:00}
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A4, resultadoCita=pendiente confirmar, horaCita=2022-10-02T11:00}


```

3.	    public String mostrarDetallesConsultaMedica(String numHistorial);


Devuelve los detalles de todas las ConsultaMedica que tenga concertadas el paciente con el número de historial que recibe.  Si el número de historial no existe devolverá “EL NÚMERO DE HISTORIAL NO EXISTE”.

```
Ejemplo “MOSTRAR TODAS LOS DETALLES DE LAS CONSULTAS MÉDICAS  DEL PACIENTE CON NÚMERO DE HISTORIAL NH000001 “
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A1, resultadoCita=pendiente confirmar, horaCita=2022-10-02T08:00}Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A3, resultadoCita=pendiente confirmar, horaCita=2022-10-02T09:00}Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A4, resultadoCita=pendiente confirmar, horaCita=2022-10-02T11:00}

```
TRAZA DEL EJEMPLO:  
```

Ejemplo: “MOSTRAR TODAS LOS DETALLES DE LAS CONSULTAS MÉDICAS  DEL PACIENTE CON NÚMERO DE HISTORIAL NH000025 “
EL NÚMERO DE HISTORIAL NH000025 NO EXISTE

```

4.	    public String imprimirTicket(String numHistorial);


Devuelve una cadena de texto con los detalles de todas las citas con ese número de historial.  Si el número de historial no existe,  devolverá “EL NÚMERO DE HISTORIAL NO EXISTE”.


Se entrega en la plantilla del proyecto el paquete utilidades, que te facilitará la labor de convertir la fecha y hora de la cita para mostrarla.

```
Ejemplo  "IMPRIMIR TICKET DE CITA" 
IMPRIMIR TICKET DE CITA
PACIENTE NH000001
CONSULTA MEDICA  EN SALA A1
CITADO 02/10/2022 08:00:00

PACIENTE NH000001
CITADO 02/10/2022 09:00:00

PACIENTE NH000001
CONSULTA MEDICA  EN SALA A3
CITADO 02/10/2022 09:00:00
PACIENTE NH000001
CONSULTA MEDICA  EN SALA A4
CITADO 02/10/2022 11:00:00

```

5.	public ArrayList<ConsultaMedica> buscarCitas(Paciente paciente);

Devolverá una colección con todas las consultas médicas que tenga ese paciente (importante, deben coincidir el número de historial y nombre y apellidos del paciente  y la edad). 

```
Ejemplo “MOSTRAR CITAS DE UN PACIENTE CON NÚMERO DE HISTORIAL NH000001 Y  nombreapellidos1 Y EDAD 21 AÑOS”
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A1, resultadoCita=pendiente confirmar, horaCita=2022-10-02T08:00}
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A3, resultadoCita=pendiente confirmar, horaCita=2022-10-02T09:00}
Consulta Médica{
Paciente{numHistorial=NH000001, nombreApellidos=nombreapellidos1, edad=21}
, sala=A4, resultadoCita=pendiente confirmar, horaCita=2022-10-02T11:00}
```

6.	   public Analisis buscarAnalisis(String numHistorial) throws HistorialNoEncontrado; 


Devolverá la cita de Analisis que corresponda a ese número de historial (si hubiese más, devuelve la primera que encuentra).  Si no se encuentra ese número de historial, deberá lanzar una excepción del tipo controlada HistorialNoEncontrado , capturando el número de  historial y la hora de búsqueda del mismo. El mensaje de la excepción será: “Número de Historial xxxxxx NO ENCONTRADO”

```

Ejemplo” MOSTRAR CITA DE ANÁLISIS PARA EL NÚMERO DE HISTORIAL  NH000001”
Analisis{numHistorial=NH000001, tipo=, horaAnalisis=2022-10-02T09:00}
Ejemplo: “MOSTRAR CITA DE ANÁLISIS PARA EL NÚMERO DE HISTORIAL  NH0000025”
Numero Historial   NH0000025 NO ENCONTRADO
```


7.	Completa TestMain para mostrar el resultado de cada uno de los métodos de comportamiento de GestionCentro. 

# Ejercicio 10 - Lanzar excepciones desde el constructor

Realizar un programa para gestionar una tienda mediante un menú interactivo. La tienda permitirá dar de alta productos, que serán almacenados en una colección de tipo ArrayList.

El programa tendrá dos clases principales:

Clase **Producto**:

No podrá instanciarse si el nombre está vacío o si el precio es menor o igual a cero. En estos casos, lanzará una excepción con distintos mensajes según el error detectado.
```
"El nombre del producto no puede estar vacío"
"El precio  del producto no puede ser cero"
```


Incluirá una funcionalidad para aplicar un descuento. Si el precio final después del descuento es inferior a 5 euros, se lanzará una excepción propia que capturará los detalles del producto en ese momento, garantizando la encapsulación mediante una copia del objeto.

Clase **Tienda**:

Gestionará los productos mediante un ArrayList.

Tendrá  al menos las siguientes funcionalidades para:

Añadir un producto a la lista.

Eliminar un producto de la lista.

Aplicar un descuento a un producto específico.

Mantener una colección de productos cuyo precio final tras aplicar el descuento sea inferior a 5 euros.

Puedes crear además cualquier otro método o funcionalidad que creas necesaria para el desarrollo del ejercicio. 

El programa permitirá al usuario interactuar con estas funcionalidades mediante un menú en consola.

En la clase Principal, habrá un menú, que  tendrá la instancia de Tienda, y mediante un menú el usuario podrá gestionar las opciones de la tienda:

```
1. Introducir producto (... completa el resto del menú para introducir los datos... )
2. Eleminar producto
3. Mostrar los productos que tiene la tienda
4. Mostrar productos rebajados con precio inferior a 5 euros
5. SALIR

