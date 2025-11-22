
public class Sudoku {

    int[][] sudoku;/*
                    * = {
                    * {2,0,0,0},
                    * {0,0,0,4},
                    * {1,0,0,0},
                    * {0,0,0,2}
                    * };
                    */
    int intentos;
    final int TAM; // TAMAÑO DEL SUDOKU - 2 FILAS - 2 COLUMNAS
    final int numeroCeldas; 

    public Sudoku() {
        // PODRÍAMOS HACER UN SUDOKU DE MAYOR TAMAÑO
         TAM = 2;
        numeroCeldas= TAM*TAM;
  
        this.sudoku = new int[numeroCeldas][numeroCeldas]; // Creamos un array 4x4, POR EJEMPLO
       
     // aquí definimos el nivel de dificultad del sudoku
         // para probar  los métodos del cálculo del ganador, lo voy a dejar con un solo intento
        sudoku[0][0] = 2;
        sudoku[0][1] = 4;
        sudoku[0][2] = 3;
        sudoku[0][3] = 1;

        sudoku[1][0] = 3;
        sudoku[1][1] = 1;
        sudoku[1][2] = 2;
        sudoku[1][3] = 4;

        sudoku[2][0] = 1;
        sudoku[2][1] = 2;
        sudoku[2][2] = 4;
        sudoku[2][3] = 3;

        sudoku[3][0] = 4;
        sudoku[3][1] = 3;
        sudoku[3][2] = 0;
        sudoku[3][3] = 2;
        intentos = calcularIntentos();
    }

    public Sudoku(int[][] sudoku) {
        // TODO - COMPROBAR QUE EL ARRAY ES MAX 2X2

         // PODRÍAMOS HACER UN SUDOKU DE MAYOR TAMAÑO- HABRÍA QUE CONOCER EL NÚMERO DE COLUMNAS Y FILAS DE CADA ELEMENTO DEL SUDOKU
         // EL CÓDIGO ESTÁ CREADO PARA TAM =2
         TAM = 2; 
        if(sudoku.length / 2 != TAM)
            // no sería un sudoku válido
        // aprenderemos a propagar excepciones, para evitar que se cree un objeto no válido
            System.out.println("No es un sudoku válido");
        numeroCeldas= TAM*TAM;
  
        this.sudoku = sudoku;
        intentos = calcularIntentos();
    }

    private int calcularIntentos() {
        int intentos = 0;
        for (int[] i : sudoku) {
            for (int j : i) {
                if (j == 0)
                    intentos++;
            }
        }

        return intentos;
    }

    public boolean jugar(int fila, int col, int numero) {

        if (sudoku[fila][col] == 0) {
            sudoku[fila][col] = numero;
            intentos--;
            return true;
        }else{
           sudoku[fila][col] = numero;
           if(numero ==0){
            intentos++;
           }
            return true;
        }
  
    }
     public boolean eliminarJugada(int fila, int col, int numero) {
        if (sudoku[fila][col] == 0) {
            sudoku[fila][col] = numero;
           if(numero ==0){
            intentos++;
           }
            return true;
        }
        return false;
    }

    public boolean comprobarJugada() {
        // COMPROBAR FILAS
        // COMPROBAR COLUMNAS
        // COMPROBAR POR CUADRADOS

        for (int i = 0; i < sudoku.length; i++) {
            if (!comprobarFila(i)) {
                return false;
            }
        }
        for (int i = 0; i < sudoku[0].length; i++) {
            if (!comprobarColumna(i)) {
                return false;
            }
        }

        if (!comprobarSudoku()) {
            return false;
        }
        return true;
    }

    private boolean comprobarColumna(int columna) {
        int suma = 0;
        for (int i = 0; i < sudoku.length; i++) {
            suma += sudoku[i][columna];
        }
        if (suma != 10) {
            return false;
        }
        return true;
    }

    private boolean comprobarFila(int fila) {
        int suma = 0;
        for (int i = 0; i < sudoku[fila].length; i++) {
            suma += sudoku[fila][i];
        }
        if (suma != 10) {
            return false;
        }
        return true;
    }

    private boolean comprobarSudoku() {
        // calculo los límites tengo 2 filas y dos columnas
        for (int i = 0; i < sudoku.length; i += TAM) {
            for (int j = 0; j < sudoku[i].length; j += TAM) {
                // limiteFila - limiteColumna
                if (!comprobarCuadrado(i + TAM, j + TAM, sudoku, TAM)) {
                    return false;
                }
            }
        }
        return true;

    }

    private boolean comprobarCuadrado(int limiteFila, int limiteColumna, int sudodku[][], int tam) {

        int comprobacion = 0;
         int suma=0; 
        for(int i=1;i<=(tam*tam) ; i++){
            // el valor de la suma  de todos los elementos que puede tener el cuadrado
            suma += i;
        }
        for (int i = limiteFila - tam; i < limiteFila; i++) {
            for (int j = limiteColumna - tam; j < limiteColumna; j++) {

                comprobacion += sudodku[i][j];

            }
        }
        if (comprobacion == suma) {
            return true;
        }
        return false;
    }

    public int getIntentos() {
        return intentos;
    }

    public String devolverSudoku() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                sb.append(sudoku[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
