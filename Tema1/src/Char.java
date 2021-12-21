import java.util.Scanner;

public class Char {
public static void main(String[] args) {
	
	Scanner telefono=new Scanner(System.in);
	System.out.println("Introduce un nombre");
	String nombre=telefono.next();//A los string se les aplican funciones como chatAt o length
	int numero=6;
	System.out.println(nombre.charAt(2));//Se empieza a contar desde el 0 por lo que el 2 realmente es el 3
	for(int i=0;i<nombre.length();i++) {
		System.out.println(nombre.charAt(i));
	}
}
}
