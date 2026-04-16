
package caracteres.ejemploFileReaderWiriter;

public class TestMain {

    public static void main(String[] args) {
        EscribeUsuario es = new EscribeUsuario();
        es.escribirUsuario();
        Usuario usuario;
        LeerUsuario le = new LeerUsuario();
        usuario = le.devolver();
        System.out.println(usuario);
    }

}
