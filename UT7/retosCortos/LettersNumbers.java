public class LettersNumbers {

    public static String separarCambios(String texto) {

        // para evitar errores con texto nulo o muy corto
        if (texto == null || texto.length() <= 1) {
            return texto;
        }

        // no concatenamos String, usamos la clase StringBuilder
        StringBuilder resultado = new StringBuilder();
        // el primer caracter siempre se añade al resultado
        resultado.append(texto.charAt(0));

        // recorremos la cadena de caracteres empezando por el segundo caracter

        for (int i = 1; i < texto.length(); i++) {
            char actual = texto.charAt(i);
            char anterior = texto.charAt(i - 1);

            // Detectamos cambio de tipo
            // Si los tipos anterior y actual son distintos, insertamos el -
            if (esLetra(actual) != esLetra(anterior)) {
                resultado.append("-");
            }

            resultado.append(actual);
        }

        return resultado.toString();
    }


    private static boolean esLetra(char c) {
        // para saber si un carácter es una letra, podemos usar los valores ASCII
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
        // OTRA POSIBILIDAD ES USAR MÉTODOS DE LA CLASE CHARACTER     
          // Character.isLetter(c);
        //return Character.isLetter(c);
    }

    private static boolean esNumero(char c){
   //  para saber si un carácter es un número, podemos usar los valores ASCII
   return (c >= '0' && c <= '9');
           // OTRA POSIBILIDAD ES USAR MÉTODOS DE LA CLASE CHARACTER   
     //   return Character.isDigit(c);
    }

// PRUEBAS 

    public static void main(String[] args) {
        System.out.println(separarCambios("abc123def"));
        System.out.println(separarCambios("a1b2c3"));
        System.out.println(separarCambios("123abc"));
        System.out.println(separarCambios("abc"));
    }
}
