
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
        metodo();InputMistmatchExceptin
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
            throw new RuntimeException("Error en finally");InputMistmatchExceptin
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


# Ejercicio de repaso
Completa una clase  ClaseLanzaExcepciones, que tendrá distintos métodos de utilizades. 

1. validarEdad(int edad)
    si edad<0 lanzar  IllegalArgumentException
    si edad<18 lanzar Exception (mensaje: "Menor de edad")
3. dividir(int a, int b)
   puede lanzar división entre 0
4. buscarUsuario(String nombre)
   En este método hay un arrayList con 5 palabras, si la palabra no está lanzará NullPointerException, si el nombre es "admin" lanzará RuntimeException("Usuario no permitido")
   
   
5. validarPassword(String pass) 
 Si la longitud es inferior a 6 dígitos lanzará una excepción personalizada PasswordInvalidException


En la clase Principal crea una instancia de esta clase, y prueba todos su métodos, teniendo en cuenta que, se debe mostrar en todo momento el error que ha ocurrido, por ejemplo, si se valida la edad, y es menor que 0, nos mostrará, "Edad no permitida"
Si es menor que 18 mostrará "Menor de edad"

```
public static void main(String[] args) {

    ClaseLanzaExcepciones service = new ClaseLanzaExcepciones();

 
        service.validarEdad(15);
        service.dividir(10, 0);
        service.leerArchivo("archivo.txt");
        service.buscarUsuario(null);
        service.validarPassword("123");
        
   
}
```
