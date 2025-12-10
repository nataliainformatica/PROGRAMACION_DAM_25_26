package clases;

import java.time.LocalDate;

public class Persona {

    // dni, nombre , apellidos, edad
    // boolean borrar

    private String dni, nombre, apellidos; 
    private int edad; 

    // añadimos el atributo sueldo
    private double sueldo; 

   
    public Persona(String nombre,String dni, 
        String Apellidos, int anioNacimiento, double sueldo){
            this.nombre = nombre;
            this.apellidos = apellidos; 
            this.edad=LocalDate.now().getYear() - anioNacimiento  ; 
            this.dni = dni; 
            this.sueldo = sueldo; 
           
    }
  

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public double getSueldo(){
        return sueldo; 
    }

  

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

   

    




}
