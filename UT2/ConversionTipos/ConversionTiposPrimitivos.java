package UT2.ConversionTipos;
 /*
     * 
     * Ejercicios propuestos:

Entero a double
Declara una variable int con un valor cualquiera y asígnala a una variable double. Muestra ambas en pantalla para comprobar el cambio.

Short a int
Declara una variable short y asígnala a una variable int. Imprime los valores para ver la conversión.

Char a int
Declara una variable char con una letra y asígnala a una variable int. Imprime el valor entero que representa el código Unicode del carácter.

Int a long
Declara una variable int y asígnala a una variable long. Comprueba que el valor se conserva.

Float a double
Declara una variable float con un número decimal y asígnala a una variable double. Imprime los valores.

Operaciones mixtas (int + double)
Declara un int y un double. Súmalos y guarda el resultado en una variable double. Imprime el resultado.

Operaciones mixtas (byte + int)
Declara un byte y un int. Súmalos y guarda el resultado en una variable int. Imprime el resultado.
     */
public class ConversionTiposPrimitivos {
   

     public static void main(String[] args) {
        
  
        // 1. Entero a double
        int numeroEntero = 42;
        double numeroDouble = numeroEntero; // conversión implícita
        System.out.println("int -> double: " + numeroEntero + " -> " + numeroDouble);

        // 2. Short a int
        short numeroShort = 123;
        int numeroInt = numeroShort; // conversión implícita
        System.out.println("short -> int: " + numeroShort + " -> " + numeroInt);

        // 3. Char a int
        char letra = 'A';
        int codigoUnicode = letra; // conversión implícita
        System.out.println("char -> int: '" + letra + "' -> " + codigoUnicode);

        // 4. Int a long
        int valorInt = 1000;
        long valorLong = valorInt; // conversión implícita
        System.out.println("int -> long: " + valorInt + " -> " + valorLong);

        // 5. Float a double
        float numeroFloat = 12.34f;
        double numeroDouble2 = numeroFloat; // conversión implícita
        System.out.println("float -> double: " + numeroFloat + " -> " + numeroDouble2);

        // 6. Operaciones mixtas (int + double)
        int num1 = 5;
        double num2 = 2.5;
        double resultado1 = num1 + num2; // int se convierte a double
        System.out.println("int + double = " + resultado1);

        // 7. Operaciones mixtas (byte + int)
        byte numByte = 10;
        int numInt2 = 50;
        int resultado2 = numByte + numInt2; // byte se convierte a int
        System.out.println("byte + int = " + resultado2);


     }
}
