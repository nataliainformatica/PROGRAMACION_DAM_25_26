import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        /*
         * MUESTRA UN MENÚ EN EL QUE EL USUARIO ELIGE UNA OPCIÓN
         * // SOLAMENTE SE SALE DEL MENÚ PULSANDO 3
         * SI EL USUARIO PULSA LA OPCIÓN 1
         * LE PREGUNTAREMOS LA EDAD
         * SI ES MAYOR o IGUAL DE 18, MOSTRAREMOS EL MENSAJE "NO HAY DESCUENTO"
         * SI ES MAYOR DE 8 - MENOR DE 18, , MOSTRAREMOS EL MENSAJE "DESCUENTO DEL 50 %"
         * SI ES MENOR O IGUAL A 8, MOSTREMOS EL MENSAJE "GRATIS"
         * 
         * SI PULSA LA OPCIÓN 2 : "EN CONSTRUCCIÓN"
         * 
         * OBLIGATORIO: LAS OPCIONES DE MENÚ DEBEN HACERSE USANDO UN SWITCH - CASE
         * OBLIGATORIO: USAR nextLine() para la captura por pantalla
         * 
         */

        Scanner sc = new Scanner(System.in);
        String opcion;
        String edad;
        int edadEntero;
        do {
            System.out.println("PULSA UNA OPCIÓN - 3 para salir");
            System.out.println("PULSA 1 PARA SABER TU DESCUENTO");
             System.out.println("PULSA 2 PARA EL FUTURO");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Cuál es tu edad");
                    edad = sc.nextLine();
                    edadEntero = Integer.parseInt(edad);
                    if (edadEntero >= 18) {
                        System.out.println("NO HAY DESCUENTO");
                    } else if (edadEntero < 18 && edadEntero > 8) {
                        System.out.println("DESCUENTO DEL 50 %");
                    } else if (edadEntero < 8) {
                            System.out.println("GRATIS");
                    }
                    break;
                case "2":
                    System.out.println("EN CONSTRUCCIÓN");
                    break; 
               
                    
            }

        } while (!opcion.equals("3"));

    }
}
