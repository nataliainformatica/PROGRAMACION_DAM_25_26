package es.avellaneda;

import java.util.Scanner;

public class Ejercicio23 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Permitir al usuario realizar las siguientes acciones:
      

        Habitacion habitaciones[];

        boolean continua = true;
        habitaciones = crearHabitaciones();
        String opcion = "0";
        while (continua) {

            System.out.println("1. Mostrar el estado del hotel");
            System.out.println("2. Reservar una habitación: Asignar un huésped a la primera habitación disponible.");
            System.out.println("3. Cancelar una reserva: Indicar el número de habitación a liberar");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    mostrarEstado(habitaciones);
                    break;
                case "2":
                    System.out.println("Nombre del huésped ");
                    if (reservarHabitacion(habitaciones, sc.nextLine())) {
                        System.out.println("Se ha reservado la habitación");
                    } else
                        System.out.println("No se ha podido reservar");
                    break; 

                case "3":

                    System.out.println("Introduce el número de habitación para cancelar la reserva");
                   
                    if(cancelarReserva(habitaciones, pedirNumero())){
                        System.out.println("Se ha cancelado la reserva de la habitación" );
                    }else{
                        System.out.println("No se ha podido cancelar");
                    }
                    break;
                    
                case "0":
                    continua = false;
                    break;
                default:
                    break;
            }

        }
    }

    private static boolean reservarHabitacion(Habitacion[] habitaciones, String huesped) {

        // buscar la primera habitación libre


        for (Habitacion h : habitaciones) {
            if (!h.consultarOcupacion()) {
                return h.reservarHabitacion(huesped);            
            }

        }
        return false;

    }

    private static void mostrarEstado(Habitacion habitaciones[]) {
        // recorreremos el array de habitaciones, mostrando el estado
        for (Habitacion habitacion : habitaciones) {

            System.out.println(habitacion);
        }

    }

    private static Habitacion[] crearHabitaciones1(){
        Habitacion[] habitaciones = new Habitacion[10];
            for(int i=0; i<10; i++){
                habitaciones[i]= new Habitacion();}
                return habitaciones; 
                
    }

    private static Habitacion[] crearHabitaciones() {
        final int MAX = 10;
        Habitacion[] habitaciones = new Habitacion[MAX];
        // el número de la habitación (1 a 10).
        for (int i = 0; i < MAX; i++) {
            habitaciones[i] = new Habitacion((i + 1));
        }
        return habitaciones;

    }

    private static boolean cancelarReserva(Habitacion[] habitaciones, int numero ){
        boolean resultado = false; 

            // es necesario buscar la instancia de habitacion

            // no nos fiamos del índice del array, ya que podría ser que al cancelar reservas
            // cambie el número respecto al índice
        Habitacion habitacion = new Habitacion(numero);
           for(Habitacion h: habitaciones){
                if(h.equals(habitacion)){
                     resultado = h.cancelarHabitacion();                   
                }
           }

            
            
        return resultado; 
    }

    private static int pedirNumero(){
        boolean continua = true;
        int numero =0;
        while(continua){

            try{
            numero = Integer.parseInt(sc.nextLine());
            continua = false; 
        }catch (Exception e) {
            System.out.println("Debes introducir un número");
            
        }

    }
    return numero; 

    }

}
