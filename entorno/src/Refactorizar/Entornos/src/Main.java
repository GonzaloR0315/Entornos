package Refactorizar.Entornos.src;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cambiopaquete.CuentaCorriente;
/**
 * Declaracion de la clase Main
 * @author Gonzalo Rubio
 *@version 1.0.1
 */
public class Main {
	static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		CuentaCorriente cuenta1,cuenta2;
		
		double saldoActual;
		int opcion = 0;
		cuenta1 = new CuentaCorriente("Juan López", "1000-2365-85-123456789", 2500, 0);
		cuenta2 = new CuentaCorriente("Maria García", "2548-25-8745-123456789", 8545200, 240);
		do {
			try {
				System.out.println("MENÚ DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Finalizar");
				opcion = Integer.parseInt(dato.readLine());
				if (opcion == 1) {
					System.out.println("¿Cuánto desea ingresar?: ");
					float ingresar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, ingresar, opcion);
				} else if (opcion == 2) {
					System.out.println("¿Cuátno desea retirar?: ");
					float retirar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, retirar, opcion);
				} else if (opcion == 3) {
					System.out.println("Finalizamos la ejecución");
				} else {
					System.err.println("Opción errónea");
				}
/*               switch(opcion){
                case 1:
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,ingresar,opcion);
                    break;
                case 2:
                    System.out.println("¿Cuátno desea retirar?: ");
                    float retirar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,retirar,opcion);
                    break;
                case 3:
                    System.out.println("Finalizamos la ejecución");
            }
*/
			} catch (IOException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		} while (opcion != 3);
		saldoActual = cuenta1.getSaldo();
		System.out.println("El saldo actual es: " + saldoActual);
		VisualizarDatosCuenta(new VisualizarDatosCuenta(cuenta1, cuenta2));
	}
	/**
	 * Buenos días
	 * @param BuenosDias TODO
	 */
	private static void VisualizarDatosCuenta(VisualizarDatosCuenta BuenosDias) {
		System.out.println("Datos clientes");
		 System.out.println(BuenosDias.cuenta1.toString());
		 System.out.println(BuenosDias.cuenta2.toString());
	}

	public static void operativa_cuenta(CuentaCorriente cuenta1, float cantidad, int opcion) {
		if (opcion == 2) {
			try {
				cuenta1.retirar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al retirar");
			}
		} else if (opcion == 1) {
			try {
				System.out.println("Ingreso en cuenta");
				cuenta1.ingresar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al ingresar");
			}
		}
		}
}