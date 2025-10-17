import java.util.Scanner;

public class Ejercicio6 {
/*PIEDRA, PAPEL O TIJERA 
 *  COMENZAMOS LA PARTIDA, 
 * DEFINIMOS CUÁL ES EL VALOR POR DEFECTO DE LA JUGADA DE LA MÁQUINA
 * PIEDRA, PAPEL O TIJERA
 * 
 * COMPROBAREMOS QUE LA JUGADA QUE INTRODUCE EL USUARIO ES VÁLIDA
 * (PIEDRA, PAPEL O TIJERA)
 * SI NO ES VÁLIDA, SEGUIREMOS PIDIENDO SU JUGADA
 * PEDIMOS AL USUARIO SU JUGADA
 *  EL JUEGO CONTINUARÁ, HASTA QUE EL USUARIO ADIVINE EL RESULTADO
 * 
 * 
 * 
*/

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    final String JUGADA_MAQUINA = "PAPEL"; 
    String jugada; 
    boolean continua; 

    do { 
        continua = true; 
        do{
        System.out.println("INTRODUCE UNA JUGADA");
        jugada = sc.nextLine();
        }while(!jugada.equals("PIEDRA") &&
        !jugada.equals("PAPEL") && 
        !jugada.equals("TIJERA"));

        if(jugada.equals(JUGADA_MAQUINA)){
            System.out.println("HAS GANADO");
            continua =false; 
        }else{
            System.out.println("SIGUE INTENTÁNDOLO");
        }
        
    } while (continua);
    

}



}
