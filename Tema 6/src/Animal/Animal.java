package Animal;

public class Animal {
private String categoria;
private int patas;
public Animal(String categoria,int patas) {
	this.categoria=categoria;
	this.patas=patas;
}
public Animal(String categoria) {
	this.categoria=categoria;
	this.patas=0;
}
public String getCategoria() {
	return categoria;
}
public int getPatas() {
	return patas;
}
public void setCategoria(String categoria) {
	this.categoria=categoria;
}
public void setPatas(int patas) {
	this.patas=patas;
}
public void comoSueno() {
	System.out.println("No lo se de momento");
}
@Override
public String toString() {
	return " categoria=" + categoria + ", patas=" + patas ;
}
}
