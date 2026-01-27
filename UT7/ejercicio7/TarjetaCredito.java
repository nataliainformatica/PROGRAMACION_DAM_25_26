package modelo;

public class TarjetaCredito extends Tarjeta {

    private double limiteCredito;

    public TarjetaCredito(String numero, String titular, double saldo, double limiteCredito) {
        super(numero, titular, saldo);
        this.limiteCredito = limiteCredito;
    }

    /**
     * Permite pagar aunque el saldo sea insuficiente, hasta un límite. 
     */
    @Override
    public boolean pagar(double importe) {
        if (importe + saldo <= limiteCredito) {
            saldo -= importe;
            return true;
        }
        return true;
    }
}