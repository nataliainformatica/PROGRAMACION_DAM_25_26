

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sudoku sudoku = new Sudoku();
        boolean gana = false;
             System.out.println(sudoku.devolverSudoku());

        int fila, columna, numero;
        do {
            System.out.println("Dime la posición de la fila");
            fila = sc.nextInt();
         System.out.println("Dime la posición de la columna");
            columna = sc.nextInt();
            System.out.println("Dime el número");
            numero = sc.nextInt();
           
              if (!sudoku.jugar(fila, columna, numero)) {
                System.out.println("Movimiento no válido");
            }
           else  if (sudoku.comprobarJugada()) {
                System.out.println("¡Sudoku completado correctamente!");
                gana = true;
              
            }
          
            System.out.println(sudoku.devolverSudoku());

        } while (sudoku.getIntentos() > 0);
        if(!gana){
            System.out.println("No has completado el Sudoku correctamente.");
        }
    }
}
