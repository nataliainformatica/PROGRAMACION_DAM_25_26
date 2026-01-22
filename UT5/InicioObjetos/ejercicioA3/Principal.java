package EjercicioA3;

public class Principal {

    public static void main(String[] args) {
        
        Rectangulo  r1,r2; 
        //(x1,y1) (x2,y2)

        // Rectangulo en (0,0)(5,5) y (7,9)(2,3)
    //  public Rectangulo(int x1, int y1, int x2, int y2){
        r1 = new Rectangulo(0, 0, 5, 5); 
        r2 = new Rectangulo(7, 9, 2, 3); 

        //Muestra por pantalla sus coordenadas, 
        // perímetros (suma de lados) 
        // y áreas (ancho x alto). 
        // Modifica todas las coordenadas como consideres 
        // y vuelve a imprimir coordenadas, perímetros y áreas.

        System.out.println("Rectángulo1");
       mostrarCoordenadas(r1);
        System.out.println("Perímetro : "+ r1.devuelvePerimetro());
        System.out.println("Área: " + r1.devuelveArea());
        System.out.println("Rectángulo1");
        mostrarCoordenadas(r2);
        System.out.println("Perímetro : "+ r2.devuelvePerimetro());
        System.out.println("Área: " + r2.devuelveArea());
        System.out.println(r1.dibujar());
        
    }
    public static void mostrarCoordenadas(Rectangulo r1){
        System.out.print("( "+ r1.getX1() + ","+ r1.getY1()+ ") ");
        System.out.println("-" + "( "+ r1.getX2() 
        + ","+ r1.getY2()+ ")");
    }


}
