public class App {
    /**
     * En el main de la clase principal instancia 3 objetos Punto con las
     * coordenadas (5,0), (10,10) y (-3, 7). Muestra por pantalla sus coordenadas
     * (utiliza un println para cada punto). Modifica todas las coordenadas (prueba
     * distintos operadores como = + - += *=...) y vuelve a imprimirlas por
     * pantalla.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Punto punto1 = new Punto(5, 0);
        Punto punto2 = new Punto(10, 10);
        Punto punto3 = new Punto(-3, 7);

        System.out.println("Las coordenadas de los tres puntos son: ");
        System.out.println(punto1.getX() + "," +  punto1.getY());
         System.out.println(punto2.getX() + "," +  punto2.getY());
          System.out.println(punto3.getX() + "," +  punto3.getY());

    // MODIFICO TODAS LAS COORDENADAS X SUMÁNDOLE 3 POSICIONES
    
    punto1.setX(0);
    punto2.setY(0);
    punt3.setY(0); 

    }
}
