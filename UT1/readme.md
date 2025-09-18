# PROGRAMACION\_DAM\_25\_26 - UT1

Código del módulo Programación

## EJEMPLO1 - Operaciones.java
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

