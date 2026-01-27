package modelo;

public class TarjetaDebito extends Tarjeta {

    private double comision;
    private final int COMISION =1; 

    public TarjetaDebito(String numero, String titular, double saldo, double comision) {
    //  public Tarjeta(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.comision = comision;
    }

    public TarjetaDebito(String numero, String titular, double saldo) {
         super(numero, titular, saldo);
        this.comision = COMISION;
    }


    @Override
    public boolean pagar(double importe) {
        double total = importe + comision;

        if (saldo >= total) {
            saldo -= total;
            return true;
        }
        return false;
    }
}