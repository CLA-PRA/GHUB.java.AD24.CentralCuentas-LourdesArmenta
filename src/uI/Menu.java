package uI;
import java.util.Scanner;



public class Menu {
	static Scanner entrada = new  Scanner(System.in);
	
		static MenuOpciones  iOpc = new MenuOpciones();

		
		
		
		public void lectura() {
			
			imprimirMenu();	
				
		}
	private static void imprimirMenu() {
		while (true) {
			System.out.println("\t************ MENU PRINCIPAL *************");
			System.out.println("\t*  1. Agregar Recursos                  *");
			System.out.println("\t*  2. Eliminar Recursos                 *");
			System.out.println("\t*  3. Mostrar Recursos                  *");
			System.out.println("\t*  4. Agregar Estudiante                *");
			System.out.println("\t*  5. Eliminar Estudiante               *");
			System.out.println("\t*  6. Mostrar Estudiantes               *");
			System.out.println("\t*  7. Prestar un Recurso                *");
			System.out.println("\t*  8. Devolución de un Recurso          *");
			System.out.println("\t*  9. Consultar por recurso prestado    *");
			System.out.println("\t* 10. Consultar por estudiante prestado *");
			System.out.println("\t* 11. Consultar por estudiante con mas  *");
			System.out.println("\t*     de TRES recursos prestados        *");
			System.out.println("\t*                                       *");
			System.out.println("\t* 99. Salir                             *");
			System.out.println("\t*****************************************");
			System.out.print("Seleccione opción ->");
			int opcion = entrada.nextInt();
			switch  (opcion) {
			case 1:
				iOpc.agregarRecurso(); 
				break;
			case 2:
				iOpc.eliminarRecurso();
				break;
			case 3:
				iOpc.mostrarRecursos();
				break;
			case 4:
				iOpc.agregarEstudiante(); 
				break;
			case 5:
				iOpc.eliminarEstudiante(); 
				break;
			case 6:
				 iOpc.mostrarEstudiantes();
				break;
			case 7:
				iOpc.prestarRecurso(); 
				break;
			case 8:
				iOpc.devolverRecurso(); 
				break;
			case 9:
				iOpc.ConsultarRecursoPrestado();
				break;
			case 10:
				iOpc.consultarRecursosEstudiante();
				break;
			case 11:
				iOpc.consultarRecursosEstudianteMasDeTres();
				break;
			case 99:
				salir();
				break;
			default:
				System.out.println("Opcion inválida");
					
			}
	   }
	}
	private static void salir() {
		System.out.println("Sesion Finalizada");
		System.out.println("Adios!");
		System.exit(0);
	}

}
	

	

