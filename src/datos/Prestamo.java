package datos;



public class Prestamo {
	private Recurso recurso;
	private Estudiante estudiante;
	private Fecha fechaPrestamo;
	private Fecha fechaDevolucion;
	public Prestamo() {
		
		
	}
	public Prestamo(Recurso recurso, Estudiante estudiante) {
		
		this.recurso = recurso;
		this.estudiante = estudiante;
		this.fechaPrestamo = null;
		this.fechaDevolucion = null;
	}

	public Prestamo(Recurso recurso, Estudiante estudiante, Fecha fechaPres){
		this.recurso = recurso;
		this.estudiante = estudiante;
		this.fechaPrestamo = fechaPres;
		this.fechaDevolucion = null;
	}
	public Prestamo(Recurso recurso, Estudiante estudiante, Fecha fechaPres, Fecha fechaDev){
		this.recurso = recurso;
		this.estudiante = estudiante;
		this.fechaPrestamo = fechaPres;
		this.fechaDevolucion = fechaDev;
	}


	public Recurso getRecurso() {
		return recurso;
	}
	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Fecha getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Fecha fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Fecha getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Fecha fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	@Override
	public String toString() {
		return "Prestamo [recurso=" + recurso + ", estudiante=" + estudiante + 
					", fechaPrestamo=" + fechaPrestamo
					+ ", fechaDevolucion=" + fechaDevolucion + "]";
	}
	
	
	
	

}
