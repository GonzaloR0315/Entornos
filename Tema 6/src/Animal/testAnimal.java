package Animal;

public class testAnimal {
public static void main(String[] args) {
	Animal a=new Animal("Mamifero",4);
	System.out.println(a);
	a.comoSueno();
	Gato g1=new Gato("Mamifero",4);
	System.out.println(g1);
	g1.comoSueno();
	Caracal c1=new Caracal("Mamifero",4,"Sabana");
	System.out.println(c1);
	c1.comoSueno();
	Animal refAnimal;
	refAnimal=c1;
	refAnimal.getPatas();
	System.out.println("Tengo "+refAnimal.getPatas()+" patas");
	refAnimal.comoSueno();
	refAnimal=g1;
	System.out.println("Tengo "+refAnimal.getPatas()+" patas");
	refAnimal.comoSueno();
}
}
