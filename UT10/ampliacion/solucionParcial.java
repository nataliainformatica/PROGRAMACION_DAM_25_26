package principal;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    private static String RUTA_ARCHIVO = "dibujos";
    private static Scanner sc = new Scanner(System.in);

    private static String palabraElegida = "ana";

    public static void main(String[] args) {
        // LEER LOS FICHEROS DE LA CAPETA Y MOSTRAR LOS NOMBRES
        String opcion;
        int intentos = 0;
        File carpeta = new File(RUTA_ARCHIVO);
        String[] lista = carpeta.list();
        for (String s : lista) {
            System.out.println("El archivo ");
            System.out.println(s);
            try {
                leeryPintarContenido(s);
            } catch (Exception e) {

            }

        }
        System.out.println("Escribe el fichero que quieres usar");
        opcion = sc.nextLine();
        try {
            intentos = leeryPintarContenido(opcion);
            jugar(intentos, opcion);
        } catch (Exception e) {
            System.out.println("El fichero no existe");

        }

    }

    private static void jugar(int intentos, String ruta) {

        char letra;
        boolean acierto = false;
        int contadorAciertos = 0;
        int totalGanar;
        boolean iguales = true;
        boolean ganador = false;
        char[] caracteres = palabraElegida.toCharArray();
        totalGanar = palabraElegida.length();
        char[] palabraAcertada = new char[caracteres.length];
        System.out.println("VER ARRAY");
        System.out.println(Arrays.toString(palabraAcertada));
        do {
            iguales = true;
            System.out.println("Introduce una letra");
            letra = sc.nextLine().charAt(0);
            // comprobar si la letra está en la palabra
            for (int i = 0; i < caracteres.length; i++) {
                if (caracteres[i] == letra) {
                    // acierto
                    palabraAcertada[i] = letra;
                    System.out.println(Arrays.toString(palabraAcertada));
                    acierto = true;
                    // cada vez que tenga un acierto - voy a comprobar si la pabrabra es la acertada

                    for (int j = 0; j < totalGanar; j++) {
                        // compruebo si las dos palabras son iguales

                        if (!(palabraAcertada[j] == caracteres[j])) {
                            iguales = false;
                        }

                    }
                    // al salir del for - si iguales == false , entonces continua
                    // si son iguales GANADOR

                    // sumar cada vez que encuentre una letra

                    if (iguales) {
                        System.out.println("HAS GANADO");
                        ganador = true;

                    } else if (!acierto) {
                        intentos--;
                        System.out.println("HAS FALLADO LA LETRA");
                        try {

                            intentos = leeryPintarContenido(ruta);
                        } catch (Exception e) {
                            System.out.println("ENCONTRÉ EL ERROR");
                        }
                    }
                }
            }
        } while (intentos > 0 && !ganador);

    }

    private static int leeryPintarContenido(String archivo) throws IOException {
        Path ruta = Paths.get(RUTA_ARCHIVO, archivo);
        List<String> contenido = null;

        contenido = Files.readAllLines(ruta);
        for (String s : contenido) {

            System.out.println(s);
        }

        return contenido.size();

    }
}
