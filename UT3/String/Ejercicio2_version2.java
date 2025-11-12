import java.util.Scanner;

public class Ejercicio2_version2 {
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

        tieneMayuscula = buscarMayuscula(contrasena);
        tieneMinuscula = buscarMinuscula(contrasena);
        tieneNumero = buscarNumero(contrasena);

        // 3. Comprobamos todos los requisitos
        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial;
    }

    public static boolean buscarMayuscula(String password) {
        // podemos recorrer todo el string, en el momento que encontremos un carácter
        // [A-Z] devolveremos true
        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);
            if (c >= 65 && c <= 90) {
                return true;
            }

        }

        return false;
    }

    public static boolean buscarMinuscula(String password) {
        // podemos recorrer todo el string, en el momento que encontremos un carácter
        // [a-z] devolveremos true
        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);
            if (c >= 97 && c <= 122)
                return true;
        }

        return false;

    }

    public static boolean buscarNumero(String password) {
        // podemos recorrer todo el string, en el momento que encontremos un carácter
        // [0-9] devolveremos true
        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);
            if (c >= 48 && c <= 57)
                return true;
        }

        return false;
    }

    public static boolean buscarEspecial(String password) {
        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);
            if (c == '$' || c == '%' || c == '_' || c == '*')
                return true;

        }

        return false;

    }
}
