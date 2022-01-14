package pq1;

public class TestF2d {
	public static void main(String[] args) {
		Forma2d miForma= new Forma2d();
		miForma.setHeight(15);
		miForma.setWidth(12.5);
		miForma.ShowDim();
		Triangulo t1=new Triangulo("Doble continuo",3.4,2.3);
		t1.setHeight(2.3);
		t1.setWidth(3.4);
		t1.style="Doble continuo";
		System.out.println(t1.area());
		t1.ShowDim();
		t1.showStyle();
	}
}
