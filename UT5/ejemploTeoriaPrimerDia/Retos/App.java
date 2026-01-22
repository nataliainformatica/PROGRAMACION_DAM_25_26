<<<<<<< HEAD
public class App {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
    }
}
=======


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sudoku sudoku = new Sudoku();
        boolean gana = false;
             System.out.println(sudoku.devolverSudoku());

        int fila, columna, numero;
        do {
            System.out.println("Dime la posición de la fila- recuerda que la primera fila es cero");
            fila = sc.nextInt();
         System.out.println("Dime la posición de la columna, recuerda que la primera columna es cero");
            columna = sc.nextInt();
            System.out.println("Dime el número que quieres poner");
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
>>>>>>> be77ed5755899618020aefc9a439f7945632a51e
