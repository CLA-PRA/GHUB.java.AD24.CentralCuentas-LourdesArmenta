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
            scanner.useDelimiter(",\\s*");

            while (scanner.hasNext()) {
                String linea = scanner.nextLine();
                String[] campos = linea.split(",");

                // Aquí se procesan los campos y se agregan a las listas correspondientes
                int id = Integer.parseInt(campos[0].replaceAll("\"", ""));
                String nombre = campos[1].replaceAll("\"", "");
                boolean disponible = Boolean.parseBoolean(campos[2].replaceAll("\"", ""));
                 // Agregar el recurso a la lista de recursos
                Recurso recurso = new Recurso(id, nombre, disponible);
                recursos.agregar(recurso);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (Scanner scannerEstudiantes = new Scanner(new File(rutaArchivoEstudiantes))) {
            scannerEstudiantes.useDelimiter(",\\s*");

            while (scannerEstudiantes.hasNext()) {
                String linea = scannerEstudiantes.nextLine();
                String[] campos = linea.split(",");

                // Aquí se procesan los campos y se agregan a las listas correspondientes
                int codigo = Integer.parseInt(campos[0].replaceAll("\"", ""));
                String nombre = campos[1].replaceAll("\"", "");
                String email = campos[2].replaceAll("\"", "");
                String fechaNac = campos[3].replaceAll("\"", "");
                String sexo = campos[4].replaceAll("\"", "");
                String programa = campos[5].replaceAll("\"", "");
               
                // Agregar el estudiante a la lista de estudiantes
                Estudiante est = new Estudiante(codigo, nombre, new Email(email), new Fecha(fechaNac), sexo, programa);
                estudiantes.agregar(est);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            

    }
}