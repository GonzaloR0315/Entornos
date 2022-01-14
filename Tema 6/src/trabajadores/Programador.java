package trabajadores;

import java.util.Arrays;

public class Programador extends Empleado {
	private String[] lenguajes;
	public Programador(String nombre,String ...lenguajes ) {
		super(nombre);
		this.lenguajes=lenguajes;
	}
	public Programador(String nombre,int tf,String ...lenguajes ) {
		super(nombre,tf);
		this.lenguajes=lenguajes;
	}
	public String[] getLenguajes() {
		return lenguajes;
	}
	public void setLenguajes(String[] lenguajes) {
		this.lenguajes = lenguajes;
	}
	public static String[] MejoresCandidatos(String lenguajeP,Programador[] ps) {
		String[] lengs; 
		String[] salida=new String[ps.length];
		int contador=0;
		for (int i = 0; i < ps.length; i++) {
			lengs=ps[i].lenguajes;
			for (int j = 0; j < lengs.length; j++) {
				if(lengs[j].equals(lenguajeP)) {
					salida[contador]=ps[i].getNombre()+", "+ps[i].getTf();
					contador++;
					break;
				}
			}
		}
		return salida;
	}
	@Override
	public String toString() {
		String salida= "El nombre es "+ super.getNombre()+" tiene el telefono "+super.getTf()+" y es programador de \n";
			for(String l:lenguajes) {
				salida+=l+"\t";
			}
			return salida;
	}

}
