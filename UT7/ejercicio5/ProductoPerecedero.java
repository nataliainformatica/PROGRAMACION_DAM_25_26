package modelo;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {

    private int diasParaCaducar;
    private final double DTO1 = 0.5;
    private final double DTO2 = 0.75;

    

    public ProductoPerecedero() {
        // super();
        this.diasParaCaducar = 0;
    }

    public ProductoPerecedero(String nombre, int precio, int diasParaCaducar) {
        super(nombre, precio);
        this.diasParaCaducar = diasParaCaducar;
    }

    /**
     * Si quedan menos de tres días se hace un descuento del 50%
     * Si queda menos de un día se hace un 75 % de descuento.
     * 
     * @return
     */
    public double calcularPrecioFinal() {
        if (diasParaCaducar < 3)
            // aplicar un descuento del 50% al precio del producto
            return getPrecio() - (getPrecio() * DTO1);
        else if (diasParaCaducar > 1)
            return getPrecio() - (getPrecio() * DTO2);
        return getPrecio();
    }

    public LocalDate devolverFechaCaducidad() {
        return LocalDate.now().plusDays(diasParaCaducar);
    }

    @Override
    public String mostrarInformacion() {
        String add = " tiene " + diasParaCaducar  + " para caducar "; 
        return super.mostrarInformacion() + add ;
    }

}
