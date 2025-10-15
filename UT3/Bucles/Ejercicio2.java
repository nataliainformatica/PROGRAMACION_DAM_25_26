public class Ejercicio2 {
    /*
     * Modifica el código del programa anterior, para que el usuario pueda decidir
     * el número de caracteres que tendrán las líneas de la figura
     */
    public static void main(String[] args) {
        int numeroLineas, numeroCaracteres;
        String linea = "";
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("DE CUÁNTAS LÍNEAS QUIERES LA FIGURA");
        numeroLineas = sc.nextInt();
        System.out.println("DE CUÁNTAS CARACTERES QUIERES CADA LÍNEA DE LA  FIGURA");
        numeroCaracteres = sc.nextInt();
        for (int j = 0; j < numeroCaracteres; j++) {
            linea = linea + "* ";
        }
        for (int i = 0; i < numeroLineas; i++) {
            System.out.println(linea);
        }
    }
}
