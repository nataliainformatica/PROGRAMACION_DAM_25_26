import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOrepositorio {

    private Connection conection;

    public DAOrepositorio(DatabaseConnection db){
       conection =  db.getConnection();
    }


      public List<Usuario> listarUsuarios() throws SQLException {
        // JOIN para obtener el nombre del departamento en lugar de solo el id
        String sql = """
            SELECT u.id,
                   u.nombre,
                   u.email,
                   d.nombre AS departamento
            FROM   usuario u
           
        """;

        List<Usuario> lista = new ArrayList<>();

        try (Statement stmt = conection.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)) {

            while (rs.next()) {
                 Usuario u = new Usuario(rs.getInt("id"),
                 rs.getString("nombre"),
                    rs.getString("email"),
                    rs.getInt("departamento"));
                    lista.add(u);
                };
            
        }
        return lista;
    }
    public Usuario listarUsuario(int id) throws SQLException {
       Usuario u= null; 
        String sql = """
            SELECT u.id,
                   u.nombre,
                   u.email,
                   d.nombre AS departamento
            FROM   usuario u
            WHERE usuario = ?
           
        """;

        System.out.println(sql); 

        

        try (Statement stmt = conection.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)) {

            while (rs.next()) {
                  u = new Usuario(rs.getInt("id"),
                 rs.getString("nombre"),
                    rs.getString("email"),
                    rs.getInt("departamento"));
                    
                };
            
        }
        return u;
    }

}
