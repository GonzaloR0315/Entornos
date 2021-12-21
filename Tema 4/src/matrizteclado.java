import java.util.Scanner;

public class matrizteclado {
	private static void verMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int filas=3,columnas=4,contador=1;
		int [][]tabla=new int [filas][columnas];
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.println("Mete un valor hasta llegar a 12");
				System.out.println("Vas por el "+contador);
				tabla[i][j]=sc.nextInt();
				contador++;
			}
		}verMatriz(tabla);
	}
}
