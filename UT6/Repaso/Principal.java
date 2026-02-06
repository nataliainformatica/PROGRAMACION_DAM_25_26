
// Clase para probar
public class Principal {
    public static void main(String[] args) {
        // Crear publicación con idUsuario
        Publicacion pub1 = new Publicacion(101);

        // Agregar contenido
        pub1.agregarContenido("Hola a todos!");
        pub1.agregarContenido("Hoy hace buen tiempo.");

        // Mostrar feed
        pub1.mostrarFeeds();

        // Eliminar último contenido
     System.out.println( pub1.mostrarFeeds());

        // Mostrar feed después de eliminar
        pub1.mostrarFeeds();

        // Crear publicación con idUsuario y contenido inicial
        Publicacion pub2 = new Publicacion(102, "Mi primera publicación!");
               System.out.println(pub2.mostrarFeeds());


        // Comparar publicaciones
        Publicacion pub3 = new Publicacion(101);
        pub3.agregarContenido("Hola a todos!");
        System.out.println("pub1 equals pub3? " + pub1.equals(pub3));
    }
}

