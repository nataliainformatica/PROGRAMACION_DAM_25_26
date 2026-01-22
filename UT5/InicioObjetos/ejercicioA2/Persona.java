package Ejercicio2;

/**
 * Crea un programa con una clase llamada Persona que representará los datos
 * principales de una persona: dni, nombre, apellidos y edad.
 * 
 * En el main de la clase principal instancia dos objetos de la clase Persona.
 * Luego, pide por teclado los datos de ambas personas (guárdalos en los
 * objetos). Por último, imprime dos mensajes por pantalla (uno por objeto) con
 * un mensaje del estilo “Azucena Luján García con DNI … es / no es mayor de
 * edad”.
 */

public class Persona {

    private String nombre, apellidos, dni; 
    private int edad;

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    } 
    
    // añado los getters y los setters

    //  mensaje del estilo “Azucena Luján García con DNI … es / no es mayor de edad”.
    public String devolverDatos(){

        StringBuilder sb = new StringBuilder(); 
        sb.append(nombre); 
        sb.append(" con ");
        sb.append(dni); 
        if(edad >= 18){
            sb.append(" es ");
        }else{
            sb.append(" no ");
        }
        sb.append("mayor de edad"); 
        return sb.toString(); 


    }




}
