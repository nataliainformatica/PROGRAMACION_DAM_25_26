package modelo;

public class Mesa {
    private int idMesa;
    private String localidad;
    private int votosA, votosB, votosC;
    private int blancos, nulos;

    public Mesa(int idMesa, String localidad, int votosA, int votosB, int votosC, int blancos, int nulos) {
        this.idMesa = idMesa;
        this.localidad = localidad;
        this.votosA = votosA;
        this.votosB = votosB;
        this.votosC = votosC;
        this.blancos = blancos;
        this.nulos = nulos;
    }



    public int getIdMesa() {
        return idMesa;
    }



    public String getLocalidad() {
        return localidad;
    }



    public int getVotosA() {
        return votosA;
    }



    public int getVotosB() {
        return votosB;
    }



    public int getVotosC() {
        return votosC;
    }



    public int getBlancos() {
        return blancos;
    }



    public int getNulos() {
        return nulos;
    }



    public int getTotalVotos() {
        return votosA + votosB + votosC + blancos + nulos;
    }
}