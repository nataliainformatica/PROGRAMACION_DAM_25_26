import java.util.Scanner;
/*
Enunciado : Calculadora de consumo de gasolina

Una gasolinera quiere implementar un programa sencillo en Java que permita calcular el consumo y el coste de un viaje en coche.
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES AL INICIO DEL BLOQUE DE CÓDIGO


        // Declaramos e inicializamos la constante
        final int KM_POR_100 = 100;
        String nombre;
        int distancia;
        double consumoMedio;
        double precioLitro;

        // Creamos la instancia de Scanner para leer desde consola
         Scanner sc = new Scanner(System.in);
         Scanner scLineas = new Scanner(System.in);


        // Pedimos los datos al usuario
        System.out.println("Introduce tu nombre: ");
        nombre = scLineas.nextLine();

        System.out.print("Introduce la distancia del viaje (km): ");
         distancia = sc.nextInt();

        System.out.print("Introduce el consumo medio (litros/100 km): ");
         consumoMedio = sc.nextDouble();

        System.out.print("Introduce el precio del litro de gasolina (€): ");
         precioLitro = sc.nextDouble();

        // Cálculos
        // Conversión implícita: distancia (int) se convierte a double en la operación


        double litrosNecesarios = (distancia * consumoMedio) / KM_POR_100;
        double costeTotal = litrosNecesarios * precioLitro;

        // Resultados con formato
        System.out.println("\nResultados del viaje:");
        System.out.printf("Nombre del conductor: %s%n", nombre);
        System.out.printf("Litros necesarios: %.2f L%n", litrosNecesarios);
        System.out.printf("Coste total: %.2f €%n", costeTotal);


        // Cierre de recursos - es recomendable cerrar los scanners
       // sc.close();
    }
}