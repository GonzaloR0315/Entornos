import java.util.Scanner;

public class Arrays2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("�Cu�ntos elementos quieres?");
	int size;
	size=Math.abs(sc.nextInt());
	int[] numeros=new int[size];
	for (int i = 0; i < numeros.length; i++) {
		numeros [i]=i*i;
		System.out.print(numeros[i]+"\t");
	}
	System.out.println();
}
}
