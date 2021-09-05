
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

    public Archivos() {
        vehiculos = new ArrayList<>();
    }

    /**
     * Lectura de la inforamacion que esta almacenada en un arhcivo.
     */
    public void leer_CSV(String nombre_archivo) {
        // StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<String>> datos_vehiculos = new ArrayList<ArrayList<String>>();
        // Modificar la ruta segun la ruta donde guarde los archivos, recordad que la
        // carpeta archivos se encuentran todos los archivos a utlilizar.
        Path filePath = Paths
                .get("C:\\Users\\s5349\\Documents\\Universidad\\Tareas_Universidad\\Ejercicio_3\\Archivos\\"
                        + nombre_archivo);
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

    public void guardar(String nombre_archivo, String titulos) {
        File archivo;
        try {
            // Modificar la ruta del arhcivo a la ruta donde se ubica actualmente
            archivo = new File("C:\\Users\\s5349\\Documents\\Universidad\\Tareas_Universidad\\Ejercicio_3\\Archivos\\"
                    + nombre_archivo);
            if (archivo.exists()) {
                vista.archivo_existente();
                BufferedWriter bw = new BufferedWriter(new FileWriter(nombre_archivo, true));
                bw.write(titulos + "\n");
                for (Vehiculo vehiculo : vehiculos) {
                    String datos[] = vehiculo.getArray();
                    bw.write(datos + "\n");
                }
                bw.close();
            } else if (archivo.createNewFile()) {
                vista.nuevo_archivo();
            }
        } catch (IOException exception) {
            System.err.println(vista.archivo_no_creado() + exception);
        }
    }

    public void guardar_vehiculos(String vehiculo, String placa_vehiculo, String marca_vehiculo, String modelo_vehiculo,
            String hora_entrada) {
        Vehiculo nuevo = new Vehiculo(vehiculo, placa_vehiculo, marca_vehiculo, modelo_vehiculo, hora_entrada);
        vehiculos.add(nuevo);
        guardar("Aparcados.csv", "Dimension,placa,modelo,marca,entrada");
    }

}
