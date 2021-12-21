/**
 * 
 * @author Gonzalo
 * @version 15.6.4
 * @param
 *
 */

public class test {
	/**
	 * Determinamos la clase text
	 */
	public static void main(String[] args) {
		circulo c1 = new circulo(5.5);
		circulo c2 = new circulo(10.1);
		circulo c3 = new circulo(10.9);
		

		if (c2.esIgual(c3, false)) {
			System.out.println("c2 y c3: iguales sin considerar decimales");
			
		} else {
			System.out.println("c2 y c3: distintos sin considerar decimales");
			
		}
		if (c2.esIgual(c3, true)) {
			System.out.println("c2 y c3: iguales considerando decimales");
			
		} else {
			System.out.println("c2 y c3: distintos considerando decimales");
			
		}
		if (c1.esIgual(c3, false)) {
			System.out.println("c1 y c3: iguales sin considerar decimales");
			
		} else {
			System.out.println("c1 y c3: distintos sin considerar decimales");
		}
	}
}

