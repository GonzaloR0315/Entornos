import java.util.Scanner;

public class entre1y100arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = 100, contador = 0;
		int num;
		boolean esta = false;
		String mensaje = "";
		int[] datos = new int[tam];
		for (int i = 0; i < datos.length; i++) {
			datos[i] = (int) ((Math.random() * 100) + 1);

		}
		do {
			System.out.println("Introducede un número a buscar entre 1 y 100");
			num = sc.nextInt();
		} while (num < 1 || num > 100);
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] == num) {
				esta = true;
				mensaje = "Está en la posición " + i;

			}
		}
		if (esta) {
			System.out.println(mensaje);
		} else {
			System.out.println(num + " no estaba");
		}

	}
}