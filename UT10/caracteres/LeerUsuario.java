
package caracteres.ejemploStreamejemploFileReaderWiriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeerUsuario {

    private final String USUARIO = "USUARIO:";
    private final String EMAIL = "EMAIL:";
    private final String COLOR = "COLOR:";
    private final String nombreFichero = "ejemplo.txt";

    /*
     * ​La clase abstracta Reader en Java es la base para todas las clases que
     * manejan flujos de entrada de caracteres. Se utiliza cuando necesitamos leer
     * datos de fuentes que proporcionan caracteres, como archivos de texto,
     * entradas de usuario o cualquier otra fuente que emita datos en forma de
     * caracteres.
     * FileReader, que es una implementación concreta de Reader. Esta clase permite leer datos basados en caracteres desde un archivo de manera sencilla.
     */

    private String leer() {
        Path currentDir = Paths.get("");
        String ruta = currentDir.toAbsolutePath().toString();
        System.out.println("RUTA: " + ruta);
        File fichero = new File(ruta + "/" + nombreFichero);
        StringBuilder sb = new StringBuilder();
        try (FileReader fic = new FileReader(fichero)) {
            int i;
            while ((i = fic.read()) != -1) // lectura de un carácter
            {
                sb.append((char) i);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("EL FICHERO NO EXISTE");
        } catch (IOException ex) {
            Logger.getLogger(LeerUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    public Usuario devolver() {
        String texto = leer();

        Pattern patron = Pattern.compile("USUARIO:(.*?)EMAIL:");
        Pattern patron2 = Pattern.compile("EMAIL:(.*?)COLOR:");
        Pattern patron3 = Pattern.compile("COLOR:*(\\S+)");
        Matcher matcher = patron.matcher(texto);
        Matcher matcher2 = patron2.matcher(texto);
        Matcher matcher3 = patron3.matcher(texto);

        if (matcher.find()) {
            String usuario = matcher.group(1);
            String email, color;
            if (matcher2.find()) {
                email = matcher2.group(1);
            } else
                email = "no enviado";

            if (matcher3.find()) {
                color = matcher3.group(1);
            } else
                color = "no enviado";

            return new Usuario(usuario, email, color);

        } else {
            System.out.println("No se encontró ningún usuario.");
            throw new RuntimeException();
        }

    }
}

/*
 * algunos de los métodos de lectura más comunes de la clase FileReader son:
 *
 * int read(): Lee un solo carácter y devuelve su valor como un entero.
 * Retorna -1 si llega al final del archivo.
 * int read(char[] cbuf): Lee
 * caracteres del archivo y los almacena en el arreglo cbuf. Retorna el
 * número de caracteres leídos o -1 si llega al final del archivo.
 * int read(char[] cbuf, int off, int len): Lee caracteres del archivo y los
 * almacena en el arreglo cbuf, empezando desde la posición off y leyendo un
 * máximo de len caracteres. Retorna el número de caracteres leídos o -1 si
 * llega al final del archivo. boolean ready(): Verifica si el archivo está
 * listo para ser leído. void skip(long n): Salta n caracteres hacia
 * adelante en el archivo. Retorna el número de caracteres saltados o -1 si
 * llega al final del archivo.
 */
