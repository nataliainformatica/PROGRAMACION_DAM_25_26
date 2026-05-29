package modelo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GestorTareas implements Guardable {
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(Tarea t) {
        tareas.add(t);
    }

    public void mostrarTareas() {
        // MOSTRAR TODAS LAS TAREAS
        // RECORRER EL BUCLE Y MOSTRAR
        for (Tarea t : tareas) {
            System.out.println(t);
        }

    }

    public void mostrarImportantes() {
        // MOSTRAR SOLO LAS TAREAS
        // CON PRIORIDAD >= 4

        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() >= 4) {
                System.out.println(tarea);
            }
        }
    }

    public String mostrarImportantes(boolean valor) {

        StringBuilder sb = new StringBuilder();
        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() >= 4) {
                sb.append(tarea.toString());
                sb.append("/n");
            }
        }
        return sb.toString();
    }

    @Override
    public void guardar(String fichero) {
        // GUARDAR LAS TAREAS - en fichero de text
        // titulo;prioridad;completada
        // EL ARRAY DE CLASE tareas
        StringBuilder sb = new StringBuilder();
        ArrayList<String> contenido = new ArrayList<>();
        contenido.add("titulo;prioridad;completada");
        for (Tarea tarea : tareas) {
            // para cada tarea
            sb.append(tarea.getTitulo());
            sb.append(";");
            sb.append(tarea.getPrioridad());
            sb.append(";");
            sb.append(tarea.isCompletada());
            sb.append("\n");
        }
        contenido.add(sb.toString());
        Path ruta = Path.of(fichero);
        try {
            Files.write(ruta, contenido);
        } catch (IOException e) {

        }
    }

    @Override
    public void cargar(String fichero) {
        // CARGAR DATOS DESDE FICHERO
        try {
            Path ruta = Path.of(fichero);
            List<String> contenido;
            List<Tarea> tareas = new ArrayList<>();
            contenido = Files.readAllLines(ruta);
            // cada línea del array, debo convertirla en un objeto
            // menos la cabecera
            //

            for (int i = 1; i < contenido.size() - 1; i++) {
                String[] atributos = contenido.get(i).split(";");
                // 0 - título, 1 - prioridad - 2 completada
                // como String, tengo que convertilo a su tipo
                String titulo = atributos[0];
                int prioridad = Integer.parseInt(atributos[1]);
                boolean completada = Boolean.parseBoolean(atributos[2]);
                tareas.add(new Tarea(titulo, prioridad, completada));
            }

        } catch (IOException c) {
            System.out.println();
        }

    }
}
