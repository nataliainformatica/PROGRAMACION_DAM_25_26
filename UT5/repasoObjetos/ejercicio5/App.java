/* 
Simular una caja registradora con la clase CajaTienda.

Debe permitir registrar productos vendidos (nombre y precio).

Métodos:

public void registrarProducto(String nombre, double precio)

public String mostrarProductos()

public double totalVenta()

public void reiniciarCaja()

Programa principal:

Registrar producto

Mostrar productos

Mostrar total venta

Reiniciar caja

Salir

*/
package principal;

import java.util.Scanner;

import clases.CajaTienda;

public class App {
    public static void main(String[] args) throws Exception {
        CajaTienda caja = new CajaTienda();
    
        menu(caja);
    }

    /**
     * Registrar producto
     * 
     * Mostrar productos
     * 
     * Mostrar total venta
     * 
     * Reiniciar caja
     * 
     * Salir
     */
    private static void menu(CajaTienda caja) {

        Scanner sc = new Scanner(System.in);
        String opcion;
        do{
        System.out.println("Simular una caja registradora con la clase CajaTienda.");
        System.out.println("1. Registrar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Mostrar total venta");
        System.out.println("4. Reiniciar caja");
        System.out.println("5. Salir");

        opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                // registrar producto
                System.out.println("Ingrese el nombre del producto:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el precio del producto:");
                try {
                    double precio = Double.parseDouble(sc.nextLine());
                    caja.registrarProducto(nombre, precio);
                } catch (Exception e) {
                    System.out.println("Precio inválido. Se actualizará a cero.");
                }
                break;
            case "2":
                // mostrar productos
                System.out.println(caja.mostrarProductos());
                break;
            case "3":
                // mostrar total venta
                System.out.println("Total venta: " + caja.totalVenta());
                break;
            case "4":
                // reiniciar caja
                caja.reiniciarCaja();
                System.out.println("Caja reiniciada.");
                break;
            case "5":
                // salir
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
                break;
        }}while(!opcion.equals("5"));

    }
}
