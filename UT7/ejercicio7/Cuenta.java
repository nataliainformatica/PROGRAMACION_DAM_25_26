package modelo;

/**
 * Crear una clase Cuenta, que tendrá como atributos
 * titular
 * y un listado de tarjetas que tiene asociadas, las tarjetas pueden ser de
 * cualquier tipo
 * Tarjeta, Tarjeta de Crédito, Tarjeta de Débido o Cybertarjeta
 * Puede tener como máximo 5 tarjetas
 * 
 * Tendrá además un método para añadir tarjetas al listado, que no permitirá
 * añadir más
 * de el máximo de las tarjetas permitidas.
 * Si no se puede añadir devolverá false.
 * La instancia se creará SIEMPRE sin ninguna tarjeta
 */
public class Cuenta {

    private String titular;
    private Tarjeta[] tarjetas;
    private final int MAX = 5;
    private int contador = 0;

    public Cuenta(String titular) {
        this.titular = titular;
        this.tarjetas = new Tarjeta[MAX];
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public boolean addTarjeta(Tarjeta tarjeta) {
        if (contador < MAX) {
            tarjetas[contador] = tarjeta;
            contador++;
            return true;
        }
        return false;
    }
    public boolean deleteTarjeta(Tarjeta tarjeta){
        // TODO
        return true; 
    }
    public boolean deleteTarjeta(int index){
        // TODO
        return true; 
    }

    // TODO
    // método mostrarListadoTarjetas
    // Tarjeta (numero) + Saldo (saldo)
    // si no hay ninguna tarjeta devolverá "Sin tarjetas"
    // no mostrará información tipo nulll

    public String mostrarInformacion() {

        StringBuilder sb = new StringBuilder();
        if (contador == 0)
            sb.append("Sin tarjetas");
        else {
            for (Tarjeta t : tarjetas) {
                sb.append(t.toString() + "\n");
            }
        }
        return sb.toString();

    }

    

}
