package ejercicio4;

public class MiString {
	public static String Alreves(String cadena) {
		String reves="";
			for (int i =cadena.length()-1;i>-1;i--) {
			reves+=cadena.charAt(i);	
			}
		return reves;
	}
	public static String LimpiaCaracteres(String cadena,String limpia) {
		String []salida=cadena.split(limpia);
		String sol="";
		for (int i = 0; i < salida.length; i++) {
			sol+=salida[i];
		}
		return sol;
	}
	public static String QuitaTildes(String cadena) {
		String quitar= "áéíóúÁÉÍÓÚ";
		String quitado="aeiouAEIOU";
		String limpia="";
		int pos;
		for (int i = 0; i < cadena.length(); i++) {
			pos=quitar.indexOf(cadena.charAt(i));
			if (pos>-1) {//vocal encontrada con acento
				limpia+=quitado.charAt(pos);
			
		}else {//no hay vocal con tilde
			limpia+=cadena.charAt(i);
		}
		}
		return cadena;
	}
	public boolean Palindromo(String cad) {
		if(cad.equals(Alreves(cad))) {
			return true;
		}
		return false;
	}
	public static boolean Numero (String cad) {
		char c;
		int n;
		for (int i=0;i<cad.length();i++) {
			c=cad.charAt(i);
			n=(int)c;
		}
		return true;

	}
}
