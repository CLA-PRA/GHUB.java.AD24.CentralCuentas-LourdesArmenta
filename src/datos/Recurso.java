package datos;

public class Recurso {
	private int id ;
	private String nombre;
	private boolean disponible;
	public Recurso() {
		
	}
	public Recurso(int id, String nombre, boolean disponible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.disponible = disponible;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Recurso [id=" + id + ", nombre=" + nombre + ", disponible=" + disponible + "]";
	}
	
	
	

}
