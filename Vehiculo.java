/**
 * Esta clase servirá para poder tener registro de los nuevos vehículos que
 * ingresan al estacionamiento.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Vehiculo {
    private String vehiculo, placa_vehiculo;
    private String modelo_vehiculo, marca_vehiculo;
    private String hora_entrada, hora_salida;

    public Vehiculo(String placa_vehiculo, String hora_salida) {
        this.placa_vehiculo = placa_vehiculo;
        this.hora_salida = hora_salida;
    }

    public Vehiculo(String vehiculo, String placa_vehiculo, String marca_vehiculo, String modelo_vehiculo,
            String hora_entrada) {
        this.vehiculo = vehiculo;
        this.placa_vehiculo = placa_vehiculo;
        this.marca_vehiculo = marca_vehiculo;
        this.modelo_vehiculo = modelo_vehiculo;
        this.hora_entrada = hora_entrada;
    }

    /**
     * Este método sirve para obtener el tipo de largo del vehiculo.
     * 
     * @return vehiculo: String
     */
    public String getVehiculo() {
        return vehiculo;
    }

    /**
     * Este método devuelve la placa del vehículo.
     * 
     * @return placa_vehiculo: String
     */
    public String getPlaca() {
        return placa_vehiculo;
    }

    /**
     * Este método devuelve el modelo del vehículo.
     * 
     * @return modelo_vehiculo: String
     */
    public String getModelo() {
        return modelo_vehiculo;
    }

    /**
     * Este método devuelve la marca del vehículo.
     * 
     * @return marca_vehiculo: String
     */
    public String getMarca() {
        return marca_vehiculo;
    }

    /**
     * Este método devuelve las horas que ha estado estacionado el vehículo.
     * 
     * @return hora_entrada: String
     */
    public String getHoras_estacionado() {
        return hora_entrada;
    }

    /**
     * Este método devuelve la hora de sálida del vehículo.
     * 
     * @return hora_salida: String
     */
    public String getHora_salida() {
        return hora_salida;
    }

}