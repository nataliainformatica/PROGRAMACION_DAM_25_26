package com.avellaneda;

import java.util.Scanner;

/*
 Liga de Superhéroes Eres el programador encargado de gestionar la lista
de superhéroes que forman parte de una liga.
Cada superhéroe tiene un nombre y un puntaje de fuerza. 
Debes escribir un programa en Java que:

Declare y llene dos arrays estáticos:

Un array de tipo String que contenga los nombres de 5 superhéroes.

Un array de tipo int que contenga el puntaje de fuerza 
correspondiente de cada superhéroe.

Muestre la lista de superhéroes y sus puntuaciones.

Haz una función que encuentre y devuelva al superhéroe más fuerte 
(el que tiene puntuación más alta)

después  muestra su nombre.

Haz una función que calcule y devuelva el promedio de fuerza de todos los superhéroes
 y después muestra un mensaje indicando 
 si cada superhéroe está por encima o por debajo del promedio.
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner scLetras = new Scanner(System.in);
        Scanner scnumeros = new Scanner(System.in);

        final int MAX = 5;
        // declaración de los dos arrays - ahora mismo están vacíos
        int[] puntuaciones = new int[MAX];
        String[] nombre = new String[MAX];
        boolean continua = false;
        int indice = 0;
        double promedio; 

        for (int i = 0; i < MAX; i++) {

            System.out.println("Dime el nombre del superhéroe " + (i + 1));
            nombre[i] = scLetras.nextLine();

            do {
                continua = false;
                System.out.println("Dime la puntuación del superhéroe " + (i + 1));
                puntuaciones[i] = scnumeros.nextInt();
                if (puntuaciones[i] < 5) {
                    System.out.println("La nota no es válida");
                    continua = true;
                }
            } while (continua);

        }
        indice = buscarMasFuertes(puntuaciones);
        System.out.println("El superhéroe con más puntuación es " + nombre[indice]);
        promedio = calcularPromedio(puntuaciones); 
        for(int i=0; i< puntuaciones.length; i++){

            if(puntuaciones[i]> promedio){
                System.out.println(nombre[i] + " es más fuerte que el promedio "+ promedio);
            }else
                System.out.println(nombre[i] + " es menos fuerte que el promedio "+ promedio);
            /*
            String msg ="menos";
             *  if(puntuaciones[i]> promedio){
                System.out.println(nombre[i] + "es más fuerte que el promedio "+ promedio);
            }
            System.out.println(nombre[i] + "es "+ msg+ " fuerte que el promedio "+ promedio);

             */
        }
        
    }

    public static int buscarMasFuertes(int[] puntuaciones) {

        int indice = 0;
        int mayor = puntuaciones[0];

        for (int i = 1; i < puntuaciones.length; i++) {
            if (puntuaciones[i] > mayor) {
                mayor = puntuaciones[i];
                indice = i;
            }

        }

        return indice;
    }

    public static double calcularPromedio(int[] puntuaciones){
        double promedio=0; 
        for(int i=0; i<puntuaciones.length; i++){
            // acumulo todas las puntuaciones
            promedio += puntuaciones[i]; 
        }
        // hago el promedio con el número de puntuaciones
        promedio = promedio /puntuaciones.length; 
        return promedio; 
    }

}
