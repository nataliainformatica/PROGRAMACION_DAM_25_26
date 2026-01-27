package modelo;

/**
 * Tiene un límite por operación • Si el importe supera el límite, el pago es
 * rechazado • Si no, usa el comportamiento normal de Tarjeta
 * 
 * 
 */
public class Cybertarjeta extends Tarjeta {

    private double limiteOperacion;

    public Cybertarjeta(String numero, String titular, double saldo, double limiteOperacion) {
       //public Tarjeta(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.limiteOperacion = limiteOperacion;
    }

    @Override
    public boolean pagar(double importe) {
        if (limiteOperacion > importe) {
            if(saldo>importe)
            saldo -= importe; 
            return true;
        }
        return false;
    }
}