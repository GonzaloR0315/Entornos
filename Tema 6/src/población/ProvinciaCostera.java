package población;

public class ProvinciaCostera extends Provincia {
	private int kmscosta;
	public ProvinciaCostera(String nb, String cc, int p, int km, int kmcosta) {
		super(nb, cc, p, km);
		kmscosta=kmcosta;
	}
	public int getKmscosta() {
		return kmscosta;
	}
	public void setKmscosta(int kmscosta) {
		this.kmscosta = kmscosta;
	}
	public void muestra() {
		System.out.println("Soy "+getNombre()+" Provincia costera tengo de costa "+ kmscosta+" Km2");
	}
	public String toString() {
		return super.toString()+" ProvinciaCostera kmscosta=" + kmscosta ;
	}

}
