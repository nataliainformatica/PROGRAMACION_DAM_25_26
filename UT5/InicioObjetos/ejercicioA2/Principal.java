package Ejercicio2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

          
       
        
        Persona persona1 = crearPersona(); 
        
        Persona persona2 = crearPersona();
        
        System.out.println(persona1.devolverDatos());
        System.out.println(persona2.devolverDatos());

    }

    private static Persona crearPersona() {
        Persona persona; 
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, dni, edadString;
        int edad;
        nombre = sc.nextLine();
        apellidos = sc.nextLine();
        dni = sc.nextLine();
        edadString = sc.nextLine();
        try {
            edad = Integer.parseInt(edadString);
        } catch (Exception ex) {
            System.out.println("La edad no es válida , te pongo la edad a cero");
            edad = 0;
        }
        persona = new Persona(nombre, apellidos, dni, edad);
        return persona; 
    }

}
