
/**
 * Este método servirá para poder tener un registro del espacio del parqueo.
 * 
 * @author Josúe Samuel Argueta Hernández.
 */
public class EspacioParqueo {
    private float ancho, largo, altura;
    private String techado, aereo;
    private Archivos datos = new Archivos();

    public EspacioParqueo(float ancho, float largo, float altura, String techado, String aereo) {
        this.ancho = ancho;
        this.largo = largo;
        this.altura = altura;
        this.techado = techado;
        this.aereo = aereo;
        agregar_espacio(ancho, largo, altura, techado, aereo);
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
    private void agregar_espacio(float ancho, float largo, float altura, String techado, String aereo) {
        datos.guardar_espacio(ancho, largo, altura, techado, aereo);
    }

    /**
     * Este método sirve para poder devolver de manera conjunta todos los datos
     * necesarios del espacio del parqueo que acaba de ingresar.
     * 
     * @return datos: String[]
     */
    public String[] getArray() {
        String[] datos = { String.valueOf(ancho), String.valueOf(largo), String.valueOf(altura), techado, aereo };
        return datos;
    }
}
