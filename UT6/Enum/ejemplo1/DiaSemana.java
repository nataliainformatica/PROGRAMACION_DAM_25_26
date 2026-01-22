// Definimos el Enum
public enum DiaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}

// Clase principal para trabajar con el Enum
public class HorarioSemanal {

    // Método que asigna actividades según el día de la semana
    public static String actividadDelDia(DiaSemana dia) {
        switch (dia) {
            case LUNES:
                return "Ir al gimnasio.";
            case MARTES:
                return "Clase de inglés.";
            case MIERCOLES:
                return "Reunión de trabajo.";
            case JUEVES:
                return "Comprar comida.";
            case VIERNES:
                return "Salir con amigos.";
            case SABADO:
                return "Día de descanso.";
            case DOMINGO:
                return "Planificar la semana.";
            default:
                return "Sin actividad.";
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Usamos el Enum
        DiaSemana dia = DiaSemana.LUNES;

        System.out.println("Actividad para el " + dia + ": " + actividadDelDia(dia));

        // Iterar sobre todos los valores del Enum
        System.out.println("\nLista de actividades semanales:");
        for (DiaSemana d : DiaSemana.values()) {
            System.out.println(d + ": " + actividadDelDia(d));
        }
    }
}

/**
Explicación del código:
El enum DiaSemana:

Es una lista de constantes que representan los días de la semana.

Es útil cuando queremos manejar un conjunto fijo de valores (en este caso, los días).

Método actividadDelDia:

Usa un switch para devolver una actividad diferente según el día.

Método main:

Muestra cómo trabajar con una constante específica del enum (LUNES).

Usa el método values() para iterar sobre todos los valores del enum.
**/
