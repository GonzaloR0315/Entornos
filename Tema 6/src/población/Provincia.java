package población;

public class Provincia {
private String nombre;
private String cc;
private int km2;
private int poblacion;
public Provincia(String nb,String cc,int p, int km) {
	nombre=nb;
	this.cc=cc;
	this.poblacion=p;
	km2=km;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCc() {
	return cc;
}
public void setCc(String cc) {
	this.cc = cc;
}
public int getKm2() {
	return km2;
}
public void setKm2(int km2) {
	this.km2 = km2;
}
public int getPoblacion() {
	return poblacion;
}
public void setPoblacion(int poblacion) {
	this.poblacion = poblacion;
}
public double densidad() {
	return (double)poblacion/km2;
}
public void muestra() {
	System.out.println("cc "+cc+" provincia "+nombre);
}
public String toString() {
	return "Provincia nombre=" + nombre + ", cc=" + cc + ", km2=" + km2
			+ ", poblacion=" + poblacion ;
}

}
