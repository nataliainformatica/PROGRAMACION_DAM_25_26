import java.util.Scanner;

public class EjercicioGit {
    /**
     * Notas de un Examen en un Colegio
     * 
     * En un colegio se registran las notas de los alumnos de varias asignaturas. Se
     * desea calcular la suma total y el promedio de cada alumno y de cada módulo.
     * 
     * Los módulos son: {"Programación", "Bases de Datos","Sistemas
     * Informáticos","Entornos de Desarrollo", "Lenguajes de Marcas", "Computación
     * en la nube", "IPE1"} {"PR", "BD","SI","ED","LM","CN"}
     * 
     * El número de alumnos es variable.
     * 
     * Las notas deben almacenarse en un array bidimensional del tamaño necesario.
     * 
     * Cada fila representa un alumno (x alumnos).
     * 
     * Cada columna representa un módulo.
     * 
     * El programa pedirá al usuario completar las notas de todos los alumnos, para
     * todos los módulos.
     * 
     * Las notas son valores enteros entre 0 y 10 .
     * 
     * Después de introducir las notas, aparecerá un menú que permitirá:
     * 
     * Calcula y muestra:
     * 
     * 🔹 La suma y promedio de cada alumno (fila).
     * 
     * 🔹 La suma y promedio de cada módulo (columna).
     * 
     * 🔹 La nota media general del grupo.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] modulos = { "PR", "BD", "SI", "ED", "LM", "CN" };
        int numAlumnos;
        int[][] notas;

        numAlumnos = pedirNumero();
        notas = new int[numAlumnos][modulos.length];

        // pedir las notas para completar la matriz
        // el número de filas de la matriz puede ser:
        // notas.length
        // o numAlumnos
        for (int alumno = 0; alumno < notas.length; alumno++) {
            // el número de columnas de la matriz puede ser:
            // notas[alumno].length
            // ó modulos.length
            for (int notaModulo = 0; notaModulo < notas[alumno].length; notaModulo++) {
                System.out.println("Dime una nota para el alumno " + alumno +
                        " módulo " + modulos[notaModulo]);
                // TODO : cambiar el sc.nextInt(), por la función de pedirNumero
                // modificando la función para que nos sirva
                notas[alumno][notaModulo] = sc.nextInt();

            }

        }

        // Calcula y muestra:La suma y promedio de cada alumno (fila)
        int acumulador;
        int[] acumuladorNotas = new int[notas.length];
        for (int i = 0; i < notas.length; i++) {
            acumulador = 0;
            for (int j = 0; j < notas[i].length; j++) {
                acumulador = acumulador + notas[i][j];

            }
            acumuladorNotas[i] = acumulador;
            // aquí tengo en acumulador todas las notas de la fila (alumno) sumadas
            // promedio es dividir la suma entre el número de módulos

            System.out.println("La suma del alumno " + i + " es: " + acumulador);

            // la suma de cada una de las filas
            // array de longitud el número de filas, y cada de posición del array
            // será la nota que corresponde al alumno de esa posición

        }

        // La suma y promedio de cada módulo (columna).

        int acumuladorModulo;
        int[] acumuladorModuloNota = new int[notas[0].length];// modulos.length
        for (int z = 0; z < notas[0].length; z++) {
            acumuladorModulo = 0;
            for (int y = 0; y < notas.length; y++) {
                acumuladorModulo += notas[y][z];
            }
            System.out.println("La suma del módulo es  " + modulos[z] + " es: " + acumuladorModulo);
            acumuladorModuloNota[z]= acumuladorModulo; 

        }

    }

    /*
     * Calcula y muestra:
     * 
     * 🔹 La suma y promedio de cada alumno (fila).
     * 
     * 🔹 La suma y promedio de cada módulo (columna).
     * 
     * 🔹 La nota media general del grupo.
     */

    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean continua;
        do {
            continua = false;
            try {
                System.out.println("Dime el número de alumnos para las notas");
                numero = sc.nextInt();
            } catch (Exception e) {
                System.out.println("EL número no es válido");
                continua = true;
            }

        } while (continua);

        return numero;
    }

}
