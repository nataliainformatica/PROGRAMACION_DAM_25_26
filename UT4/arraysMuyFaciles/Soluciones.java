import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Soluciones {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

       // ejercicio1();
       // ejercicio6();
        // ejercicio8();
        ejercicio21();
    }

    /**
     * Crea un programa que pida diez números reales por teclado, los almacene en un
     * array, y luego muestre todos sus valores.
     */

    public static void ejercicio1() {

        final int MAX = 10;
        int[] diezNumeros = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            System.out.println("Introduce un número ");

            try {
                diezNumeros[i] = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                // dejaremos un cero en la posición donde no se ha introducido un
                // número correcto
            }
        }
        for (int n : diezNumeros) {
            System.out.println(n);
        }

        // es lo mismo
        for (int i = 0; i < MAX; i++) {
            System.out.println(diezNumeros[i]);
        }

    }

    /*
     * Crea un programa que pida dos valores enteros N y M,
     * luego cree un array de tamaño N, escriba M en todas sus posiciones y lo
     * muestre por pantalla.
     */
    public static void ejercicio6() {

        int tamanio; // N
        int valor; // M
        int[] numeros; 
        System.out.println("TAMAÑO DEL ARRAY");
        tamanio = pedirNumero(); 
        numeros = new int[tamanio];
        System.out.println("NÚMERO PARA RELLENAR EL ARRAY");
        valor =pedirNumero(); 

        for(int i=0; i<numeros.length;i++){
            numeros[i]= valor; 
        }
        for(int n: numeros){
            System.out.print(n);
            System.out.print("-");
        }

    }

    private static int pedirNumero() {
        int numero = 0;
        boolean continua = true;
        while (continua) {

            System.out.println("Introduce un número ");
            try {
                numero = Integer.parseInt(sc.nextLine());
                continua = false;
            }

            catch (Exception ex) {
                System.out.println("Debes introducir un NÚMERO");
            }
        }
        return numero;
    }

    /**
     * Crea un programa que cree un array con 100 números enteros aleatorios entre 0 y 200, 
     * utilizando Math.random()- o la clase Random, y luego le pida al usuario un valor entero E. 
     * Por último, mostrará cuántos valores del array son igual o superiores a E.
     */

    public static void ejercicio8(){

    Random r = new Random(); 

    final int MAX =100; 
    final int NUMEROS = 200; 
    int[] array = new int[MAX]; 
    int contador=0; 
    int E; 

    double a= (int)(Math.random()*NUMEROS );
  
    for(int i= 0; i<MAX; i++){
        array[i]= (int)(Math.random()*NUMEROS );

        // array[i]= r.nextInt(200);
    }

        E= pedirNumero();
    for(int n: array){
        System.out.println(n + "-");
        if(n>= E){
            contador++;
        } 
    }
    System.out.println("EN EL ARRAY APARECE EL VALOR " + E + "O MAYOR QUE E: " + contador + " VECES");
  
    }


    /*
     * Utilizando arrays
     * Pedimos al usuario que introduzca una cadena de caracteres que tenga una longitud de 25 caracteres
     * 
     * Si la candena no tiene longitud 25, se completará con ****
     * 
     * Después  vamos a hacer el cifrado siguiente: sustituye las 'a' por 'e' y las 'e' por 'a'
     */

    public static void ejercicio21(){
        final int LONGITUD = 25; 
        String cadena; 
        char[] cadenaChar; 
        System.out.println("Introduce una cadena de caracteres de longitud 25");

        cadena = sc.nextLine(); 
        if(cadena.length()< LONGITUD){
            for(int i=0; i<(LONGITUD-cadena.length()) ; i++){
                cadena = cadena+"*";
            }
            
        }
        cadenaChar = cadena.toCharArray(); 

        for(int i =0; i< cadenaChar.length; i++){
            if(cadenaChar[i] =='a')
            cadenaChar[i]='e';
            else if(cadenaChar[i]=='e')
            cadenaChar[i]='a';
        }

        for(char a: cadenaChar){
            System.out.print(a);
        }

        System.out.println(Arrays.toString(cadenaChar));
       

    }


    }
