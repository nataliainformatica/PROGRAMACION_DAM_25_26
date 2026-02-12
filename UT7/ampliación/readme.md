# Ejercicio ampliación 1
Sistema de Gestión de Vehículos y Cálculo de Tarifas de Parking

Vas a desarrollar un sistema en Java que permita gestionar distintos tipos de vehículos y calcular tanto su coste de mantenimiento como el precio por hora en un parking, siguiendo criterios similares a los que utilizan los ayuntamientos (como antigüedad, tipo de motor, descuentos para vehículos eléctricos, etc.). Utilizarás herencia, clases abstractas, interfaces y polimorfismo.

Requisitos:

Clase abstracta Vehiculo:

Atributos:

String marca

String modelo

String matricula

int anioFabricacion

double peso (en kilogramos)

Métodos:

Constructor para inicializar todos los atributos.

Método concreto String mostrarInformacion(): muestra la información básica del vehículo.

Método abstracto double calcularCostoMantenimiento(): debe ser implementado por cada subclase para calcular el coste de mantenimiento.

Método abstracto double calcularPrecioHora(): debe ser implementado por cada subclase para calcular el precio por hora en el parking según las características del vehículo.

Interfaz Electrico:

Métodos:

double calcularCostoCarga(): calcula el costo de cargar la batería.

double autonomia(): devuelve la autonomía del vehículo eléctrico en kilómetros.

Subclases que heredan de Vehiculo:

a) Clase Automovil:

Atributos adicionales:

int numeroPuertas

boolean esHibrido

double capacidadCombustible (en litros)

Implementación del método calcularCostoMantenimiento():

El costo base se calcula como: (peso * 0.05) + (capacidadCombustible * 0.1).

Si el automóvil es híbrido (esHibrido == true), reducir el costo total en un 10%.

Implementación del método calcularPrecioHora():

Precio base: 2 euros por hora.

Si el automóvil tiene más de 10 años de antigüedad, añadir un 20% al precio.

Si es híbrido, aplicar un descuento del 15%.

b) Clase BicicletaElectrica (implementa Electrico):

Atributos adicionales:

double capacidadBateria (en kWh)

double consumoPorKm (en kWh/km)

Implementación del método calcularCostoMantenimiento():

El costo base se calcula como: (peso * 0.02).

Agregar un costo fijo de 15 euros por mantenimiento de la batería.

Implementación del método calcularPrecioHora():

Las bicicletas eléctricas tienen parking gratuito.

Implementación de los métodos de Electrico:

calcularCostoCarga(): se calcula como (capacidadBateria * 0.20).

autonomia(): se calcula como (capacidadBateria / consumoPorKm).

Clase Parking:

Atributos:

ArrayList /< Vehiculo /> vehiculosEstacionados

Métodos:

void agregarVehiculo(Vehiculo vehiculo): agrega un vehículo al parking.

void mostrarTarifas(): recorre la lista de vehículos y muestra el precio por hora de cada uno usando polimorfismo. double calcularRecaudacionTotal(): suma el precio por hora de todos los vehículos estacionados para obtener la recaudación total.

Clase Main:

Crear instancias de Automovil y BicicletaElectrica.

Agregar estas instancias al Parking.

Mostrar la información de cada vehículo, su costo de mantenimiento y su precio por hora.

Mostrar la recaudación total del parking.

Ejercicio adicional: Si el vehículo implementa la interfaz Electrico, mostrar también el costo de carga y la autonomía usando instanceof y casting.
# Ejercicio ampliación - práctica de clase

Clase abstracta Usuario  Representa a cualquier usuario de la aplicación.

Atributos
```
•	int idUsuario
•	String nombreUsuario
•	String nombreCompleto
•	int likes
```


Restricciones

•	Una vez creada la instancia no se podrán modificar:
```
o	idUsuario
o	nombreUsuario
o	nombreCompleto
```

•	Se define que dos usuarios son iguales si tienen el mismo nombreUsuario (atributo único).

Métodos

public abstract String mostrarFeeds();
```
public void recibirLike(int idUsuario) {
    likes++;
}
```

Clase **UsuarioNormal** (hereda de Usuario) 

Representa a un usuario normal que puede seguir a otros usuarios, pero no puede publicar contenido.

Atributos

•	ArraList<Integer> seguidos  // ArraList con los identificadores de los usuarios a los que sigue, (también se permite usar array)

Constructor

Al crear la instancia se reciben:
```
•	idUsuario
•	nombreUsuario
•	nombreCompleto
•	ArrayList con los ids de los usuarios seguidos
```


public UsuarioNormal(int idUsuario, String nombreUsuario, String nombreCompleto,  ArrayList<Integer> usuariosSeguidos)

Métodos

public void recibirLike(int idUsuario)

•	Al recibir un like:

o	Solo se incrementará el contador de likes si el usuario que envía el like está en la lista de seguidos.

o	Si no lo está, el like se ignora.

public boolean seguir(int idUsuario)

•	Permite seguir a otro usuario.

•	Si el usuario ya está en la lista de seguidos, no se añadirá de nuevo.

•	Devuelve true si se añade correctamente, false en caso contrario.

public String mostrarFeeds()

•	Devuelve el texto: " Usuario:  nombreUsuario no puede publicar"

(nombreUsuario es el valor del atributo en la instancia)

Clase UsuarioPremium (hereda de Usuario)

Representa a un usuario premium que puede seguir a otros usuarios y publicar contenido.

Atributos

•	ArrayList<String> publicaciones

ArrayList que almacena las publicaciones del usuario. Una publicación es un String.

Constructor

    public UsuarioPremium(int idUsuario, String nombreUsuario, String nombreCompleto, ArrayList<Integer> usuariosSeguidos) {…}

    
Métodos 

public void recibirLike(int idUsuario)

•	Al recibir un like:

o	Se incrementa siempre el contador, independientemente de quién envíe el like.

public void publicar(String publicacion)

•	Añade una nueva publicación al arrayList publicaciones.

public String mostrarFeeds()

•	Devuelve una cadena con  “El usuario nombreUsuario ha publicado + la lista de todas las publicaciones del usuario 

Completa la clase Principal 
, que está  en el aula virtual ,  para hacer pruebas de las clases  Usuario, UsuarioPremium y UsuarioNormal,  usando la clase Pruebas (adjunta en el aula virtual)  que tiene un DAO simulado (una colección de prueba). 



```
import java.util.ArrayList;

public class Pruebas {

        private static ArrayList<Usuario> usuarios = new ArrayList<>();

        // Método que devuelve una lista de Usuario, con 5 usuarios normales y 5
        // usuarios premium, con sus respectivos datos.
        public static ArrayList<Usuario> crearUsuarios() {
                ArrayList<Integer> seguidos1 = new ArrayList<>();
                seguidos1.add(2);
                seguidos1.add(3);
                seguidos1.add(4);
                seguidos1.add(5);
                UsuarioNormal u1 = new UsuarioNormal(1, "usuario1", "Usuario Uno", seguidos1);
                usuarios.add(u1);
                ArrayList<Integer> seguidos2 = new ArrayList<>();
                seguidos2.add(1);
                seguidos2.add(3);
                seguidos2.add(4);
                seguidos2.add(5);
                UsuarioNormal u2 = new UsuarioNormal(2, "usuario2", "Usuario Dos", seguidos2);
                usuarios.add(u2);
                ArrayList<Integer> seguidos3 = new ArrayList<>();
                seguidos3.add(1);
                seguidos3.add(2);
                seguidos3.add(4);
                seguidos3.add(5);
                UsuarioNormal u3 = new UsuarioNormal(3, "usuario3", "Usuario Tres", seguidos3);
                usuarios.add(u3);
                ArrayList<Integer> seguidos4 = new ArrayList<>();
                seguidos4.add(1);
                seguidos4.add(2);
                seguidos4.add(3);
                seguidos4.add(5);
                UsuarioNormal u4 = new UsuarioNormal(4, "usuario4", "Usuario Cuatro", seguidos4);
                usuarios.add(u4);
                ArrayList<Integer> seguidos5 = new ArrayList<>();
                seguidos5.add(1);
                seguidos5.add(2);
                seguidos5.add(3);
                seguidos5.add(4);
                UsuarioNormal u5 = new UsuarioNormal(5, "usuario5", "Usuario Cinco", seguidos5);
                usuarios.add(u5);


                // USUARIOS PREMIUM

                ArrayList<Integer> seguidos6 = new ArrayList<>(seguidos1);
                               UsuarioPremium u6 = new UsuarioPremium(6, "usuario6", "Usuario Seis", seguidos6);
                usuarios.add(u6);
                ArrayList<Integer> seguidos7 = new ArrayList<>(seguidos2);
              
                UsuarioPremium u7 = new UsuarioPremium(7, "usuario7", "Usuario Siete", seguidos7);
                usuarios.add(u7);
                ArrayList<Integer> seguidos8 = new ArrayList<>(seguidos3);
                UsuarioPremium u8 = new UsuarioPremium(8, "usuario8", "Usuario Ocho", seguidos8);
                usuarios.add(u8);
                ArrayList<Integer> seguidos9 = new ArrayList<>(seguidos4);
                UsuarioPremium u9 = new UsuarioPremium(9, "usuario9", "Usuario Nueve", seguidos9);
                usuarios.add(u9);
                ArrayList<Integer> seguidos10 = new ArrayList<>(seguidos5);
                UsuarioPremium u10 = new UsuarioPremium(10, "usuario10", "Usuario Diez", seguidos10);
                usuarios.add(u10);
                return usuarios;
        }
}
```

 clase Principal para completar

 ```

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

      
        // COMPLETA EL CÓDIGO EN ESTA CLASE DONDE SE TE PIDE
        // SIGUIENDO LAS INSTRUCCIONES
        // usando la clase Pruebas, importa el array de Usuarios 
        

        // MUESTRA LAS PUBLICACIONES  DE TODOS LOS USUARIOS

        UsuarioNormal u1 = (UsuarioNormal) usuarios.get(0);
        UsuarioNormal u2= (UsuarioNormal) usuarios.get(1);
        UsuarioPremium u6 = (UsuarioPremium) usuarios.get(5);
        UsuarioPremium u7 = (UsuarioPremium) usuarios.get(6);

        // USANDO LAS INSTANCIAS DE LOS USUARIOS  u1, u2, u6 y u7 
        // COMPLETA LAS SIGUIENTES PRUEBAS
        // COMPLETA EL CÓDIGO EN LOS ******
        // u1 sigue al usuario u6
      
        ******

        // añade una publicación a u6
        ******
        // U1 recibe un like de u6
        ********
        // U1 recibe un like de u7 
        *****
        
        // muestra el número de  likes que tiene el usuario u1 
        ********

        

    }

}
```




