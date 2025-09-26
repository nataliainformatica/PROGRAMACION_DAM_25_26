import java.util.Scanner;

public class EjercicioVariables {

/*
 * Completa una aplicación, que mostrará la siguiente información:
 *  "CÁLCULARÉ CUÁNTOS AÑOS TENDRÁS EN EL 2057"

Debes completar el código, pidiendo la información que necesites al usuario, para después informarle:

"SI AHORA TIENES XXX AÑOS" "EN EL AÑO 2057 TENDRÁS YYY"

Lógicamente XXX e YYY son valores calculados según la edad que introdudza el usuario.

Añade al inicio de la aplicación un comentario de varias líneas, explicando el algoritmo o resolución que vas a utilizar Añade también un comentario, junto con la definición de la variable, indicando el tipo de dato que has elegido.
 */

/* 
   usaré una constante para el año futuro
  usaré una constante para el año actual
  hago el cálculo en otra variable   "diferencia" que será la que utilizo 
  en todo el código para el cálculo de la edad
  usaré una variable para la edad que ponga el usuario
  la edad futura, será el cálculo de la edadActual  + diferencia

 /*
  * 

  */

    public static void main(String[] args) throws Exception {
        // entre { ... } es un bloque de código
      

        // definición de variables
        final int ANIO_FINAL =2057; 
        final int ANIO_ACTUAL=2025; 
        Scanner lecturaTeclado = new Scanner(System.in);



        int diferencia = ANIO_FINAL - ANIO_ACTUAL; 
        int edadActual;
        int edadFutura; 


        System.out.println("CÁLCULARÉ CUÁNTOS AÑOS TENDRÁS EN EL 2057");
        System.out.println("Dime tu edad actual");
        edadActual = lecturaTeclado.nextInt();

        edadFutura = edadActual + diferencia; 
        System.out.println("Tu edad en el " + ANIO_FINAL + " será: " + edadFutura);




    }
}
