package clases;

import java.util.Arrays;

/*
Debe permitir registrar productos vendidos (nombre y precio).

Métodos:

public void registrarProducto(String nombre, double precio)

public String mostrarProductos()

public double totalVenta()

public void reiniciarCaja() */
public class CajaTienda {

    private String[] productos; 
    private double[] precios;
    private int contador;

    public CajaTienda(){
        this.productos = new String[100];
        Arrays.fill(this.productos, "");
        this.precios = new double[100];
        this.contador = 0; 
    }

public void registrarProducto(String nombre, double precio){
    if(contador < 100) {
        this.productos[contador] = nombre;
        this.precios[contador] = precio;
        contador++; 
    }   
}
public String mostrarProductos(){
    StringBuilder productos = new StringBuilder();
    for (int i = 0; i < contador; i++) {
        productos.append(this.productos[i]).append(" - ").append(this.precios[i]).append("\n");
    }
    return productos.toString();
}

public double totalVenta(){
    double total = 0;
    for (int i = 0; i < contador; i++) {
        total += this.precios[i];
    }
    return total;
}
public void reiniciarCaja(){
    this.productos = new String[100];
    // Arrays.fill(this.productos,"");
    this.precios = new double[100];
    this.contador = 0;
}

@Override
public String toString() {
    return "CajaTienda [productos=" + Arrays.toString(productos) + "\n total =" + totalVenta()
            + ", contador=" + contador + "]";
}



}
