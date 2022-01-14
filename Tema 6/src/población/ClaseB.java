package población;

public class ClaseB extends ClaseA {
	private double valor;
	public ClaseB (String nombre,int dato,double valor) {
		super(nombre,dato);
		this.valor=valor;
	}
	public ClaseB(double valor) {
		super();
		this.valor=valor;
	}
	public ClaseB() {
		super();
		this.valor=10.254;
	}
}
