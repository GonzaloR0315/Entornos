package tema5;

public class Profesor {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean especialista;
public Profesor(String nombre,String apellido,int edad,boolean especialista) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.edad=edad;
	this.especialista=especialista;
}
public Profesor() {
	nombre="Gonzalo";
	apellido="Rubio";
	edad=30;
	especialista=false;
}
public Profesor(String nombre,String apellido,int edad) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.edad=edad;
	especialista=false;
}
public Profesor(String nombre,int edad) {
	this.nombre=nombre;
	apellido="Rubio";
	this.edad=edad;
	especialista=true;
}
public void setEspecialista(boolean especialista) {
	this.especialista=especialista;
}
public String informa() {
	String aux="No";
	if (especialista) {
		aux="Si";
	}
	return "nombre del profesor "+nombre+" apellido "+apellido+" edad "+edad+" especialista "+aux;
}
	

}
