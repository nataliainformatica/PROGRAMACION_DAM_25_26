


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFileChooser;
public class FicherosBasico {

 public static void main(String[] args) {
   
    //crearDir();
    //verDir();
    verInf();
    rutaSinIO_NIO();
    muestraRutaNIO();
}

private static void crearDir(){
    File d = new File("NUEVODIR"); //directorio que creo a partir del actual
   File f1 = new File(d,"FICHERO1.TXT");
   File f2 = new File(d,"FICHERO2.TXT");
   
   d.mkdir();//CREAR DIRECTORIO
     
   try { 
    if (f1.createNewFile())
       System.out.println("FICHERO1 creado correctamente...");
    else
       System.out.println("No se ha podido crear FICHERO1...");
   
    if (f2.createNewFile())
       System.out.println("FICHERO2 creado correctamente...");
    else
       System.out.println("No se ha podido crear FICHERO2...");
   } catch (IOException ioe) {ioe.printStackTrace();}  
   
   f1.renameTo(new File(d,"FICHERO1NUEVO"));//renombro FICHERO1

   try { 
        File f3 = new File("NUEVODIR/FICHERO3.TXT");
	  f3.createNewFile();//crea FICHERO3 en NUEVODIR
   } catch (IOException ioe) {ioe.printStackTrace();}  
 }


private static void verDir(){

    String dir = ".";
    File f = new File(dir);
    String[] archivos = f.list();
    System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
    for (int i = 0; i < archivos.length; i++) {
        File f2 = new File(f, archivos[i]);
        System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", archivos[i], f2.isFile(),
                f2.isDirectory());
    }
}

	public static void VerDir2() {
		String dir = ".";
		File f = new File(dir);
		File[] listaficheros= f.listFiles();		
		System.out.printf("Ficheros en el directorio actual: %d %n", listaficheros.length);
		for (int i = 0; i < listaficheros.length; i++) {
			File f2 = listaficheros[i];
			System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", 
					f2.getName(), f2.isFile(),f2.isDirectory());
		}
	}

   private static void verInf() {
     System.out.println("INFORMACIÓN SOBRE EL FICHERO:");
     File f=null;

      JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(null); // Abre el diálogo de selección

        if (seleccion == JFileChooser.APPROVE_OPTION) { // Si el usuario seleccionó un archivo
             f = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + f.getAbsolutePath());
        } else {
            System.out.println("Selección cancelada.");
        }
    // File f = new File("D:\\ADAT\\UNI1\\VerInf.java");  


     if(f.exists()){
           System.out.println("Nombre del fichero  : "+f.getName());
           System.out.println("Ruta                : "+f.getPath());
           System.out.println("Ruta absoluta       : "+f.getAbsolutePath());
           System.out.println("Se puede leer       : "+f.canRead());
           System.out.println("Se puede escribir   : "+f.canWrite());
           System.out.println("Tama o              : "+f.length());
         System.out.println("Es un directorio    : "+f.isDirectory()); 
         System.out.println("Es un fichero       : "+f.isFile());
         System.out.println("Nombre del directorio padre: "+f.getParent());
     }
    } 
    public static void muestraRutaNIO() {
        Path currentDir = Paths.get("");
        String absolutePath = currentDir.toAbsolutePath().toString();
        
        System.out.println("La ruta actual es: " + absolutePath);

    }

    public static void rutaSinIO_NIO() {
        String currentDir = System.getProperty("user.dir");
        System.out.println("..La ruta actual es: " + currentDir);

    }
    public static void verificarSiRutaExiste() {
        //Path es una interfaz que representa una ruta en el sistema de archivos
        //Paths es una clase de utilidad que sirve para crear instancias de Path
        // mediante Paths.get
        // desde java 11 tb se puede con Path.of()
        Path ruta = Paths.get("archivo.txt");
        if(Files.exists(ruta)){
            System.out.println("El archivo existe");
        }else
        System.out.println("El archivo no existe");
    }
   

}
