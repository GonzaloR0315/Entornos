import java.util.Scanner;

public class random {
public static void main(String[] args) {
	int saldo=(int)(Math.random()*(10000-100+1)+100);
	Scanner teclado=new Scanner (System.in);
	System.out.println("Su saldo es de "+saldo);
	int op ;
	System.out.println("�Qu� operaci�n quiere realizar?");
	System.out.println("1� Sacar dinero");
	System.out.println("2� Consulta");
	System.out.println("3� Meter dinero");
	op=teclado.nextInt();
	switch (op) {
	case 1:
		System.out.println("�Cu�nto quieres sacar?");
		int cuanto=teclado.nextInt();
		if (cuanto>0 && saldo>=cuanto) {
			saldo-=cuanto;
			System.out.println("�xito");
		}else {
			System.out.println("No dispones de "+cuanto+" �");
			System.out.println("Error");
		}
		break;
		
	case 2:
		System.out.println("Su saldo es de "+saldo);
		break;
	case 3:
		System.out.println("�Cu�nto quieres meter?");
		int meter=teclado.nextInt();
		System.out.println("Su saldo actual es de "+(meter+=saldo)+" �");
		break;
	default:
	}
}

}
