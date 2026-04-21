package modelo;

import java.util.*;

public class EstadisticasVotacion {

    private List<Mesa> mesas;

    public EstadisticasVotacion(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    // Total de votos generales
    public int totalVotos() {
        int total = 0;
        for (Mesa m : mesas) {
            total += m.getTotalVotos();
        }
        return total;
    }

    //  Total por partido
    public Map<String, Integer> votosPorPartido() {
        Map<String, Integer> resultados = new HashMap<>();

        resultados.put("A", 0);
        resultados.put("B", 0);
        resultados.put("C", 0);

        for (Mesa m : mesas) {
            resultados.put("A", resultados.get("A") + m.getVotosA());
            resultados.put("B", resultados.get("B") + m.getVotosB());
            resultados.put("C", resultados.get("C") + m.getVotosC());
        }

        return resultados;
    }

    // Partido ganador
    public String partidoGanador() {
        Map<String, Integer> votos = votosPorPartido();

        String ganador = "";
        int max = -1;

        for (String partido : votos.keySet()) {
            if (votos.get(partido) > max) {
                max = votos.get(partido);
                ganador = partido;
            }
        }

        return ganador;
    }

    // Porcentaje por partido
    public Map<String, Double> porcentajePorPartido() {
        Map<String, Integer> votos = votosPorPartido();
        Map<String, Double> porcentajes = new HashMap<>();

        int total = totalVotos();

        for (String partido : votos.keySet()) {
            double porcentaje = (votos.get(partido) * 100.0) / total;
            porcentajes.put(partido, porcentaje);
        }

        return porcentajes;
    }

    //  Mesa con más participación
    public Mesa mesaMayorParticipacion() {
        Mesa mejor = null;
        int max = -1;

        for (Mesa m : mesas) {
            if (m.getTotalVotos() > max) {
                max = m.getTotalVotos();
                mejor = m;
            }
        }

        return mejor;
    }

    //  Media de votos por mesa
    public double mediaVotosPorMesa() {
        if (mesas.isEmpty()) return 0;
        return totalVotos() / (double) mesas.size();
    }
}