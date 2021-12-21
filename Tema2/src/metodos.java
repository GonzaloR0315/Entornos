import java.util.Scanner;

public class metodos {
	
	public static int Suma (int n1,int n2) {
		return n1+n2;
	}
	public static void SumaV2 (int n1,int n2) {
		System.out.println("La suma de "+n1+" más "+n2+" es = "+(n1+n2));
	}
		public static void main(String[] args) {
			int num;
	for (int i=1;i<11;i++) {
		num=(int)(Math.random()*100);
		int s;
		s=Suma(i,num);
		SumaV2(i,num);
		System.out.println(i+" Número aleatorio "+num+ " /t " +s); 
	
	}
}

}
