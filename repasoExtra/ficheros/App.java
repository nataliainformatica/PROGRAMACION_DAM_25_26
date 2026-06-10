package ficheros;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        String[] nombres = { "Programación", "Bases de datos", "Sistemas Informátcos" };
        int[] codigos = { 0, 1, 2 };

        Utilidades.guardarDatos(codigos, nombres, "fichero.txt");

        System.out.println(Arrays.toString(Utilidades.leerDatos("fichero.txt")));
    }
}
