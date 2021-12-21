/**
 * Define los metodos de un circulo
 * @author Gonzalo Rubio
 * @version 15.6.4
 * @since 26/11/2021
 * 
 */

public class circulo {
	private double rad;
	
	/**
	 * @param radio
	 * muestra el  radio del circulo
	 */
	public circulo(double radio) {
		this.rad = radio;
	}

	/**
	 * @param radio
	 * Establecemos el metodo para saber el radio del circulo como double
	 */
	public double getRad() {
		return rad;
		
	}
	/**
	 * @param radio
	 * La verdad no se que hace
	 */
	public void setRad(double rad) {
		this.rad = rad;
		
	}
	/**
	 *@class imprimir
	 * Veremos cual es el diametro el area y el color de 
	 * el primer circulo para luego poder compararlo.
	 */
	public void imprimir() {
		String color = "rojo";
		System.out.println("Diámetro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
		
	}

	public boolean esIgual(circulo otro, boolean conDecimales) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				
				return true;
			else
				return false;
		} else {
		
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
