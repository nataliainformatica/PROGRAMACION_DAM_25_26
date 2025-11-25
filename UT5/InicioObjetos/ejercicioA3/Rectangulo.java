package EjercicioA3;

/**
 * Ejercicio A3 – Rectángulo
 * 
 * Crea un programa con una clase llamada Rectangulo que representará un
 * rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que
 * la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2.
 * 
 * En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5)
 * y (7,9)(2,3).
 * El Rectángulo tiene un método, que devuelve el área,
 * tiene un método que devuelve el perímetro
 * 
 * tiene un método que devuelve un String, que si se pinta en consola
 * muestra el rectángulo
 * (si la base  o la altura es mayor de 10 , truncará el valor a 10)
 * 
 *  Muestra por pantalla sus coordenadas, perímetros (suma de
 * lados) y áreas (ancho x alto). Modifica todas las coordenadas como consideres
 * y vuelve a imprimir coordenadas, perímetros y áreas.
 */
public class Rectangulo {

    private int x1,y1,x2,y2; 

    public Rectangulo(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2; 
    }

    public int getX1() {
        return x1;
    }   
    
    


    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int devuelveArea(){

        int resultado; 

        // ancho x alto
        // ancho= abs(x2-x1)( POR SI ACASO NOS LO DAN EN EL EJE NEGATIVO )
        // alto = abs(y2-y1)

        resultado  = Math.abs(x2-x1) * Math.abs(y2-y1); 
        return resultado; 

    }
    public int devuelvePerimetro(){
              int resultado; 

        // 2*ancho + *alto
        // ancho= abs(x2-x1)( POR SI ACASO NOS LO DAN EN EL EJE NEGATIVO )
        // alto = abs(y2-y1)

        resultado  = 2* Math.abs(x2-x1)  + 2* Math.abs(y2-y1); 
        return resultado; 
    }    
// Devuelve un dibujo ASCII del rectángulo
    public String dibujar() {
        int ancho = x2-x1;
        int alto = y2-y1;

        StringBuilder sb = new StringBuilder();

        // Ajuste: si ancho o alto son 0, no se puede dibujar
        if (ancho == 0 || alto == 0) {
            return "[Rectángulo sin área, no se puede dibujar]";
        }

        // Parte superior
        sb.append("*".repeat(ancho)).append("\n");

        // Lados
        for (int i = 0; i < alto - 2; i++) {
            sb.append("*");
            sb.append(" ".repeat(ancho - 2));
            sb.append("*\n");
        }

        // Parte inferior (si hay alto suficiente)
        if (alto > 1) {
            sb.append("*".repeat(ancho)).append("\n");
        }

        return sb.toString();
    }



}
    