import java.util.Scanner;

public class Consecutivoswhile2 {
public static void main(String[] args) {
	Scanner teclado=new Scanner (System.in);
	int num,nuevo=0,ante=-14577,Contador=0;
	while(ante!=nuevo || Contador<2) {
		System.out.println("Introduce el nuevo número");
		System.out.println("El programa terminará cuando se escriban dos números iguales seguidos");
		ante=nuevo;
		nuevo=teclado.nextInt();
		Contador++;
	}
	System.out.println("Los dos son iguales");
	System.out.println("Se han necesitado "+Contador+" números para que sean iguales");
}
}
