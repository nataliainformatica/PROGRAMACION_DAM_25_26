import java.util.Scanner;
public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String texto = sc.nextLine();


        char repetido = primerCaracterRepetido(texto);

        if (repetido != 0) {
            System.out.println("El primer carácter repetido es: '" + repetido + "'");
        } else {
            System.out.println("No hay caracteres repetidos en la cadena.");
        }
    }

    /**
     * Devuelve el primer carácter que aparece repetido en la cadena.
     * Si no hay ninguno, devuelve 0.
     */
    public static char primerCaracterRepetido(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char actual = texto.charAt(i);

            // Comparamos con el resto de caracteres siguientes
            for (int j = i + 1; j < texto.length(); j++) {
                if (actual == texto.charAt(j)) {
                    return actual; // Lo encontramos repetido
                }
            }
        }
        return 0; // Ningún carácter repetido
    }
}

