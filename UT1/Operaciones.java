import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir los dos números
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        // Calcular suma y multiplicación
        int suma = num1 + num2;
        int multiplicacion = num1 * num2;

        // Mostrar resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La multiplicación es: " + multiplicacion);

        sc.close();
    }
}
