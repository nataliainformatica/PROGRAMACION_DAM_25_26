Disponemos de una aplicación, que  usando una colección de objetos, que representan los datos de distintas mesas
electorales, mostrar estadísticas. 
Esta aplicación, solo funciona con datos en memoria. 

El objetivo, es añadir persistencia de la siguiente forma: 

Los datos de las distintas mesas, están en formato CSV: 

```
idMesa;localidad;votosA;votosB;votosC;blancos;nulos
1;Madrid;120;95;30;5;2
```
Deberás hacer una aplicación, que leerá los ficheros almacenados en una carpeta (usando jFileChooser para seleccionar la ruta)

Crea los objetos Mesa, y los guarda en un fichero binario (usando DataOutputStream).

Ahora, modifica el código facilitado, para que en lugar de tener los datos "hardcoded" , haga una lectura de datos

al fichero binario, creado anteriormente (para leerlo, usaremos jFileChooser, para seleccionar la ruta donde está almacenado el ficheor)






