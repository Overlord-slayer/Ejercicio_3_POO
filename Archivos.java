
/**
 * Clase para poder tener el control de los arhivos donde se almacena la informacion necesario.
 *
 *  @author Josúe Samuel Argueta Hernández.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Archivos {
    private Interaccion vista = new Interaccion();
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<EspacioParqueo> espacioParqueos;

    /**
     * Constructor que inicializa el arreglo dinamico.
     */
    public Archivos() {
        vehiculos = new ArrayList<>();
        espacioParqueos = new ArrayList<>();
    }

    /**
     * Lectura de la inforamacion que esta almacenada en un arhcivo.
     */
    public void leer_CSV(String nombre_archivo) {
        // StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<String>> datos_vehiculos = new ArrayList<ArrayList<String>>();

        Path filePath = Paths.get(nombre_archivo);
        try {
            // Tratar de leer el archivo segun su ruta.
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            // Lectura linea por linea del archivo.
            while ((linea = br.readLine()) != null) {
                // Para la lectura de caracteres
                // sb.append(linea).append("\n");
                String[] datosDeLinea = linea.split(",");
                ArrayList<String> datos_temporal = new ArrayList<String>();
                for (String dato : datosDeLinea) {
                    datos_temporal.add(dato);
                }
                datos_vehiculos.add(datos_temporal);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println(datos_vehiculos);

    }

    /**
     * Guardar los datos en un fichero .csv segun sea el caso.
     */
    public void guardar(String nombre_archivo) {
        File archivo;
        try {
            // Modificar la ruta del arhcivo a la ruta donde se ubica actualmente
            archivo = new File(nombre_archivo);
            if (archivo.exists()) {
                vista.archivo_existente();
                BufferedWriter bw = new BufferedWriter(new FileWriter(nombre_archivo, true));
                // bw.write(titulos + "\n");
                for (Vehiculo vehiculo : vehiculos) {
                    String datos[] = vehiculo.getArray();
                    for (int i = 0; i < datos.length; i++) {
                        int maximo = datos.length - 1;
                        if (i == maximo) {
                            bw.write(datos[i] + "\n");
                        } else {
                            // if (i == 0) {
                            // bw.write("\n" + datos[i] + ",");
                            // } else {
                            bw.write(datos[i] + ",");
                            // }
                        }

                    }
                }
                bw.close();
            } else if (archivo.createNewFile()) {
                vista.nuevo_archivo();
            }
        } catch (IOException exception) {
            System.err.println(vista.archivo_no_creado() + exception);
        }
    }

    /**
     * Guarda los elementos del vehículo que acaba de ingresar.
     * 
     * @param vehiculo:        String
     * @param placa_vehiculo:  String
     * @param marca_vehiculo:  String
     * @param modelo_vehiculo: String
     * @param hora_entrada:    String
     */
    public void guardar_vehiculos(String vehiculo, String placa_vehiculo, String marca_vehiculo, String modelo_vehiculo,
            String hora_entrada) {
        vehiculos.add(new Vehiculo(vehiculo, placa_vehiculo, marca_vehiculo, modelo_vehiculo, hora_entrada));
        guardar("Aparcados.csv");
    }

    /**
     * Guarda los elemnsto del espacio generado.
     * 
     * @param ancho:   float
     * @param largo:   float
     * @param altura:  float
     * @param techado: String
     * @param aereo:   String
     */
    public void guardar_espacio(float ancho, float largo, float altura, String techado, String aereo) {
        espacioParqueos.add(new EspacioParqueo(ancho, largo, altura, techado, aereo));
        guardar("Espacios.csv");
    }

}
