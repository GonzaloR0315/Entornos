import java.util.Scanner;

public class Intentosdowhile {
public static void main(String[] args) {
	int intentos=10,numuser,nummachine;
	nummachine=(int)(Math.random()*100+1);	
	Scanner sc=new Scanner(System.in);
	do{
		System.out.println("Acierta un número entre 1 y 100");
		numuser=sc.nextInt();

			intentos--;
		
		if (nummachine==numuser) {
			System.out.println("Has acertado con "+(10-intentos)+" intentos");
		}else if (nummachine>numuser) {
			System.out.println("El número de la máquina es mayor");
		}else {
			System.out.println("El número de la máquina es menor");
		}
	}while(nummachine!=numuser && intentos>0);{
		if (nummachine!=numuser) {
		System.out.println("Te has quedado sin intentos");
	}
	}
		System.out.println("Fin del juego");
		System.out.println("¿Quieres volver a jugar");
	
}
}
