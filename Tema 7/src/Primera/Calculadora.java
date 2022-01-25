package Primera;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);
	System.out.println("Calculadora universal");
	int op=0;
	double valor1,valor2;
	do {
		System.out.println("Dime valor1");
		valor1=sc.nextDouble();
		System.out.println("Dime valor2");
		valor2=sc.nextDouble();
		System.out.println("Que quieres hace 1Sumar 2Restar 3Multiplicar 4Dividir");
		op=sc.nextInt();
		switch (op) {
			case 1:
				Suma s1=new Suma(valor1,valor2);
				System.out.println(s1);
				System.out.println("La suma vale "+s1.operar());
				break;
			case 2:
				Resta r1=new Resta(valor1,valor2);
				System.out.println(r1);
				System.out.println("La resta vale "+r1.operar());
				break;
			case 3:
				Multiplica m1=new Multiplica(valor1,valor2);
				System.out.println(m1);
				System.out.println("La multiplicación vale "+m1.operar());
				break;
			case 4:
				Divide d1=new Divide(valor1,valor2);
				System.out.println(d1);
				System.out.println("La multiplicación vale "+d1.operar());
				break;
		}
	}while(op>=0 &&op<5);
	System.out.println("Fin");
}
}
