import java.util.Scanner;

public class Consecutivoswhile {
public static void main(String[] args) {
	Scanner teclado=new Scanner (System.in);
	int num,nuevo=0,ante=0;
	System.out.println("Introduce el primero n�mero");
	ante= teclado.nextInt();
	System.out.println("Introduce el segundo n�mero");
	nuevo= teclado.nextInt();
	while(ante!=nuevo) {
		ante=nuevo;
		System.out.println("Introduce el nuevo n�mero");
		System.out.println("El programa terminar� cuando se escriban dos n�meros iguales seguidos");
		nuevo=teclado.nextInt();
		
		
	}
	System.out.println("Los dos son iguales");
}
}
