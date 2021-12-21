import java.util.Scanner;

public class palindromo {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	boolean control=true;
	System.out.println("Introduce un número");
	int num=sc.nextInt();
	String cad=String.valueOf(num);
	for (int i = 0, j=cad.length()-1;i<j; i++,j--) {
		if (cad.charAt(i)!=cad.charAt(j)) {
			control=false;
			break;
		}
		if (control=true) {
			System.out.println("Es capicua el "+num);
		}else if (control=false) {
			System.out.println("No es capicua el "+num);
		}
	}
	
}
}
