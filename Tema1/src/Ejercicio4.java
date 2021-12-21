import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	Scanner velocidad=new Scanner (System.in);
	System.out.println("Introduce la velocidad a la que vas");
	int num =velocidad.nextInt();
	if (num<30) {
		System.out.println("Vamos muy lentos");
		System.out.println("Acelera");
	}else if (num<100) {
		System.out.println("Llegaremos a tiempo");
	}else {
		System.out.println("Vas muy rapido");
		System.out.println("Frena");
	}
}
}
