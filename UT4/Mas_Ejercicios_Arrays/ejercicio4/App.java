package es.avellaneda.principal;

import java.util.Scanner;

import es.avellaneda.utilidades.Utilidades;

public class App {

    /**
     * Pida al usuario que introduzca 10 actividades o consumos realizados en una
     * semana relacionados con energía, transporte o consumo.
     * 
     * @param args
     */

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int VECES = 2; 
        String[] actividades = new String[VECES]; 
        String[] energias = new String[actividades.length];
        String[] grados = new String[energias.length]; 

        System.out.println("Introduce " + VECES + " actividades relacionadas con el consumo energético");

        for (int i=0; i<VECES; i++){
            

            System.out.println("Actividad " +  (i+1));
            actividades[i] = sc.nextLine();

        }

        for(int j=0; j< actividades.length; j++){
            energias[j] = Utilidades.devuelveTiposEnergias(actividades[j]);
        }

        for(int z =0; z<energias.length; z++){
            grados[z]= Utilidades.devuelveContaminacion(energias[z]);

        }

        // mostrar resultados

        for(int k =0; k<actividades.length; k++){
            System.out.print("La actividad " + actividades[k]);
            System.out.print(" está catalogada como tipo de energía: "+ energias[k]);
            System.out.println(" y tiene un grado de contaminación "+ grados[k]);
        }



        
    }
}
