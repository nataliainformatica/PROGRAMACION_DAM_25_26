import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Crear una instancia de persona
        // usando adecuadamente el constructor
        // usar el método de consultarDatosAlumno
        // para mostrar los datos del alumno
        Scanner sc = new Scanner(System.in);


        Persona persona1; 
        
        String nombre, nia, matricula; 
        persona1 = new Persona();
        System.out.println("Introduce el nombre");
        nombre = sc.nextLine(); 
        System.out.println("Introduce el nia");
        nia = sc.nextLine();
        System.out.println("Introduce fecha matrícula");
        matricula = sc.nextLine(); 
        
        persona1.setNombreApellidos(nombre);
        persona1.setNIA(nia);
        persona1.setFechaMatricula(matricula);
      //  persona1= new Persona(nombre, nia, matricula);

        System.out.println(persona1.consultarDatosAlumno());

    }

}
