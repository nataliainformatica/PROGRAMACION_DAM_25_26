import java.util.Scanner;
public class Ejercicio2Avanzado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dibujo ASCII de y = a x^2 + b x + c");
        System.out.print("Introduce a: ");
        double a = sc.nextDouble();
        System.out.print("Introduce b: ");
        double b = sc.nextDouble();
        System.out.print("Introduce c: ");
        double c = sc.nextDouble();

        // Configuración del lienzo
        int width = 80;    // columnas (x)
        int height = 25;   // filas (y)
        // rango del eje x que mostraremos
        double xMin = -10;
        double xMax = 25;

        // Calculamos yMin y yMax para la escala vertical
        // primero inicializamos los valores min y max a sus valores máximos, y después lo calculamos
        // este cálculo garantiza que el dibujo se escale bien sin importar los valores de a, b, c o el rango elegido.
        double yMin = Double.POSITIVE_INFINITY;
        double yMax = Double.NEGATIVE_INFINITY;
        int samples = 500;
        for (int i = 0; i <= samples; i++) {
            // asigna un valor de x dentro del rango
            double x = xMin + (xMax - xMin) * i / samples;
            // calculamos y usando la ecuación
            double y = a * x * x + b * x + c;
            yMin = Math.min(yMin, y);
            yMax = Math.max(yMax, y);
        }

        // Añadimos margen
        double yMargin = (yMax - yMin) * 0.1;
        yMin -= yMargin;
        yMax += yMargin;

        // Escalas
        double xScale = (xMax - xMin) / (width - 1);
        double yScale = (yMax - yMin) / (height - 1);

        // Crear lienzo
        char[][] canvas = new char[height][width];
        for (int r = 0; r < height; r++)
            for (int c2 = 0; c2 < width; c2++)
                canvas[r][c2] = ' ';

        // Dibujar la parábola
        for (int c2 = 0; c2 < width; c2++) {
            double x = xMin + c2 * xScale;
            double y = a * x * x + b * x + c;
            int r = (int) Math.round((yMax - y) / yScale); // fila desde arriba
            if (r >= 0 && r < height)
                canvas[r][c2] = '*';
        }

        // Dibujar ejes si están dentro del rango
        if (yMin <= 0 && yMax >= 0) {
            int row0 = (int) Math.round((yMax - 0) / yScale);
            if (row0 >= 0 && row0 < height)
                for (int c2 = 0; c2 < width; c2++)
                    if (canvas[row0][c2] == ' ')
                        canvas[row0][c2] = '-';
        }

        if (xMin <= 0 && xMax >= 0) {
            int col0 = (int) Math.round((0 - xMin) / xScale);
            if (col0 >= 0 && col0 < width)
                for (int r = 0; r < height; r++)
                    if (canvas[r][col0] == ' ')
                        canvas[r][col0] = '|';
        }

        // Mostrar cabecera
        System.out.println("\n   y = " + a + "x^2 + " + b + "x + " + c + "\n");

        // Imprimir lienzo
        for (int r = 0; r < height; r++) {
            System.out.print("|");
            for (int c2 = 0; c2 < width; c2++) {
                System.out.print(canvas[r][c2]);
            }
            System.out.println("|");
        }

        sc.close();
    }
}
