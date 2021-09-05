import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archivos {

    public void leer() {
        StringBuilder sb = new StringBuilder();
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
                sb.append(linea).append("\n");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println(sb);
    }

    public void guardar() {
        File archivo;
        try {
            archivo = new File(
                    "C:/Users/s5349/Documents/Universidad/Tareas_Universidad/Ejercicio_3/Archivos/Aparcados.csv");
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
