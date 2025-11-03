package es.avellaneda;

/*
 * Cada habitación estará representada por un objeto de la clase Habitacion, 
    que tendrá los siguientes atributos:

    numero (entero): el número de la habitación (1 a 10).

    huesped (cadena): el nombre del huésped que ocupa la habitación, o null si está vacía.
 */
public class Habitacion {

    private static int contador; 

    private int numero; 
    private String huesped; 
    private boolean ocupada; 

    public Habitacion(){
        this.numero = contador;
        contador++; 
        // escribo los requisitos del enunciado, si no tiene huesped debe ser null, no vacío 
        this.huesped = null; 
        ocupada = false;  
    }


    public Habitacion(int numero){
        this.numero = numero;
        // escribo los requisitos del enunciado, si no tiene huesped debe ser null, no vacío 
        this.huesped = null; 
        ocupada = false; 
    }


    // Reservar una habitación asignándole un huésped.
    public boolean reservarHabitacion(String huesped){
        boolean resultado =  false; 
          if(ocupada){
            return resultado; 
        }
        this.huesped = huesped;
        resultado = true; 
        ocupada=true; 
        return resultado;
    }
    // Cancelar una reserva, dejando la habitación vacía.

    public boolean cancelarHabitacion(){
        boolean resultado = true; // esto significa que ha podido cancelar la reserva
        if(!ocupada){
            resultado = false; 
            return resultado;
        }
        huesped = null; 
        ocupada=false; 
        return resultado; 
    }
    
    public int getNumero() {
        return numero;
    }


    public String getHuesped() {
        return huesped;
    }


    public boolean consultarOcupacion() {
        return ocupada;
    }

    

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder( "Habitacion numero = "); 
        sb.append(numero); 
        sb.append(" esta "); 

        if(ocupada)
            sb.append("OCUPADA POR " + huesped) ;
        else{
            sb.append("LIBRE");
        } 

        return  sb.toString();
    }


    public boolean isOcupada() {
        return ocupada;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        result = prime * result + ((huesped == null) ? 0 : huesped.hashCode());
        result = prime * result + (ocupada ? 1231 : 1237);
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Habitacion other = (Habitacion) obj;
        if (numero != other.numero)
            return false;
        
        return true;
    }




    



}

