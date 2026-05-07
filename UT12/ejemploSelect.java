    public List<Empleado> listarPorDepartamento(int idDepto) throws SQLException {
        String sql = """
            SELECT p.id, p.nombre, p.apellidos, p.email,
                   e.salario, e.id_departamento, d.nombre AS nombre_depto
            FROM persona p
            JOIN empleado    e ON e.id = p.id
            JOIN departamento d ON d.id = e.id_departamento
            WHERE e.id_departamento = ?
              AND p.tipo IN ('EMPLEADO','JEFE')
            ORDER BY e.salario DESC
            """;
        List<Empleado> lista = new ArrayList<>();
        try (PreparedStatement ps = ConexionDB.getConexion().prepareStatement(sql)) {
            ps.setInt(1, idDepto);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()){
                    Empleado e = new Empleado(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("apellidos"),
                rs.getString("email"),
                rs.getDouble("salario"),
                rs.getInt("id_departamento"));
                e.setNombreDepartamento(rs.getString("nombre_depto")
                lista.add(e);
                } 
            }
        }
        return lista;
