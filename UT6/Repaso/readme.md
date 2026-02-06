
# Ejercicios de repaso - 

https://github.com/lionel-ict/ApuntesProgramacion/blob/master/Unidad%208%20POO%20(I)/ud8_Ejercicios.pdf

Práctica del RA4 - 
Crea una clase Publicacion que represente publicaciones de usuarios en una red social. 

Cada publicación tiene los siguientes atributos: 

•	idUsuario (int): identificador del usuario que crea la publicación.

•	contenidos (Lista de Strings): con los contenidos de la publicación, máximo 10 Strings.

•	fechaHoraPublicacion (LocalDateTime): la fecha y hora en que se creó la publicación. Se asigna automáticamente al crear la publicación y no puede modificarse posteriormente.

•	fechaHoraModificacion(LocalDateTime): la fecha y hora en la que se modifica la lista de contenidos, ya sea añadiendo o eliminando. Si no se añade o modifica  ningún contenido, será la misma que la fecha de publicación. 

Requisitos de la clase Publicacion:

1.	Se debe poder crear de una de estas dos formas:
   
o	Solamente con idUsuario.

o	Con idUsuario y un contenido inicial.

2.	Permitir consultar los atributos (idUsuario, , fechaHoraPublicacion y fechaHoraModificacion).
   
3.	Permitir agregar más contenido mediante agregarContenido(String contenido).
   
Devolver true o false y actualizar fechaModificacion

4.	Permitir eliminar el último contenido agregado con eliminarUltimoContenido().
   
Devolver true o false y actualizar fechaModificacion

5.	Implementar mostrarFeeds(), que muestre:
   
o	ID de usuario

o	Fecha y hora de la modificación.

o	Todos los contenidos de la publicación

6.	Implementar el método equals(Object obj) de forma que dos publicaciones sean consideradas iguales si:
7.	
o	Tienen el mismo idUsuario y

o	Tienen exactamente el mismo contenido (en orden y cantidad).

Crea también una clase Principal para probar la clase Publicacion.

•	Crea una instancia de Publicacion.

•	Agregar contenido.

•	Elimina el último contenido. 

•	Muestre el contenido usando mostrarFeeds().

