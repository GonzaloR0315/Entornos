import java.util.Scanner;

public class Entre20Y40 {
public static void main(String[] args) {
	Scanner teclado=new Scanner (System.in);
	int contador=0,contfallo=0,max=20,num;
	while (contador<4) {
		System.out.println("Introduce n�meros");
		num=teclado.nextInt();
		if (num>19 && num<41) {
			contador++;
			if (num>max) {
				max=num;
		}
			
		}else {
			contfallo++;
		
		}
}
	System.out.println("El n�mero m�ximo ha sido "+max);
	System.out.println("El n�mero de n�meros invalidos ha sido "+contfallo);
}
}
