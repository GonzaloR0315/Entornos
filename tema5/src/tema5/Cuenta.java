package tema5;

public class Cuenta {
private String titular;
private double cantidad;//saldo
public Cuenta(String titular) {//el saldo es igual a 0
	this.titular=titular;
}
public Cuenta(String titular,double cantidad) {
	this.titular=titular;
	this.cantidad=cantidad;
}
public void setTitular(String titular) {
	this.titular=titular;
}
public void setCantidad(double cantidad) {
	this.cantidad=cantidad;
}
public String getTitular() {
	return titular;
}
public double getCantidad() {
	return cantidad;
}
public String ingresar(double dinero) {
	if(dinero>0) {
		cantidad+=dinero;
		return "Operación realizada correctamente, su saldo es = "+cantidad;
	}
	return "Operación fallida";
}
public String retirar(double dinero) {
	if (cantidad-dinero>=0) {
		cantidad-=dinero;
		return "Operación realizada correctamente, su saldo es = "+cantidad;
	}else {//no hay saldo suficiente para poder retirar esa cantidad
		System.out.println("Solo puedes retirar "+cantidad);
		cantidad=0;
		return "Su cuenta se ha quedado a 0";
	}
	
}
public String toString() {
	return "titular= "+titular+" saldo actual= "+cantidad;
}
}
