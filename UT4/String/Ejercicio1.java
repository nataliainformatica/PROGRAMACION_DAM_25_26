import java.util.*;
/** Esta solución está hecha usando bucles (alguno infinito) con salidas tipo break 
 * 
 * MODIFÍCALO PARA NO USAR BREAK
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] codigos ={"0", "539", "759", "380", "560", "850", "50", "70", "890"};
        String[] paises = {"EEUU", "Irlanda", "Venezuela", "Bulgaria", "Portugal", "Cuba", "Inglaterra", "Noruega", "India"};
       
        
        while (true) {
            String codigo = sc.nextLine().trim();
            if (codigo.equals("0")) break; // fin de entrada
            
            // Determinar tipo de código y rellenar con ceros
            if (codigo.length() < 8) {
                codigo = String.format("%08d", Integer.parseInt(codigo));
            } else if (codigo.length() < 13) {
                codigo = String.format("%013d", Integer.parseInt(codigo));
            }

            int n = codigo.length();
            // convierte el número en dígito
            int digitoControl = codigo.charAt(n - 1) - '0';
            // int digito = Character.getNumericValue(codigo.charAt(i)); // más genérico

            int suma = 0;
            // multiplicarPor3  - true: multiplica por 3
            // false: multiplica por 1
            boolean multiplicarPor3 = true; // empieza desde la derecha, sin contar el control

            for (int i = n - 2; i >= 0; i--) {
                int digito = codigo.charAt(i) - '0';
                suma += digito * (multiplicarPor3 ? 3 : 1);
                multiplicarPor3 = !multiplicarPor3;
            }

            int resto = suma % 10;
            int calculado = (resto == 0) ? 0 : 10 - resto;

            if (calculado == digitoControl) {
                // Código correcto
                if (n == 13) {
                    String pais = "Desconocido";
                    for (int i=0;i<codigos.length;i++) {
                        if (codigo.startsWith(codigos[i])) {
                            pais = paises[i];
                            break;
                        }
                    }
                    System.out.println("SI " + pais);
                } else {
                    System.out.println("SI");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
