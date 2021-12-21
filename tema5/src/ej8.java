import java.util.Scanner;

public class ej8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce una cadena de datos");
	String cad=sc.nextLine();
	String aux=new String (cad.toUpperCase());
	String[]trozos=aux.split(" ");
	String salida="";
	for (String recorre:trozos) {
		salida+= recorre;
		
	}System.out.println(cad.toLowerCase()+"\n"+salida);
}
}
