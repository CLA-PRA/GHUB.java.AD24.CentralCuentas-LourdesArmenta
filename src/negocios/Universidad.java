package negocios;
import datos.Estudiante;
import datos.Lista;
import datos.PosicionIlegalException;
import datos.Prestamo;
import datos.Recurso;
import datos.Fecha;
import datos.Email;

import datos.LectorArchivo;

/**
 * La clase Universidad representa una universidad que maneja listas de estudiantes, recursos y préstamos.
 * Proporciona métodos para gestionar estos datos.
 */
public class Universidad {
	private Lista<Estudiante> estudiantes;
	private Lista<Recurso> recursos;
	private Lista<Prestamo> prestamos;
	/**
     * Constructor por defecto que inicializa las listas de estudiantes, recursos y préstamos.
     */
	public Universidad() {
		
		//invocar al archivo de recursos
		
		
	}

	
	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param email
	 * @param fechaNac
	 * @param sexo
	 * @param programa
	 * @return
	 * @throws PosicionIlegalException
	 */

	public boolean agregarEstudiante
			
			
	}

	
	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws PosicionIlegalException
	 */

	public Estudiante buscarEstudiante(int codigo) throws PosicionIlegalException{
		
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @return
	 * @throws PosicionIlegalException
	 */
	public boolean agregarRecurso(int id, String nombre) throws PosicionIlegalException{
		
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws PosicionIlegalException
	 */
	public Recurso buscarRecurso(int id) throws PosicionIlegalException{
		
	}

	/**
	 * 
	 * @param codigo
	 * @param id
	 * @param fecha
	 * @return
	 * @throws PosicionIlegalException
	 */
	public boolean prestarRecursos(int codigo, int id, Fecha fecha) throws PosicionIlegalException{
		
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws PosicionIlegalException
	 */
	public Estudiante consultarEstudianteTieneRecurso(int id) throws PosicionIlegalException{
		
	}

	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws PosicionIlegalException
	 */
	public Lista<Recurso> consultarRecursosDeUnEstudiante(int codigo) throws
	   
		
	}

	/**
	 * 
	 * @param id
	 * @param fecha
	 * @return
	 * @throws PosicionIlegalException
	 */
	
	public boolean devolverRecurso(int id, Fecha fechaDev) throws PosicionIlegalException{
		Recurso rec = buscarRecurso(id);
		if (rec==null){
			System.out.println("Recurso no existe");
			return false;
		}
		if(rec.isDisponible()) {
			System.out.println("El recurso "+rec+" no se puede devolver "+
		   " porque esta disponible");
			return false;
		}
		for (int i=0;i<prestamos.getTamanio();i++) {
			Prestamo pres=prestamos.getValor(i);
			System.out.println("Nombre: "+pres.getEstudiante().getNombre()+"Fecha Prestamo: "+ pres.getFechaPrestamo()+"Fecha Devolución: "+pres.getFechaDevolucion());
			if(pres.getRecurso().getId()==id && pres.getFechaDevolucion()==null) {
				//validar que la fecha de devolución no debe ser menor que la fecha de prestado
				System.out.println("voy a compara devolucion "+fechaDev+" con prestamo "+pres.getFechaPrestamo());
				if (fechaDev.compareTo(pres.getFechaPrestamo()) < 0) {
					System.out.println("La fecha de devolución no puede ser anterior a la fecha de préstamo");
					return false;
				}
				//asignoo la fecha de devolucion
				pres.setFechaDevolucion(fechaDev);
				rec.setDisponible(true);
				System.out.println("Se ha devuelto el recurso "+
				   rec+ "por parte del estudiantes "+
						pres.getEstudiante()+ "satisfactoriamente");
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws PosicionIlegalException
	 */
	public boolean eliminarRecurso(int id) throws PosicionIlegalException{
		
	}

	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws PosicionIlegalException
	 */
	public boolean eliminarEstudiante(int codigo) throws PosicionIlegalException{
		Estudiante est = buscarEstudiante(codigo);
		if (est==null) {
			System.out.println("Estudiante no existe");
			return false;
		}
		//Borrar el estudiante de los prestamos
		
		
		
		
		//Borrar el estudiantes de estudiantes
		
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws PosicionIlegalException
	 */
	public String buscarNombreRecurso(int id) throws PosicionIlegalException{
		
	}

	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws PosicionIlegalException
	 */
	public String buscarNombreEstudiante(int codigo) throws PosicionIlegalException{
		
	}

	
	 /**
	  * 
	  * @return
	  * @throws PosicionIlegalException
	  */
	
	public Lista<Recurso> mostrarRecursos() throws PosicionIlegalException{
		
	}

	/**
	 * 
	 * @return
	 * @throws PosicionIlegalException
	 */
	
	public Lista<Estudiante> mostrarEstudiantes() throws PosicionIlegalException {
		
	}
	/**
	 * 
	 * @return una lista de los estudiantes que cumplan con la condición de tener mas
	 *       de tres préstamos
	 * @throws PosicionIlegalException
	 */
	
	public Lista<Estudiante> mostrarEstudiantesMasDeTres() throws PosicionIlegalException {
		
		
		return prestamosMasDeTres;
	}
	
}
		
	
	





