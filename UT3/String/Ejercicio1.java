import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LONGITUD = 15;

        System.out.println("Comprobador de ADN");
        System.out.println("Introduce las dos cadenas de ADN (15 bases cada una).");
        System.out.println("Usa A, T, C, G (pueden ser mayúsculas o minúsculas).");
        System.out.println();

        // Leer primera cadena completa - usamos métodos de String
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine().trim().toUpperCase();

        // Leer segunda cadena completa - usamos métodos de String
        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine().trim().toUpperCase();

        // Validar longitud - usamos métodos de String
        if (cadena1.length() != LONGITUD || cadena2.length() != LONGITUD) {
            System.out.println("\nError: ambas cadenas deben tener exactamente " + LONGITUD + " bases.");         
        }

        boolean hayMutacion = false;
        // OTRA FORMA DE CONSTRUIR CADENAS DE CARACTERES - StringBuilder - 
       /*StringBuilder salida1 = new StringBuilder();
        StringBuilder salida2 = new StringBuilder(); */ 
        String salida1="",salida2="";
        // Comprobar cada posición 
        for (int i = 0; i < LONGITUD; i++) {
            char base1 = cadena1.charAt(i);
            char base2 = cadena2.charAt(i);

            if (sonComplementarias(base1, base2)) {
                // Correctas ,  mostrar en mayúsculas
              //  salida1.append(Character.toUpperCase(base1)).append(" ");
               // salida2.append(Character.toUpperCase(base2)).append(" ");

                salida1 = salida1 + Character.toUpperCase(base1) + " ";
                salida2 = salida2 + Character.toUpperCase(base2) + " ";
            } else {
                // Mutación → mostrar en minúsculas
                hayMutacion = true;
                salida1 = salida1 + Character.toLowerCase(base1) + " ";
                salida2 = salida2 + Character.toLowerCase(base2) + " ";
               // salida1.append(Character.toLowerCase(base1)).append(" ");
               // salida2.append(Character.toLowerCase(base2)).append(" ");
            }
        }

        // Mostrar resultados
        System.out.println("\nResultado de la comprobación:");
        System.out.println(salida1);
        System.out.println(salida2);

        if (hayMutacion) {
            System.out.println("\nSe ha detectado una mutación en la secuencia.");
        } else {
            System.out.println("\nLas cadenas están correctamente emparejadas.");
        }

        sc.close();
    }

    // Método auxiliar
    private static boolean sonComplementarias(char base1, char base2) {
        switch (base1) {
            case 'A': return base2 == 'T';
            case 'T': return base2 == 'A';
            case 'C': return base2 == 'G';
            case 'G': return base2 == 'C';
            default: return false;
        }
    }
}
