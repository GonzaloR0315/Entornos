package tema5;

public class nombre {
public static void main(String[] args) {
	Nombres l1=new Nombres (3);
	l1.agregarNombre("Eva");
	l1.agregarNombre("Raúl");
	l1.agregarNombre("Juan");
	l1.Verlistaact();

	l1.eliminar("Juan");
	l1.Verlistaact();

}
}
