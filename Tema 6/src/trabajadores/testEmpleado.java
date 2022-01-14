package trabajadores;

public class testEmpleado {
public static void main(String[] args) {
	Empleado[] emps=new Empleado[5];
	emps[0]=new Empleado("Pepe");
	Empleado e1=new Empleado("Eva",645289543);
	emps[1]=e1;
	Programador p1= new Programador("JC",703548245,"Java","Python");
	emps[2]=p1;
	Programador p2=new Programador("Marc",221);
	emps[3]=p2;
	emps[4]=new Programador("Maria",484547856,"Php","Prolong","Java","C#","Fortran","Cobol");
	for(Empleado e:emps) {
		//System.out.println(e);
	}
	Programador[]misProg=new Programador[4];
	misProg[0]=p1;
	misProg[1]=p2;
	misProg[2]=new Programador("Antonio",845645678,"Java");
	misProg[3]=(Programador)emps[4];
	for(String dato:Programador.MejoresCandidatos("Cobol", misProg)) {
		System.out.println(dato);
	}
}
}
