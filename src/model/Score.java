package model;

public class Score {
	private String nombre;
	private int segundos;

	public Score(String nombre, int segundos) {
		this.nombre = nombre;
		this.segundos = segundos;
	}

	public String getNombre() {
		return nombre;
	}

	public int getSegundos() {
		return segundos;
	}
	
}
