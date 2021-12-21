package tema5;

public class Curso {
private String nombre;
private int credito;
private boolean llave;
private Asignatura as;
public Curso() {}
public Curso(String nombre) {
	this.nombre=nombre;
}
public Curso(int credito) {
	this.credito=credito;
}
public Curso(boolean llave) {
	this.llave=llave;
}
public Curso(Asignatura as) {
	this.as=as;
}

public Curso(String nombre, int credito, boolean llave, Asignatura as) {
	this.nombre = nombre;
	this.credito = credito;
	this.llave = llave;
	this.as = as;
}
public String toString() {
	return "Curso [nombre=" + nombre + ", credito=" + credito + ", llave="+ llave + ", as=" + as + "]";
}
}
