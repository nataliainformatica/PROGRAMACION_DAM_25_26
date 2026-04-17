
El objetivo del programa que debes hacer es un "Revisor de contratos". 
Una pequeña empresa, tiene almacenados muchos contratos de compraventa de vehículos, necesidades del negocio le obligan a hacer un listado de todos los vehículos vendidos. 
Siguiendo los requisitos crea una aplicación  que: 

Al abrir el programa mostrará  en consola un menú en el que tendremos varias opciones: 

```
===== GESTOR DE CONTRATOS =====
1. Seleccionar carpeta de contratos
2. Generar resumen de matrículas
0. Salir
Opción:
```


**Opción 1:**
Seleccionar la ruta donde están los contratos, si el usuario selecciona una carpeta, mostrará en consola su contenido. 
Leerá cada uno de los ficheros que estén en la ruta seleccionada, (mostrando el nombre del documento  y su contenido en la consola),  buscando la matrícula en el documento (usando expresiones regulares), 

(solo busca una matrícula por cada documento), cuando la encuentra la almacena en una lista.

```
List<String> matriculas
```
Al finalizar la lectura de todos los documentos de la ruta seleccionada, muestra en la pantalla la lista de matrículas. 

**Opción 2: **

Nos permitirá hacer un fichero resumen con todas las matrículas, que se guardará en la ruta seleccionada en el punto 1. Si no se había elegido la ruta dará un mensaje de error y volverá al menú. 


