
import java.util.Scanner;

public class ConversionTipos {
    public static void main(String[] args) {
        // PRIMITIVOS
      // numéricos - enteros y decimales
      // booleano - true - false
      // char - un carácter - conversión del número de la codificación ASCII
        // NO PRIMITIVO - CADENAS DE CARACTERES - String
        int numeroEntero ; 
        numeroEntero = 4; 
        float decimal1 = 4.0f;
        double decimal2 = 8.2; // CONSOLA - 8,2
        char letra = 'a';
        boolean  booleano = true; // false
        String cadena ; 

        // definimos las variables al inicio del bloque de código
        Scanner sc = new Scanner(System.in);
        Scanner scLetras = new Scanner(System.in);

        // lectura de enteros
        numeroEntero = sc.nextInt();
        decimal1 = sc.nextFloat();
        decimal2 = sc.nextDouble();

        decimal1 = sc.nextDouble();
        cadena = scLetras.nextLine();
        letra = cadena.charAt(0); 
        // si queremos pedir un char por consola usamos
        letra = scLetras.nextLine().charAt(0);

        













        


    }

}
