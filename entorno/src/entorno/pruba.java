package entorno;

import java.util.Scanner;

public class pruba
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	/*Ahora tendremos que dar un valor a 
	*hermano introduciendo por teclado el 
	*propio valor y comprobaremos si es mayor
	*o menor que subrayador
	*/
	/**
	 * Gestiona un circulo muestra sus cvalores lo compara con otro;
	 * 
	 */
	int 	i 		= 	5;
	int 	subrayador 	= 	85;
	int	hermano	=	sc.nextInt();
	/**
	 * damos valores de enteros a nuestras variables
	 */
	
	if (subrayador<hermano-i) {
		System.out.println("Muy bien");}
	else if (subrayador>hermano-i) {
		System.out.println("Un poco feo");
	}else {
		System.out.println("Tienen el mismo valor");
		/**
		 * imprimimos el resultado de las variables
		 */
	}
	
}
}
