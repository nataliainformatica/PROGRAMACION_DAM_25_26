package modelo;

public interface Guardable {
    void guardar(String fichero);

    void cargar(String fichero);
}