
import java.util.Scanner;

public class Ejercicio7 {
/*
OBLIGATORIO, SOLO SE PUEDE USAR SCANEER.NEXTLINE
DEBERÁS CONVERTIR LOS DATOS AL TIPO DE DATO QUE NECESITES

 *  CAJERO AUTOMÁTICO SIMULADO
 *  Empieza con saldo 0
 * Muestra un menú: 
 * 1. Depositar
 * 2. Retirar
 * 3. Consultar
 * 4. Salir
 * 
 * EVITA SALDOS NEGATIVOS, NO SE PODRÁ RETIRAR SI EL SALDO ES NEGATIVO
 * 
 * 
 * 
 */

public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in); 
int saldoCajero =0; 
String opcion; 
String valorEnString;   // esta variable la usaré para la cantidad a retirar o depositar


// menú
do { 

    System.out.println("1.Depositar\n" + //
                "  2. Retirar\n" + //
                "  3. Consultar\n" + //
                "  4. Salir");
    System.out.println("INTRODUCE UNA OPCIÓN" );
    opcion = sc.nextLine(); 
    switch (opcion) { // switch (variable Consultada)
        case "1": // case  valor 
            // Depositar

            System.out.println("¿Cuánto quieres depositar");
            valorEnString = sc.nextLine(); 
            saldoCajero = saldoCajero + Integer.parseInt(valorEnString); 

            break;
        case "2": // RETIRAR
        System.out.println("¿Cuánto quieres retirar");
            valorEnString = sc.nextLine();
        if(saldoCajero >=  Integer.parseInt(valorEnString)){
        saldoCajero = saldoCajero -  Integer.parseInt(valorEnString); }
        else{
            System.out.println("NO HAY SUFICIENTE SALDO");
        }

            break; 
        case "3": // consultar
            System.out.println("EL SALDO EN EL CAJERO ES "+ saldoCajero);
            break; 
        case "4": 
         System.out.println( "SALIENDO DEL MENÚ");
            break; 
        default:
           System.out.println("OPCIÓN NO VÁLIDA");
    }

    
} while (!opcion.equals("4"));



}

}
