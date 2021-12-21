package ejercicio4;

public class testMiString {
public static void main(String[] args) {
	String hr="Paloma";
	String reves=MiString.Alreves(hr);
	System.out.println(hr);
	System.out.println(reves);
	String lim="Paloma amo oma oma paloma";
	System.out.println(MiString.LimpiaCaracteres(lim, " "));
	String acento="camión";
	System.out.println(MiString.QuitaTildes(acento.toUpperCase()));
	System.out.println(MiString.QuitaTildes(acento));
	System.out.println(MiString.Numero("134"));
}
}
