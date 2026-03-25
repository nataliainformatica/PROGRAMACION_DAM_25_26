Una oficina de comunicaciones recibe distintos tipos de información que deben ser almacenados y mostrados en un formato uniforme, independientemente de si se trata de cartas personales, cartas comerciales, burofaxes o noticias.

Para conseguir mostrar el formato uniforme  todas las clases implementan Formateable con el método: 

    public String formatear();

    ATRIBUTOS DE LAS CLASES
Carta

remitente, destinatario, fecha y contenido.

CartaPostalCertificada

numeroCertificacion

CartaPostalOrdinaria

peso (int – en gramos)

Burofax

conAcuseRecibo (boolean)

Noticia

titulo, contenido, autor, fechaPublicacion


Completa la clase Principal.  

Tendrá una lista  que almacenará  cartas (de cualquier tipo)  y noticias. 


Para conseguir una instancia de LocalDate en este formato: "Fecha (AAAA-MM-DD): 

Puedes usar : LocalDate f = LocalDate.parse(sc.nextLine());

Completa el menú con sus funcionalidades. 
```
--- MENÚ ---
1. Añadir comunicación
2. Mostrar todas las  cartas ordenadas por fecha
3. Mostrar todas las noticias ordenadas por autor
0. Salir
Elige opción:

```

```
OPCIÓN 1: Añadir comunicación
Tipo de comunicación: 1. Carta Postal Certificada 2. Carta Postal Ordinaria 3. Burofax 4. Noticia

```

En esta opción se pide el tipo de comunicación, y dependiendo de la opción seleccionada se pedirán los datos correspondientes, y se añadirá la comunicación a la lista. 
Se muestran a continuación ejemplos de cada una de las entradas de comunicación, que deberás imitar en tu código:

```
CARTA CERTIFICADA
Remitente: Juan Pérez
Destinatario: María López
Fecha (AAAA-MM-DD): 2026-03-21
Contenido: Este es el contenido de la carta certificada.
Número certificación: CERT12345
```
```
CARTA POSTAL ORDINARIA
Remitente: Ana Gómez
Destinatario: Carlos Ruiz
Fecha (AAAA-MM-DD): 2026-03-20
Contenido: Carta ordinaria de prueba.
Peso (g): 50
```
```
BUROFAX
Remitente: Empresa XYZ
Destinatario: Pedro Martín
Fecha (AAAA-MM-DD): 2026-03-19
Contenido: Burofax de aviso importante.
Con acuse de recibo (si/no): si
```
```
NOTICIA
Título: Noticia del día
Contenido: Hoy se lanza la nueva versión de la app.
Autor: Redacción
Fecha publicación (AAAA-MM-DD): 2026-03-21
```


A continuación se muestran las trazas de la implementación de  Formateble para cada una de las comunicaciones: 

OPCIÓN 2:  Mostrar todas las  cartas(postal, certificada y burofax) ordenadas por fecha
```
Elige opción: 2

--- BUROFAX ---
De: Empresa XYZ
Para: Pedro Martín
Fecha: 2026-03-19
Contenido: Burofax de aviso importante
Acuse de recibo: Sí
--- CARTA POSTAL ORDINARIA ---
De: Ana Gómez
Para: Carlos Ruiz
Fecha: 2026-03-20
Contenido: Carta ordinaria de prueba
Peso: 50g
--- CARTA CERTIFICADA---
De: Juan Pérez
Para: María López
Fecha: 2026-03-21
Contenido: Contenido de la carta certificada
Certificación: CERT12345
------------------------

```


OPCIÓN 3 . Mostrar todas las noticias ordenadas por autor

```
Elige opción: 3

--- NOTICIAS ---
Título: Noticia del día
Autor: Redacción
Fecha: 2026-03-21
Contenido: Hoy se lanza la nueva versión de la app.
------------------------
```

**TRATAMIENTO DE EXCEPCIONES**
El número de certificado de la CARTA CERTIFICADA, debe tener como mínimo 8 caracteres y como máximo 10. 

Si recibe un código que no cumpla estos requisitos para crear la instancia, no se creará y propagará una excepción propia  CodigoCertificadoIncorrecto, capturando todos los datos de la carta. 

Debes tratar todas las posibles excepciones en la **clase Principal**, teniendo en cuenta que si el problema es por el formato de la fecha introducida por consola, mostrará el mensaje: “Formato de fecha incorrecta”.
Si es por formato del número de certificado, mostrará  el mensaje

La carta certificada con remitente: Juan Pérez y destinatario  María López con fecha 2026-03-21 y contenido Este es el contenido de la carta certificada tiene un número de certificación: CERT123 que no es correcto.
(se sustituye el texto subrayado por los datos que se hayan introducido por consola)

