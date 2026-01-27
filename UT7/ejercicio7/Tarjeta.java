package modelo;

public class Tarjeta {
    // los atributos están en  protectec
    // las clases que hereden podrán tener visibilidad de los atributos

    protected String numero;
    protected String titular;
    protected double saldo;

    public Tarjeta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean pagar(double importe) {
        if (saldo >= importe) {
            // tengo saldo, puedo pagar
            saldo -= importe;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Número de tarjeta " + numero + " | Saldo: " + saldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((titular == null) ? 0 : titular.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarjeta other = (Tarjeta) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (titular == null) {
            if (other.titular != null)
                return false;
        } else if (!titular.equals(other.titular))
            return false;
        return true;
    }

  

    
}