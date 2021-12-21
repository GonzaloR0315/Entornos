import java.util.Scanner;

public class Sumawhile {
public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	int num,contador=0,suma=0;
	while (suma<100) {
		System.out.println("Introduce un número");
		num = teclado.nextInt();
		contador++;
		suma+=num;
		System.out.println(num);
		
	}
System.out.println("La suma acumulada es "+suma);
System.out.println("Esta se ha conseguido con "+contador+" números");
}
}
