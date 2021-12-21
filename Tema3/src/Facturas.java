import java.util.Scanner;

public class Facturas {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int unidad;
	double precio=0,acumulador=0,descuento;
	do {
		System.out.println("Introduce las unidades de tu producto, para acabar con 0");
		unidad = sc.nextInt();
		/* if (unidad==0) {
			break;
		}*/
		System.out.println("Introduce el precio de esas unidades");
		precio = sc.nextDouble();
		acumulador+=precio*unidad;
	}while(unidad!=0);
	System.out.println("El valor de tu factura es "+acumulador);
		if(acumulador>=1000) {
		descuento=acumulador*5/100;
		System.out.println("Tienes derecho a un descuento de "+descuento);
		System.out.println("El precio es "+ (acumulador-descuento));
		}else {
			System.out.println("El precio es "+ acumulador);
		}
	System.out.println("Fin del calculo");
	
}
}
