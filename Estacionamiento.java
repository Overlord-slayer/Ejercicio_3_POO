import java.util.ArrayList;

/**
 * Esta clase intenta realizar las operaciones necesarias para almacener la
 * informacion de los estacionamientos.
 * 
 * @author Josúe Samuel Argueta Hernández
 */

class Estacionamiento {
    private String nombre, direccion, precio;
    private ArrayList<Vehiculo> vehiculos;

    public Estacionamiento() {
        vehiculos = new ArrayList<>();
    }

    public Estacionamiento(String nombre, String direccion, String precio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
    }

    public void agregar_vehiculo(String vehiculo, String placa_vehiculo, String marca_vehiculo,
            String modelo_vehiculo) {
        Vehiculo nuevo = new Vehiculo(vehiculo, placa_vehiculo, marca_vehiculo, modelo_vehiculo);
        vehiculos.add(nuevo);
    }
}