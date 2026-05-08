import java.sql.DriverManager;

import javax.xml.crypto.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection {

    private static final String DB_URL = "jdbc:sqlite:empresa.db";

    private Connection connection;

    public DatabaseConnection() throws SQLException {
        this.connection = DriverManager.getConnection(DB_URL);
        crearTablas();
    }

   
    public Connection getConnection() {
        return connection;
    }

   
    private void crearTablas() throws SQLException {
        // Usamos Statement para DDL (CREATE TABLE)

        try (Statement stmt = connection.createStatement()) {

            // Tabla DEPARTAMENTO
            stmt.execute("""
                        CREATE TABLE IF NOT EXISTS departamento (
                            id      INTEGER PRIMARY KEY AUTOINCREMENT,
                            nombre  TEXT    NOT NULL UNIQUE
                        )
                    """);

            // Tabla USUARIO — columna departamento_id es FK hacia departamento
            stmt.execute("""
                        CREATE TABLE IF NOT EXISTS usuario (
                            id              INTEGER PRIMARY KEY AUTOINCREMENT,
                            nombre          TEXT    NOT NULL,
                            email           TEXT    NOT NULL UNIQUE,
                            departamento_id INTEGER NOT NULL,
                            FOREIGN KEY (departamento_id) REFERENCES departamento(id)
                        )
                    """);

     
        }
    }

    /**
     * Cierra la conexión. Al implementar AutoCloseable se puede llamar
     * automáticamente en un bloque try-with-resources.
     */

    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
         
        }
    }
}