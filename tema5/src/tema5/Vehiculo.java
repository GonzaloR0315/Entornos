package tema5;
/**
 * Definimos las propiedades de vehiculo
 * 
 * @author Gonzalo
 *
 */
 class Vehiculo {
	/**
	 * definimos el número de las ruedas
	 */
	private int numruedas;
	/**
	 * definimos la velocidad máxima
	 */
	private int velocidadmax;
	/**
	 * definimos el peso
	 */
	private int peso;
	/**
	 * crea el vehiculo
	 * 
	 * @param num
	 *            número de ruedas del vehiculo
	 * @param max
	 *            velocidad máxima del vehiculo
	 * @param ps
	 *            peso del vehiculo
	 */
	public Vehiculo(int num, int max, int ps) {
		numruedas = num;
		velocidadmax = max;
		peso = ps;
	}
	/**
	 * asigna el valor a ruedas
	 * 
	 * @param num
	 *            número de ruedas
	 */
	public void setNumruedas(int num) {
		numruedas = num;
	}
	/**
	 * asigna el valor a la velocidad máxima
	 * 
	 * @param max
	 *            velocidad máxima
	 */
	public void setVelmax(int max) {
		velocidadmax = max;
	}
	/**
	 * asigna el valor al peso
	 * 
	 * @param ps
	 *            peso del vehiculo
	 */
	public void setPeso(int ps) {
		peso = ps;
	}
	/**
	 * obtiene el valor de ruedas
	 * 
	 * @return retorna las ruedas
	 */
	public int getNumruedas() {
		return numruedas;
	}
	/**
	 * obtiene el valor de la velocida
	 * 
	 * @return retorna las velocidad
	 */
	public int getVelmax() {
		return velocidadmax;
	}
	/**
	 * obtiene el peso
	 * 
	 * @return retorna el peso del vehiculo
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * Compara si un vehiculo es igual a otro
	 * 
	 * @param otro
	 *            crea otro vehiculo
	 * @return retorna si los vehiculos son iguales o no
	 */
	public boolean esigual(Vehiculo otro) {
		if (numruedas == otro.numruedas && velocidadmax == otro.velocidadmax
				&& peso == otro.peso) {
			return true;
		}
		return false;
	}
	/**
	 * Copia los valores de un vehiculo en otro
	 * @param otro es en vehiculo en el que se van a copiar los valores
	 */
	public void copia1(Vehiculo otro) {
		otro.numruedas = numruedas;
		otro.velocidadmax = velocidadmax;
		otro.peso = peso;
	}
	/**
	 * Copia los valores de otro en un vehiculo
	 * @param otro es el vehiculo del que se copian las propiedades
	 */
	public void copia2(Vehiculo otro) {
		numruedas=otro.numruedas ;
		velocidadmax=otro.velocidadmax = velocidadmax;
		peso=otro.peso ;
	}
	/**
	 *  gestiona la información del vehiculo
	 * @return retorna la información del vehiculo
	 */
	public String informacion() {
		return "veiculo:" + " " + numruedas + " " + velocidadmax + " " + peso;
	}
	/**
	 * copia las propiedades del vehiculo
	 * @return retorna las propiedades del vehiculo
	 */
	public Vehiculo copia3() {
		// veiculo avion =new veiculo(0,0,0);
		return new Vehiculo(numruedas, velocidadmax, peso);
	}
}
