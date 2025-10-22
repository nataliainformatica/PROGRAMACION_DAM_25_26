import java.util.*;

public class Ejercicio1 {

    /***
     * DEBERÁS COMPLETAR EL CÓDIGO PARA HACER UNA CALCULADORA, QUE TENDRÁ 4
     * FUNCIONES: SUMAR - RESTAR - MULTIPLICAR O DIVIDIR
     * 
     * PIDE AL USUARIO 2 NÚMEROS
     * PIDE AL USUARIO QUÉ QUIERE HACER
     * DEPENDIENDO DE LA OPCIÓN ELEGIDA, EL CÓDIGO USARÁ LA
     * FUNCIÓN CORRESPONDIENTE (SUMAR - RESTAR...)
     * Y MOSTRARÁ EL RESULTADO
     * 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, resultado=0;
        int opcion;
        System.out.println("CALCULADORA ");
        System.out.println("DIME EL PRIMER NÚMERO");
        numero1 = sc.nextInt();
        System.out.println("DIME EL SEGUNDO NÚMERO");
        numero2 = sc.nextInt();

        System.out.println("¿QUÉ OPERACIÓN QUIERES HACER");
        System.out.println("1.SUMAR \n2.RESTAR \n3.MULTIPLICAR \n4.DIVIDIR");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
            resultado = sumar(numero1, numero2);
                break;
            case 2:
            resultado = restar(numero1, numero2);
                break;
            case 3:
            resultado = multiplicar(numero1, numero2);
                break;
            case 4:
            resultado = dividir(numero1, numero2);
                break;
            default:
                System.out.println("OPCIÓN NO VÁLIDA");

        }
        
        System.out.println("EL RESULTADO DE LA OPERACIÓN ES " + resultado);

    }

    public static int sumar(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;

    }
     public static int restar(int n1, int n2) {
        int resultado = n1 - n2;
        return resultado;

    }
     public static int multiplicar(int n1, int n2) {
        int resultado = n1 * n2;
        return resultado;

    }
     public static int dividir(int n1, int n2) {
        int resultado = n1 / n2;
        return resultado;

    }

}
