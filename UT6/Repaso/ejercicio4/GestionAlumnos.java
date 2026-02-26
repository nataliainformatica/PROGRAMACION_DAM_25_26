
import java.util.Scanner;

public class GestionAlumnos {

    private static Scanner sc = new Scanner(System.in);

    private static DAO dao = new DAO();


    public static void main(String[] args) {

        String opcion;
        do {

            mostrarMenu();
            opcion = sc.nextLine();
            switch (opcion) {

                case "1":
                    crearCurso();
                    break;
                case "2":
                    listarCursos();
                    break;
                case "3":
                    matricularAlumno();
                    break;
                case "4":
                    listarMatriculaciones();
                    break;
                case "5":
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("5"));
    }

    private static void mostrarMenu() {

        System.out.println("\n===== MENÚ CENTRO =====");
        System.out.println("1. Crear curso");
        System.out.println("2. Listar cursos");
        System.out.println("3. Matricular alumno");
        System.out.println("4. Listar matriculaciones");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void crearCurso() {
        System.out.print("Código del curso: ");
        String codigo = sc.nextLine();
        System.out.print("Nombre del curso: ");
        String nombre = sc.nextLine();
        System.out.print("Horas del curso: ");

        // TODO - COMPLETA LA GESTIÓN DE EXCEPCIONES PARA QUE SI EL USUARIO INTRODUCE UN
        // VALOR NO VÁLIDO PARA LAS HORAS,
        // SE LE INDIQUE EL ERROR Y SE LE VUELVA A PEDIR EL VALOR HASTA QUE INTRODUZCA
        // UNO VÁLIDO.
        int horas = 0;
        boolean valido = false;
        while (!valido) {
            try {
                horas = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número válido para las horas.");
            }
        }

        // TODO – COMPLETA EL MÉTODO PARA QUE EL CURSO SE GUARDE EN EL DAO
        // MUESTRA LOS MENSAJES DE ERROR O DE ÉXITO CORRESPONDIENTES.
        Curso curso = new Curso(codigo, nombre, horas);
        if (dao.buscarPorCodigo(codigo) == null) {
            dao.guardar(curso);
            System.out.println("Curso creado correctamente.");
        } else {
            System.out.println("Error: El curso ya existe.");
        }
    }

    private static void listarCursos() {

        // TODO – COMPLETA EL CÓDIGO PARA QUE SE MUESTREN EN CONSOLA LA INFORMACIÓN
        // DE LOS CURSOS EN EL SIGUIENTE FORMATO...

        System.out.println(dao.listar());

    }

    private static void matricularAlumno() {

        System.out.print("Dni del alumno: ");

        String dni = sc.nextLine();

        System.out.print("Nombre del alumno: ");

        String nombreAlumno = sc.nextLine();

        System.out.print("Código del curso: ");

        String codigoCurso = sc.nextLine();

        // busca el curso por código
        Curso curso = dao.buscarPorCodigo(codigoCurso);
        if (curso == null) {
            System.out.println("Error: El curso no existe.");
            return;
        }
        // si el curso existe, se crea el alumno y se matricula en el curso
        // tengo que  comprobar que el alumno no esté ya matriculado en el curso, 
       // como tengo un método que me permite buscar un alumno en el curso por su dni, 
       // lo uso para hacer esa comprobación
        if (curso.buscarAlumnoPorDni(dni) != null) {
            System.out.println("Error: El alumno ya está matriculado en este curso.");
            return;
        }else{
            Alumno alumno = new Alumno(dni, nombreAlumno);
            curso.matricularAlumno(alumno);
            System.out.println("Alumno matriculado correctamente.");
        }
                  
        System.out.println("Alumno matriculado correctamente.");

    }

    private static void listarMatriculaciones() {

        System.out.print("Código del curso del que quieres ver la lista de matriculados: ");

        String codigoCurso = sc.nextLine();

        // TODO – COMPLETA EL CÓDIGO PARA QUE SE MUESTREN EN CONSOLA LA //LISTA DE
        // MATRICULADOS DEL CÓDIGO DE CURSO INTRODUCIDO

    }

}
