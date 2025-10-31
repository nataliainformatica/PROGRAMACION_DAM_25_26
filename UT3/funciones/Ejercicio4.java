/*Practicaremos: variables, bucles, condicionales y funciones. 
Es un requisito imprescindible que realices alguna parte del código usando una función, 
por ejemplo puedes hacer una función que pida un valor válido de movimiento (a/d/q). 
También podrías hacer una función que calcule la nueva posición de Pac-Man dependiendo de a/d/q, 
o también una función que haga la composición de la línea 
(dónde está Pac-Man después del moviviento)

Imagina que tienes un camino con bolitas . y Pac-Man P:

.....P.....
Pac-Man puede moverse a la izquierda (a) o a la derecha (d). 
Cada vez que se mueve y come una bolita (.), ganas puntos (1 punto por cada bola).
 El juego termina cuando no quedan bolitas o escribes q.*/

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_BOLAS = 10;
        // también podemos hacer una función para contar las bolas
        // NUM_BOLAS = contarBolas(camino);
        String camino = ".....P.....";

        int puntos = 0;
        boolean continua = true;

        while (continua) {
            int nuevaPosicion = -1;
            int posicionActual = camino.indexOf("P");
            System.out.println("Camino: " + camino);
            System.out.println("Puntos: " + puntos);
            String movimiento = pedirMovimiento();
            if (movimiento.equals("a") || movimiento.equals("d")) {
                if (movimiento.equals("a")) {
                    System.out.println("MOVIMIENTO A IZQUIERDA");
                    nuevaPosicion = posicionActual - 1;
                } else if (movimiento.equals("d")) {
                    System.out.println("MOVIMIENTO A DERECHA");
                    nuevaPosicion = posicionActual + 1;
                }
                
                if (nuevaPosicion != -1) {
                     char nuevaPosicionChar = camino.charAt(nuevaPosicion);   
                     if (nuevaPosicionChar == '.') {
                         puntos++;
                         if(puntos >= NUM_BOLAS) {
                             continua = false;
                         }
                     }
                     // construir un string concatenando valores, sin usar StringBuilder
                     String nuevoCamino = "";
                     for (int i = 0; i < camino.length(); i++) {
                         if (i == nuevaPosicion) {
                             nuevoCamino += 'P';
                         } else if (i == posicionActual) {
                             nuevoCamino += ' ';
                         } else {
                             nuevoCamino += camino.charAt(i);
                         }
                     }
                     camino = nuevoCamino;

                    /*
                    // solución con StringBuilder
                     * StringBuilder sb = new StringBuilder(camino);
                     * char caracter = sb.charAt(nuevaPosicion);
                     * sb.setCharAt(posicionActual, ' ');
                     * sb.setCharAt(nuevaPosicion, 'P');
                     * if (caracter == '.') {
                     * puntos++;
                     * if (puntos >= NUM_BOLAS) {
                     * continua = false;
                     * }
                     * }
                     * camino = sb.toString();
                     */
                } else {
                    System.out.println("Movimiento inválido.");
                }

            } else if (movimiento.equals("q")) {
                continua = false;
                System.out.println("Juego terminado.");
            }
        }

    }

    public static String pedirMovimiento() {
        Scanner scanner = new Scanner(System.in);
        String movimiento = "";
        boolean continua = true;
        while (continua) {
            System.out.print("Introduce tu movimiento (a/d/q): ");
            movimiento = scanner.nextLine();
            if (movimiento.equals("a") || movimiento.equals("d") || movimiento.equals("q")) {
                continua = false;
            } else {
                System.out.println("Movimiento inválido. Inténtalo de nuevo.");
            }
        }
        return movimiento;
    }

    /*
     * 
     * Usando una función para calcular la nueva posición de Pac-Man
     * 
     * 
     * public static int calcularNuevaPosicion(int posicionActual, String
     * movimiento) {
     * if (movimiento.equals("a")) {
     * return posicionActual - 1;
     * } else if (movimiento.equals("d")) {
     * return posicionActual + 1;
     * }
     * return -1;
     * }
     */

     public static int contarBolas(String camino) {
         int contador = 0;
         for (int i = 0; i < camino.length(); i++) {
             if (camino.charAt(i) == '.') {
                 contador++;
             }
         }
         return contador;
     }
}
