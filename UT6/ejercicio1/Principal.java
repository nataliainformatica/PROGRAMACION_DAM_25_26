package es.avellaneda.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    private static Scanner sc = new Scanner(System.in);
    private static final int MAX_TAREAS = 20;

    public static void main(String[] args) {
        Tarea[] tareas = new Tarea[20];
        int contador = 0;
        String opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Crear tarea");
            System.out.println("2. Mostrar las tareas almacenadas");
            System.out.println("3. Salir");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    // llamar a la función
                    if (contador < MAX_TAREAS) {
                        tareas[contador] = crearTarea();
                        contador++;
                    }

                    break;

                default:
                    break;
            }
        } while (!opcion.equals("3"));
    }

    private static Tarea crearTarea() {
        Tarea tarea ;
        String nombre,descripcion; 
        LocalDate fechaVencimiento;
        int aa, mm,dd; 

        System.out.println("Introduce el nombre");
     
        nombre = sc.nextLine();
        System.out.println("Introduce la descripción");
        descripcion = sc.nextLine();
        System.out.println("Introduce el año");
        aa= pedirNumeroEntero();
        System.out.println("Introduce el mes");
        mm =pedirNumeroEntero()
        System.out.println("Introduce el dia");
        dd = pedirNumeroEntero(); 
        tarea = new Tarea(nombre,descripcion,LocalDate.of(aa,mm,dd));
     
        return tarea;

    }

    private static int pedirNumeroEntero() {
        int numero = 0;
        do {
            try {
                numero = Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
                System.out.println("No es un número válido");

            }
        } while (numero == 0);
        return numero;
    }


    private static void mostrarTareas(Tarea[] tareas){
        for(Tarea t: tareas){
            System.out.println(t);
        }

    }

}
