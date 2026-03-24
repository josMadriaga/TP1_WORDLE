package model;

import java.util.Random;
import utils.Observable;
import events.IJuegoObserver;

public class JuegoM extends Observable<IJuegoObserver> {
	private String palabraSecreta;
	private int intentos;
	private String[] diccionario;
	
	public JuegoM(int cantVidas) {
		this.diccionario = new String[] {
				"ACTOR", "AGUAS", "ALTOS", "AMIGO", "ARBOL", "AUTOS", "AVION", "BARCO", "BESOS", "BRAZO",
			    "CAJAS", "CALOR", "CAMAS", "CAMPO", "CANTO", "CARAS", "CARRO", "CASAS", "CERDO", "ENANO",
			    "CINCO", "CLARO", "CLIMA", "COCHE", "COLOR", "CORTE", "COSAS", "CREMA", "DADOS", "DATOS",
			    "DISCO", "DULCE", "ESTAR", "FELIZ", "FUEGO", "GATOS", "GENTE", "GOTAS", "GRUPO", "HIELO",
			    "HOJAS", "HORAS", "HUESO", "IDEAS", "ISLAS", "JABON", "JOVEN", "JUEGO", "LAPIZ", "LIBRO"
			    };
		Random generadorAleatorio = new Random();
		int indiceAleatorio = generadorAleatorio.nextInt(this.diccionario.length);
		this.palabraSecreta = this.diccionario[indiceAleatorio];
		this.intentos = cantVidas;
	}
	public void validarPalabra(String palabraIngresada) {
		String[] coloresLetras = new String[5];
		palabraIngresada = palabraIngresada.toUpperCase();
		
		for (int i = 0; i < 5; i++) {
			if (palabraIngresada.charAt(i) == palabraSecreta.charAt(i)) {
				coloresLetras[i] = "verde";
			} else if (palabraSecreta.contains(String.valueOf(palabraIngresada.charAt(i)))) {
				coloresLetras[i] = "amarillo";
			} else {
				coloresLetras[i] = "gris";
			}
		}
		this.intentos--;
		boolean gano = palabraIngresada.equals(palabraSecreta);
		notifyObservers(observer -> observer.onPalabraRevisada(coloresLetras));
		if (gano || intentos == 0) {
			notifyObservers(observer -> observer.onJuegoTerminado(gano));
		}
	}
}
