public class Ejercicio3 {
/*
 * Modifica el código del programa anterior, para que el usuario pueda además el carácter con el que se crearán las líneas

 */

 public static void main(String[] args) {
    int numeroLineas, numeroCaracteres;
    String linea = "";
    char caracter;
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.println("DE CUÁNTAS LÍNEAS QUIERES LA FIGURA");
    numeroLineas = sc.nextInt();
    System.out.println("DE CUÁNTAS CARACTERES QUIERES CADA LÍNEA DE LA  FIGURA");
    numeroCaracteres = sc.nextInt();
    System.out.println("QUÉ CARÁCTER QUIERES USAR PARA LA FIGURA");
    caracter = sc.next().charAt(0);
    for (int j = 0; j < numeroCaracteres; j++) {
        linea = linea + caracter + " ";
    }
    for (int i = 0; i < numeroLineas; i++) {
        System.out.println(linea);
    }

    
 }
}
