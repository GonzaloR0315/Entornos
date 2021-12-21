import java.util.Scanner;

public class char2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i;
	char letra;
	String nombre="Mikado";
	System.out.println(nombre.replace('f', 'a'));
	System.out.println("Para detener el programa pulsa S");
	for (i = 0;(letra=sc.next().charAt(0)) !='s';i++) {
		System.out.println("pass #"+i);
	}
	System.out.println("Fin de programa");
}
}
