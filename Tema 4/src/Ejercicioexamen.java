
public class Ejercicioexamen {
public static void main(String[] args) {
	int []puntuaciones=new int [136];
	int []datos=new int [1000];
	int mayor=-1, menor=136,dato=0,acum=0;
	for (int i = 0; i < datos.length; i++) {
		dato=(int)(Math.random()*136);
		datos[i]=dato;
		acum+=dato;
		puntuaciones[dato]++;
		if(dato>mayor) {
			mayor=dato;
		}
		if (dato<menor) {
			menor=dato;
		}
		System.out.print(datos[i]+"\t");
	}
	System.out.println(mayor);
	System.out.println(menor);
	System.out.println(acum/1000);
	int maxpt=0,nrep=0;
	for (int i = 0; i < puntuaciones.length; i++) {
		if(puntuaciones[i]!=0) {
			maxpt=i;
			nrep=puntuaciones[i];
		}
		System.out.print(puntuaciones[i]+"\t");
	}
	System.out.println();
	System.out.println(nrep);

}
}
