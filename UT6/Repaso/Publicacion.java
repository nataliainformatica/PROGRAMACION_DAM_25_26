package ejercicio1;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Cada publicación tiene los siguientes atributos:
 * • idUsuario (int): identificador del usuario que crea la publicación.
 * • contenidos (Lista de Strings): con los contenidos de la publicación, máximo
 * 10 Strings.
 * • fechaHoraPublicacion (LocalDateTime): la fecha y hora en que se creó la
 * publicación. Se asigna automáticamente al crear la publicación y no puede
 * modificarse posteriormente.
 * • fechaHoraModificacion(LocalDateTime): la fecha y hora en la que se modifica
 * la lista de contenidos, ya sea añadiendo o eliminando. Si no se añade o
 * modifica ningún contenido, será la misma que la fecha de publicación.
 * 
 */
class Publicacion {
    private int idUsuario;
    private String[] contenidos;
    private int numContenidos; // para saber cuántos contenidos hay actualmente
    private final LocalDateTime fechaHoraPublicacion;
    private LocalDateTime fechaHoraModificacion;
    private static final int MAX_CONTENIDOS = 10;

    // Constructor con solo idUsuario
    public Publicacion(int idUsuario) {
        this.idUsuario = idUsuario;
        this.contenidos = new String[MAX_CONTENIDOS];
        this.numContenidos = 0;
        this.fechaHoraPublicacion = LocalDateTime.now();
        this.fechaHoraModificacion = this.fechaHoraPublicacion;
    }

    // Constructor con idUsuario y contenido inicial
    public Publicacion(int idUsuario, String contenidoInicial) {
        /* AVANZADO */
        // this(idUsuario); // llama al constructor anterior
        this.idUsuario = idUsuario;
        this.contenidos = new String[MAX_CONTENIDOS];
        this.numContenidos = 0;
        this.fechaHoraPublicacion = LocalDateTime.now();
        this.fechaHoraModificacion = this.fechaHoraPublicacion;
        /* AVANZADO - HACER EL CONDICIONAL - NO ES REQUISITO EN EL EJERCICIO */
        // REPASO MÉTODOS DE STRING - isEmpty() y null
        if (contenidoInicial != null && !contenidoInicial.isEmpty()) {
            this.contenidos[0] = contenidoInicial;
            this.numContenidos = 1;
            this.fechaHoraModificacion = LocalDateTime.now();
        }
    }

    // Getters

    // 2. Permitir consultar los atributos (idUsuario, , fechaHoraPublicacion y
    // fechaHoraModificacion). */
    public int getIdUsuario() {
        return idUsuario;
    }
    /*
     * ¿POR QUÉ NO PODEMOS HACER UN GET DE CONTENIDOS?
     * // LA RAZÓN - PASO POR REFERENCIA - SI DEVOLVEMOS EL ARRAY, SE PODRÍA
     * MODIFICAR FUERA DE LA CLASE
     * 
     * public String[] getContenidos() {
     * // PODRÍAMOS HACER UNA COPIA DEL ARRAY PARA DEVOLVERLO, PERO NO ES REQUISITO
     * EN EL EJERCICIO
     * return Arrays.copyOf(contenidos, numContenidos);
     * }
     */

    public LocalDateTime getFechaHoraPublicacion() {
        return fechaHoraPublicacion;
    }

    public LocalDateTime getFechaHoraModificacion() {
        return fechaHoraModificacion;
    }

    // Agregar contenido


    public boolean agregarContenido(String contenido) {
        // Verificar si se ha alcanzado el límite de contenidos
        if (numContenidos >= MAX_CONTENIDOS) {

            // imprimir desde el objeto, SOLO PARA PRUEBAS, NUNCA ESCRIBIMOS EN CONSOLA
            // DESDE LA CLASE, SOLO DESDE EL MAIN
            // PORQUE NO ES RESPONSABILIDAD DEL OBJETO MANEJAR LA INTERFAZ DE USUARIO, SINO
            // SOLO SU LÓGICA INTERNA
            // System.out.println("No se pueden agregar más contenidos (límite
            // alcanzado).");
            return false;
        }
        // SIGUIENDO LO QUE HICIMOS EN EL CONSTRUCTOR, VERIFICAMOS EL CONTENIDOS
        // NO ES REQUISITO EN EL EJERCICIO, PERO ES UNA BUENA PRÁCTICA PARA EVITAR
        // CONTENIDOS VACÍOS O NULOS
        if (contenido != null && !contenido.isEmpty()) {
            contenidos[numContenidos] = contenido;
            numContenidos++;
            // ACTUALIZAMOS LA FECHA DE MODIFICACIÓN CADA VEZ QUE SE AGREGA O ELIMINA
            // CONTENIDO
            fechaHoraModificacion = LocalDateTime.now();
            return true;
        }
        return false;
    }

    // Eliminar último contenido
    public boolean eliminarUltimoContenido() {
        if (numContenidos > 0) {
            numContenidos--;
            contenidos[numContenidos] = null; // opcional, limpiar referencia
            fechaHoraModificacion = LocalDateTime.now();
            return true;
        }
        // imprimir desde el objeto, SOLO PARA PRUEBAS, NUNCA ESCRIBIMOS EN CONSOLA
        // DESDE LA CLASE, SOLO DESDE EL MAIN
        // PORQUE NO ES RESPONSABILIDAD DEL OBJETO MANEJAR LA INTERFAZ DE USUARIO, SINO
        // SOLO SU LÓGICA INTERNA
        // System.out.println("No hay contenido para eliminar.");
        return false;
    }

  
    /*
     * 5. Implementar mostrarFeeds(), que muestre:
     * o ID de usuario
     * o Fecha y hora de la modificación.
     * o Todos los contenidos de la publicación
     */
    public String mostrarFeeds() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID Usuario: ").append(idUsuario).append("\n");
        sb.append("Fecha y hora de modificación: ").append(fechaHoraModificacion).append("\n");
        sb.append("Contenidos:\n");
        // SI USAMOS EL CONTADOR, SOLO MOSTRAMOS LOS CONTENIDOS HASTA EL NÚMERO DE
        // CONTENIDOS ACTUAL, NO TODO EL ARRAY
        for (int i = 0; i < numContenidos; i++) {
            sb.append("- ").append(contenidos[i]).append("\n");
        }
        // imprimir desde el objeto, SOLO PARA PRUEBAS, NUNCA ESCRIBIMOS EN CONSOLA
        // DESDE LA CLASE, SOLO DESDE EL MAIN
        // PORQUE NO ES RESPONSABILIDAD DEL OBJETO MANEJAR LA INTERFAZ DE USUARIO, SINO
        // SOLO SU LÓGICA INTERNA
        /*
         * System.out.println("ID Usuario: " + idUsuario);
         * System.out.println("Fecha y hora de modificación: " + fechaHoraModificacion);
         * System.out.println("Contenidos:");
         * for (int i = 0; i < numContenidos; i++) {
         * System.out.println("- " + contenidos[i]);
         * }
         */
        return sb.toString();
    }


    /*
     * 6. Implementar el método equals(Object obj) de forma que dos publicaciones
     * sean consideradas iguales si:
     * o Tienen el mismo idUsuario y
     * o Tienen exactamente el mismo contenido (en orden y cantidad).
     */
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Publicacion other = (Publicacion) obj;
        if (idUsuario != other.idUsuario)
            return false;
        if (!Arrays.equals(contenidos, other.contenidos))
            return false;
        return true;
    }

    /*
     * @Override
     * public boolean equals(Object obj) {
     * if (this == obj)
     * return true;
     * if (!(obj instanceof Publicacion))
     * return false;
     * Publicacion other = (Publicacion) obj;
     * if (idUsuario != other.idUsuario)
     * return false;
     * if (numContenidos != other.numContenidos)
     * return false;
     * for (int i = 0; i < numContenidos; i++) {
     * if (!contenidos[i].equals(other.contenidos[i])) {
     * return false;
     * }
     * }
     * return true;
     * }
     */

}
