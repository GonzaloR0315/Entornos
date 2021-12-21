
public class arraysdosdimesiones {
private static int[][]crearArraybidim(int filas,int columnas,int minimo,int maximo){
	int [][] miArray=new int [filas][columnas];
	for (int i = 0; i < miArray.length; i++) {
		for (int j = 0; j < miArray[i].length; j++) {
			miArray[i][j]=(int)(Math.random()*(maximo-minimo+1)+minimo);
		}
	}
	return miArray;
}
private static void verArraybidim(int[][] vector) {
	for (int i = 0; i < vector.length; i++) {
		for (int j = 0; j < vector[i].length; j++) {
			System.out.print(vector[i][j]+"\t");
		}
		System.out.println(" ");
	}
System.out.println();
}
	public static void main(String[] args) {
	int [][]array1=crearArraybidim(13,5,0,100);
	verArraybidim(array1);
	
}
}
