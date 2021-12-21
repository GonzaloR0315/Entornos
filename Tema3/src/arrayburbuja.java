

public class arrayburbuja {

	public static void mostrar(int []miArray){
		for (int i = 0; i < miArray.length; i++) {
			System.out.print(miArray[i]+" ");
		}
	
	}
	public static void main(String[] args) {
	int tam=5,aux;
	int[] datos=new int[tam];
	for (int i = 0; i < tam; i++) {
		datos[i]=(int)(Math.random()*100);
		
	}
	System.out.println("Valores iniciales");
	mostrar(datos);
	//Metodo burbuja
	for (int i = 0; i<tam-1; i++) {
		for (int j=i+1; j < datos.length; j++) {
			
			if (datos[i]>datos[j]) {
				aux=datos[i];
				datos[i]=datos[j];
				datos[j]=aux;
			}
		}
	}System.out.println();
	System.out.println("Ahora los datos estan ordenados");
	mostrar(datos);
	System.out.println();
	System.out.println("Fin");

	
}
}
