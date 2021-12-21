package cambiopaquete;

/**
 * Crearemos una clase para poser acceder a nuestra cuenta y realizar distintas operaciones
 * @author Gonzalo
 *
 */
public class CuentaCorriente {
private static final int Zero = 0;
/**
 * definimos el nombre de la cuenta
 */
	protected String nombre;
	/**
	 * definimos la cuenta
	 */
	private String cuenta;
	/**
	 * definimos el saldo de la cuenta
	 */
	private double saldo;
	/**
	 * definimos el tipo de interes de la cuenta
	 */
	private double tipoInteres;
/**
 * Crea la clase cuenta
 * @class 
 */
	public CuentaCorriente() {
	}
/**
 * Crea una cuenta defiendo los parametros que apareceran en ella
 * @param nom define el nombre
 * @param cue define la cuenta
 * @param sal define el saldo
 * @param tipo define el tipo de interes
 */
	public CuentaCorriente(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}
/**
 * Asigna el nombre de la cuenta
 * @param nom asigna el contenido de nom al nombre de la cuenta
 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}
/**
 * Obtiene el nombre de la cuenta
 * @return devuelve el nombre
 */
	public String getNombre() {
		return nombre;
	}
/**
 * Obtiene el saldo que tenemos
 * @return devuelve el saldo
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * ingresa el dinero en la cuenta
 * @param cantidad
 * @throws Exception
 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < Zero) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}
/**
 * retira el dinero de la cuenta
 * @param cantidad
 * @throws Exception
 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < Zero) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (getSaldo() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}
/**
 * devuelve el dinero de nuestra cuenta
 * @return devuelve el dinero que hay en nuestra cuenta
 */
	public String getCuenta() {
		return cuenta;
	}
/**
 * establece cual es nuestra cuenta
 * @param cuenta define nuestra cuenta en esta propiedad
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * establece cual es el saldo de nuestra cuenta
 * @param saldo define el saldo de la cuenta en esta propiedad
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Nos devuelve el tipo de interes de nuestra cuenta
 * @return devuelve el tipo de interes de la cuenta
 */
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * establece el tipo de interes de nuestra cuenta
 * @param tipoInteres  define el tipo de interes en esta propiedad
 */
	public void setTipoInteres(double tipoInterés) {
		this.tipoInteres = tipoInterés;
	}
	
public String toString() {
	return "CuentaCorriente [nombre=" + nombre + ", cuenta=" + cuenta
			+ ", saldo=" + saldo + ", tipoInteres=" + tipoInteres + "]";
}
}
