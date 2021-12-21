package actor;

public class testCartelera {
public static void main(String[] args) {
	Cartelera c=new Cartelera(2);
	Pelicula p1=new Pelicula("El buen patron","drama",90);
	p1.Agregar("actor");
	p1.Agregar("actriz");
	Pelicula p2=new Pelicula("Ali G anda suelto","comedia",100);
	p2.Agregar("Baron Cohen");
	p2.Agregar("Kate Henges");
	p2.Agregar("Ricky C");
	c.AgregarPelicula(p1, "Madrid");
	c.AgregarPelicula(p2, "Madrid");
	c.AgregarPelicula(p2, "Barcelona");
	c.AgregarPelicula(p2, "Sevilla");
	System.out.println(c);

}
}
