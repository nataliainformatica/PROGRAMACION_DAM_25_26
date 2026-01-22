package principal;

import java.util.Scanner;

import clases.Persona;

public class App {
    public static void main(String[] args) throws Exception {
      
        // instancia de persona

        //  public Persona(String nombre,String dni,   String Apellidos, int edad)
        
        final int MAX =3; 
        Scanner sc = new Scanner(System.in); 
        
        String nombre,apellido,dni;
        int anioNacimiento=0; 
        double sueldo=0; 
        double totalSueldos=0; 
        Persona[] personas = new Persona[3];

        for(int i=0; i<personas.length; i++){
            System.out.println("Nombre");
            nombre = sc.nextLine();
            System.out.println("Apellidos");
            apellido = sc.nextLine();
            System.out.println("DNI");
            dni = sc.nextLine();
             try{
            System.out.println("Año nacimiento");
            anioNacimiento = Integer.parseInt(sc.nextLine());
            System.out.println("Sueldo ");
           
            sueldo = Double.parseDouble(sc.nextLine());
            }catch(Exception e){
                System.out.println("El valor no es válido, lo pondremos a 0");
                
                sueldo = 0; 
            }
            //(String nombre,String dni, String Apellidos, int anioNacimiento, double sueldo)
            personas[i]= new Persona(nombre, dni, apellido, anioNacimiento,sueldo);

            for(Persona p: personas){
                totalSueldos += p.getSueldo(); 
                
            }
        System.out.println("El total de sueldos es " + totalSueldos);

        }

        

    }
}
