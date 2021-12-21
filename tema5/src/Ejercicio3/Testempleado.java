package Ejercicio3;

public class Testempleado {
public static void main(String[] args) {
	Empleado e1=new Empleado("654275847");
	Empleado e4=new Empleado("654275847");
	System.out.println(e1);
	Empleado e2=new Empleado("Margarita","584632014");
	System.out.println(e2);
	System.out.println("El telefono de "+e2.getNombre()+" es "+e2.getTelefono());
	Empleado e3=new Empleado("Fariña","875964230");
	System.out.println(e3);
	System.out.println("En la empresa hay "+Empleado.getNumempleados()+" empleados");
	System.out.println("¿El empleado 1 es el mismo que el empleado 4? "+e1.sonIguales(e4));
	System.out.println("¿El empleado 1 es el mismo que el empleado 3? "+e1.sonIguales(e3));
	
}
}
