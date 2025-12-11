package clases;

/**
 * Métodos:
 * 
 * public void llenar(double litros)
 * 
 * public void vaciar(double litros)
 * 
 * public double nivelActual()
 * 
 * public boolean estaVacio()
 * 
 * public boolean estaLleno()
 * 
 * public void vaciarCompleto()
 * 
 * Reglas:
 * 
 * El nivel nunca puede sobrepasar la capacidad.
 * 
 * El nivel nunca puede bajar de 0.
 */

public class DepositoAgua {

    private double capacidadMaxima;
    private double capacidadActual;

    /**
     * Como no se establece en el enunciado, la solución adoptada en este código
     * es que el nivelActual en el momento de crear el depósito es 0.
     * En el caso de capacidadMaxima, definimos que será pasada por el constructor
     * y después no se podrá modificar.
     * 
     */
    public DepositoAgua(double capacidadMaxima) {
        this.capacidadMaxima = capacidadActual;
        this.capacidadActual = 0;
    }

    public double nivelActual() {
        return capacidadActual;
    }

    public void vaciarCompleto() {
        capacidadActual = 0;
    }

    public boolean estaVacio() {
        return (capacidadActual == 0) ? true : false;
    }

    public boolean estaLleno() {
        return (capacidadActual == capacidadMaxima) ? true : false;
    }

    /**
     * Como el tipo de devolucion es void, asumimos para el desarrollo
     * que si se pasan más litros de la capacidad de llenado
     * el resto se tira
     * 
     */
    public void llenar(double litros) {
        capacidadActual = capacidadActual + litros;
        if (capacidadActual >= capacidadMaxima)
            capacidadActual = capacidadMaxima;

    }

    public void vaciar(double litros) {
        capacidadActual = capacidadActual - litros;
        if (capacidadActual <= 0)
            capacidadActual = 0;
    }

}
