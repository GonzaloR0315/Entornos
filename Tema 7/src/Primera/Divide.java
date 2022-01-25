package Primera;

public class Divide extends Operacion {
	public Divide(double operando1, double operando2) {
		super(operando1, operando2);
		
	}

	@Override
	public double operar() {
		
		return super.getOperando1()/super.getOperando2();
	}

	@Override
	public String toString() {
		return  "La divisi�n es " +getOperando1() +" m�s "+ getOperando2() ;
	}


}
