import java.util.Scanner;

public class Consecutivoswhile {
public static void main(String[] args) {
	Scanner teclado=new Scanner (System.in);
	int num,nuevo=0,ante=0;
	System.out.println("Introduce el primero número");
	ante= teclado.nextInt();
	System.out.println("Introduce el segundo número");
	nuevo= teclado.nextInt();
	while(ante!=nuevo) {
		ante=nuevo;
		System.out.println("Introduce el nuevo número");
		System.out.println("El programa terminará cuando se escriban dos números iguales seguidos");
		nuevo=teclado.nextInt();
		
		
	}
	System.out.println("Los dos son iguales");
}
}
