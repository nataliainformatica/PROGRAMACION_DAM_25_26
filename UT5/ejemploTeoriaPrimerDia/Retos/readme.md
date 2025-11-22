# Ejercicio SUDOKU

Vamos a completar el código para poder jugar a sudokus (sencillos, de 16 casillas, usando números del 1 al 4)

Para ello, el requisito es hacer un objeto Sudoku, que tendrá las siguientes características: 
El panel de 4 x 4 ,  por ejemplo, vamos a jugar con este sudoku de partida. 
Los ceros corresponden a las casillas que habrá que completar. 
En el momento que todas las casillas estén completas, comprobaremos si el resultado es correcto. 
Recuerda, para que un sudoku esté bien resuelto,  (en este caso, el ejemplo son 4 filas y 4 columnas, y se dividen en 4 cuadrados)
la suma de los elementos de cada fila debe ser 10, 
la suma de los elementos de cada columna debe ser 10, 
la suma de los elementos de cada cuadrado debe ser 10
(10, es 1+2+3+4)

```
    int[][] sudoku;/*
                    * = {
                    * {2,0,0,0},
                    * {0,0,0,4},
                    * {1,0,0,0},
                    * {0,0,0,2}
                    * };
                    */
```
Si se introduce un número en una posición que ya tiene un número cualquiera, se sustituirá el número en esa posición.

El juego podría desarrollarse así, se muestra el último movimiento, solo falta una posición por completar: 

```
2 4 3 1
3 1 2 4
1 2 4 3
4 3 0 2

Dime la posición de la fila- recuerda que la primera fila es cero
3
Dime la posición de la columna, recuerda que la primera columna es cero
2
Dime el número que quieres poner
1
¡Sudoku completado correctamente!
2 4 3 1 
3 1 2 4 
1 2 4 3 
4 3 1 2
```
