package miSolucion;

import java.util.ArrayList;
import java.util.Objects;

public class Curso {

    private String codigo;
    private String nombre;
    private int horas;
    private ArrayList<Alumno> alumnosMatriculados;

    /*
     * RAZONAMIENTO:
     * El código identifica el curso de forma única.
     * La lista de alumnos se inicializa vacía porque un curso se crea sin alumnos.
     */
    public Curso(String codigo, String nombre, int horas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
        this.alumnosMatriculados = new ArrayList<>();
    }

    // Getters necesarios

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public ArrayList<Alumno> getAlumnosMatriculados() {
        return alumnosMatriculados;
    }

    /*
     * Matricula alumno evitando duplicados.
     */
    public void matricularAlumno(Alumno a) {

        if (!alumnosMatriculados.contains(a)) {
            alumnosMatriculados.add(a);
        }
    }

    /*
     * Busca alumno por DNI
     */
    public Alumno buscarAlumnoPorDni(String dni) {

        for (Alumno a : alumnosMatriculados) {
            if (a.getDni().equals(dni)) {
                return a;
            }
        }
        return null;
    }

    /*
     * Dos cursos son iguales si tienen el mismo código.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return codigo.equals(curso.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {

        return "Código: " + codigo +
                " Nombre: " + nombre +
                " Horas: " + horas;
    }

}