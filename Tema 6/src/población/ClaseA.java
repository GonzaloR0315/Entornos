package población;

public class ClaseA {
	private String nombre;
	private int dato;
	
	public ClaseA() {
	}
	public ClaseA(String nombre,int dato) {
		this.nombre=nombre;
		this.dato=dato;
	}
	public ClaseA(String nombre) {
		this.nombre=nombre;
		dato=10;
	}
	@Override
	public String toString() {
		return "ClaseA [nombre=" + nombre + ", dato=" + dato + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}

}
