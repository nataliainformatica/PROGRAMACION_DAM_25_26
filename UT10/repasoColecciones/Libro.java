public class Libro {

    private String signatura;
    private String titulo;
    private String autor;

    public Libro(String signatura, String titulo, String autor) {
        this.signatura = signatura;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(Libro libro) {
        this.signatura = libro.signatura;
        this.titulo    = libro.titulo;
        this.autor     = libro.autor;
    }

    public String getSignatura()  { return signatura; }
    public String getTitulo()     { return titulo; }
    public String getAutor()      { return autor; }

    public void setSignatura(String signatura) { this.signatura = signatura; }
    public void setTitulo(String titulo)       { this.titulo = titulo; }
    public void setAutor(String autor)         { this.autor = autor; }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((signatura == null) ? 0 : signatura.hashCode());
        result = prime * result + ((titulo    == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor     == null) ? 0 : autor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Libro other = (Libro) obj;
        if (signatura == null) { if (other.signatura != null) return false; }
        else if (!signatura.equals(other.signatura)) return false;
        if (titulo == null) { if (other.titulo != null) return false; }
        else if (!titulo.equals(other.titulo)) return false;
        if (autor == null) { if (other.autor != null) return false; }
        else if (!autor.equals(other.autor)) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Libro [signatura=" + signatura +
               ", titulo="    + titulo    +
               ", autor="     + autor     + "]";
    }
}
