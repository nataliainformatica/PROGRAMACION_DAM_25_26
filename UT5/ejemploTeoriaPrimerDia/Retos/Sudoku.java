
public class Sudoku {

    int[][] sudoku;



    private booleancomprobarSudoku(nt sudodku[][]){
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
