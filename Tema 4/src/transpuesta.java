
public class transpuesta {
	private static void verMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
public static void main(String[] args) {
	int filas=5,columnas=5,num=1;
	int [][] tabla= new int [filas][columnas];
	int [][] tabla1= new int [filas][columnas];
	for (int i = 0; i < tabla.length; i++) {
		for (int j = 0; j < tabla.length; j++) {
			tabla[i][j]=num;
			num++;
		}
	}
	verMatriz(tabla);
	System.out.println("");
	//transponer
	int aux=0;
	for (int i = 0; i < tabla1.length; i++) {
		for (int j = 0; j < tabla1.length; j++) {
		
			tabla1[i][j]=tabla[j][i];
		}
	}
	verMatriz(tabla1);
}
}
