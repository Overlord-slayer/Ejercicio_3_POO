/**
 * Esta clase servirá para poder tener registro de los nuevos vehículos que
 * ingresan al estacionamiento.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Vehiculo {
    private String vehiculo, placa_vehiculo;
    private String modelo_vehiculo, marca_vehiculo;
    private float horas_estacionado;

    public Vehiculo(String vehiculo, String placa_vehiculo, String marca_vehiculo, String modelo_vehiculo,
            float horas_estacionado) {
        this.vehiculo = vehiculo;
        this.placa_vehiculo = placa_vehiculo;
        this.marca_vehiculo = marca_vehiculo;
        this.modelo_vehiculo = modelo_vehiculo;
        this.horas_estacionado = horas_estacionado;
    }

    public Vehiculo(String vehiculo, String placa_vehiculo, String marca_vehiculo, String modelo_vehiculo) {
        this.vehiculo = vehiculo;
        this.placa_vehiculo = placa_vehiculo;
        this.marca_vehiculo = marca_vehiculo;
        this.modelo_vehiculo = modelo_vehiculo;
    }

}
