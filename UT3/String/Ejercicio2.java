import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Implementa un validador de contraseñas. Ésta se debe leer por teclado y
     * debemos comprobar que cumple determinadas características:
     * 
     * Tiene entre 8 y 20 caracteres.
     * Tiene alguna letra mayúscula y alguna letra minúscula.
     * Tiene algún carácter raro entre $ % _ *
     * Tiene algún número
     * Implementa un método que devuelva true o false para indicar si se cumplen los
     * requisitos de contraseña válida o no. La contraseña debe enviarse al método
     * como parámetro.
     * 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una contraseña: ");
        String contrasena = sc.nextLine();

        if (esContrasenaValida(contrasena)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña NO cumple los requisitos.");
        }

    }

    // Método que valida la contraseña
    public static boolean esContrasenaValida(String contrasena) {
        // Tiene entre 8 y 20 caracteres.
        if (contrasena.length() < 8 || contrasena.length() > 20) {
            return false;
        }

        // Variables para los requisitos
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneEspecial = false;

        // 2. Recorremos los caracteres de la contraseña
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            // usando la clase Character
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (c == '$' || c == '%' || c == '_' || c == '*') {
                tieneEspecial = true;
            }
        }

        // 3. Comprobamos todos los requisitos
        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial;
    }
}
