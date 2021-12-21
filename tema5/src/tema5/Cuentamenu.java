package tema5;

import java.util.Scanner;

public class Cuentamenu {
public static void main(String[] args) {
	Cuenta l1 = new Cuenta("Lisa");
	int op=-1;
	Scanner sc=new Scanner (System.in);
	while(op!=4) {
		System.out.println("1.Saldo 2.Ingresar 3.Retirar 4.Salir");
		op=sc.nextInt();
		switch(op) {
			case 1:
				System.out.println("Saldo actual= "+l1.getCantidad());
				break;
			case 2:
				System.out.println("Dime la cantidad a ingresar");
				double ingre=sc.nextDouble();
				System.out.println(l1.ingresar(ingre));
				break;
			case 3:
				System.out.println("Dime la cantidad a retirar");
				double ret=sc.nextDouble();
				System.out.println(l1.retirar(ret));
				break;
			default:
				op=4;
		}
	}
	System.out.println(l1);
	System.out.println("Fin de programa");
}
}
