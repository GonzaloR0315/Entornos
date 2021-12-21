
public class tablareves {

	private static void verArraybidim(int[][] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				System.out.print(vector[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
			
public static void main(String[] args) {
	int filas=5,columnas=7,num=1;
	int [][]array1=new int [5][7];
	for (int columna = 0; columna < columnas; columna++) {
		for (int fila = 0; fila < filas; fila++) {
			
		
			array1[fila][columna]=num;
			num++;
	}}
	verArraybidim(array1);
}	
}
