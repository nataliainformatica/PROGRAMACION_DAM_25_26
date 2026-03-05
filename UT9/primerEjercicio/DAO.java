import java.util.ArrayList;
import java.util.HashSet;

public class DAO {

    private static ArrayList<Servidor> servidoresList; 

    private static HashSet<Servidor> servidoresSet; 
    
    public static ArrayList<Servidor>  getServidoresList(){
        servidoresList = new ArrayList<>();
        servidoresList.add(new Servidor("AvellanedaNAS1", "10.0.0.1"));
        servidoresList.add(new Servidor("AvellanedaNAS2", "10.0.0.2"));
        servidoresList.add(new Servidor("AvellanedaNAS3", "10.0.0.3"));
        servidoresList.add(new Servidor("AvellanedaNAS4", "10.0.0.4"));
        servidoresList.add(new Servidor("AvellanedaNAS1", "10.0.0.1"));
        return servidoresList;
    }

    public static HashSet<Servidor> getServidoresSet(){
    servidoresSet = new HashSet<>();
      servidoresSet.add(new Servidor("AvellanedaNAS1", "10.0.0.1"));
        servidoresSet.add(new Servidor("AvellanedaNAS2", "10.0.0.2"));
        servidoresSet.add(new Servidor("AvellanedaNAS3", "10.0.0.3"));
        servidoresSet.add(new Servidor("AvellanedaNAS4", "10.0.0.4"));
        servidoresSet.add(new Servidor("AvellanedaNAS1", "10.0.0.1"));
    return servidoresSet; 

    }

}
