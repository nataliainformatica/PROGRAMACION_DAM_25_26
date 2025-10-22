
import java.util.Scanner;
public class Ejercicio2 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir los coeficientes al usuario
        System.out.println("Introduce los coeficientes de la ecuacion cuadratica (y = ax^2 + bx + c):");
        System.out.print("Introduce el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Introduce el valor de c: ");
        double c = scanner.nextDouble();

        // 2. Calcular y mostrar la altura máxima
        if (a < 0) { // Una parábola con a<0 se abre hacia abajo, lo que es lógico para un lanzamiento

            // el vértice de la parábola  es donde la pendiente es cero, y esto ocurre en x = -b / (2a)
            double x_vertice = -b / (2 * a);
            // y la altura máxima es en el vértice de la parábola
            
            double y_maxima = a * Math.pow(x_vertice, 2) + b * x_vertice + c;
            System.out.printf("\nLa altura maxima de la pelota es de %.2f unidades, \n que se alcanza a una distancia de %.2f unidades.\n", y_maxima, x_vertice);
        } else {
            System.out.println("\nEl coeficiente 'a' debe ser negativo para que la pelota suba y luego baje.");
        }

        // 3. Calcular y mostrar la distancia total recorrida (raíces de la ecuación)
        double discriminante = b * b - 4 * a * c;

        if (discriminante >= 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            // La distancia es la raíz positiva que no sea el punto de partida (x=0)
            double distanciaTotal = 0;
            if (raiz1 >= 0) {
                distanciaTotal = raiz1;
            }
            if (raiz2 >= 0) {
                distanciaTotal = Math.max(distanciaTotal, raiz2);
            }
            
            System.out.printf("La pelota recorre una distancia horizontal TOTAL de %.2f unidades antes de llegar al suelo.\n", distanciaTotal);
        } else {
            System.out.println("La pelota nunca llega al suelo (no hay raices reales), probablemente un error en los datos.");
        }

        // 4. Comprobar si la pelota entra en la canasta
        System.out.print("\n¿Quieres comprobar si la pelota entra en una canasta? (s/n): ");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Introduce la distancia horizontal a la canasta: ");
            double distanciaCanasta = scanner.nextDouble();
            System.out.print("Introduce la altura de la canasta: ");
            double alturaCanasta = scanner.nextDouble();

            double alturaEnCanasta = a * Math.pow(distanciaCanasta, 2) + b * distanciaCanasta + c;

            // Se asume que entrará si está muy cerca de la altura de la canasta
            if (Math.abs(alturaEnCanasta - alturaCanasta) < 0.1) {
                System.out.println("¡La pelota entra en la canasta!");
            } else if (alturaEnCanasta > alturaCanasta) {
                System.out.printf("La pelota pasa por encima de la canasta (a una altura de %.2f).\n", alturaEnCanasta);
            } else {
                System.out.printf("La pelota cae por debajo de la canasta (a una altura de %.2f).\n", alturaEnCanasta);
            }
        }

}