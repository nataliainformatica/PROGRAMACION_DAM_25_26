Ejercicio AMPLIACIÓN - AGENDA
Agenda de Eventos usando Colecciones en Java

Desarrolla una aplicación en Java que administre una agenda de eventos utilizando colecciones (Set, TreeSet, ArrayList).

Agenda

Utiliza un TreeSet para almacenar las citas o eventos ordenados.



Se ordenarán por fecha y hora.

Principal

Implementa un sistema de menú para interactuar con las siguientes opciones.

Cargar citas desde un calendario compartido
Realizar  la carga de citas desde la BBBDD usando un DAO que devuelve un ArrayList. Agregar estas citas a la agenda.

Cargar citas desde la agenda propia
Realizar  la carga de citas desde un DAO que devuelve un HashSet. Agregar estas citas a la agenda.

Mostrar la agenda de citas (ORDENADAS)");
Mostrará todas las citas de la agenda

4 .Eliminar citas por categoría

Solicitar al usuario una categoría y se eliminarán todas las citas que pertenezcan a esa categoría.

Salir
Clase Cita:

fecha (LocalDate)

hora (LocalTime)

descripción (String)

categoría (String)

DAOSimulado

Un método que devuelve un ArrayList con citas de un calendario compartido. Un método que devuelve un HashSet con citas de la agenda propia.
