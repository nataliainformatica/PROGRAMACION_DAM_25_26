public class Servidor  implements Comparable<Servidor> {


    // orden natural por el atributo ip

    private String nombre, ip; 
    public Servidor(String nombre, String ip){
        this.nombre = nombre; 
        this.ip =ip;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    @Override
    public String toString() {
        return "Servidor [nombre=" + nombre + ", ip=" + ip + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((ip == null) ? 0 : ip.hashCode());
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
        Servidor other = (Servidor) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (ip == null) {
            if (other.ip != null)
                return false;
        } else if (!ip.equals(other.ip))
            return false;
        return true;
    }
  @Override
public int compareTo(Servidor o) {
    String[] partes1 = this.ip.split("\\.");
    String[] partes2 = o.ip.split("\\.");
    for (int i = 0; i < partes1.length; i++) {
        int p1 = Integer.parseInt(partes1[i]);
        int p2 = Integer.parseInt(partes2[i]);
        // función recursiva 
        if (p1 != p2) {
            return Integer.compare(p1, p2);
        }
    }
    return 0;
}

    
    
}
