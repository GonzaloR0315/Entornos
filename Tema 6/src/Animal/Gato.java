package Animal;

public class Gato extends Animal {

	public Gato(String categoria, int patas) {
		super(categoria, patas);
		
	}
	@Override
public void comoSueno() {
	System.out.println("Miau Miau");
}
	@Override
	public String toString() {
		return "Gato " + super.toString();
	}

}
