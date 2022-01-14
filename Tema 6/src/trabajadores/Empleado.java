package trabajadores;

public class Empleado {
	private String nombre;
	private int tf;
	public Empleado(String nombre,int tf) {
		this.nombre=nombre;
		this.tf=tf;
	}
	public Empleado(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public int getTf() {
		return tf;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setTf(int tf) {
		this.tf=tf;
	}
	public String toString() {
		return " Nombre " + nombre + ", tf " + tf ;
	}
}
