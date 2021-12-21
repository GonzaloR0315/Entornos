
public class arraystring {
public static void main(String[] args) {
	String []ciudades= {"sevilla","tokio","berlin"};
	for (int i = 0; i < ciudades.length; i++) {
		System.out.println(ciudades[i]);
	}
	//recorrido for each
	System.out.println("for each");
	for (String ciu:ciudades) {
		System.out.println(ciu);
	}

}
}
