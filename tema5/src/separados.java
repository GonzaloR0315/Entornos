import java.util.Scanner;

public class separados {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int posicion;
	String cad;
	System.out.println("Introduce una cadena de caracteres");
	cad=sc.nextLine();
	String[]trozos=cad.split("z");
	System.out.println("El número de elementos que tiene trozos es "+trozos.length);
	for(String subcadena:trozos) {
		System.out.println(subcadena);
	}
	System.out.println(cad);
}
}
