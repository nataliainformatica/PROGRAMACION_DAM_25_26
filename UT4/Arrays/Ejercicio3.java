package carpetaArrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Debes hacer el código para un juego que llamaremos Atrapa a Guy Fawkes Será
 * un minijuego que se ejecutará en la consola:
 * 
 * Hay varias habitaciones numeradas (este dato se preguntará antes de comenzar
 * el juego) debajo del Parlamento. Vamos a imaginar para esta primera versión,
 * que las habitaciones están en un pasillo largo, por lo que están ordenadas en
 * fila. El guardia tiene un número limitado de posibilidades de búsqueda antes
 * de que amanezca, que se calcularán como (int)númeroHabitaciones*0,55,
 * (ejemplo, si son 10 habitaciones serán 5 posibilidades)
 * 
 * En una está escondido Guy Fawkes con la pólvora.
 * 
 * El jugador es un guardia que tiene que inspeccionar las habitaciones,
 * buscando a Guy Fawkes.
 * 
 * Cada turno el jugador elige una habitación (si elige una habitación que no
 * existe el juego finaliza), según lo cerca o lejos que esté la habitación
 * elegida, el programa responde con pistas ("oyes ruidos y hay un fuerte olor a
 * póvora", “hueles pólvora cerca”, “silencio total”...). Si la habitación
 * siguiente (por la derecha o izquierda) es en la que está escondido Guy, dará
 * el primer mensaje "oyes ruidos y hay un fuerte olor a póvora", si pasada una
 * habitación (a la derecha o izquierda) está escondido Guy, se mostrará el
 * mensaje: “hueles pólvora cerca”, si hay más de una habitación entre la que
 * revisa el guardia y en la que está escondido Guy mostrará: “silencio total”.
 * 
 * Si el guardia lo encuentra antes del amanecer gana, si no lo encuentra el
 * parlamento....
 * 
 */
public class Ejercicio3 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] habitaciones;
        boolean encontrado = false;
        int numero, numeroHabitacion, numIntentos, distancia;
        System.out.println("Dime cuántas habitaciones hay en el parlamento");
        numero = pedirNumero();
        habitaciones = crearHabitaciones(numero);
        numIntentos = calcularNumIntentos(numero);
        do {
           
            System.out.println("Dime la habitacion donde se esconde la pólvora ");
            numeroHabitacion = pedirNumero();
            if (numeroHabitacion < 0 || numeroHabitacion >= habitaciones.length) {
                System.out.println("La habitación no existe");

            } else {
                distancia = comprobarDistancia(habitaciones, numeroHabitacion);
                if (distancia != 0) {
                    mostrarInfo(distancia);
                    numIntentos--;
                } else {
                    encontrado = true;
                }

            }

        } while (!encontrado && numIntentos > 0);
        if (encontrado) {
            System.out.println("¡Has encontrado a Guy Fawkes!");
        } else {
            System.out.println("Amaneció, no has encontrado la pólvora y el parlamento... 💥");
        }
    }

    /**
     * Si la habitación siguiente (por la derecha o izquierda) es en la que está
     * escondido Guy, dará
     * el primer mensaje "oyes ruidos y hay un fuerte olor a póvora", si pasada una
     * habitación (a la derecha o izquierda) está escondido Guy, se mostrará el
     * mensaje: “hueles pólvora cerca”, si hay más de una habitación entre la que
     * revisa el guardia y en la que está escondido Guy mostrará: “silencio total”.
     */
    private static void mostrarInfo(int distancia) {
        String msg = "";
        switch (distancia) {
           
            case 2:
                msg = "Hueles a pólvora cerca";
                break;
            case 1:
                msg = "Oyes ruidos y hay un fuerte olor a pólvora";
                break;
            default:
                msg = "Silencio total";

        }
        System.out.println(msg);

    }

    private static int comprobarDistancia(String[] habitaciones, int numero) {
        // comprobar si en el númeroHabitación, está "X"
        // este código serviría para tener distintos contenidos en las habitaciones
        int resultado;

        if (habitaciones[numero].equalsIgnoreCase("X")) {
            resultado = 0;
            // fin del juego, encontró la habitación
        } else {
            // ver la distancia a la habitación
            resultado = Math.abs(numero - buscarHabitacion(habitaciones, "X"));
        }
        return resultado;

    }

    private static int buscarHabitacion(String[] habitaciones, String tipo) {
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i].equalsIgnoreCase(tipo)) {
                return i;
            }
        }
        return -1;

    }

    private static String[] crearHabitaciones(int numero) {
        String[] habitaciones = new String[numero];
        Random rd = new Random();
        Arrays.fill(habitaciones, " ");
        // calculo un número aleatorio para la pólvora
        // en el rango de 0 a numero
        int aleatorio = rd.nextInt(numero);
        habitaciones[aleatorio] = "X";
        return habitaciones;

    }

    private static int pedirNumero() {
        boolean continua;
        int numero = 0;
        do {
            try {
                continua = false;
                numero = sc.nextInt();
            } catch (Exception e) {
                System.out.println("El número no es válido, vuelve a introducirlo");
                continua = true;
            }

        } while (continua);
        return numero;
    }

    /**
     * El guardia tiene un número limitado de posibilidades de búsqueda antes
     * de que amanezca, que se calcularán como (int)númeroHabitaciones*0,55,
     * 
     * @return
     */
    private static int calcularNumIntentos(int numeroHabitaciones) {

        return (int) (numeroHabitaciones * 0.55);
    }
}