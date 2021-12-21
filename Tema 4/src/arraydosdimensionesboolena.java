import java.util.Scanner;

public class arraydosdimensionesboolena {
	
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
				Scanner sc=new Scanner(System.in);
			int [][]array1=crearArraybidim(2,3,0,100);
			verArraybidim(array1);
			boolean encontrado,seguir=true;
			int buscar,fila,columna;
			do {
			System.out.println("Dime que valor busco");
			buscar=sc.nextInt();
			fila=-1;
			columna=-1;
			encontrado=false;
			//Ahora este programa realizara la busqueda
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1[i].length; j++) {
					if (array1[i][j]==buscar) {
						encontrado=true;
						fila=i;
						columna=j;
						break;
					}
				}//for interno
				if (encontrado) {
					break;
				}}//aqui es donde la busqueda termina
				if (encontrado) {
					System.out.println("Elvalor "+buscar+" estaba en la fila "+fila+"y en la columna "+columna);
				}else {
					System.out.println("El valor "+buscar+" no estaba");
				}
				
		
			System.out.println("Seguir buscando valores");
			seguir=sc.nextBoolean();
		}while(seguir);
}
}

