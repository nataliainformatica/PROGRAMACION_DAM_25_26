import java.util.Arrays;


public class Persona {
    private String nombreApellidos;
    private String NIA;
    private String fechaMatricula; 

    private boolean faltasEnero[]; 

    public Persona(String nombreApellidos,String NIA, String fechaMatricula ) {
        this.nombreApellidos =  nombreApellidos;
        this.NIA = NIA; 
        this.fechaMatricula=fechaMatricula; 

        this.faltasEnero = new boolean[31];
        Arrays.fill(faltasEnero,false); 
    } 
    public Persona(){

    }
    public String getNombreApellidos(){
        return this.nombreApellidos;
    
    }
    
    public void setNombreApellidos(String nombreApellidos){
        this.nombreApellidos =nombreApellidos;
    }

    public String getNIA() {
        return NIA;
    }

    public void setNIA(String nIA) {
        NIA = nIA;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String consultarDatosAlumno(){

        return "NOmbre " +  nombreApellidos +
        " NIA: " + NIA + " Fecha Matricula" + fechaMatricula; 

    }

    public void ponerFalta(int dia, boolean falta){
       faltasEnero[dia]= falta; 
    }

    public int  consultarTotalFaltas(){
        int contador=0; 
        for(boolean b: faltasEnero){
            if(b){
                contador++;
            }
        }
        return contador; 
    }

}
