# PROGRAMACION\_DAM\_25\_26 - UT1

Código del módulo Programación

## EJEMPLO1 - Operaciones.java - '"write once, run anywhere"' 
Compilación y ejecución en consola de un programa

Guarda el archivo como Operaciones.java
Compila con: javac Operaciones.java
Ejecuta con:  java Operaciones



## ¿Qué estamos usando? 
**JDK** (Java Development Kit): kit de desarrollo. Contiene javac (compilador), jar, jlink, herramientas de depuración, y una JRE para ejecutar programas. Para poder compilar, es necesario el JDK.

**JRE** (Java Runtime Environment): entorno para ejecutar aplicaciones Java; contiene las bibliotecas y la JVM (máquina virtual).

**JVM** (Java Virtual Machine): el motor que carga bytecode, lo verifica, lo convierte (interpretación y/o compilación JIT) y lo ejecuta en la máquina física.

**Bytecode** / .class: resultado de javac. Es un formato independiente de la plataforma que la JVM ejecuta.

**Classpath** : lista de sitios (directorios, .jar) donde la JVM/compilador buscan clases. Por defecto incluye el directorio actual . (pero puede cambiar si CLASSPATH está configurado).
  Para ejecutar desde consola se puede usar -cp o -classpath para controlarlo.
```
java -version
javac -version
echo %JAVA_HOME%   # Windows
echo $JAVA_HOME    # Linux/Mac
```


## Resumen del proceso
javac (Java Compiler)

Es el compilador de Java.

Convierte el código fuente (.java) en bytecode (.class).

Ese bytecode no es código máquina nativo, sino un código intermedio independiente de la plataforma.

Archivo .class

Contiene el bytecode.

Puede ejecutarse en cualquier sistema operativo siempre que exista una JVM para esa plataforma.

Ejemplo: el mismo .class funciona en Windows, Linux o Mac, sin recompilar.

JVM (Java Virtual Machine)

Interpreta y/o compila ese bytecode a instrucciones nativas (dependiendo del sistema y del procesador).

Se encarga también de la memoria, la seguridad y el recolector de basura (garbage collector).

## Proceso completo

Escribes: Operaciones.java

Compilas: javac Operaciones.java → genera Operaciones.class

Ejecutas: java Operaciones → la JVM carga el .class, lo interpreta/optimiza y lo corre en tu sistema.
