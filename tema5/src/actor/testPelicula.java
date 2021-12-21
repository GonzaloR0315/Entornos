package actor;

public class testPelicula {
public static void main(String[] args) {
	Pelicula p1=new Pelicula("Dune","Acción",164);
	System.out.println(p1);
	p1.Agregar("Aquaman");
	p1.Agregar("WS");
	p1.Agregar("WS");
	p1.Agregar("BOB");
	p1.Agregar("Nuevo");
	System.out.println(p1);
}
}
