
# Ejercicio 
El objetivo es realizar una aplicación para una biblioteca que necesita gestionar libros y préstamos.

La aplicación tendrá una clase GestionBiblioteca (facilitada en el aula virtual) que deberás completar.

El programa mostrará el siguiente menú:

===== MENÚ BIBLIOTECA =====
1. Añadir libro
2. Listar libros
3. Realizar préstamo
4. Registrar devolución
5. Listar préstamos de un libro
6. Salir
Seleccione opción:



TRAZAS DE EJECUCIÓN

Crear libro: pedirá al usuario ISBN, título y género,  y stock asegúrate de capturar correctamente las posibles excepciones. 
Puedes volver al menú principal se se produce algún fallo en la introducción de datos.
```
Seleccione opción: 1

ISBN: 1
Título: Java Básico
Genero: TECNOLOGIA
Stock total: 3

Libro creado correctamente
		
```
Traza de error

```
	
		
			ISBN: 1
Título: Java Básico
Genero: MELOINVENTO
Stock total: 3

Has introducido algún dato incorrecto
		
```

Realizar préstamo
```
Seleccione opción: 3

ISBN libro: 1
Nombre usuario: Marta

Préstamo realizado correctamente
```
			Si no hay stock:
```		
No hay unidades disponibles
```	
Registrar devolución
```
Seleccione opción: 4

ISBN libro: 1
idPrestamo: 1

Devolución registrada correctamente
```
Listar préstamos
```
Seleccione opción: 5

ISBN libro: 1

PRESTAMOS:

Prestamo{nombreUsuario='Marta',
fechaPrestamo=2026-03-06, fechaDevolucion=null}
		
```


MODELADO DE CLASES 

# clase Prestamo

Esta clase representa un préstamo de un libro a un usuario.

	

	
```

	
		
			Atributos privados
			idPrestamo (int)
			nombreUsuario (String)
			fechaPrestamo (LocalDate)
			fechaDevolucion (LocalDate)
```
		
		
			Requisitos
			
			La fechaPrestamo se asignará automáticamente con la fecha actual cuando se crea el préstamo.
			
			La fechaDevolucion será null inicialmente.
			
			Cuando el libro se devuelva, se asignará la fecha actual, mediante el método finalizarPrestamo()
		
	


Métodos necesarios

Constructores, getters y setters que consideres necesarios.

El idPrestamo, será automático, usando un contador de instancias .

public boolean finalizarPrestamo()  que actualiza la fechaDevolucion a la fecha actual (solamente si la fechaDevolucion era null)

# clase Libro 
```
		
			Atributos privados
			isbn (String)
			titulo (String)
			genero (enum GeneroLibro)
			stockTotal (int)
			prestamos (ArrayList<Prestamo>)
			
```
		
		
		
			Reglas importantes
			
			Cuando se crea un libro: El stockTotal indica cuántos ejemplares tiene la biblioteca.
			
			La lista de préstamos comienza vacía.
			
			Dos libros son iguales si tienen el mismo ISBN.
		
	

```

Enum GeneroLibro
NOVELA
CIENCIA
HISTORIA
TECNOLOGIA
```

Nota: Recuerda que puedes usar GeneroLibro genero  =  GeneroLibro.valueOf(texto.toUpperCase());

Método   boolean prestarLibro(Prestamo p)

Debe:

	
	Comprobar si hay stock disponible.
	
	Si hay stock:
	
		añadir el préstamo
		
		devolver true
	
	
	Si no hay stock:
	
		
		devolver false
	


Método  boolean devolverLibro(int idPrestamo)

Debe:

	
	Buscar el préstamo activo idPrestamo .
	
	Registrar la fecha de devolución  en Prestamo. 
	
	
	Liberar una unidad de stock, solamente si el libro estaba prestado.


Método  int getStockDisponible()

Debe calcular:     stockTotal - prestamosActivos

Método Prestamo buscarPrestamoActivo(String nombreUsuario)

Devuelve el primer préstamo (con ese d nombreUsuario) que todavía no tenga fecha de devolución.

# DAO
LibroDAO      ---  No se permite usar STATIC

Atributo
```

private ArrayList<Libro> listaLibros;
```


Métodos obligatorios

 public boolean guardar(Libro l)

Guarda el libro evitando 	duplicados por ISBN.

public  Libro buscarPorIsbn(String isbn)

Devuelve el libro correspondiente.

public  String listar()

Devuelve un String con todos los libros.

Formato ejemplo:
ISBN: 1 Titulo: Java Básico  Stock disponible: 3

Si no hay libros:
No hay libros registrados.



   

}
