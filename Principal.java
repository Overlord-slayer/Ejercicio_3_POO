import javax.swing.JOptionPane;

/**
 * Esta es la clase controlador del sistema que sirve para poder darle
 * funcionamiento del programa.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Principal {
    // Se agreago esta "propiedad" al metodo principa, puesto que se desea
    // tener utilizacion en todo sentido de la clase Interaccion
    private static Interaccion vista = new Interaccion();

    /**
     * Método principal que contiene todas las instancias necesarias para poder dar
     * una funcionamiento lógico al sistema.
     * 
     * @param args: String
     */
    public static void main(String[] args) {
        vista.bienvenida();
        byte opcion = 0;
        while (opcion != 4) {
            opcion = menu_opcion();
            switch (opcion) {
                case 1:
                    // Aparcar vehiculo
                    break;
                case 2:
                    // Crear parqueo
                    break;
                case 3:
                    // Datos Estadisticos
                    break;
                case 4:
                    vista.despedida();
                    break;
                default:
                    vista.opcion_invalida();
                    break;
            }
        }
    }

    private static byte menu_opcion() {
        vista.menu();
        byte opcion = 0;
        boolean pasar = false;
        do {
            try {
                opcion = Byte.parseByte(JOptionPane.showInputDialog("Ingrese una de las opciones"));
                if ((opcion < 1) || (opcion > 4)) {
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
}
