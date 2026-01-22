import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.text.TabSet;

import es.avellaneda.modelo.Categoria;
import es.avellaneda.modelo.Estado;
import es.avellaneda.modelo.Tarea;

public class App {
    private static final int MAX = 20;
    private static  Tarea[] tareas = new Tarea[20];
    private static int contador =0;

    public static void main(String[] args) throws Exception {

        // En la clase principal, crearemos un array de tarea.    
        
        Tarea tarea = new Tarea("PRUEBA", Categoria.ESTUDIO, Estado.PENDIENTE, 
            LocalDate.of(2026, 2,03), LocalTime.of(17,55));
         Tarea tarea2 = new Tarea("PRUEBA", Categoria.ESTUDIO, Estado.PENDIENTE, 
            LocalDate.of(2026, 2,03), LocalTime.of(17,55));

        System.out.println("PRUEBA DE AÑADIR TAREA resultado");
        System.out.println(addTarea(tarea));
              System.out.println(addTarea(tarea2));
        System.out.println("LISTADO DE TODAS LAS TAREAS");
        mostrarTareas();
        System.out.println("LISTADO DE LAS TAREAS PENDIENTES");
        mostrarTareasPendientes();
    }
      /**
         * Añadiremos un método a la clase principal que nos permita añadir tareas, sin
         * embargo no permitirá añadir tareas duplicadas.
         */
     private static boolean addTarea(Tarea tarea){
        // si está duplicada tarea.equals devolverá un false
        // recorro el array comprobando si hay una tarea igual a la que voy a añadir
        for(int i =0; i<contador; i++){
            if(tarea.equals(tareas[i])){
                // si hay una tarea duplicada, no añado la tarea al array
                return false; 
            }
        }
        // si no he encontrado ninguna tarea duplicada, añado la tarea nueva en la posición vacía
        tareas[contador]= tarea; 
        contador++;

        return true;
        }

        //
//Probaremos a listar en la consola todas las tareas.
   private static void mostrarTareas(){
    for(Tarea t: tareas){
        if(t!= null)
        System.out.println(t);
    }
   }


//Probaremos a listar solamente las tareas que están pendientes. Usando el método isVencida, no el estado
private static void mostrarTareasPendientes(){
    for(Tarea t: tareas){
        if(t!= null && !t.isVencida()){
            System.out.println(t);
        }
    }
}

}
