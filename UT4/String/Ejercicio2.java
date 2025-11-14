import java.util.Arrays;

public class Ejercicio2 {
    /**
     * Realiza un programa que ordene alfabéticamente el nombre de un número
     * variable de alumnos alumnos, que estarán en una colección de String. Al
     * comenzar el programa, se pide al usuario los nombres quiere ordenar
     * Finalizará mostrando el resultado imprimiendo en mayúsculas un nombre en cada
     * línea alfabéticamente de la a la z
     */
    public static void main(String[] args) {

        String[] nombres = { "Natalia", "Zacarias","Javier", "Carlos","Amparo","Julián" };

        System.out.println(Arrays.toString(nombres));

        // recorremos el array y para cada una de las posiciones la comparamos con el
        // nombre siguiente
        // como aún no hemos visto el método compare, lo haremos usando los caracteres

        for (int i = 0; i < nombres.length - 1; i++) {
          
            for (int segundo = i+1; segundo < nombres.length; segundo++) {
                  String nombre1 = nombres[i];
                String nombre2 = nombres[segundo];
                // usando un operador ternario para asignar la menor longitud
                int longitud = nombre1.length() < nombre2.length() ? nombre1.length() : nombre2.length();
                // ahora comprobamos los caracteres, siempre del nombre que tiene menor longitud
                for (int j = 0; j < longitud; j++) {
                    int c1 = nombre1.charAt(j);
                    int c2 = nombre2.charAt(j);
                    // TABLA ASCII CON CARACTERES MAYÚSCULAS(66) Y MINÚSCULAS(97)
                    // NÚMERO MAYOR, ES EL PRIMERO ALFABÉTICAMENTE
                    if (c1 < c2) {
                        // nombre1 es mayor alfabéticamente
                        // no cambiamos posiciones

                        break;
                    } else if (c1 > c2) {
                        // c2 es mayor alfabéticamente
                        // cambiamos posiciones
                        System.out.println("CAMBIAMOS");
                        String temp = nombres[i];
                        nombres[i] = nombres[segundo];
                        nombres[segundo] = temp;
                        break;
                    }
                    // si son iguales, es necesario continuar con el siguiente caracter

                }

                // java.util.Arrays.sort(nombres);
            }

        }

        System.out.println(Arrays.toString(nombres));
    }
}