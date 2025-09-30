public class ImpresionConFormato {
    public static void main(String[] args) {
        
        // Entero con ancho fijo
        int numero = 42;
        System.out.printf("Número entero: %d%n", numero);

        // Decimal con 2 decimales
        double precio = 12.34567;
        System.out.printf("Precio con 2 decimales: %.2f%n", precio);

        // Relleno con ceros a la izquierda
        int codigo = 7;
        System.out.printf("Código con ceros: %04d%n", codigo);

        // Texto con ancho fijo
        String nombre = "Ana";
        System.out.printf("Nombre alineado a la derecha (10 espacios): %10s%n", nombre);
        System.out.printf("Nombre alineado a la izquierda (10 espacios): %-10s FIN%n", nombre);

        // Mostrar porcentaje
        double porcentaje = 0.853;
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje * 100);

        // Varias variables en un mismo print
        String producto = "Manzana";
        int cantidad = 5;
        double total = cantidad * 0.75;
        System.out.printf("Producto: %s | Cantidad: %d | Total: %.2f €%n", producto, cantidad, total);
    }
}
