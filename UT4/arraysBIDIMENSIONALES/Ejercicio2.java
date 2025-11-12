

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;
        char[][] sopa = new char[filas][columnas];

        // Palabras a colocar en la sopa
        String[] palabras = { "ENERGIA", "AGUA", "MOLECULAS", "OXIGENO", "HIDROGENO", "CARBONO" };

        // Inicializar la sopa con letras aleatorias
        rellenarConLetrasAleatorias(sopa);

        // Colocar palabras horizontalmente
        colocarPalabras(sopa, palabras);

        // Mostrar la sopa de letras
        imprimirSopa(sopa);
    }

    public static void rellenarConLetrasAleatorias(char[][] sopa) {
        Random random = new Random();
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                // USAMOS EL VALOR ENTERO DE LA TABLA ASCII PARA CONSEGUIR UN CARÁCTER ALEATORIO
                // 'A'= 65, 'Z' = 90 (65+25 )
                // random.nextInt(26) genera un número entre 0 y 25
                sopa[i][j] = (char) ('A' + random.nextInt(26));
            }
        }
    }

    // PASAMOS POR REFERENCIA EL ARRAY sopa

    public static void colocarPalabras(char[][] sopa, String[] palabras) {
        Random random = new Random();
        int[] filasUsadas = new int[sopa.length];
        int contador =0; 
        Arrays.fill(filasUsadas, -1);
        for (String palabra : palabras) {
            boolean colocada = false;
            while (!colocada) {
                int fila = random.nextInt(sopa.length);
                if(!contieneNumero(filasUsadas, fila)){
                      // queremos un aleatorio entre 0 y la diferencia entre el número de columnas y
                // la longitud de la palabra
                // para asegurar que "cabe" la palabra
                int columna = random.nextInt(sopa[fila].length - palabra.length() + 1);

                colocada = true;

                // Colocar palabra horizontalmente
                for (int j = 0; j < palabra.length(); j++) {
                    sopa[fila][columna + j] = palabra.charAt(j);
                }

                filasUsadas[contador] = fila;
                contador++;

                }

              
            }
        }
    }

    public static void imprimirSopa(char[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean contieneNumero(int[] array, int numero){
        for(int i = 0; i < array.length; i++){
            if(array[i] == numero){
                return true;
            }
        }
        return false;
    }
}