package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Utilidades {

    public static void guardarDatos(int[] codigos, String[] nombres, String fichero) {

        // poner la cabecera "CÓDIGO-NOMBRE"
        // después escribir cada línea codigo-nombre

        ArrayList<String> lineas = new ArrayList<>();
        lineas.add("CÓDIGO-NOMBRE");
        for (int i = 0; i < codigos.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(codigos[i]);
            sb.append("-");
            sb.append(nombres[i]);
            lineas.add(sb.toString());

        }
        Path rutaArchivo = Path.of(fichero);
        try {
            Files.write(rutaArchivo, lineas);

        } catch (IOException e) {

        }

    }

    public static String[] leerDatos(String fichero) {
        Path rutaArchivo = Path.of(fichero);
        String[] resultado = null;

        try {
            List<String> contenido = Files.readAllLines(rutaArchivo);

            contenido.remove(0);
            resultado = new String[contenido.size()];

            for (int i = 0; i < contenido.size(); i++) {
                String[] argumentos = contenido.get(i).split("-");

                // {"01","PR"}
                // {"02","BD"}
                resultado[i] = argumentos[1];

            }
            System.out.println(contenido);
        } catch (IOException e) {

        }

        // TODO CAMBIAR DEVOLUCIÓN
        return resultado;

    }

}
