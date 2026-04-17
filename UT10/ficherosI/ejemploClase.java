package ejemploCaracteres;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class EjemploClase {

    /**
     * 
     * Menú:
     * 1. Escribir
     * 2. Leer
     * 
     * 1. Pide por consola una frase al usuario , y depués pediremos el nombre del
     * fichero
     * donde guardar la información
     * 2.
     * Después usando jfileChooser, el usuario podrá seleccionar el fichero a leer,
     * y el resultado
     * se mostrará por consola
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("1.Escribir");
        System.out.println("2.Leer");
        opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("Dime el nombre del fichero");

                String nombre = sc.nextLine();
                System.out.println("Qué quieres escribir en el fichero");
                String valor = sc.nextLine();
                escribir(nombre, valor);
                break;
            case "2":
                System.out.println(leer());

            default:
                break;
        }

    }

    private static boolean escribir(String nombreFichero, String valor) {

        try (FileWriter fic = new FileWriter(nombreFichero)) {

            fic.append(valor);
            return true;
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        }
        return false;
    }

    private static String leer() {
        
        StringBuilder sb = new StringBuilder();

￼
 main
￼

        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(null); // Abre el diálogo de selección

        if (seleccion == JFileChooser.APPROVE_OPTION) { // Si el usuario seleccionó un archivo
            File f = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + f.getAbsolutePath());
            try (FileReader fic = new FileReader(f)) {

                int i;
                while ((i = fic.read()) != -1) {
                    sb.append((char) i);
                }

            } catch (IOException e) {

            }
        } else {
            System.out.println("Selección cancelada.");
        }

        return sb.toString();

    }
}
