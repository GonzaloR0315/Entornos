package tema5;

public class Cursos {
public static void main(String[] args) {
	Curso c1=new Curso();
	System.out.println(c1);
	Curso c2=new Curso("1�wem");
	System.out.println(c2);
	Curso c3= new Curso("1�Wem",30,true,new Asignatura("Programaci�n","Inform�tica",8));
	System.out.println(c3);
}
}
