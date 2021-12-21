package actor;

import java.util.Arrays;

public class Pelicula {
	private String titulo;
	private String genero;
	private int duracion;
	private String []actores;
	public Pelicula(String titulo,String genero,int duracion) {
		this.titulo=titulo;
		this.genero=genero;
		this.duracion=duracion;
		actores=new String [3];
	}
	public String getTitulo() {
		return titulo;
	}
	public String getGenero() {
		return genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public String[] getActores() {
		return actores;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	public void setDuracion(int duracion) {
		this.duracion=duracion;
	}
	public void setActores(String []actores) {
		this.actores=actores;
	}
	public String Critica() {
		return "La pelicula "+titulo+" es muy buena";
	}
	public static double Recaudacion(int numespectadores) {
		return numespectadores*11.0;
	}
	public boolean Agregar(String nombre) {
		for (int i = 0; i < actores.length; i++) {
			if(actores[i]!=null) {
				if (actores[i].equals(nombre)) {
					System.out.println("Ya esta");
					return false;
				}
			}else {
				actores[i]=nombre;
				System.out.println("Añadido");
				return true; 
			}
			
		}
		return false;//lista llena y sin coincidencias
	}
	
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + ", actores="
				+ Arrays.toString(actores) + "]";
	}
	
}
