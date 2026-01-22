# Ejercicio 1 
Crea un programa en Java que  en el método main tendrá un menú de opciones:**(1,2,3,s)** con las siguientes funcionalidades:

Opción 1: Invoca   la función mostrarABC()

Opción 2: Mostrar el número devuelto al invocar a la función  devolverAleatorio(15).

Opción 3:  Mostrará el número devuelto por la función devolverNumero()

Opción s o S: Salir del programa.

Cualquier otra opción pulsada mostrará el mensaje, “OPCIÓN NO VÁLIDA” y volverá a mostrar el menú.

El menú se repite hasta que el usuario elija salir (s o S).

(las funciones no tienen que funcionar en este ejercicio) 

# Ejercicio2: 

Completa la función
```
mostrarABC(){...}
```

Ésta función mostrará los resultados que se explican a continuación en  la consola  usando bucles, no está permitido escribir la línea con el resultado directamente. 

Mostrará en UNA  LÍNEA  los caracteres de la A a la Z (MAYÚSCULAS) ,
y en la SIGUIENTE LÍNEA los caracteres de la a a la z (MINÚSCULAS).  Recuerda ‘A’ = 65 


# Ejercicio 3: 
Completa la función 
```
private static int devolverAleatorio(int n){...}

```
  que realizará   **n**  intentos de cálculo de un número aleatorio  y devolverá como resultado  el número mayor de los n intentos. 

Si el valor de n fuese negativo o cero, devolverá el primer valor aleatorio que calcule. 

Puedes usar: 
```
Random rd = new Random();
  rd.nextInt(1000); // el 1000 es el valor máximo del rango para calcular el aleatorio
```
# Ejercicio 4: 
Completa la función : 
```private static int devlverNumero(){...}
```

Pide un número ENTERO POSITIVO  al usuario,  esta función se asegura de que no haya excepciones,
de forma que si se introduce un valor que no es un número mostrará el mensaje “NO ES UN NÚMERO, VOY A DEVOLVER UN -1” y devolverá un -1.

Si el usuario pone un número negativo, mostrará “NO ES UN NÚMERO POSITIVO, VOY A DEVOLVER UN 0” y devolverá un 0.
