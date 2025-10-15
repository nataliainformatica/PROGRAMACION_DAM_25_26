
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * Completa el código que permitirá crear una figura usando "* * * * *".

    El número de líneas de la figura se pedirá al usuario por consola

     */


     public static void main(String[] args) {
        int numeroLineas ;
        Scanner sc = new Scanner(System.in);
       
       
        String linea = " * * * * * ";

        System.out.println("DE CUÁNTAS LÍNEAS QUIERES LA FIGURA");
        numeroLineas = sc.nextInt();
       
        for (int i = 0; i < numeroLineas; i++) {
            
                System.out.println(linea);
            

        }
     }
}
