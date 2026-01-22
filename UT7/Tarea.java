package es.avellaneda.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tarea {

    private String titulo;
    private Categoria categoria;
    private Estado estado;
    private LocalDate fechaAsignada;
    private LocalTime horaAsignada;

    public Tarea(String titulo, Categoria categoria, Estado estado, LocalDate fechaAsignada, LocalTime horaAsignada) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.estado = estado;
        this.fechaAsignada = fechaAsignada;
        this.horaAsignada = horaAsignada;
    }

    /**
     * Añadiremos un método a la clase Tarea, que devolverá un booleano:
     * true, si la tarea está vencida respecto a la fecha y hora actual.
     * false, si no está vencida.
     * 
     * @return
     */
    public boolean isVencida() {
        // LocalDate.now() me devuelve la fecha actual
        // LocalTime.now() me devuelve la hora actual
        // si la fecha es posterior devuelve false
        if (fechaAsignada.isAfter(LocalDate.now()))
            return false;

        // comprobar si la fechaAsignada de la instancia es inferior a la fecha actual
        // está vencida devuelve true
        if (fechaAsignada.isBefore(LocalDate.now()))
            return true;
        // si la fecha es igual, hay que ver la hora y aplicar el mismo criterio
        // si la horaAsignada is anterior a la hora actual, devuelve false
        if (horaAsignada.isBefore(LocalTime.now()))
            return false;

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + ((fechaAsignada == null) ? 0 : fechaAsignada.hashCode());
        result = prime * result + ((horaAsignada == null) ? 0 : horaAsignada.hashCode());
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
        Tarea other = (Tarea) obj;
        if (categoria != other.categoria)
            return false;
        if (fechaAsignada == null) {
            if (other.fechaAsignada != null)
                return false;
        } else if (!fechaAsignada.equals(other.fechaAsignada))
            return false;
        if (horaAsignada == null) {
            if (other.horaAsignada != null)
                return false;
        } else if (!horaAsignada.equals(other.horaAsignada))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tarea [titulo=" + titulo + ", categoria=" + categoria + ", estado=" + estado + ", fechaAsignada="
                + fechaAsignada + ", horaAsignada=" + horaAsignada + "]";
    }

    /**
     * Se define el criterio de que dos tareas son iguales si la fecha y hora son
     * iguales, y la categoría. El título podría ser distinto, así como el estado.
     * 
     */

    

}
