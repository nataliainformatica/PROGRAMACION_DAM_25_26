package com.avellaneda.principal;

import com.avellaneda.utilidades.Utilidades;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Debe pedir el número de facturas del cliente.
        Scanner sc = new Scanner(System.in);
        int numFacturas =0, numGastos;
        double  gasto, totalGastos= 0, totalFacturas=0; 
     System.out.println("CÁLCULO DEL IMPORTE TOTAL DE TODAS LAS FACTURAS");        
        System.out.println("Dime cuántas factruas vamos a contabilizar");
        numFacturas = sc.nextInt();
        for(int i=0; i<numFacturas; i++){
            // el código de pedir los datos de cada una de las facturas
            // tendré que pedir el número de gastos
            numGastos = Utilidades.introducirNumGastos();
            for(int j=0; j<numGastos; j++){
                gasto = Utilidades.introducirGasto();
                totalGastos = totalGastos + gasto; 
            }
            // tendré que pedir el importe de cada uno de los gastos
            System.out.println("El importe total de la factura : " +( i+1)  + " ES "+ totalGastos);

            totalFacturas = totalFacturas + totalGastos; 
            totalGastos =0; 
            // debe mostrar el importe total de gastos de cada factura.
        }// fin for del número de facturas 
        
            //Finalmente debe mostrar el importe total de todas las facturas del usuario
        System.out.println("El importe total de todas las facturas es:  " + totalFacturas);
 
    }
}
