# Ejercicio1
### Calculadora de dos operandos

![image](https://user-images.githubusercontent.com/91023374/194544336-359660e2-45bd-47d8-864c-0af2ae3cb32a.png)


## PARTE I: Repaso de UT 1, 2 y 3.

### Objetivos
 
Trabajar con:

- Variables numéricas
- Operadores
- Expresiones
- Estructuras de decisión
- Estructuras de repetición
- Funciones o métodos estáticos
 
### Enunciado
Implementa un programa "Calculadora" que muestre un menú con las operaciones de:
```
1. sumar
2. restar
3. multiplicar
4. dividir
5. resto
   
0. SALIR
```
El programa no debe parar hasta introducir un 0 (para salir del programa).

Una vez que el usuario elija la opción, debe pedir los dos operadores y mostrar el resultado.

**Ejemplo de salida por consola:**

![image](https://user-images.githubusercontent.com/91023374/194543555-f5228227-6600-414b-8cf6-0093abe3ba09.png)

## PARTE II: Con funciones o métodos estáticos en la clase Main

Por cada opción de la calculadora debes crear una función que haya la operación en cuestión.

## PARTE III: Con funciones o métodos estáticos en la clase Operaciones (usando paquetes  y una clase aparte)



# Ejercicio 2
## Programa para la gestión de facturas y gastos de una empresa

![image](https://user-images.githubusercontent.com/91023374/201478111-63d27b23-3b09-4b16-84db-39ab6fa6f3d5.png)


  **PROGRAMA QUE CALCULA EL IMPORTE TOTAL DE TODAS LAS FACTURAS Y SUS GASTOS ASOCIADOS**
 
  * REQUISITOS: *
  - Debe pedir el número de facturas del cliente.
  - Por cada factura debe pedir el número de gastos que tiene la factura, usando una función :
     ```
    public static int introducirNumGastos(...){....}
     // la función asegurará que el número de gastos es mayor a cero,
     // si no es mayor a cero volverá a pedir que se introduzca el número de gastos
    ```
    
  - Por cada gasto debe pedir el importe del mismo, , usando una función :
    ```
    public static double introducirGasto(...){....}

     // la función asegurará que el gasto  es mayor a cero,
     // si no es mayor a cero volverá a pedir que se introduzca el número de gastos
    
    ```
    
    
  - Debe mostrar el importe total de gastos de cada factura.
  - Finalmente debe mostrar el importe total de todas las facturas del usuario
 
 

**Ejemplo salida por consola:**

![image](https://user-images.githubusercontent.com/91023374/194542169-7907b105-48f9-4209-89a3-1ed1e2284925.png)


# Ejercicio 3
## Máquina expendedora de billetes de tren

#### Escribir el programa que tenga en cuenta las siguientes especificaciones

**Precio del billete:** 2 euros

**Se aplican descuentos por edades:**
- Menor de 8 años: gratis
- Entre 8 y 17 años: se aplica el 50% de descuento
- Entre 18 y 64 años: no hay descuento
- Mayor de 64 años (a partir de 65): gratis

Debe mostrar por consola el precio final del billete.

#### Retos que añaden funcionalidad a la máquina expendedora

![image](https://user-images.githubusercontent.com/91023374/134820384-14e8fd5c-323c-42d8-8b83-8c721c3c32cf.png) **RETO 1 !!!**
En el viaje vendido número 5 (el quinto billete que vende la máquina), el billete será gratis.
En ese momento el programa parará.

**Ejemplo salida consola:**

![image](https://user-images.githubusercontent.com/91023374/194308918-b3baabc7-5510-4ead-93af-3e95056f9420.png)


![image](https://user-images.githubusercontent.com/91023374/134820387-4429bb44-1c97-427f-83be-07a0ac16e9a8.png) **RETO 2 !!!**
Cada 5 billetes vendidos el precio del billete será gratis.
El programa no parará hasta llegar a un número de billetes vendidos que el usuario ha especificado previamente por consola (límite).

**Ejemplo salida consola:**

![image](https://user-images.githubusercontent.com/91023374/194309248-87f06a14-d598-4647-90bc-e20e1311bed6.png)


![image](https://user-images.githubusercontent.com/91023374/134820387-4429bb44-1c97-427f-83be-07a0ac16e9a8.png) **RETO 3 !!!**
- El programa no parará hasta llegar a un número de operaciones que el usuario ha especificado previamente por consola (límite).
- En cada operación, el programa debe preguntar por el número de billetes que quiere comprar el usuario (en vez de ir de uno en uno como en los retos anteriores)
- Una vez que sabe el número de billetes, por cada uno de ellos debe preguntar la edad para calcular el importe de cada billete individual.
- Debe indicar por pantalla el precio de cada billete.
- Finalmente debe indicar el importe total de todos los billetes que ha comprado el usuario.

**Ejemplo salida consola:**

![image](https://user-images.githubusercontent.com/91023374/194342175-a4320d5c-dddf-46c6-addf-b328a364ab97.png)



![image](https://user-images.githubusercontent.com/91023374/134820387-4429bb44-1c97-427f-83be-07a0ac16e9a8.png) **RETO 4 !!! PRÁCTICA GUIDA: Solución moduclar con métodos estáticos**
- Debes añadir al reto3 la lógica para que al finalizar el programa (se ha llegado al límite de operaciones) se muestre por pantalla el importe total recaudado por la máquina (el sumatorio de todos los importes de cada operación)


