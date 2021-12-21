import java.util.Scanner;

public class actividadarrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int tam=3;
	int[]numeros=new int[tam];
	for (int i = 0; i < numeros.length; i++) {
	System.out.println("Introduce un número");
		numeros[i]=sc.nextInt();
	}
	for (int i =numeros.length-1;i>-1; i--) {
	System.out.println(numeros[i]);
		
	}
}
}
