import modelo.ProductoNoPerecedero;
import modelo.ProductoPerecedero;

public class App {

    /**
     * rea instancias de ambas subclases (ProductoPerecedero y ProductoNoPerecedero). Muestra la información y llama a los métodos específicos de cada subclase.
     * @param args
     */
    public static void main(String[] args)  {

        ProductoNoPerecedero np = new ProductoNoPerecedero(); 
        //    public ProductoNoPerecedero(String nombre, int precio, String tipo, double descuento) {
        System.out.println(np.mostrarInformacion());


         ProductoNoPerecedero np1 = new ProductoNoPerecedero("Zapatillas", 
            100, "ocio", 0.25); 
                System.out.println(np1.mostrarInformacion());
                System.out.println("Precio FInal " + np1.aplicarPromocion());

    ProductoPerecedero p = new ProductoPerecedero();
    //     public ProductoPerecedero(String nombre, int precio, int diasParaCaducar) {
        System.out.println(p.mostrarInformacion());
    ProductoPerecedero p1 = new ProductoPerecedero("pan bimbo", 2, 2);
        System.out.println(p1.mostrarInformacion());
        System.out.println("La fecha de caducidad es " + p1.devolverFechaCaducidad());
        System.out.println("El precio final es " + p1.calcularPrecioFinal());


    }
     
}
