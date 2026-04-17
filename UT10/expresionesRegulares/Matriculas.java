package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matriculas {


    public static void main(String[] args) {

        String texto = "Coche moderno 1234BCD y antiguo M-1234-AB. "
                     + "Otro coche 5678HJK y B-123456-Z.";
                      // patrón para cada palabra - word boundary - \b
                     // patrón para matrículas modernas: 4 dígitos seguidos de 3 letras (sin vocales ni Ñ)
                     //0000BBB (4 números + 3 letras)
                     // NO SE USAN : vocales, Ñ, Q, W, X
                
        String regexModerna = "\\b\\d{4}[BCDFGHJKLMNPRSTVWXYZ]{3}\\b";
             // patrón para matrículas antiguas: 1 o 2 letras, guion,
        String regexAntigua = "\\b[A-Z]{1,2}-\\d{4,6}-[A-Z]{1,2}\\b";
        // 1 o 2 letras, guion, 4 a 6 dígitos, guion, 1 o 2 letras


        Pattern patternModerna = Pattern.compile(regexModerna);
        Pattern patternAntigua = Pattern.compile(regexAntigua);

        Matcher m1 = patternModerna.matcher(texto);
        Matcher m2 = patternAntigua.matcher(texto);

        System.out.println("Matrículas modernas:");
        // buscamos todas las coincidencias de matrículas modernas en el texto
        while (m1.find()) {
            // cada coincedencia encontrada se muestra por pantalla usando group()
            System.out.println(m1.group());
        }

        System.out.println("\nMatrículas antiguas:");
        while (m2.find()) {
            System.out.println(m2.group());
        }
    }
}
