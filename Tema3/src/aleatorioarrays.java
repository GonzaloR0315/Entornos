
public class aleatorioarrays {
public static void main(String[] args) {
	int tam =100;
	int[] numeros=new int[tam];
	for (int i = 0; i < numeros.length; i++) {
	
		numeros[i]=(int)((Math.random()*100)+1);
	}
	for (int i = 1; i < numeros.length; i=i+2) {
		System.out.println("El valor de la posición "+i+" es "+numeros[i]);
	}
}
}
