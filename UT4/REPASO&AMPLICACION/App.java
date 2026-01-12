import java.util.Random;

public class App {
    public static void main(String[] args) {
        int filas = 10; // Número de filas del array
        int[][] array = new int[filas][2];
        Random rand = new Random();

        // Bucle para rellenar el array -columna 0, número aleatorio; columna 1, índice original
        for (int i = 0; i < filas; i++) {
            array[i][0] = rand.nextInt(100); // Número aleatorio entre 0 y 99
            array[i][1] = i;                 // Índice original
        }

        // Mostramos el resultado
        System.out.println("Array original:");
        imprimirArray(array);

        // Ordenar el array por columna 0 usando burbuja
        ordenarBurbuja(array);

        // Mostrar el resultado , usando la misma instancia de array
        System.out.println("\nArray ordenado por columna 0:");
        imprimirArray(array);
    }

    // Método de ordenación burbuja
    public static void ordenarBurbuja(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j][0] > array[j + 1][0]) {
                    // Intercambiar filas completas
                    // cada fila de un array bidimensional es un array unidimensional
                    int[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirArray(int[][] array) {
        System.out.println("Valor\tÍndiceOriginal");
        for (int[] fila : array) {
            System.out.println(fila[0] + "\t" + fila[1]);
        }
    }
}
