package Repaso;

import java.util.Random;
import java.util.Scanner;

/**
 * Crea una aplicación que permita adivinar un número. La aplicación genera un
 * número aleatorio del 1 al 100. A continuación va pidiendo números y va
 * respondiendo si el número a adivinar es mayor o menor que el introducido,a
 * demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El
 * programa termina cuando se acierta el número (además te dice en cuantos
 * intentos lo has acertado), si se llega al limite de intentos te muestra el
 * número que había generado.
 */
public class Ejercicio2_versionWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INTENTOS =10; 
        final int INF = 1;
        final int SUP = 100;
        int contador = INTENTOS; 
        boolean ganador = false;
        boolean continua ; 
        int numeroAleatorio;
        int numeroJugador;
        int intentos = 0;
        numeroAleatorio = devuelveAleatorio(INF, SUP);

        // disponemos de 10 intentos
        do {
            continua = true; 
            intentos++;
            contador --; 
            if(contador <=0){
                continua = false; 
            }
           
            // para cada intento hay que pedir el número al jugador
            // comprobar si es igual al númeroAleatorio
            // si es igual debo salir del bucle
            System.out.println("Te quedan " + contador + " intentos");
            numeroJugador = devolverNumeroJugador();
            if (numeroAleatorio == numeroJugador) {
                System.out.println("Has ganado en el intento  " + intentos);
                ganador = true;
                continua = false; 
                break;
            } else if (numeroJugador > numeroAleatorio) {
                System.out.println("El número a acertar es inferior al que has introducido");
            } else {
                System.out.println("El número a acertar es superior al que has introducido");
            }
            
        } while (continua );
/* 
        for (int i = INTENTOS; i > 0; i--) {
            intentos++;
            // para cada intento hay que pedir el número al jugador
            // comprobar si es igual al númeroAleatorio
            // si es igual debo salir del bucle
            System.out.println("Te quedan " + i + " intentos");
            numeroJugador = devolverNumeroJugador();
            if (numeroAleatorio == numeroJugador) {
                System.out.println("Has ganado en el intento  " + intentos);
                ganador = true;
                break;
            } else if (numeroJugador > numeroAleatorio) {
                System.out.println("El número a acertar es inferior al que has introducido");
            } else {
                System.out.println("El número a acertar es superior al que has introducido");
            }

        }*/

        if (!ganador) {
            System.out.println("El número que tenías que acertar era " + numeroAleatorio);
        }

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

    public static int devuelveAleatorio(int inferior, int superior) {
        Random rd = new Random();
        int numeroAleatorio;
        // numeroAleatorio = (int) (Math.random() * 100);

        do {
            numeroAleatorio = rd.nextInt(superior);
            // Returns a pseudorandom, uniformly distributed int value between 0 (inclusive)
            // and the specified value (exclusive), drawn from this random number
            // generator's sequence.

        } while (numeroAleatorio <= inferior);

        return numeroAleatorio;

    }

}
