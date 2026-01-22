package es.avellaneda.ejercicio1;

import java.time.LocalDate;

/*
Crearemos una clase llamada Tarea, donde cada tarea tiene un nombre, una descripción 
y una fecha de vencimiento (utilizando LocalDate).


 */
public class Tarea {
    private String nombre, descripcion; 
    private LocalDate fechaVencimiento;

    public Tarea(){
        
    }

    public Tarea(String nombre, String descripcion, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }



   
    @Override
    public String toString() {
        return "Tarea [nombre=" + nombre + ", descripcion=" + descripcion + ", fechaVencimiento=" + fechaVencimiento
                + "]";
    } 

   

    

    

}
