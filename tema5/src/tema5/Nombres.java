package tema5;

public class Nombres {
private int numMax;//Maximo de nombres de la lista
private String []lista;
private int actual;

public Nombres (int max) {
	numMax=max;
	lista=new String[numMax];
	actual=0;
}
public void setNumMax(int nuevoMax) {
	numMax=nuevoMax;
}
public int getNumMax() {
	return numMax;
}
public int agregarNombre (String nuevoNombre) {
	if (actual==numMax) {//lista llena
		//System.out.println("La lista ya esta llena");
		return -1;
	}else if (actual<numMax) {//Se puede añadir
		for (int i = 0; i < actual; i++) {
			if (lista[i].equals(nuevoNombre)) {//no se añade porque ya esta
				//System.out.println(nuevoNombre+" ya estaba");
				return 0;
			}
			
		}
	}
		lista[actual++]=nuevoNombre;//añadimos
		return 1;
}
public boolean eliminar(String nombre) {
	int posicion=-1;
	for (int i = 0; i < actual; i++) {
		if (lista[i].equals(nombre)) {//El nombre esta
			posicion=i;
			break;
		}
	}
	if (posicion==-1) {
		return false;
	}
	for (int j = posicion+1; j > actual-1; j++) {
		lista[j]=lista[j+1];
	}
	lista[actual-1]="";//borrado fisico
	actual--;
	return true;
}
public void Verlistaact() {
	System.out.println("Listado de nombres");
	for (int i = 0; i < actual; i++) {
		System.out.println(lista[i]);
	}
}
}
