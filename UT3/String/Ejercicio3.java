import java.util.Scanner;

public class Ejercicio3 {

    /**
     * Realiza un programa que ordene alfabéticamente el nombre de tres alumnos, que
     * estarán en tres variables String. Al comenzar el programa, se pide al usuario
     * los nombres quiere ordenar Finalizará mostrando el resultado imprimiendo en
     * mayúsculas un nombre en cada línea alfabéticamente de la a la z
     */
       
        // para ordenar alfabéticamente, con lo que sabemos hasta ahora
        // debemos comparar carácter a carácter. 
        // nombre1 con nombre2, y dejar el que es el primero en una variable temporal
        // comparar después el tercero con la variable temporal y actulizar la variable temporal



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los tres nombres
        System.out.print("Introduce el primer nombre: ");
        String nombre1 = sc.nextLine();

        System.out.print("Introduce el segundo nombre: ");
        String nombre2 = sc.nextLine();

        System.out.print("Introduce el tercer nombre: ");
        String nombre3 = sc.nextLine();

      

        // Convertimos todos los nombres a minúsculas para comparar correctamente
        // pero guardamos también la versión original para imprimir luego
        String n1 = nombre1.toLowerCase();
        String n2 = nombre2.toLowerCase();
        String n3 = nombre3.toLowerCase();

        // Ordenamiento simple de tres elementos usando nuestra función comparar()
        String temp;

        // Si n1 > n2, intercambiamos
        if (esMayor(n1, n2)) {
            temp = nombre1; nombre1 = nombre2; nombre2 = temp;
            temp = n1; n1 = n2; n2 = temp;
        }

        // Si n1 > n3, intercambiamos
        if (esMayor(n1, n3)) {
            temp = nombre1; nombre1 = nombre3; nombre3 = temp;
            temp = n1; n1 = n3; n3 = temp;
        }

        // Si n2 > n3, intercambiamos
        if (esMayor(n2, n3)) {
            temp = nombre2; nombre2 = nombre3; nombre3 = temp;
            temp = n2; n2 = n3; n3 = temp;
        }

        // Mostramos el resultado en mayúsculas
        System.out.println("\nNombres ordenados alfabéticamente:");
        System.out.println(nombre1.toUpperCase());
        System.out.println(nombre2.toUpperCase());
        System.out.println(nombre3.toUpperCase());
    }

    /**
     * Compara dos strings carácter a carácter (usando valores ASCII)
     * Devuelve true si s1 es mayor alfabéticamente que s2.
     */
    public static boolean esMayor(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int lenMin = Math.min(len1, len2);

        for (int i = 0; i < lenMin; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 > c2) {
                return true;  // s1 va después alfabéticamente
            } else if (c1 < c2) {
                return false; // s1 va antes
            }
        }

        // Si todos los caracteres son iguales hasta el final del más corto,
        // el más largo se considera "mayor"
        return len1 > len2;
    }
}
