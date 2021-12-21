
public class arraysnotas {
	public static void main(String[] args) {
		int tam =20;
		double acumulador=0;
		int contador=0;
		double[] notas=new double[tam];
		for (int i = 0; i < notas.length; i++) {
		
			notas[i]=(double)(Math.round(Math.random()*10));
			acumulador+=notas[i];
		}
		acumulador=acumulador/tam;
		System.out.println("La nota media es "+acumulador);
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]>=acumulador) {
				contador++;
			}
			System.out.println("Las notas positivas son "+contador);
		}
}
}
