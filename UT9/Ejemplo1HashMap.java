import java.util.HashMap;
import java.util.Scanner;

public class Agenda {
    private static final String SALIR = "4";
    private static Scanner sc = new Scanner(System.in);
    private static String opcion;

    private static HashMap<Integer, String> agenda = new HashMap<>();

    public static void main(String[] args) {
        do {
            menu();
            System.out.println("Introduce un valor ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    try {
                        Integer clave = introduceValor();
                        System.out.println("Introduce el nombre del contacto");
                        String contacto = sc.nextLine();
                        agenda.put(clave, contacto);
                    } catch (NumberFormatException e) {
                        System.out.println("El valor no es un número");
                    }
                    break;
                case "2":
                    try {
                        System.out.println("¿Qué número quieres consultar ?");
                        Integer clave = introduceValor();
                        System.out.println("El contacto es:  "+ agenda.get(clave));
                    } catch (NumberFormatException e) {
                        System.out.println("El valor no es un número");
                    }
                    break; 
                case "3":
                    System.out.println("MOSTRAR TODOS OS CONTACTOS ");
                    for(HashMap.Entry<Integer,String> entrada: agenda.entrySet()){
                        System.out.println("Contacto " + entrada.getValue()+ entrada.getKey() );
                    }
                    break;
                default:
                    break;
            }
        } while (!opcion.equals(SALIR));

    }

    private static void menu() {
        System.out.println("1.Insertar contacto ");
        System.out.println("2. Consultar contacto ");
        System.out.println("3. Mostrar todos");
        System.out.println("4. Salir ");
    }

    // aunque el código es muy corto el del método
    // se queda así, para insistir en el concepto de
    // propagar exepciones
    private static Integer introduceValor() {
        Integer valor;
        System.out.println("Introduce el número de teléfono");
        valor = sc.nextInt();
        return valor;
    }

}
