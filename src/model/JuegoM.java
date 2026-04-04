package model;

import java.time.LocalDateTime;
import java.util.Random;
import utils.Observable;
import events.IJuegoObserver;	
import utils.DifficultEnum;

public class JuegoM extends Observable<IJuegoObserver> {
	private String palabraSecreta;
	private int intentosRestantes;
	private int fila = 0;
	private String[] listaDePalabras;
	private String AMARILLO = "#b59f3b";
	private String GRIS = "#3a3a3c";
	private String VERDE = "#538d4e";
	private LocalDateTime fechaInicio;

	public JuegoM(DifficultEnum dificultad,int intentos) {
		// TODO agregar más listas con palabras en base a dificultad los arrays se
		// pueden llamar como las dificultades para mediante una función flecha
		// mapearlas facilmente por enum quizas
		  String[] facil = { "GATOS", "PERRO", "CASAS", "AUTOS", "AGUAS", 
				    		"COCHE", "COLOR", "FELIZ", "ARBOL", "AMIGO", 
				    		"MESAS", "LIBRO", "LAPIZ", "NOCHE", "TARDE", 
				    		"LUNAS", "SOLES", "RATON", "REINA", "FUEGO"};
		  
		  String[] normal = {"ACTOR", "BRAZO", "CLIMA", "HIELO", "JUEGO", 
				  			"BARCO", "DULCE", "GENTE", "JOVEN", "CINCO", 
				  			"CAMPO", "MUNDO", "NORTE", "PISTA", "RADIO", 
				  			"SALUD", "VALOR", "VOCES", "VUELO", "PLAZA"};
		  
		  String[] dificil = {"ZARZA", "ÑANDU", "AÑEJO", "QUIZA", "GNOMO", 
				    		"YELMO", "XENON", "BOXEO", "KIWIS", "KAYAK", 
				    		"FLUOR", "EBANO", "PIZZA", "ZORRO", "VORAZ", 
				    		"SAXOS", "JUEZA", "BAZAR", "BRUJA", "CHUZA"};
		  
		  this.listaDePalabras = switch (dificultad) {
		  case EASY -> facil;
		  case NORMAL -> normal;
		  case HARD -> dificil;
		  };
	  
		Random generadorAleatorio = new Random();
		int indiceAleatorio = generadorAleatorio.nextInt(this.listaDePalabras.length);
		this.palabraSecreta = this.listaDePalabras[indiceAleatorio];
		this.intentosRestantes = intentos;
		this.fechaInicio = LocalDateTime.now();
	}

	public void sendError() {
		notifyObservers(o -> o.onError());
	}

	public void validarPalabra(String palabraIngresada) {
		String[] coloresLetras = { VERDE, VERDE, VERDE, VERDE, VERDE };
		palabraIngresada = palabraIngresada.toUpperCase();
		if (palabraIngresada.equals(getPalabraSecreta())) {
			notifyObservers(observer -> {
				observer.onPalabraRevisada(coloresLetras, fila);
				observer.onJuegoTerminado(true);
			});
			return;
		}
		StringBuilder palabraSecretaTemp = new StringBuilder(this.palabraSecreta);
		// Primero, marcar las letras correctas
		for (int i = 0; i < 5; i++) {
			coloresLetras[i] = GRIS;
			if (palabraIngresada.charAt(i) == palabraSecretaTemp.charAt(i)) {
				coloresLetras[i] = VERDE;
				palabraSecretaTemp.setCharAt(i, '-');
			}
		}

		// Luego, marcar las letras amarillas
		for (int i = 0; i < 5; i++) {
			if (coloresLetras[i].equals(GRIS)) {
				int index = palabraSecretaTemp.indexOf(String.valueOf(palabraIngresada.charAt(i)));
				if (index != -1) {
					coloresLetras[i] = AMARILLO;
					palabraSecretaTemp.setCharAt(index, '-');
				}
			}
		}

		this.intentosRestantes--;
		boolean gano = palabraIngresada.equals(palabraSecreta);
		notifyObservers(observer -> observer.onPalabraRevisada(coloresLetras, fila));
		if (gano || intentosRestantes == 0) {
			notifyObservers(observer -> observer.onJuegoTerminado(gano));
		}
		this.fila++;
	}

	public String getPalabraSecreta() {
		return palabraSecreta;
	}

	public int getIntentosRestantes() {
		return intentosRestantes;
	}

	public int getFila() {
		return fila;
	}

	public void initialize() {
		notifyObservers(observer -> {
			observer.onInitialize(intentosRestantes, palabraSecreta);
		});
	}
	
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

}
