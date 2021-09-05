
import javax.swing.JOptionPane;

/**
 * Esta es la clase controlador del sistema que sirve para poder darle
 * funcionamiento lógico al programa.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Principal {
    // Se agreago esta "propiedad" al metodo principa, puesto que se desea
    // tener utilizacion en todo sentido de la clase Interaccion
    private static Interaccion vista = new Interaccion();
    private static Estacionamiento aparcar_vehiculo = new Estacionamiento();
    private static Archivos datos = new Archivos();

    /**
     * Método principal que contiene todas las instancias necesarias para poder dar
     * una funcionamiento lógico al sistema.
     * 
     * @param args: String
     */
    public static void main(String[] args) {
        vista.bienvenida();
        byte opcion = 0;
        while (opcion != 5) {
            opcion = menu_opcion();
            switch (opcion) {
                case 1:
                    // Aparcar vehiculo
                    datos_vehiculo();
                    break;
                case 2:
                    // Sacar vehiculo

                    break;
                case 3:
                    // Crear parqueo
                    break;
                case 4:
                    // Datos Estadisticos
                    break;
                default:
                    vista.despedida();
                    break;
            }
        }
    }

    /**
     * Este metodo sirve para hacer una verificacion del dato ingresado por el
     * usuario
     * 
     * @return opcion: byte
     */
    private static byte menu_opcion() {
        byte opcion = 0;
        boolean pasar = false;
        do {
            vista.menu();
            try {
                opcion = Byte.parseByte(JOptionPane.showInputDialog(vista.opciones_menu()));
                if ((opcion < 1) || (opcion > 5)) {
                    vista.opcion_invalida();
                } else {
                    pasar = true;
                }

            } catch (NumberFormatException exception) {
                vista.valor_invalido();
            }
        } while (!pasar);

        return opcion;
    }

    /**
     * Este método es para poder obtener los datos del vehículo por parte del
     * usuario.
     */
    private static void datos_vehiculo() {
        String vehiculo, placa_vehiculo, marca_vehiculo, modelo_vehiculo;
        String hora_entrada;
        vista.nuevo_vehiculo();

        vehiculo = JOptionPane.showInputDialog(vista.dimensiones());
        placa_vehiculo = JOptionPane.showInputDialog(vista.placa());
        marca_vehiculo = JOptionPane.showInputDialog(vista.marca());
        modelo_vehiculo = JOptionPane.showInputDialog(vista.modelo());
        hora_entrada = JOptionPane.showInputDialog(vista.hora_ingreso());

        aparcar_vehiculo.agregar_vehiculo(vehiculo, placa_vehiculo, marca_vehiculo, modelo_vehiculo, hora_entrada);
    }

    private static void datos_parqueo() {
        String ancho, largo, altura, techado, aereo;
        vista.nuevo_estacionamiento();
    }
}
