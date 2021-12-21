import java.util.Scanner;

public class cadenavocales {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce una cadena para decirte el número de vocales que tiene");
	String cad=sc.nextLine();
	int contador=0;
	String vocales="aeiou";
	for (int letra = 0; letra < cad.length(); letra++) {
		if (vocales.indexOf(cad.charAt(letra))>-1){
			contador++;
		}
	}
	System.out.println("La cadena tiene "+contador+" vocales");
}
}
