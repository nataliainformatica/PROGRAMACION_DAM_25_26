
package caracteres.ejemploFileReaderWiriter;

import java.util.Objects;

public class Usuario {
  private  String usuario ;
    private  String email ;
    private  String  color;

    public Usuario(String usuario, String email, String color) {
        this.usuario = usuario;
        this.email = email;
        this.color = color;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nUsuario{" + "usuario=" + usuario + ", email=" + email + ", color=" + color + '}';
    }
    
    
}
