# Gestión de bases de datos relacionales

Ejemplo - 
JDBC + FICHEROS

El 30 de abril de 1993, el CERN (Organización Europea para la Investigación Nuclear) liberó el código fuente de la World Wide Web al dominio público.

Este acto permitió que la web se convirtiera en la herramienta abierta y universal que conocemos hoy.

Para conmemorar esta efeméride, hoy vamos a realizar  el desarrollo de una aplicación de gestión para el **Archivo Histórico de la Red**.

Deberás desarrollar una aplicación en Java que integre la persistencia de datos en un sistema relacional (BBDD EMBEBIDO) y la capacidad de intercambio de información mediante archivos de texto (I/O).

La BBDD se denomina *GenesisWeb* y tendrá una tabla *HitosHistoricos*:

id (INT, Clave Primaria, Autoincremental).

url (VARCHAR, no nulo).

nombre (VARCHAR, no nulo).

autor (VARCHAR).

anio_lanzamiento (INT).

descripcion (TEXT o VARCHAR largo).

La aplicación deberá permitir, a través de un menú interactivo, las siguientes operaciones:

Gestión de Registros (CRUD):

•	Alta de un nuevo hito web.

•	Listado completo de hitos almacenados en la base de datos.

•	Búsqueda de hitos por año de lanzamiento.

En un clase aparte, realizaremos 

 Módulo de Importación (Ficheros de Lectura): Con un método estático para relizar la importación, recibiendo por parámetro el nombre del fichero, y la conexión a la BBDD. 
 
•	 debe ser capaz de leer un fichero .
EJEMPLO INFORMACIÓN A IMPORTAR A LA BBDD
```
http://info.cern.ch;World Wide Web;Tim Berners-Lee;1990;El primer servidor y sitio web de la historia en el CERN.
http://aliweb.com;ALIWEB;Martijn Koster;1993;El primer motor de búsqueda de la web (Archie Like Indexing for the Web).
http://bloomberg.com;Bloomberg.com;Michael Bloomberg;1993;Portal de información financiera y datos de mercado.
http://whitehouse.gov;WhiteHouse.gov;Gobierno de EEUU;1994;Uno de los primeros sitios oficiales de un gobierno en el mundo.
http://yahoo.com;Yahoo!;Jerry Yang y David Filo;1994;Originalmente un directorio de sitios web llamado Jerry and David's Guide.
http://amazon.com;Amazon;Jeff Bezos;1995;Inició como una librería online cadabra.com antes de renombrarse.
http://ebay.com;eBay;Pierre Omidyar;1995;Originalmente AuctionWeb, el primer gran sitio de subastas entre usuarios.
http://altavista.com;AltaVista;Digital Equipment Corp;1995;Motor de búsqueda pionero capaz de indexar texto completo.
http://microsoft.com;Microsoft Online;Bill Gates;1991;Página oficial para soporte y distribución de software.
http://imdb.com;IMDb;Col Needham;1990;Inició como una lista de actrices en Usenet antes de ser web en 1993.
http://netflix.com;Netflix;Reed Hastings;1997;Plataforma de alquiler de DVD por correo antes del streaming.
http://google.com;Google Search;Larry Page y Sergey Brin;1998;Revolucionó la búsqueda con el algoritmo PageRank.
http://paypal.com;PayPal;Max Levchin y Peter Thiel;1998;Originalmente Confinity, pionero en pagos digitales.
http://wikipedia.org;Wikipedia;Jimmy Wales y Larry Sanger;2001;La enciclopedia libre basada en tecnología Wiki.
http://linkedin.com;LinkedIn;Reid Hoffman;2003;La primera gran red social enfocada al ámbito profesional.
http://facebook.com;Facebook;Mark Zuckerberg;2004;Originalmente TheFacebook, exclusiva para estudiantes de Harvard.
http://flickr.com;Flickr;Ludicorp;2004;Plataforma pionera en gestión de fotografías y etiquetas (tags).
http://youtube.com;YouTube;Chad Hurley y Steve Chen;2005;El primer sitio masivo de alojamiento y compartición de vídeo.
http://twitter.com;Twitter;Jack Dorsey;2006;Plataforma de microblogging que limitaba los mensajes a 140 caracteres.
http://github.com;GitHub;Tom Preston-Werner;2008;Plataforma de desarrollo colaborativo basada en el sistema Git.

```
•	El formato del fichero será: url;nombre;autor;anio;descripcion 
(una línea por registro).

•	El programa deberá procesar el archivo e insertar automáticamente los datos en la base de datos, de la conexión que recibe como parámetro.

Propagará excepciones SQL. 


Módulo de Exportación (Ficheros de Escritura): Con un método estático para realizar la exportación, recibieno por parámetro el nombre del fichero y la conexión a la BBDD. 

•	Generar un informe de texto legible  que resuma todos los registros de la base de datos con un formato amigable para el usuario.

Ejemplo del resultado
```
 ================================================================================
                ARCHIVO HISTÓRICO DE LA WORLD WIDE WEB
                Informe conmemorativo del 30 de abril
================================================================================

Generado el: 30/04/2026
Total de hitos registrados: 20

--------------------------------------------------------------------------------
[ID: 1] - WORLD WIDE WEB
--------------------------------------------------------------------------------
   > URL:         http://info.cern.ch
   > Creador:     Tim Berners-Lee
   > Lanzamiento: 1990
   > Historia:    El primer servidor y sitio web de la historia en el CERN.

--------------------------------------------------------------------------------
[ID: 5] - YAHOO!
--------------------------------------------------------------------------------
   > URL:         http://yahoo.com
   > Creador:     Jerry Yang y David Filo
   > Lanzamiento: 1994
   > Historia:    Originalmente un directorio de sitios web llamado Jerry and 
                  David's Guide.

--------------------------------------------------------------------------------
[ID: 12] - GOOGLE SEARCH
--------------------------------------------------------------------------------
   > URL:         http://google.com
   > Creador:     Larry Page y Sergey Brin
   > Lanzamiento: 1998
   > Historia:    Revolucionó la búsqueda con el algoritmo PageRank.

--------------------------------------------------------------------------------
[ID: 14] - WIKIPEDIA
--------------------------------------------------------------------------------
   > URL:         http://wikipedia.org
   > Creador:     Jimmy Wales y Larry Sanger
   > Lanzamiento: 2001
   > Historia:    La enciclopedia libre basada en tecnología Wiki.

================================================================================
          "La Web no es solo una herramienta, es un derecho humano"
================================================================================
```




SCRIPT SQL 

-- Crear la tabla con la estructura para los hitos de la web
```
CREATE TABLE IF NOT EXISTS HitosHistoricos (
    id               INTEGER PRIMARY KEY AUTOINCREMENT,
    url              TEXT NOT NULL,
    nombre           TEXT NOT NULL,
    autor            TEXT,
    anio_lanzamiento INTEGER,
    descripcion      TEXT
);
```

 Inserciones iniciales de prueba (Opcional, para ver si funciona antes de importar el CSV)
 ```
INSERT INTO HitosHistoricos (url, nombre, autor, anio_lanzamiento, descripcion) 
VALUES ('http://info.cern.ch', 'World Wide Web', 'Tim Berners-Lee', 1990, 'El origen de todo.');

INSERT INTO HitosHistoricos (url, nombre, autor, anio_lanzamiento, descripcion) 
VALUES ('https://google.com', 'Google', 'Larry Page & Sergey Brin', 1998, 'El busca
```
