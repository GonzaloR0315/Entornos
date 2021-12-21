package tema5;

public class Asignatura {
private String nombre;
private String Especialidad;
int hora;
public Asignatura(String nombre, String especialidad, int hora) {
	super();
	this.nombre = nombre;
	Especialidad = especialidad;
	this.hora = hora;
}
public String toString() {
	return "Asignatura [nombre=" + nombre + ", Especialidad=" + Especialidad
			+ ", hora=" + hora + "]";
}
}
