
public class Moto {
	public static void main(String[] args) {

	double kilometros= (double)(Math.random()*82) ;
	double litros = (double)(Math.random()*29);
		System.out.println(Math.round (kilometros*100)/100.0+" kilometros");
		System.out.println(Math.round (litros*100)/100.0+" litros");	
		System.out.println(Math.round ((litros/kilometros)*100)/100.0+ " litros que consume por kilometro");
	}

}
