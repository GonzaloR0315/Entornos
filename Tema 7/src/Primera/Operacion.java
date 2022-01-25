package Primera;

public abstract class Operacion {
private double operando1;
private double operando2;
private double resultado;
//puede tener metodos completos y abstractos
public Operacion(double operando1, double operando2) {
	
	this.operando1 = operando1;
	this.operando2 = operando2;
}
public double getOperando1() {
	return operando1;
}
public void setOperando1(double operando1) {
	this.operando1 = operando1;
}
public double getOperando2() {
	return operando2;
}
public void setOperando2(double operando2) {
	this.operando2 = operando2;
}
public abstract double operar() ;
public double getResultado() {
	return resultado;
}

}
