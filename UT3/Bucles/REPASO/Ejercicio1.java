package Repaso;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Crea una aplicación que pida un número y
     * calcule su factorial (El factorial de un número es el producto de todos los
     * enteros
     * entre 1 y el propio número y se representa por el número seguido de un signo
     * de exclamación.
     * Por ejemplo 5! = 1x2x3x4x5=120),
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, factorial = 1;
        System.out.println("INTRODUCE UN NÚMERO POR TECLADO");
        try {
            numero = sc.nextInt();
            System.out.println("AHORA VAMOS A CALCULAR EL FACTORIAL DEL NÚMERO");
            System.out.print(numero + "!= ");
            // es necesario recorrer de uno en uno todos los números
            // desde uno hasta el valor introducido
            // acumularemos el producto de todos los números desde el uno

            for (int i = 1; i <= numero; i++) {
                if (i != numero) {
                    System.out.print(i + "x");
                } else {
                    System.out.print(i );

                }
                factorial = factorial * i;

            }
            System.out.println("=" + factorial);
        } catch (Exception e) {
            System.out.println("El número introducido no es válido");
        }

    }
}
