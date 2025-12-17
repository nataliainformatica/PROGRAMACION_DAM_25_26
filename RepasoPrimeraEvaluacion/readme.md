 Hoja de ejercicios: Ámbitos y alcance de variables en Java

> Objetivo: comprender y practicar los **ámbitos (scope) de las variables en Java** y detectar errores reales de diseño.
>
> En Java existen varios **niveles claros de alcance**:
>
> - Variables **locales**
> - Variables de **instancia**
> - Variables **estáticas** (de clase)
> - Variables en **bloques** (`if`, `for`, `try`)
> - Clases internas, lambdas y variables *effectively final*

---

## Instrucciones
- Razona el resultado **antes de ejecutar**.
- Identifica **dónde vive cada variable**.


---

##  Ejercicio 1 – Variable local
```java
public class Ej1 {
    public static void main(String[] args) {
        int x = 10;
        prueba();
        // System.out.println(y);
    }

    static void prueba() {
        int y = 5;
        System.out.println(y);
    }
}
```

### Preguntas
1. ¿Por qué `y` no es accesible desde `main`?
2. ¿Dónde existe realmente `y`?

Solución

`y` es una **variable local al método** `prueba`. Solo existe durante la ejecución de ese método.
</details>

---

## Ejercicio 2 – Variables de instancia
```java
public class Contador {
    int total = 0;

    void incrementar() {
        int total = 10;
        System.out.println(total);
    }

    public static void main(String[] args) {
        Contador c = new Contador();
        c.incrementar();
        System.out.println(c.total);
    }
}
```

### Preguntas
1. ¿Qué se imprime?
2. ¿Por qué `total` no cambia?
3. 
Solución

El `total` del método es **local** y oculta al atributo. Para modificar el atributo:

```java
this.total++;
```


---

## Ejercicio 3 – Variables estáticas
```java
public class Sesion {
    static int usuarios = 0;

    Sesion() {
        usuarios++;
    }

    public static void main(String[] args) {
        new Sesion();
        new Sesion();
        System.out.println(usuarios);
    }
}
```

### Preguntas
1. ¿Cuántos usuarios se muestran?
2. ¿A quién pertenece la variable `usuarios`?
3. 
Solución


Se imprime `2`. `usuarios` pertenece a la **clase**, no a los objetos.



---

## Ejercicio 4 – Ámbito de bloque
```java
public class Bloques {
    public static void main(String[] args) {
        if (true) {
            int x = 5;
        }
        // System.out.println(x);
    }
}
```

### Preguntas
1. ¿Por qué no compila?
2. ¿Cuál es el ámbito de `x`?

 Solución
`x` solo existe dentro del bloque `if`. Java tiene **scope por bloque**.


---

## Ejercicio 5 – `this` vs variable local
```java
public class Usuario {
    String nombre;

    void setNombre(String nombre) {
        nombre = nombre;
    }

    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setNombre("Ana");
        System.out.println(u.nombre);
    }
}
```

### Preguntas
1. ¿Qué se imprime?
2. ¿Cuál es el error de diseño?

 Solución

Se imprime `null`. La variable local oculta al atributo.

```java
this.nombre = nombre;
```


---


## Ejercicio 8 – Bug real con estáticos
```java
public class Config {
    static String modo = "PROD";
}

public class ModuloA {
    void activarTest() {
        Config.modo = "TEST";
    }
}

public class ModuloB {
    void imprimir() {
        System.out.println(Config.modo);
    }
}
```

### Preguntas
1. ¿Cuál sería el resultado de invocar imprimir() de ModuloB?
2. ¿Qué tendrías que escribir dentro del método main para ejecutarlo?




