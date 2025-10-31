package Repaso;

import java.util.Scanner;

/*
 * Algoritmo que pida números hasta que se introduzca un cero.
 *  Debe imprimir la suma y la media de todos los números introducidos.


 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int acumulador = 0;
        int contador = 0;
        boolean continua = true;

     
        do {
            numero = devolverNumeroJugador();
            if (numero != 0) {
                acumulador += numero;
                contador++;
                continua = true; 
            }else{
                continua = false; }

        } while (continua);



        System.out.println("La media de los números que has introducido es " + acumulador / contador);

    }

    public static int devolverNumeroJugador() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean indicador = false;
        do {
            System.out.println("Introduce un número ");
            try {
                numero = sc.nextInt();
                indicador = false;
            } catch (Exception e) {
                System.out.println("El número introducido no es correcto");
                indicador = true;
            }

        } while (indicador);

        return numero;
    }

}
