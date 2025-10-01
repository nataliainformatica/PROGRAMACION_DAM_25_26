# Ejercicio 1

Enunciado : **Calculadora de consumo de gasolina**

Una gasolinera quiere implementar un programa sencillo en Java que permita calcular el consumo y el coste de un viaje en coche.

El programa debe:

## Pedir por consola al usuario:
  El nombre del usuario

  La distancia del viaje (en kilómetros).

  El consumo medio del coche (en litros por cada 100 km).

  El precio del litro de gasolina.

## Uso de  y constantes:

Usa una constante para el número de kilómetros de referencia: KM_POR_100 = 100.

Usa los tipos adecuados a cada variable  (int, double, float, etc.) para guardar los datos necesarios.

## Calcular:

Los litros necesarios para realizar el viaje.

El coste total del viaje.

 **conversión implícita**  En el cálculo, deja que Java convierta automáticamente un int a double o float si es necesario.

Deberás usar operadores como la multiplicación y división para obtener el consumo y el coste.

Muestra los  resultados personalizados para el ususario usando printf para dar formato de la siguiente forma: 

Los litros necesarios con 2 decimales.

El coste total con 2 decimales y el símbolo €.

# Ejercicio 2

__Comparador de peso de maletas__

Deberás escribir un pequeño  programa de facturación de equipaje en un aeropuerto que debe comprobar si una maleta cumple con el peso máximo permitido.

El peso máximo permitido es  = 23.2 (en kg).

Entrada de datos:
Pide al usuario su  código de billete (puede contener letras y números)
Pide al usuario el peso de su maleta (puede tener decimales).

El probrama calculará :

El peso  aproximado en kilos (entero - usando conversión explícita).

Evalúa, usando  operadores relacionales, si el peso de la maleta:

Es igual al máximo.

Es menor al máximo.

Es mayor al máximo.

```
Introduce el peso de tu maleta (kg): 24.7

Ejemplo de funcionamiento del programa
Matela para embarque con código: A3204
Peso real: 24.70 kg
Peso aproximado (entero): 24 kg
¿Es igual al máximo? false
¿Es menor al máximo? false
¿Es mayor al máximo? true
```

# Ejercicio 3

__Calculadora de turnos de lavado de coches__ 

Una estación de servicio organiza el lavado de coches en turnos.

Cada coche recibe un número de turno (entero).

Se quiere determinar a qué pista de lavado le corresponde el coche, según su turno.

La pista se calcula con la operación:

pista = turno % NUM_PISTAS

Teniendo en cuenta que el lavado tiene 3 pistas.

Además, cada pista tiene un código de letra asociado:

0 → 'A'

1 → 'B'

2 → 'C'
(puedes calcular el carácter sumando 'A' + pista).

El programa debe pedir al usuario el número de turno (que puede empezar por 0) , calculará la pista y se la mostrará al usuario con su letra.

```
Introduce tu número de turno: 7

Número de pistas: 3
Tu turno es: 7
Te corresponde la pista número: 1
Identificada con la letra: B

```
# Ejercicio 4
__Comparador de edades__ 

Un programa debe ayudar a un cine a verificar si una persona puede entrar a ver una película para mayores de 18 años.
El precio de la entrada es único y son 7 €. (__CONSTANTE__)

Se necesitan conocer los siguientes datos: 

  - edad del usuario como **String** (no directamente como número).

Realiza la comparación (usando operadores relacionales) para:

Verificar si la edad es mayor o igual que 18. Usa esta conversión para mostrar el resultado en un mensaje.

Conversión implícita:

Usa un int en una operación con un double (ej. añadir un “decimal simbólico” al precio de la entrada).

Salida: muestra si la persona es mayor de edad y el precio de la entrada.

Como aún no "sabemos" usar condicionales, mostramos el precio tanto si es mayor, como si es menor de edad.


Ejemplo de cómo debe ser la salida del programa: 
```
Introduce tu edad: 20

Tu edad (String): "20"
Tu edad (número): 20
¿Eres mayor de edad? true
El precio de la entrada es: 7.0 €
```

# Ejercicio 5

__Comparador de notas de examen__

Un instituto necesita un programa que analice la nota de un estudiante.

Se necesita conocer los siguientes datos que cumplirán los requisitos especificados. 

Pide la nota como texto (String, pero puede ser decimales, ten en cuenta que una cadena de texto los decimales son puntos y comas ).

Usando comparaciones con operadores relacionales,  verifica y guarda en variables booleanas:

== 10 -----→ para poder responder:  ¿es matrícula de honor? true

&gt;= 5----- →   para poder responder:  ¿es aprobado? true 

&lt; 5----- →  para poder responder:   ¿es suspenso? true

&gt;= 0 &amp&amp &lt;= 10 -------→   para poder responder:   ¿la nota está en rango válido? true

!= 0------ →  para poder responder:    ¿no se dejó en blanco? true

Convierte de nuevo la nota a texto con String.valueOf() para poder guardarla en una variable String. 

EJEMPLO DE SALIDA POR PANTALLA

```Introduce tu nota: 7.5

Nota introducida (String): "7.5"
Nota como número: 7.5
¿Es matrícula de honor (==10)? false
¿Es aprobado (>=5)? true
¿Es suspenso (<5)? false
¿Está en rango válido (0-10)? true
¿No es cero (!=0)? true
```



