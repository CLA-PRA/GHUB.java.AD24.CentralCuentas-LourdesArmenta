package datos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * La clase LectorArchivo se encarga de leer archivos y cargar datos en listas de estudiantes, recursos y préstamos.
 */

public class LectorArchivo {
    /**
     * Lee los archivos de recursos y estudiantes y carga los datos en las listas proporcionadas.
     *
     * @param estudiantes La lista donde se cargarán los datos de los estudiantes.
     * @param recursos La lista donde se cargarán los datos de los recursos.
     * @param prestamos La lista donde se cargarán los datos de los préstamos.
     */

    public void leerArchivo( Lista <Estudiante> estudiantes, 
                             Lista <Recurso> recursos, 
                             Lista <Prestamo> prestamos) {
        String rutaArchivo = "src/datos/recursos.txt";
        String rutaArchivoEstudiantes = "src/datos/estudiantes.txt";
        
        try (Scanner scanner = new Scanner(new File(rutaArchivo))) {
            
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try () {
           

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            

    }
}