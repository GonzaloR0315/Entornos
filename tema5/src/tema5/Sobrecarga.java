package tema5;

public class Sobrecarga {
private int a;
private int b;
public Sobrecarga(int a, int b) {
	this.a=a;
	this.b=b;
}
public int suma() {
	return a+b;
}
public int suma (int c) {
	return a+b+c;
}
public int suma (int c,int d) {
	return a+b+c;
}
}

