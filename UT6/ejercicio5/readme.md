import java.util.Scanner;

public class Principal {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String opcion;

        do {

            mostrarMenu();
            opcion = sc.nextLine();
            switch (opcion) {

                case "1":
   
                    break;
                case "2":


                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("6"));
    }

    private static void mostrarMenu() {

        System.out.println("\n===== MENÚ BIBLIOTECA =====");
        System.out.println("1. Añadir libro");
        System.out.println("2. Listar libros");
        System.out.println("3. Realizar préstamo");
        System.out.println("4. Registrar devolución");
	      System.out.println("5.Listar préstamos de un libro);
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");

    }

   

}
