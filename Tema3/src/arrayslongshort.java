
public class arrayslongshort {
public static void mostrarArray(long[] miArray) {
	for (int i = 0; i < miArray.length; i++) {
		System.out.println("El factorial de "+ (i+1)+" es "+miArray[i]);
	}
}
public static void main(String[] args) {
	long[] misFact=new long[20];
	long f=1;
	for (int i = 0; i < misFact.length+1; i++) {
		f*=i;
		misFact[i-1]=f;
	}
	mostrarArray(misFact);
}

}
