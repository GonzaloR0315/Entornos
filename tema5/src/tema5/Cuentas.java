package tema5;

public class Cuentas {
public static void main(String[] args) {
	Cuenta c1=new Cuenta("Fernando");
	System.out.println(c1);
	c1.setCantidad(100);
	System.out.println(c1.ingresar(854.32));
	System.out.println(c1.retirar(548.47));
	System.out.println(c1);
}
}
