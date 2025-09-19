public class ColoresConsola {

    // Códigos ANSI para colores de texto
    public static final String RESET = "\u001B[0m";
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CIAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";

    public static void main(String[] args) {
        System.out.println(NEGRO + "Estoy imprimiendo en negro" + RESET);
        System.out.println(ROJO + "Estoy imprimiendo en rojo" + RESET);
        System.out.println(VERDE + "Estoy imprimiendo en verde" + RESET);
        System.out.println(AMARILLO + "Estoy imprimiendo en amarillo" + RESET);
        System.out.println(AZUL + "Estoy imprimiendo en azul" + RESET);
        System.out.println(MORADO + "Estoy imprimiendo en morado" + RESET);
        System.out.println(CIAN + "Estoy imprimiendo en cian" + RESET);
        System.out.println(BLANCO + "Estoy imprimiendo en blanco" + RESET);
    }
}