package modelo;

public class ProductoNoPerecedero extends Producto{
    private String tipo; 
    private double descuento;

    public ProductoNoPerecedero(String nombre, int precio, String tipo, double descuento) {
        super(nombre, precio);
        this.tipo = tipo;
        this.descuento = descuento;
    }
         
    public ProductoNoPerecedero(){
        //super();
        this.tipo ="sin tipo";
        this.descuento =0;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
  public double aplicarPromocion(){
    return getPrecio() -(getDescuento()*descuento); 
  }
    @Override
    public String mostrarInformacion() {
        String add = " con un descuento  de " + descuento + " y un tipo "+ tipo; 
        return super.mostrarInformacion() + add ;
    }
 /* 
 // si queremos cancelar completamente el método y no usar el método de la clase padre
 @Override
    public String mostrarInformacion() {
        
        return "Producto no perecedero  del tipo " + tipo + " "+ getNombre()
        + " vale " + getPrecio() ;
    }
*/
   
    




}
