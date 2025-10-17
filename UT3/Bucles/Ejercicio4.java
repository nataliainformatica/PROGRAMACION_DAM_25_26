
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        /*
         * Calcula el promedio de 10 notas que se pedirán al usuario
         * las notas serán números enteros
         */
        Scanner sc = new Scanner(System.in);
        //final int NUM = 11; 
        int numModulos;
        int nota; 
        int acumulador =0; 
        int notaMedia; 
        System.out.println("Introduce el número de módulos que tienes");
        numModulos = sc.nextInt();

        for  (int i= 1; i<=numModulos; i++){
            // códigio que necesitamos repetir

            nota = sc.nextInt();
            acumulador = acumulador + nota; 

        }
        notaMedia = acumulador/ NUM; 
        System.out.println("Tu nota media es: " + notaMedia);

    }
}
