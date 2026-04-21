package principal;
import java.util.*;

import modelo.EstadisticasVotacion;
import modelo.Mesa;

public class App {
    public static void main(String[] args) {

        List<Mesa> mesas = new ArrayList<>();

        mesas.add(new Mesa(1, "Madrid", 100, 80, 20, 5, 2));
        mesas.add(new Mesa(2, "Madrid", 120, 60, 30, 3, 1));
        mesas.add(new Mesa(3, "Madrid", 90, 110, 40, 4, 3));

        EstadisticasVotacion est = new EstadisticasVotacion(mesas);

        System.out.println("Total votos: " + est.totalVotos());

        System.out.println("Votos por partido: " + est.votosPorPartido());

        System.out.println("Partido ganador: " + est.partidoGanador());

        System.out.println("Porcentajes: " + est.porcentajePorPartido());

        System.out.println("Media votos/mesa: " + est.mediaVotosPorMesa());

        Mesa mejor = est.mesaMayorParticipacion();
        System.out.println("Mesa con más participación: " + mejor.getIdMesa());
    }
}