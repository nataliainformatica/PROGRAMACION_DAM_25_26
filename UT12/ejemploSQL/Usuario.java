public class Usuario {

    /**
     *    CREATE TABLE IF NOT EXISTS usuario (
                            id              INTEGER PRIMARY KEY AUTOINCREMENT,
                            nombre          TEXT    NOT NULL,
                            email           TEXT    NOT NULL UNIQUE,
                            departamento_id INTEGER NOT NULL,
                            FOREIGN KEY (departamento_id) REFERENCES departamento(id)
                        )
     */
    private String nombre, email;
    private int id, departamento; 
    public Usuario(){

    }
    public Usuario(int id, String nombre, String email, int departamento){
        this.id = id; 
        this.nombre= nombre;
        this.email=email;
        this.departamento = departamento;
    }
        public Usuario( String nombre, String email, int departamento){
        this.nombre= nombre;
        this.email=email;
        this.departamento = departamento;
    }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getDepartamento() {
            return departamento;
        }
        public void setDepartamento(int departamento) {
            this.departamento = departamento;
        }

    

}
