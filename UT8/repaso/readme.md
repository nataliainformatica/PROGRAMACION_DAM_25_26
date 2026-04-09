
¿Cómpila? (SI/NO)
```
public class Test1 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error general");
        } catch (ArithmeticException e) {
            System.out.println("División por cero");
        }
    }
}

```

¿Error? (SI/NO)

```
public class Test2 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Error");
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

```

¿Cómo solucionamos esto?
```
public class Test4 {

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        throw new Exception("Error en metodo2");
    }

    public static void main(String[] args) {
        metodo1();
    }
}
```

¿Y ésto?
```class MiExcepcion extends Exception {}

public class Test5 {

    public static void metodo() {
        throw new MiExcepcion();
    }

    public static void main(String[] args) {
        metodo();
    }
}
```

¿Tiene sentido hacer esto?
```
public class Test6 {
    public static void main(String[] args) {
        String texto = null;

        try {
            if (texto.equals("hola")) {
                System.out.println("Hola");
            }
        } catch (NullPointerException e) {
          
        }
    }
}
```
Remate final
```
public class Test7 {

    public static void metodo() throws Exception {
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            throw new Exception("Error controlado");
        } finally {
            throw new RuntimeException("Error en finally");
        }
    }

    public static void main(String[] args) {
        try {
            metodo();
        } catch (Exception e) {
            System.out.println("Capturado: " + e.getMessage());
        }
    }
}
```
