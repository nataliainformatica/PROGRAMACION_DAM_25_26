// Definición del Enum para las posiciones
public enum Posicion {
    BASE,
    ESCOLTA,
    ALERO,
    ALA_PIVOT,
    PIVOT
}

// Clase Jugador
public class Jugador {
    private String nombre;
    private String fechaNacimiento;
    private double altura;
    private int dorsal;
    private Posicion posicion;

    // Constructor
    public Jugador(String nombre, String fechaNacimiento, double altura, int dorsal, Posicion posicion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    // Método toString para mostrar los datos del jugador
    @Override
    public String toString() {
        return "Jugador: " + nombre + "\n" +
               "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
               "Altura: " + altura + " m\n" +
               "Dorsal: " + dorsal + "\n" +
               "Posición: " + posicion + "\n";
    }

   
}
