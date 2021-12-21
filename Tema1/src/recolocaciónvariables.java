import java.util.Scanner;

public class recolocaciónvariables {
public static void main(String[] args) {
	Scanner teclado=new Scanner (System.in);
	System.out.println("Introduce tres valores ");
	int menor,intermedio,mayor;
	int n1=teclado.nextInt();
	menor=n1;
	int n2=teclado.nextInt();
	if (n2>menor) {
		intermedio=n2;
	}else {
		menor=n2;
		intermedio=n1;
	}
	int n3=teclado.nextInt();
	if (n3>intermedio){
		mayor=n3;
	}else if (n3>menor) {
		mayor=intermedio;
		intermedio=n3;
	}else {
		mayor=intermedio;
		intermedio=menor;
		menor=n3;
	}
	System.out.println(mayor+" "+intermedio+" "+menor);
}
}
