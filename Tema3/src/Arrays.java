import java.util.Scanner;

public class Arrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int tam=4;
	boolean[]compro=new boolean [tam];
	double cesta[]=new double[tam];
	//relleno y recorro cesta
	for (int  i=0;i<cesta.length;i++) {
		cesta[i]=Math.round((Math.random()*100)*100)/100.0;
		System.out.print(cesta[i]+"\t");
}
	System.out.println();
	//relleno y recorro compro
	for (int  i=0;i<compro.length;i++) {
		//impar=true
		if(((int)(Math.random()*10))%2!=0){
			compro[i]=true;
		}
		System.out.print(compro[i]+"\t");
}
	System.out.println();
	//calculo el precio de lo que voy a comprar
	double total=0;
	for (int  i=0;i<compro.length;i++) {
		if (compro[i]) {
			total+=cesta[i];
		}
	}
	System.out.println("Total de la compra = "+total);
}
}