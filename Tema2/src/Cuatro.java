import java.util.Scanner;

public class Cuatro {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce un número");
	int num = sc.nextInt();
	boolean b=true;//Mientras no se demuestre lo contrario es primo
 for  (int i =num-1;i>1;i--) {
  if (num%i==0){
	 System.out.println(num+" No es primo");
	 b=false;
	break;
  } }if (b){
	 System.out.println(num+" Es primo");
	 }
	 System.out.println("Fin");
 }}
 
	


