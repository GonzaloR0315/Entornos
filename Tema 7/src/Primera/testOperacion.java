package Primera;

public class testOperacion {
public static void main(String[] args) {
	//Operacion op1=new Operacion (3,4); no se puede hacer porque la clase es abstracta
	Suma s1=new Suma(3,4);
	System.out.println(s1);
	System.out.println("La suma vale "+s1.operar());
	Resta r1=new Resta(33,29);
	System.out.println(r1);
	System.out.println("La resta vale "+r1.operar());
	Multiplica m1=new Multiplica(3,29);
	System.out.println(m1);
	System.out.println("La multiplicación vale "+m1.operar());
	Divide d1=new Divide(843,0);
	System.out.println(d1);
	System.out.println("La multiplicación vale "+d1.operar());
	}
}
