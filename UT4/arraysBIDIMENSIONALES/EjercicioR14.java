import java.util.Random;
import java.util.Scanner;

/*
 * Crearemos la matriz de la clase
 * asumimos el número de pcs, por tanto 6 filas y 3 columnas
 * Demos hacer una función para hacer un sorteo, nos devolverá el
 * alumno al que le ha tocado el sorteo
 * 
 * Crea una función que recibe el nombre de un alumno, y devuelve
 * el true/false, dependiendo de si está o no
 * 
 * 
 * Crea una función que pasará lista a todos los alumnos, de forma que mostrará
 * el nombre de cada uno de los alumnos, y dependiendo de la respuesta ("si"/"no")
 * mantendrá el nombre del alumno, o lo dejará vacío si la respuesta es  "NO"
 */

public class EjercicioR14 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String alumno;

        String clase[][] = {
                { "alumno1", "alumno2", "alumno3" },
                { "alumno4", "alumno5", "alumno6" },
                { "alumno7", "alumno8", "alumno9" }
        };

        System.out.println("GANADOR " + ganadorSorteo(clase));
        System.out.println("Vamos a pasar lista, dime el nombre del alumno ");
        String resultado;
        alumno = sc.nextLine();
        if (pasarLista(clase, alumno)) {
            resultado = "SI";
        } else
            resultado = "SI";
       
        System.out.println(alumno + " " +resultado + " HA VENIDO");


        System.out.println("PASAMOS LISTA ");
        pasarListaVersion2(clase);
        mostrarArray(clase);
        
    }

    public static String ganadorSorteo(String[][] clase) {
        Random rd = new Random();
        // calcular aleatorio para fila
        int fila, columna;
        fila = rd.nextInt(clase.length);

        // calcular aletorio para columna
        columna = rd.nextInt(clase[0].length);

        // con la fila y columna, devolver el String

        return clase[fila][columna];
    }

    public static void mostrarArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               System.out.println(array[i][j]+"\t");
                
            }
        }

    }
    public static boolean pasarLista(String[][] clase, String alumno) {

        //
        for (int i = 0; i < clase.length; i++) {
            for (int j = 0; j < clase[i].length; j++) {
                // buscar el elemnto
                if (clase[i][j].equals(alumno))
                    return true;
            }
        }

        return false;

    }

    public static void pasarListaVersion2(String[][] clase) {
        for (int i = 0; i < clase.length; i++) {
            for (int j = 0; j < clase[i].length; j++) {
                String respuesta;
                System.out.println("PASAMOS LISTA: " + clase[i][j]);
                System.out.println("Contesta si ha venido a clase (si/no)");
                respuesta = sc.nextLine();

                if (!respuesta.equalsIgnoreCase("si")) {
                    clase[i][j] = "";
                }

            }
        }

    }

}
