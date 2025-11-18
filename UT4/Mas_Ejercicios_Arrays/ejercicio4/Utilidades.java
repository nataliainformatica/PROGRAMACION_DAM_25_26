package es.avellaneda.utilidades;

/**
 * Crea otro paquete, con una clase en el que habrá una función con el método
 * devuelveTiposEnergias…. , en esta función estará definido un array estático
 * con 3 tipos de energía ["petróleo", "gas natural", "hidroeléctrica"]. Que
 * usará las siguientes colecciones de palabras para identificar cada una de las
 * energías:
 * 
 * 
 */
public class Utilidades {

    public static String devuelveTiposEnergias(String accion) {
        String tipo = "No encontrado";
        // --- PALABRAS / ACTIVIDADES RELACIONADAS CON CADA ENERGÍA ---
        String[] energias = { "petróleo", "gas natural", "hidroeléctrica" };
        String[] palabrasPetroleo = {
                "coche", "gasolina", "diesel", "moto", "avión", "transporte", "camión", "autobús",
                "repostar", "viajar", "combustible", "gasolinera", "barco", "motor"
        };

        String[] palabrasGasNatural = {
                "calefacción", "cocinar", "agua caliente", "ducha", "baño", "horno", "cocina de gas",
                "termo", "caldera", "calor"
        };

        String[] palabrasHidroelectrica = {
                "lavadora", "lavavajillas", "microondas", "cargar móvil", "ordenador", "consola", "televisión"
        };

        // buscar en cualquiera de las tres colecciones la acción y devover el tipo

        for (String s : palabrasPetroleo) {
            if (accion.contains(s)) {
                return energias[0];
                // return "petróleo"; 
            }
        }
        for (String s2 : palabrasGasNatural) {
                if (accion.contains(s2)) {
                    return energias[1];
                }
        }
        for (String s3 : palabrasHidroelectrica) {
                if (accion.contains(s3)) {
                    return energias[2];
                }
        }
        

    return tipo;

}
/**
 * Esta misma clase tendrá otro método, 
 * devuelveGradoContaminación,
 *  que tendrá un array con los grados de contaminación de las energías [alto, alto,bajo]. La función devolverá, teniendo en cuenta la posición en el array, el grado de contaminación que tiene la energía.
 */
public static String devuelveContaminacion(String energia){
    String[] energias = {"petróleo","gas natural", "hidroeléctrica"};
    String[] grados ={"alto","alto","bajo"};

    for(int i =0; i< energias.length; i++){
            if(energia.equalsIgnoreCase(energias[i])){
                return grados[i];
            }
    }


    return "No catalogado";


}

}
