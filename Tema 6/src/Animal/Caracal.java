package Animal;

public class Caracal extends Animal{
	private String habitat;
public Caracal(String categoria, int patas, String habitat) {
		super(categoria, patas);
	this.habitat=habitat;
	}
public void comoSueno() {
	System.out.println("Miaaaaaaau Miaaaaaaaaaaauuuuu");
}
public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat=habitat;
}
@Override
public String toString() {
	return "Caracal"+ super.toString()+" habitat=" + habitat;
}
}
