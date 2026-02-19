
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

  
========================================
           PARRILLA DE SALIDA
========================================

1. Frenzel     | 130.0 pts | 15:00:00
2. Johansen    | 128.5 pts | 15:00:02
3. Rehrl       | 129.0 pts | 15:00:02
4. Lamparter   | 125.0 pts | 15:00:08

========================================
¡Listos para la carrera de fondo!
========================================
Observa que: Johansen y Rehrl salen a la misma hora, pero no es empate en puntuación máxima , es el mismo retraso aplicado, el programa funciona correctamente.
CAPTURA DEL POSIBLE CASO DE EMPATE – CAPTURA DE LA EXCEPCIÓN
****DATOS DE PRUEBA
Johansen   130.0
Frenzel    130.0
Lamparter  125.0
Rehrl      129.0

Calculando puntuación máxima...

ERROR: Existe empate en la puntuación máxima (130.0)

No es posible calcular la parrilla de salida.
Se requiere desempate según normativa oficial.

Programa finalizado.
