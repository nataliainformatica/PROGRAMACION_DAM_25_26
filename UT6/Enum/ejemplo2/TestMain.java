public class TestMain{
// Método principal para probar
    public static void main(String[] args) {
        // Crear jugadores
        Jugador jugador1 = new Jugador("Juan Pérez", "15/03/1995", 1.85, 7, Posicion.BASE);
        Jugador jugador2 = new Jugador("Carlos Gómez", "10/07/1998", 2.01, 12, Posicion.PIVOT);
        Jugador jugador3 = new Jugador("Luis Martínez", "22/11/2000", 1.95, 23, Posicion.ESCOLTA);

        // Mostrar información de los jugadores
        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println(jugador3);
    }}
