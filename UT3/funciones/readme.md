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
