import modelo.*;

public class App {
    public static void main(String[] args) {
/*
        Tarjeta tarjeta = new TarjetaDebito("A01", "Titular1", 1000);
        TarjetaCredito tc = new TarjetaCredito("A02", "Titular2", 1000, 1000);
        TarjetaDebito td = new TarjetaDebito("A03", "Titular3", 1000);

        Tarjeta[] tarjetas = new Tarjeta[3];

        tarjetas[0] = tarjeta;
        tarjetas[1] = tc;
        tarjetas[2]= td; 
         */


        // una instancia de cuenta
        // y añadirle una tarjeta de crédito


        Cuenta cuenta = new Cuenta("Titular");

        TarjetaCredito tj =new TarjetaCredito("A01", "Titulara", 1000, 2000);
        cuenta.addTarjeta(tj);

        cuenta.mostrarInformacion();
    }
}
