import java.util.Scanner;

public class divisiones {
public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	System.out.println("Introduce dos valores ");
	int n1=teclado.nextInt();
	int n2=teclado.nextInt();
	if ((n1%2==0)&&(n2%2==0)){
	System.out.println("los dos son pares");}
	else if ((n1%2==1)&&(n2%2==1)){
	System.out.println("Los dos son impares");}
	else if ((n1%2==1)&&(n2%2==0)){
	System.out.println(n1+" Es impar y "+n2+" Es par");}
	else if ((n1%2==0)&&(n2%2==1)){
	System.out.println(n1+" Es par y "+n2+" Es impar");}
	System.out.println("Fin del programa");


}
}
