import java.util.Scanner;

public class Ejercicio44_practicaArrays {
    /**
    La solución puede no estar completa, y tener algún fallo, es lo trabajado en clase
    **/

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String[] videojuegos = { "The Legend of Zelda", "Super Mario Bros", "Minecraft", "Final Fantasy VII",
                "The Witcher 3", "God of War", "Halo" };
        int[] valoraciones = new int[videojuegos.length];
        int[] contadores =  new int[videojuegos.length];
        double[] medias = new double[videojuegos.length];
        // MENU

        // condiciones: 1,2,3,4 son opciones, 0 es salir

        int opcion;

        do {
            System.out.println("1. Valorar un videojuego\n" + //
                    "2. Mostrar valoraciones medias\n" + //
                    "3. Mostrar número de valoraciones\n" + //
                    "4. Mostrar juego mejor valorado\n" + //
                    "0. Salir");

            opcion = pedirOpcion(0, 4);
            switch (opcion) {
             int opcionJuego; 
             int opcionValoracion;
                case 1:
                    mostrarVideojuegos(videojuegos);
                    System.out.println("Introduce el número del juego: ");
                    opcionJuego = pedirOpcion(1, videojuegos.length);
                    
                    System.out.println("Introduce tu puntuación (1 a 5): " ); 
                    opcionValoracion = pedirOpcion(1, 5); 

                    // guardar en la posición del (opcionJuego -1)  la opcionValoracion
                    valoraciones[opcionJuego-1]+= opcionValoracion; 
                    contadores[opcionJuego-1] ++;


                    break;
                case 2:
                    mostrarValoracionesMedias(videojuegos, valoraciones, contadores); 
                    break;

                case 3:
                    mostrarArrays(videojuegos, valoraciones);
                    break;
                case 4:
                    // 4. Mostrar juego mejor valorado
                    break;
                case 0:
                    System.out.println("");
                default:
                    System.out.println("No has introducido un valor válido");
                    break;
            }

        } while (opcion != 0);

    }

    private static void mostrarValoracionesMedias(String[] videojuegos, int[] valoraciones, int[] contadores, int[] medias) {
        for (int i = 0; i < valoraciones.length; i++) {
            // formato: Minecraft: 5.0
            // además incluir el formato: Final Fantasy VII: Sin valoraciones-
           

            if (contadores[i] == 0) {
                System.out.println(videojuegos[i] + ": " + "Sin valoraciones");
                medias[i]=0; 
            } else {
                 // TODO cambiar division entera a decimal
                medias[i] =valoraciones[i] / contadores[i];
                System.out.println(videojuegos[i] + ": " + medias[i]);
            }

        }

    }

    private static void mostrarMejorValorado(String[] videojuegos, int[]medias){
        double aux=0; 
        int indice=0; 
        for(int i=0; i<videojuegos.length; i++){
            if(medias[i]> aux){
                // 
                aux = medias[i];
                indice = i; 
            }
        }
        System.out.println("El juego mejor valorado es "+ videojuegos[indice]);

    }

    private static void mostrarArrays(String[] videojuegos, int[] valoraciones) {

        for (int i = 0; i < valoraciones.length; i++) {
            System.out.println(videojuegos[i] + ":  " + valoraciones[i] + "valoraciones");
        }
    }

    private static void mostrarVideojuegos(String[] videojuegos) {
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println((i + 1) + ". " + videojuegos[i]);
        }
    }

    private static int pedirOpcion(int min, int max) {
        // como parámetros recibo mínimo aceptado
        // y máximo aceptado
        // si el número no está entre esos valores, hay que seguir pidiéndolo

        int opcion = 0;
        boolean continuar = true;
        while (continuar) {

            try {
                System.out.println("Dime el número de opcion entre el " + min + " y el  " + max);
                opcion = Integer.parseInt(sc.nextLine());
                if (opcion < min || opcion > max) {
                    System.out.println("No has introducido el valor en el rango solicitado");
                    // continuar = true;
                } else {
                    continuar = false;
                }

            } catch (Exception ex) {
                System.out.println("No has introducido el valor en el rango solicitado");

            }
        }

        return opcion;

    }
}

