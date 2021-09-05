
/**
 * Clase para poder tener el control de los arhivos donde se almacena la informacion necesario.
 *
 *  @author Josúe Samuel Argueta Hernández.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Archivos {

    public static void leer_CSV() {
        // StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<String>> datos_vehiculos = new ArrayList<ArrayList<String>>();
        // Modificar la ruta segun la ruta donde guarde los archivos, recordad que la
        // carpeta archivos se encuentran todos los archivos a utlilizar.
        Path filePath = Paths
                .get("C:/Users/s5349/Documents/Universidad/Tareas_Universidad/Ejercicio_3/Archivos/Aparcados.csv");
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

    public void guardar(String nombre_archivo) {
        File archivo;
        try {
            // Modificar la ruta del arhcivo a la ruta donde se ubica actualmente
            archivo = new File(
                    "C:/Users/s5349/Documents/Universidad/Tareas_Universidad/Ejercicio_3/Archivos/" + nombre_archivo);
            if (archivo.createNewFile()) {
                if (archivo.exists()) {
                    System.out.println("El archivo ya existe");
                } else {
                    System.out.println("Se ha creado");
                }
            }
        } catch (IOException exception) {
            System.out.println("No se ha podido crear el archvivo.");
        }
    }

}
