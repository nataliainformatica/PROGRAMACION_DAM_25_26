package modelo;

public class Tarea {
    private String titulo;
    private int prioridad;
    private boolean completada;

    public Tarea(String titulo, int prioridad, boolean completada) {
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // TODO - REVISAR SI IMPLEMENTAMOS EQUALS

    @Override
    public String toString() {
        return titulo + " - Prioridad: " + prioridad +
                " - " + (completada ? "Completada" : "Pendiente");
    }
}