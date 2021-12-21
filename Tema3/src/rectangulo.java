import java.util.Scanner;

public class rectangulo {
	public static void dibujaRectangulo(int filas,int columnas){
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Introduce la altura del rectangulo");
		int alto = sc.nextInt();
		System.out.println("Introduce la anchura del rectangulo");
		int ancho = sc.nextInt();
		dibujaRectangulo(alto,ancho);
	}
}
}
