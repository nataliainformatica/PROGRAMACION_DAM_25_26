
import java.util.Scanner;

public class Ejercicio5 {

    /*
     * Pediremos al usuario 10 números, al finalizar la petición le mostraremos
     * el máximo y el mínimo
     * 
     * ( haremos las pruebas con números entre cero y 100)
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int NUM = 5;
        int numero;
        int max = 0, min = 100;
        
        for (int i = 1; i <= NUM; i++) {
           

            // meter un bucle que revise la condición de número válido
            do { 
                System.out.println("Dime un número");
                  numero = sc.nextInt(); 
                if(numero <0 ||  numero >100){
                    System.out.println("ESTE NÚMERO NO ES VÁLIDO");
                }
             
            } while (numero <0 ||  numero >100);
            

            if (numero > max) {
                max = numero;
            }

            if (numero < min) {
                min = numero;
            }

        }
        System.out.println("EL NÚMERO MÁXIMO ES:  " + max);
        System.out.println("EL NÚMERO MÍNIMO ES : " + min);

    }

}
