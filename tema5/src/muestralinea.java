

import java.util.Scanner;

public class muestralinea {
public static void main(String[] args) {
	//String cad="Estamos en la clase de programación";
	String cad;
	Scanner sc=new Scanner(System.in);
	int posicion;
	System.out.println("Introduce una cadena");
	cad=sc.nextLine();
	do {
	 posicion=cad.indexOf(" ");
	//System.out.println(posicion);
	if (posicion>-1) {
		System.out.println(cad.substring(0,posicion));
		cad=cad.substring(posicion+1);
		
	}
	}while(posicion!=-1);
	System.out.println(cad);
}
}