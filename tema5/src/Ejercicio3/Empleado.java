package Ejercicio3;

public class Empleado {
private String nombre;
private String telefono;
static private int numempleados;
public Empleado(String nombre,String telefono) {
	this.nombre=nombre;
	this.telefono=telefono;
	numempleados++;
}
public Empleado(String telefono) {
	nombre="Pepe";
	this.telefono=telefono;
	numempleados++;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public static void setNumempleados(int numempleados) {
	Empleado.numempleados = numempleados;
}
public static int getNumempleados() {
	return numempleados;
}
public boolean sonIguales(Empleado Otro) {//mismo nombre y telefono
	if(this.nombre.equals(Otro.getNombre())&&this.telefono.equals(Otro.getTelefono())) {
		return true;
	}
	return false;
}
public String toString() {
	return nombre+" "+telefono;
}

}
