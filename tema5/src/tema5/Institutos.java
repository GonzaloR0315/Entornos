package tema5;

public class Institutos {
public static void main(String[] args) {
	String[]enses= {"grado superior","grado medio"};
	String[]enses2= {"grado superior","Bachiller"};
	Instituto i1 =new Instituto("Ies Paloma","Publico",enses,"fd",2000);
	System.out.println(i1.toString());
	Instituto i2= new Instituto("Leonardo","Publico",enses2,"clase",854);
	System.out.println(i2);
	Instituto i3= new Instituto("Lorca","Privado","dfalkaf");
	System.out.println(i3);
	i3.setNumalumnos(84865);
	System.out.println(i3);
}
}
