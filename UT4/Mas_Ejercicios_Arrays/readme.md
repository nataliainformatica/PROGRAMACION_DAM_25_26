
# EJERCICIOS DE LA UNIDAD 4 -  APLICACIÓN DE ESTRUCTURAS DE ALMACENAMIENTO. TABLAS Y CADENAS


![vidaSubmarina](https://github.com/user-attachments/assets/44db9543-d4bb-4b56-864d-adc307e6a019)

# Ejercicio 1 :  Actividad práctica: Arrays unidimensionales 

## Tema: Control de residuos plásticos en una playa (ODS 14: Vida submarina)
Estáis colaborando con un proyecto para monitorizar la cantidad de residuos plásticos recogidos en 7 puntos de una playa local durante una semana. 

Queremos saber cuántos residuos se han recogido cada día para analizar la tendencia y motivar al voluntariado.

Objetivos de esta práctica son: 
* Practicar arrays unidimensionales en Java, aplicando a una posible aplicación real para control ambiental.
* Reflexionar sobre la importancia de ODS 14 (Vida submarina) y la reducción de residuos plásticos.

  
Tarea:

Crear un programa en Java que:

•	Pida al usuario por consola que introduzca la cantidad de residuos plásticos (en kg) recogidos cada día durante 7 días, guardando estos valores en un array de 7 posiciones.
•	Calcule:

o	El total de residuos recogidos en la semana.

o	La media diaria.

o	El día con mayor cantidad de residuos recogidos.

•	Muestre todos los resultados por consola.


Ampliación: 
Añadiremos otro punto del menú, que realizará un cálculo de los residuos de plástico  que se producen en un día en una casa,  preguntará al usuario, 

¿cuántos envases has utilizado para hacer el  desayuno? 
¿Cuántos en la comida? 
¿Cuántos en la cena?, 

teniendo como base una constante del peso medio de un envase, se mostrará la media de residuos de un usuario en un día, una semana y en un año.

# Ejercicio 2: “El analizador de temperaturas”

![accionPorClima](https://github.com/user-attachments/assets/723490ff-0247-4c30-944a-b5daa5749681)

## ODS 13: Acción por el clima

Contexto:

Estamos viviendo un aumento de temperaturas globales debido al cambio climático. 

Para entender mejor esta realidad, vamos a crear un programa que analice las temperaturas diarias registradas en una semana.

Así aprenderás a usar arrays unidimensionales y verás cómo la programación puede ayudarnos a observar patrones y tomar decisiones para proteger el planeta.

Objetivo:

Practicar arrays unidimensionales en Java.

Reforzar el uso de bucles, condicionales y operaciones básicas. 

Reflexionar sobre cómo la tecnología puede apoyar la lucha contra el cambio climático (ODS 13).

# Ejercicio 3: “Invertir y mostrar”

ODS asociado: ODS 12 – Producción y Consumo Responsables

<img width="109" alt="image" src="https://github.com/user-attachments/assets/4d444509-2561-4c9c-bc70-1c1b96f4c6f4" />


A menudo, realizamos actividades diarias que implican consumo de recursos (agua, energía, materiales). 

Reflexionar sobre estas actividades en orden inverso nos ayuda a identificar qué acciones podrían reducir el consumo o el impacto ambiental.

Deberás crear un programa en Java que:

Lea 10 actividades diarias realizadas por el usuario (pueden ser actividades relacionadas con consumo, por ejemplo: “Ducha de 10 minutos”, “Usar lavadora”, “Usar calefacción”, etc.), y las almacene en un array de Strings.

Muestre las actividades en orden inverso al que fueron introducidas, para ayudar a reflexionar sobre cuáles se podrían reducir, eliminar o hacer de forma más responsable para contribuir al cuidado del planeta.



# Ejercicio 4: “Buscador de duplicados”

## ODS asociado: ODS 13 – Acción por el Clima

![accionPorClima](https://github.com/user-attachments/assets/d6fa3b59-e70a-4850-adae-75f0f2f30a08)


En el consumo diario, solemos realizar acciones repetidas que incrementan nuestra huella de carbono (como desplazamientos innecesarios en coche, consumo energético excesivo o compras impulsivas). Identificar actividades duplicadas nos permite reducir consumos y emisiones.

Enunciado:
Crea un programa en Java que:

Pida al usuario que introduzca 10 actividades o consumos realizados en una semana relacionados con energía, transporte o consumo.

Almacene estas actividades en un array de Strings.
Usando los métodos que se definen más adelante, mostraremos para cada una de las actividades del usuario, el tipo de energía consumida, y el grado de contaminación de cada una. 

## Definición de las funciones a realizar.

Crea otro paquete, con una clase en el que habrá una función con el método devuelveTiposEnergias…. , en esta función estará definido un array estático  con 3 tipos de energía ["petróleo", "gas natural", "hidroeléctrica"].
Que usará las siguientes colecciones de palabras para identificar cada una de las energías: 
```
// --- PALABRAS / ACTIVIDADES RELACIONADAS CON CADA ENERGÍA ---

        String[] palabrasPetroleo = {
            "coche", "gasolina", "diesel", "moto", "avión", "transporte", "camión", "autobús",
            "repostar", "viajar", "combustible", "gasolinera", "barco", "motor"
        };

        String[] palabrasGasNatural = {
            "calefacción", "cocinar", "agua caliente", "ducha", "baño", "horno", "cocina de gas",
            "termo", "caldera", "calor"
        };

     
        String[] palabrasHidroelectrica = {
            "lavadora", "lavavajillas", "microondas", "cargar móvil", "ordenador", "consola", "televisión"
        };devuelve
```

Esta misma clase tendrá  otro método, devuelveGradoContaminación, que tendrá un array  con los grados de contaminación de las energías [alto, alto,bajo]. La función devolverá, teniendo en cuenta la posición en el array, el grado de contaminación que tiene la energía.

**AMPLIACIÓN**:  De las actividades que ha introducido el usuario, debes detectar y mostrar por consola qué actividades están repetidas (es decir, las actividades que el usuario realiza más de una vez y podrían optimizarse para reducir emisiones), con la energía a la que están asociadas y el grado de contaminación de ésta.



# Ejercicio 5: “Cuenta vocales” (ODS 5: Igualdad de Género)

![igualdadGenero](https://github.com/user-attachments/assets/95d2ac22-115e-4976-a6bc-c8449b0144de)



Objetivo:

Realiza un programa que pida una frase relacionada con la igualdad de género y cuente cuántas vocales tiene.

Enunciado: 

 El programa pedirá al usuario que escriba una frase que exprese un compromiso o idea sobre la igualdad de género (por ejemplo, “La igualdad comienza en casa”).
 
 Usando la clase **String**

 Guardará la frase en una variable.
 
 Recorrerá la frase carácter a carácter para contar cuántas vocales (a, e, i, o, u) tiene en total.
