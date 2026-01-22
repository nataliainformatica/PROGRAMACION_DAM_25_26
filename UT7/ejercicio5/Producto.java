package modelo;

public class Producto {
    // los atributos están privados

    private String nombre;
    private int precio;
    public Producto(){
        this.nombre = "sin nombre";
        this.precio =0; 

    }


    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio; 

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    } 


    public String mostrarInformacion(){

        return "El producto es " +nombre + " y tiene un precio de " + precio;   

    }

    
}
