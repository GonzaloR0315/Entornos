package Primera;

public class Suma extends Operacion{

	public Suma(double operando1, double operando2) {
		super(operando1, operando2);
		
	}

	@Override
	public double operar() {
		
		return super.getOperando1()+super.getOperando2();
	}

	@Override
	public String toString() {
		return  "La suma es " +getOperando1() +" más "+ getOperando2() ;
	}



}
