import java.util.Scanner;

/*
 * 
 * TURNOS DE LAVADO
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        
        // Constante
        final int NUM_PISTAS = 3;

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Introduce tu número de turno: ");
        int turno = sc.nextInt();

        // Uso del operador %
        int pista = turno % NUM_PISTAS;

        // Conversión a carácter (char)
        char letraPista = (char) ('A' + pista);

        // Salida
        System.out.println("\nNúmero de pistas: " + NUM_PISTAS);
        System.out.println("Tu turno es: " + turno);
        System.out.println("Te corresponde la pista número: " + pista);
        System.out.println("Identificada con la letra: " + letraPista);

        sc.close();
    }
}
