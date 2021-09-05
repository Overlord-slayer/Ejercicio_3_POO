/**
 * Está clase, su función principal es poder dar una interacción amena con el
 * usuario.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Interaccion {

    public Interaccion() {

    }

    /**
     * Este método mostrará el menú de opciones del sistema.
     */
    public void menu() {
        System.out.println("\nESCOJA LA OPCION QUE DESEA SEGUIR\n");
        System.out.println("1. Aparcar Vehiculo");
        System.out.println("2. Sacar Vehiculo");
        System.out.println("3. Crear nuevo parqueo");
        System.out.println("4. Datos estadisticos");
        System.out.println("5. Salir");
    }

    /**
     * Este metodo sirve para mostrar el mensaje para que el usuario ingrese la
     * opcion que desea.
     * 
     * @return mensaje: String
     */
    public String opciones_menu() {
        String mensaje = "Ingrese la opcion que desea utilizar:";
        return mensaje;
    }

    /**
     * La función de este método es dar la bienvenida la usuario.
     */
    public void bienvenida() {
        System.out.println("BENVENIDO/A AL SISTEMA DE APARCAMIENTO DE VEHICULOS");
    }

    /**
     * La función de este metodo es darle un adios al usuario, una vez haya
     * concluido su tarea.
     */
    public void despedida() {
        System.out.println("¡Muchas gracias por preferir nuestro sistema!, ¡Feliz Dia!");
    }

    /**
     * Este método servirá para indicarle al usuario que ingreso una opcion invalida
     * del menú.
     */
    public void opcion_invalida() {
        System.out.println("DEBE INGRESAR UNA OPCION SEGUN EL MENU");
    }

    /**
     * Este método, serivirrá para indicarle al usuario que ingrese valores
     * numéricos.
     */
    public void valor_invalido() {
        System.out.println("DEBE INGRESAR UN NUMERO");
    }

    /**
     * Este método sirve para solicitarle al usuario, de manera textual, que ingrese
     * los datos del vehículo.
     */
    public void nuevo_vehiculo() {
        System.out.println("\nIngrese los datos del vehiculo:");
    }

    /**
     * Este metodo sirve para mostrarle el tipo de dimensiones para el vehiculo.
     * 
     * @return dimension: String
     */
    public String dimensiones() {
        String dimension = "Ingrese la dimension del vehiculo (Compact, Standard, Standard Large)";
        return dimension;
    }

    /**
     * Este método sirve para solicitar, de manera textual, la placa del vehículo.
     * 
     * @return placa: String
     */
    public String placa() {
        String placa = "Ingrese el numero de placa del vehiculo";
        return placa;
    }

    /**
     * Este método sirve para solicitar, de manera textual, la marca del vehículo.
     * 
     * @return marca: String
     */
    public String marca() {
        String marca = "Ingrese la marca del vehiculo";
        return marca;
    }

    /**
     * Este método sirve para solicitar, de manera textual, la marca del vehículo.
     * 
     * @return modelo: String
     */
    public String modelo() {
        String modelo = "Ingrese el modelo del vehiculo";
        return modelo;
    }

    /**
     * Esta método sirve para mostrar de manera texutal que ingrese la hora de
     * entrada del vehículo al estacionamiento.
     * 
     * @return entrada: String
     */
    public String hora_ingreso() {
        String entrada = "Ingrese la hora de entrada del vehiculo:";
        return entrada;
    }

    /**
     * Este método sirver para mostrar de manera texual al usuaio que ingrese la
     * hora de salida del vehiculo.
     * 
     * @return salida: String
     */
    public String hora_salida() {
        String salida = "Ingrese la hora de salida del vehicuo:";
        return salida;
    }

    public void nuevo_estacionamiento() {
        System.out.println("Ingrese los datos del parqueo");
    }

    public void direccion_estacionamiento() {
        System.out.println("Ingrese el nombre del parqueo: ");
    }
}
