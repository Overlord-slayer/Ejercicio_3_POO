
/**
 * Esta clase intenta realizar las operaciones necesarias para almacener la
 * informacion de los estacionamientos.
 * 
 * @author Josúe Samuel Argueta Hernández
 */

class Estacionamiento {
    private String nombre, direccion;
    private float precio;

    /**
     * Este constructor sobrecargado sirve para poder obtener los datos del
     * estacionamiento
     * 
     * @param nombre
     * @param direccion
     * @param precio
     */
    public Estacionamiento(String nombre, String direccion, float precio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
    }

}