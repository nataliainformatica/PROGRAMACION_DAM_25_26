import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsoPaths2 {

 public static void main(String[] args) {


        // mostramos el uso de getProperty con "user.home" para obtener el directorio del usuario
        System.out.println("El directorio del usuario es: " + System.getProperty("user.home")); 

		Path path = Paths.get(System.getProperty("user.home"),"documents", "java", "temario.txt");
		
		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2)); // 	subpath(int beginIndex, int endIndex)
        //Returns a relative Path that is a subsequence of the name elements of this path.
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());

    // CREAR CARPETAS Y FICHEROS CON PATHS
    // Permite tener más control sobre la operación, como por ejemplo manejar excepciones específicas, verificar la existencia de archivos antes de crearlos, etc.
    Path dirPath = Paths.get("NUEVODIR");
    Path dirPath2 = Paths.get("NUEVODIR2/NUEVODIR3"); // crear un directorio dentro de otro
    try {
        Files.createDirectory(dirPath);
        System.out.println("Directorio creado: " + dirPath.toString());
        Files.createDirectories(dirPath2);
        System.out.println("Directorio creado: " + dirPath2.toString());
    } catch (IOException e) {
        System.out.println("Error al crear el directorio: " + e.getMessage());
        
    }

	}   

}

/**
 * API
 * static Path	get(String first, String... more)	
Converts a path string, or a sequence of strings that when joined form a path string, to a Path.
Path mejora el manejo de rutas, independiente del sistema operativo
Permite usar la clase Files para operar con ficheros, directorios y otros tipos de archivos.  Ofreciendo operaciones avanczadas como copiar, mover, eliminar, crear enlaces simbólicos, etc.



Interface Path: An object that may be used to locate a file in a file system. It will typically represent a system dependent file path.
Accessing Files
Paths may be used with the Files class to operate on files, directories, and other types of files. For example, suppose we want a BufferedReader to read text from a file "access.log". 
The file is located in a directory "logs" relative to the current working directory and is UTF-8 encoded.

     Path path = FileSystems.getDefault().getPath("logs", "access.log");
     BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
 */
