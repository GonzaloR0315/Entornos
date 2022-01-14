package población;

public class testProvincia {
public static void main(String[] args) {
	
	Provincia p1=new Provincia("Madrid","Madrid",46840584,55890);
		System.out.println(p1.toString());
		System.out.println("La densidad de la provincia es de "+p1.densidad());
		p1.muestra();
	ProvinciaCostera pc=new ProvinciaCostera("Valencia","CV",15804341,34682,9842);
		System.out.println(pc.toString());
		pc.muestra();
		System.out.println("La densidad de la provincia es de "+pc.densidad());
	Provincia[]ps=new Provincia[2];
		ps[0]=p1;
		ps[1]=pc;
		for (Provincia p:ps) {
			p.muestra();
		}
}
}
