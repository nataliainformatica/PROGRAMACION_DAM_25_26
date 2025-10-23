package com.avellaneda.utilidades;

import java.util.Scanner;

public class Utilidades {

    public static int introducirNumGastos() {
        int numGastos = 0;
        Scanner sc = new Scanner(System.in);
        do {

            // TODO - añadir a la petición en número de factura que estamos preguntando
            System.out.println("Dime el número de gastos que tiene la factura");
            numGastos = sc.nextInt();

        } while (numGastos <= 0);
        return numGastos;

    }
    // la función asegurará que el número de gastos es mayor a cero,
    // si no es mayor a cero volverá a pedir que se introduzca el número de gastos

    public static double introducirGasto() {
        double gasto;
        Scanner sc = new Scanner(System.in);
        do {

            // TODO - añadir a la petición en número de gasto que estamos preguntando
            System.out.println("Dime el importe del  gasto que tiene la factura");
            gasto = sc.nextInt();

        } while (gasto <= 0);

        return gasto;

    }

}
