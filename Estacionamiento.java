import java.util.ArrayList;

/**
 * Esta clase intenta realizar las operaciones necesarias para almacener la
 * informacion de los estacionamientos.
 * 
 * @author Josúe Samuel Argueta Hernández
 */

class Estacionamiento {
    private String nombre, direccion;
    private float precio;
    private ArrayList<EspacioParqueo> espacioParqueos;
    private Archivos datos = new Archivos();

    /**
     * Este contructor crea la instacia de un arreglo dinamico de tipo Vehiculo para
     * almacenar los datos del vehiculo.
     */
    public Estacionamiento() {
        espacioParqueos = new ArrayList<>();
    }

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

    /**
     * Este método sirve para poder almacenar los vehiculos nuevos que son
     * aparcados.
     * 
     * @param vehiculo:        String
     * @param placa_vehiculo:  String
     * @param marca_vehiculo:  String
     * @param modelo_vehiculo: String
     * @param hora_entrada:    String
     */
    public void agregar_vehiculo(String vehiculo, String placa_vehiculo, String marca_vehiculo, String modelo_vehiculo,
            String hora_entrada) {
        Vehiculo vehiculos = new Vehiculo(vehiculo, placa_vehiculo, marca_vehiculo, modelo_vehiculo, hora_entrada);
        datos.guardar_vehiculos(vehiculo, placa_vehiculo, marca_vehiculo, modelo_vehiculo, hora_entrada);
    }

}