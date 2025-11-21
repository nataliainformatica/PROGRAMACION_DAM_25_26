public class Coche {

    // constructor
    public Coche(String color, String marca, String matricula){
      this.color = color;
        this.marca =marca;
        this.matriculaCoche = matricula;  

    }

public Coche(String marca) {
        this.marca = marca;
    }


    
 // Atributos
 private String color; 
 private String marca;
 private String matriculaCoche; 
 // Métodos
 void arrancar() {
 System.out.println("El coche  "  + marca + " está arrancando.");
 }
 void frenar() {
 System.out.println("El coche está frenando.");
 }
}