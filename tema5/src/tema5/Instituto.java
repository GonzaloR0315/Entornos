package tema5;

import java.util.Arrays;

public class Instituto {
private String nombre;
private String tipo;
private String[]ense;
private String direccion;
private int numalumnos;
public Instituto(String nombre, String tipo, String[] ense, String direccion,int numalumnos) {
	this.nombre = nombre;
	this.tipo = tipo;
	this.ense = ense;
	this.direccion = direccion;
	this.numalumnos = numalumnos;
}
public Instituto(String nombre, String tipo,  String direccion) {
	this.nombre = nombre;
	this.tipo = tipo;
	this.ense=new String [3];
	this.direccion = direccion;
	this.numalumnos =700;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String[] getEnse() {
	return ense;
}
public void setEnse(String[] ense) {
	this.ense = ense;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public int getNumalumnos() {
	return numalumnos;
}
public void setNumalumnos(int numalumnos) {
	this.numalumnos = numalumnos;
}
public String toString() {
	return "Instituto [nombre=" + nombre + ", tipo=" + tipo + ", ense="
			+ Arrays.toString(ense) + ", direccion=" + direccion
			+ ", numalumnos=" + numalumnos + "]";
}
}
