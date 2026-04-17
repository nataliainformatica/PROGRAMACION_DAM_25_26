import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import ejercicioLectura.LectorMatricula;

public class App {

    public static void main(String[] args) {
       File ruta = seleccionarCarpeta();
         if (ruta != null) {
              System.out.println("Carpeta seleccionada: " + ruta.getAbsolutePath());
         } else {
              System.out.println("No se seleccionó ninguna carpeta.");
         }
    }
  private static File seleccionarCarpeta() {
        System.out.println("INFORMACIÓN SOBRE EL FICHERO:");
        File f = null;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(".")); // Establece el directorio inicial (puede ser el directorio
                                                        // actual)"));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Solo permite seleccionar carpetas
        int seleccion = fileChooser.showOpenDialog(null); // Abre el diálogo de selección

        if (seleccion == JFileChooser.APPROVE_OPTION) { // Si el usuario seleccionó un archivo
            f = fileChooser.getSelectedFile();
            return f; 

        } return null; 

    
    }


}
