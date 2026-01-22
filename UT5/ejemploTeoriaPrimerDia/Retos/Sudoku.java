package es.avellaneda.clases;

public class Sudoku {

    int[][] sudoku = {
            {2,0,0,0},
            {0,0,0,4},
            {1,0,0,0},
            {0,0,0,2}
        };
    int intentos;
    public Sudoku(){
        intentos = calcularIntentos();
        System.out.println("traza");

    }
    private int calcularIntentos(){
        int intentos =0;
        for(int[] i : sudoku){
            for(int j : i){
                if(j==0)
                    intentos++;
            }
        }

        return intentos;
    }



    private booleancomprobarSudoku(nt sudodku[][]){
        // calculo los límites tengo 2 filas y dos columnas
        for(int i=0; i< (sudoku.length/2) ;i++){
            for(int j=0; j<(sudoku[i].length; j++) ; j++){
                if(!comprobarCuadrado((sudoku.length/2),(sudoku[i].length/2), sudodku)){
                    return false; 
                }
            }
        }
        return true; 
         

    }
    private boolean comprobarCuadrado(int limiteInferior, int limiteSuperior, int sudodku[][]){

       int comprobacion =0; 
        for(int i = 0; i< limiteInferior;i++){
            for (int j=0; j<limiteSuperior; j++){
         
                comprobacion += sudodku[i][j]; 

            }
        }
        if(comprobacion !=10){
            return true; 
        }

        return false; 


    }

}
