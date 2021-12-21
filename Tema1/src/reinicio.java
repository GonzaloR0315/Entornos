import java.util.Scanner;

public class reinicio {
public static void main(String[] args) {
	int menor=Integer.MIN_VALUE;
	int num=(int) (Math.random()*-100);
	System.out.println(num);
menor=num;

int i;
for( i=0; i<9 ; i++) {
	num= (int)(Math.random()*-100);
	System.out.println(num);
	if (num<menor) {
		menor=num;
	
	}
	}
System.out.println("El menor es "+ menor);
}
	}

	

