import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Servidor> servidoresList = DAO.getServidoresList();
        HashSet<Servidor> servidoresSet = DAO.getServidoresSet();

        Collection<Servidor> servidores = DAO.getServidoresList();
        servidores.addAll(DAO.getServidoresSet());

        mostrarLista(servidores);

        // ordenar la lista de servidores por ip
    
        Collections.sort(servidoresList);
        //
        System.out.println("SERVIDORES ORDENADA");
        mostrarLista(servidores);

        /*
         * mostrarLista(servidoresList);
         * mostrarLista(servidoresSet);
         */

    }

    private static void mostrarLista(Collection<Servidor> servidores) {
        System.out.println("Mostrar Collections");
        for (Servidor s : servidores) {
            System.out.println(s);
        }

    }

    /*
     * 
     * 
     * private static void mostrarLista(ArrayList<Servidor> servidores) {
     * System.out.println("Mostrar ArrayList");
     * for (Servidor s : servidores) {
     * System.out.println(s);
     * }
     * }
     * 
     * private static void mostrarLista(HashSet<Servidor> servidores) {
     * System.out.println("Mostrar HashSet");
     * for (Servidor s : servidores) {
     * System.out.println(s);
     * }
     * }
     */

}
