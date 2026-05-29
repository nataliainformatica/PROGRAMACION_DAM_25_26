import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javax.imageio.plugins.tiff.TIFFDirectory;

import modelo.GestorTareas;
import modelo.Tarea;

public class App {
    public static void main(String[] args) {
        GestorTareas gt = new GestorTareas();
        gt.agregarTarea(new Tarea("TITULO1", 1, false));
        gt.agregarTarea(new Tarea("TITULO2", 2, false));
        gt.agregarTarea(new Tarea("TITULO3", 3, false));
        gt.mostrarTareas();
        gt.mostrarImportantes();
        gt.guardar("fichero.txt");
        gt.cargar("fichero.txt");
        gt.mostrarTareas();

    }

    public void leerTextoDeArchivoVariasLineas() {
        Path ruta = Path.of("nombreArchivo.txt");

        try {
            List<String> contenido = Files.readAllLines(ruta);
            System.out.println("Lectura del archivo: " + contenido);

        } catch (IOException c) {
        }

    }

    public void escribirTextoEnArchivo() {
        List<String> contenido = List.of("1", "2", "3");
        Path ruta = Path.of("rutaArchivo.txt");
        try {
            Files.write(ruta, contenido);
        } catch (IOException e) {

        }
    }
}
