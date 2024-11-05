package uI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import datos.Email;
import datos.Estudiante;
import datos.Fecha;
import datos.Lista;
import datos.Recurso;
import negocios.Universidad;


public class MenuOpciones {
	static Scanner entrada = new  Scanner(System.in);
	private Universidad univ = new Universidad();
	
	public  void agregarRecurso() {
		
		try {
			Integer id;
			String nombre;
			
			do {
				
				System.out.println("Ingresar un ID de Recurso");
				System.out.println("El ID del Recurso no puede repetirse");
		
				System.out.print("ID:");
				id = entrada.nextInt();
				
			}while (!(univ.buscarRecurso(id) == null));
			entrada.nextLine();
			System.out.print("NOMBRE:");
			nombre = entrada.nextLine();
			
			if(univ.agregarRecurso(id, nombre)){
				System.out.println("El Recurso se agregó exitosamente");
			}else{
				System.out.println("El recurso NO SE HA Registrado");
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	   
	public void eliminarRecurso() {
		
	  
	}
	public void devolverRecurso() {
		try {
			Integer id;
			String nombre;
			String sFecha;
			Fecha fecha=null;
			boolean fechaValida = false;
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			while (!fechaValida) {
				try {
					System.out.print("Ingrese la Fecha de Devolución (dd/MM/yyyy):");
					sFecha = entrada.next();
					LocalDate fechaLocalDate = LocalDate.parse(sFecha, formato);
					fecha = new Fecha(sFecha); // Asumiendo que tienes una clase Fecha que acepta un String
					fechaValida = true; // Si no hay excepción, la fecha es válida
				} catch (DateTimeParseException e) {
					System.out.println("Fecha inválida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.");
				}
			}
			
			do {
				
				System.out.print("Ingresar un ID de Recurso:");
				
				id = entrada.nextInt();
				
			} while ((univ.buscarRecurso(id) == null));
			
			nombre=univ.buscarNombreRecurso(id);
			System.out.println(" "+nombre);
			
			if(univ.devolverRecurso(id,fecha)){
				System.out.println("Préstamo Devuelto Exitosamente");
			}
			else{
				System.out.println("Prestamo NO HA podido ser devuelto");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	  
	}
	public void mostrarRecursos() {
		
	}
    public  void agregarEstudiante() {
		
		
		
	}
	   
	public void eliminarEstudiante() {
		
	}
	public void mostrarEstudiantes() {
		
	 
	}
    public  void prestarRecurso() {
		
		try {
			Integer codigo;
			Integer id;
			String sFecha;
			
			Fecha fecha=null;
			boolean fechaValida = false;
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			while (!fechaValida) {
				try {
					System.out.print("Ingrese la Fecha de Préstamo (dd/MM/aaaa):");
					sFecha = entrada.next();
					LocalDate fechaLocalDate = LocalDate.parse(sFecha, formato);
					fecha = new Fecha(sFecha); // Asumiendo que tienes una clase Fecha que acepta un String
					fechaValida = true; // Si no hay excepción, la fecha es válida
				} catch (DateTimeParseException e) {
					System.out.println("Fecha inválida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.");
				}
					
			}
			      
			do {
				
				System.out.print("Ingresar Código de Estudiante: ");
				codigo = entrada.nextInt();
				System.out.println("Nombre Estudiante: "+univ.buscarNombreEstudiante(codigo));
				
				System.out.print("Ingresar Id de Recurso: ");
				id = entrada.nextInt();
				System.out.println("Descripción Recurso: "+univ.buscarNombreRecurso(id));
		
				
			} while ((univ.buscarEstudiante(codigo) == null || 
					univ.buscarRecurso(id)==null));
			
			if(univ.prestarRecursos(codigo, id,fecha))
				System.out.println("Recurso se ha prestado exitosamente");
			else
				System.out.println("No se ha podido prestar el recurso");
			

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
    public  void ConsultarRecursoPrestado() {
		
		
		
	}
    public  void consultarRecursosEstudiante() {
		
	
    }
    public  void consultarRecursosEstudianteMasDeTres() {
		
    }
	
}

	

	

