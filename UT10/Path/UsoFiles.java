import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class UsoFiles {

    public static void main(String[] args) {
        escribirTextoEnArchivo();
       // leerTextoDeArchivo();
        leerTextoDeArchivoEnVariasLineas();
    }

    /**
     * Escribir texto en un archivo
     * Usando Files, java internamente abre el stream, escribe el texto y luego
     * cierra el stream automáticamente,
     * lo que simplifica el proceso de escritura en archivos.
     */
    private static void escribirTextoEnArchivo() {
        String texto = "PRIMERA ESCRITURA.";
        String texto2 = """
                SEGUNDA ESCRITURA
                DE VARIAS LÍNEAS 
                                """;
        Path rutaArchivo = Path.of("ejemplo.txt");
        try {
            Files.writeString(rutaArchivo, texto);
            Files.writeString(rutaArchivo, texto2,StandardOpenOption.APPEND);
            System.out.println("Texto escrito en el archivo: " + rutaArchivo.toString());
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    private static void escribirTextoEnArchivoConLista() {
        List<String> lineas = List.of("Línea 1", "Línea 2", "Línea 3");
        Path rutaArchivo = Path.of("ejemplo_lista.txt");
        try {
            Files.write(rutaArchivo, lineas);
            System.out.println("Texto escrito en el archivo: " + rutaArchivo.toString());
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private static void leerTextoDeArchivo() {
        Path rutaArchivo = Path.of("ejemplo.txt");
        try {
            String contenido = Files.readString(rutaArchivo);
            System.out.println("Contenido del archivo: " + contenido);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
     private static void leerTextoDeArchivoEnVariasLineas() {
        Path rutaArchivo = Path.of("ejemplo.txt");
        try {
            List<String> contenido = Files.readAllLines(rutaArchivo);
            System.out.println("Contenido del archivo: " + contenido);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
