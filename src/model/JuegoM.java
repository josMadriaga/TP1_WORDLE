package model;

import java.util.Random;
import utils.Observable;
import events.IJuegoObserver;

public class JuegoM extends Observable<IJuegoObserver> {
	private String palabraSecreta;
	private int intentosRestantes;
	private String[] listaDePalabras;
	
	public JuegoM(int cantVidas) {
		this.listaDePalabras = new String[] {
				"ACTOR", "AGUAS", "ALTOS", "AMIGO", "ARBOL", "AUTOS", "AVION", "BARCO", "BESOS", "BRAZO",
			    "CAJAS", "CALOR", "CAMAS", "CAMPO", "CANTO", "CARAS", "CARRO", "CASAS", "CERDO", "ENANO",
			    "CINCO", "CLARO", "CLIMA", "COCHE", "COLOR", "CORTE", "COSAS", "CREMA", "DADOS", "DATOS",
			    "DISCO", "DULCE", "ESTAR", "FELIZ", "FUEGO", "GATOS", "GENTE", "GOTAS", "GRUPO", "HIELO",
			    "HOJAS", "HORAS", "HUESO", "IDEAS", "ISLAS", "JABON", "JOVEN", "JUEGO", "LAPIZ", "LIBRO"
			    };
		Random generadorAleatorio = new Random();
		int indiceAleatorio = generadorAleatorio.nextInt(this.listaDePalabras.length);
		this.palabraSecreta = this.listaDePalabras[indiceAleatorio];
		this.intentosRestantes = cantVidas;
	}
	public void validarPalabra(String palabraIngresada) {
		String[] coloresLetras = new String[5];
		palabraIngresada = palabraIngresada.toUpperCase();
		StringBuilder palabraSecretaTemp = new StringBuilder(this.palabraSecreta);
		// Primero, marcar las letras correctas 
		for (int i = 0; i < 5; i++) {
			if(palabraIngresada.charAt(i) == palabraSecretaTemp.charAt(i)) {
				coloresLetras[i] = "verde";
				palabraSecretaTemp.setCharAt(i, '-');
			} else {
				coloresLetras[i] = "gris";
			}
		}
		
		// Luego, marcar las letras amarillas
		for (int i = 0; i < 5; i++) {
			if (coloresLetras[i].equals("gris")) {
				int index = palabraSecreta.indexOf(String.valueOf(palabraIngresada.charAt(i)));
				if (index != -1) {
					coloresLetras[i] = "amarillo";
					palabraSecretaTemp.setCharAt(index, '-');
				}
			}
		}
		
		this.intentosRestantes--;
		boolean gano = palabraIngresada.equals(palabraSecreta);
		notifyObservers(observer -> observer.onPalabraRevisada(coloresLetras));
		if (gano || intentosRestantes == 0) {
			notifyObservers(observer -> observer.onJuegoTerminado(gano));
		}
	}
}
