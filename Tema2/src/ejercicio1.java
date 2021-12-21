import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		int primero = (int) (Math.random() * 10 + 1);
		System.out.println(primero);
		int num;
		boolean si = true;
		for (int i = 1; i < 10; i++) {
			num = (int) (Math.random() * 10);
			System.out.println(num);
			if (primero != num) {
				si = false;
			}
			if (si == true) {
				System.out.println("Todos son iguales");
			} else {
				System.out.println("No todos son iguales");
				break;
			}

		}

	}
}
