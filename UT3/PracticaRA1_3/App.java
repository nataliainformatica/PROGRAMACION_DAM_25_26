import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // el parking dispone de 25 plazas
        final int NUM_PLAZAS = 2;
        final int PORCENTAJE = 50; 
        final int PERSONAS = 25; 
        // TODO cambiar valor a 25

        boolean esCoche = false;
        int numeroAdultos=0 ;
        int numeroMenores=0;
        int totalAdultos = 0, totalMenores = 0; // acumuladores
        int edad; 
        int edadAcumulada =0; 
        int numeroCoches =0; 
        double mediaEdad; 


        // en el siguiente bucle recorremos todas las plazas para conseguir la
        // información
        System.out.println("ESTADÍSTICAS DEL PARKING");
        for (int i = 1; i <= NUM_PLAZAS; i++) {
            // para cada plaza comprobaremos si es coche
            System.out.println("¿Es un coche? ");
            esCoche = sc.nextBoolean();

            if (esCoche) {
                // se piden los datos para estadística
                numeroCoches ++ ; 
                System.out.println("¿Cuántos adultos hay en el coche? ");
                numeroAdultos = sc.nextInt(); 
                totalAdultos += numeroAdultos; 
                //totalAdultos = totalAdultos + numeroAdultos; 
                System.out.println("¿Cuántos menores hay en el coche?");
                numeroMenores = sc.nextInt(); 
                totalMenores += numeroMenores;
                for(int j =1; j<=numeroAdultos;j++){
                    System.out.println("Dime la edad ");
                    edad = devolverEdadValida(); 
                    edadAcumulada += edad;
                }

            } // no es necesario el else

        }

        mediaEdad = edadAcumulada/numeroAdultos; 

        // mostrar estadísticas

        System.out.println("Total de plazas del parking ocupadas por coches " + numeroCoches);
        System.out.println("Porcentaje del total de las plazas ocupadas por coches " 
            + (double) numeroCoches/ NUM_PLAZAS * 100);
        System.out.println("TOTAL DE PERSONAS " + (numeroAdultos + numeroMenores));

                System.out.println("TOTAL DE ADULTOS " + (numeroAdultos ));
        System.out.println("TOTAL DE MENORES  " + (numeroMenores));

        System.out.println("MEDIA DE EDAD " + ((int)mediaEdad));
        if((numeroCoches/ NUM_PLAZAS * 100) >= PORCENTAJE
         || (totalAdultos+totalMenores)> PERSONAS){
            System.out.println("PARKING CON MUCHA AFLUENCIA");

        }






    }

    public static int devolverEdadValida() {
        int edad;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce tu edad ");
            System.out.println("El valor tiene que ser entre 0 y 100");
            edad = sc.nextInt();
        } while (edad <= 0 || edad >= 100);

        return edad;

    }
}
