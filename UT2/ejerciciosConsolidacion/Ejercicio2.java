import java.util.Scanner;
/*
 * 
 * COMPARADOR DE MALETAS
 */

public class Ejercicio2{
    public static void main(String[] args) {
        // DEFINICIÓN DE VARIALBLES AL INICIO DEL BLOQUE DE CÓDIGO
        // Constante
        final double PESO_MAX = 23.2;

        // Scanner
        Scanner sc = new Scanner(System.in);
         Scanner scLetras = new Scanner(System.in);


         double peso;
         int pesoEntero;
         boolean igual, menor, mayor;
         String codigoEmbarque; 

        // Entrada
        System.out.print("Introduce tu código de embarque: ");
        codigoEmbarque = scLetras.nextLine();

        System.out.print("Introduce el peso de tu maleta (kg): ");
         peso = sc.nextDouble();

        // Conversión explícita a int
         pesoEntero = (int) peso;

        // Comparaciones con operadores relacionales
         igual = peso == PESO_MAX;
         menor = peso < PESO_MAX;
         mayor = peso > PESO_MAX;

        // Salida con formato
        /*
         * Estos son los especificadores más comunes en Java:

                %d → entero

                %f → número decimal (se puede controlar con %.2f, %.3f, etc.)

                %s → cadena de texto

                %c → carácter

                %n → salto de línea (equivalente a \n)
         * 
         */

        System.out.println("Código de embarque: " + codigoEmbarque);
        System.out.printf("%nPeso real: %.2f kg%n", peso);
        System.out.printf("Peso aproximado (entero): %d kg%n", pesoEntero);
        System.out.println("¿Es igual al máximo? " + igual);
        System.out.println("¿Es menor al máximo? " + menor);
        System.out.println("¿Es mayor al máximo? " + mayor);
        // Cierre del Scanner
        sc.close();
    }
}
