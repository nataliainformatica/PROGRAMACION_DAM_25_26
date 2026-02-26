package miSolucion;

import java.util.ArrayList;

public class DAO {
    private ArrayList<Curso> listaCursos;

    /*
     * Constructor inicializa la base de datos en memoria
     */

    public DAO() {
        this.listaCursos = new ArrayList<>();
    }

    /*
     * Guarda curso evitando duplicados
     * // pero tiene void, y por tanto para mostrar el mensaje de error al guardar
     * // será necesario hacer la verificación antes de llamar a este método, lo
     * cual no es ideal.
     */
    public boolean guardar(Curso c) {
        if (listaCursos.contains(c)) {
            System.out.println("Error: El curso ya existe en la base de datos.");
            listaCursos.add(c);
    }
    public Curso buscarPorCodigo(String codigo){
        for (Curso c : listaCursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null; // No se encontró el curso
    }

    public String listar(){
        StringBuilder sb = new StringBuilder();
        // si el array está vacío, se muestra un mensaje indicando que no hay cursos disponibles
        if (listaCursos.isEmpty()) {
            return "No hay cursos disponibles.";
        }
        for (Curso c : listaCursos) {
            sb.append(c.getCodigo()).append(" - ").append(c.getNombre()).append("\n");
        }
        return sb.toString();
    }

}
