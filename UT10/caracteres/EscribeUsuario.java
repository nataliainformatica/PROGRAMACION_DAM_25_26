
package caracteres.ejemploFileReaderWiriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Métodos heredados de Writer
 * Como FileWriter extiende Writer, hereda los siguientes métodos:
 * 
 * write(int c): Escribe un solo carácter.
 * 
 * write(char[] cbuf): Escribe un arreglo de caracteres.
 * 
 * write(char[] cbuf, int off, int len): Escribe una parte del arreglo de
 * caracteres.
 * 
 * write(String str): Escribe una cadena completa.
 * 
 * write(String str, int off, int len): Escribe una parte de la cadena.
 * 
 * flush(): Fuerza la escritura de los datos en el archivo.
 * 
 * close(): Cierra el flujo.
 */
/*
 * Además, FileWriter agrega constructores específicos que no existen en Writer:
 * 
 * FileWriter(String fileName): Crea un FileWriter para escribir en un archivo
 * (sobrescribiendo el contenido).
 * 
 * FileWriter(String fileName, boolean append): Crea un FileWriter, con la
 * opción de añadir al final del archivo (append = true).
 * 
 * FileWriter(File file): Similar al primero, pero recibe un objeto File.
 * 
 * FileWriter(File file, boolean append): Similar al segundo, pero con un objeto
 * File.
 */

public class EscribeUsuario {

    private final String USUARIO = "USUARIO:";
    private final String EMAIL = "EMAIL:";
    private final String COLOR = "COLOR:";
    private final String nombreFichero = "ejemplo.txt";

    public void escribirUsuario() {

        File fichero = Paths.get(nombreFichero).toFile();
        // con una ruta específica
        // File fichero = Paths.get("", nombreFichero).toFile();

        /// recibiríamos los datos del usuario como objeto
        String usuario = "uno_distinto";
        String email = "dos";
        String color = "tres";
        // TRY-WITH-RESOURCES - cierra automáticamente el flujo
        try (FileWriter fic = new FileWriter(fichero)) {
            /*
             * public Writer append(char c) throws IOException
             * public Writer append(CharSequence csq) throws IOException
             * public Writer append(CharSequence csq, int start, int end) throws IOException
             */
            fic.append(USUARIO);
            fic.append(usuario);
            fic.append(EMAIL);
            fic.append(email);
            fic.append(COLOR);
            fic.append(color);

        } catch (IOException ex) {
            Logger.getLogger(EscribeUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

/*
 * CharSequence es una interfaz en Java que representa una secuencia de caracteres de forma abstracta. 
 * Permite trabajar con cualquier tipo de secuencia de caracteres de manera uniforme, sin importar su implementación (String, StringBuilder, StringBuffer, etc.).
 * public interface CharSequence {
    char charAt(int index);       // Devuelve el carácter en la posición dada
    int length();                 // Devuelve la longitud de la secuencia
    CharSequence subSequence(int start, int end);  // Devuelve una subcadena
    String toString();            // Convierte la secuencia a String
}
    Muchos métodos en Java aceptan CharSequence en lugar de String, permitiendo mayor flexibilidad.

    Por ejemplo, append(CharSequence csq) en Writer:
 */
