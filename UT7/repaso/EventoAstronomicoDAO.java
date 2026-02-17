import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class EventoAstronomicoDAO {

    private ArrayList<EventoAstronomico> eventos;

    public EventoAstronomicoDAO() {
        eventos = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
/*
private LocalDate fecha;
private LocalTime horaInicio;
private LocalTime horaFin;
private String descripcion;

*/

        // ==============================
        // ECLIPSES 
   //private TipoEclipse tipo;
  //private ArrayList <String> zonasVisibilidad;

        // ==============================

        eventos.add(new Eclipse(
                LocalDate.of(2024, 4, 8),
                LocalTime.of(17, 38),
                LocalTime.of(20, 55),
                "Eclipse solar total visible en Norteamérica",
                TipoEclipse.SOLAR_TOTAL,
                List.of("México", "Estados Unidos", "Canadá")
        ));

        eventos.add(new Eclipse(
                LocalDate.of(2026, 2, 17),
                LocalTime.of(9, 56),
                LocalTime.of(14, 27),
                "Eclipse solar anular (anillo de fuego)",
                TipoEclipse.SOLAR_ANULAR,
                List.of("Chile", "Argentina", "Antártida")
        ));

        eventos.add(new Eclipse(
                LocalDate.of(2026, 8, 12),
                LocalTime.of(17, 00),
                LocalTime.of(19, 30),
                "Eclipse solar total visible en España",
                TipoEclipse.SOLAR_TOTAL,
                List.of("España", "Groenlandia", "Islandia")
        ));

        eventos.add(new Eclipse(
                LocalDate.of(2025, 3, 14),
                LocalTime.of(3, 00),
                LocalTime.of(6, 00),
                "Eclipse lunar total",
                TipoEclipse.LUNAR_TOTAL,
                List.of("Europa", "África", "América")
        ));

        eventos.add(new Eclipse(
                LocalDate.of(2023, 10, 28),
                LocalTime.of(19, 35),
                LocalTime.of(23, 52),
                "Eclipse lunar parcial",
                TipoEclipse.LUNAR_PARCIAL,
                List.of("Europa", "Asia", "África")
        ));

        // ==============================
        // LLUVIAS DE METEOROS
// private String constelacionRadiante;
// private int meteorosPorHora; 
// private boolean visibleSinLuna;
// private int intensidadLimite; 
        // ==============================


        eventos.add(new LluviaMeteoros(
                LocalDate.of(2025, 8, 12),
                LocalTime.of(22, 0),
                LocalTime.of(4, 0),
                "Perseidas (máximo de actividad)",
                "Perseo",
                80,
                True,50

        ));

        eventos.add(new LluviaMeteoros(
                LocalDate.of(2025, 12, 14),
                LocalTime.of(21, 0),
                LocalTime.of(3, 0),
                "Gemínidas (máximo de actividad)",
                "Géminis",
                120,
                True,50
        ));

        eventos.add(new LluviaMeteoros(
                LocalDate.of(2025, 10, 21),
                LocalTime.of(23, 0),
                LocalTime.of(5, 0),
                "Oriónidas",
                "Orión",
                25,
                False,50
        ));
    }

    public List<EventoAstronomico> obtenerTodos() {
        return new ArrayList<>(eventos); // devuelve copia para proteger la lista interna
    }
}
