package model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;
import utils.Observable;
import utils.WordUtil;
import events.IJuegoObserver;
import utils.DifficultEnum;
import utils.LanguageEnum;

public class JuegoM extends Observable<IJuegoObserver> {
	private String palabraSecreta;
	private int intentosRestantes;
	private int fila = 0;
	private String[] listaDePalabras;
	private String AMARILLO = "#b59f3b";
	private String GRIS = "#3a3a3c";
	private String VERDE = "#538d4e";
	private LocalDateTime fechaInicio;

	public JuegoM(DifficultEnum dificultad, LanguageEnum lenguaje, int intentos) {
		this.listaDePalabras = WordUtil.buildWordArray(lenguaje, dificultad);
		Random generadorAleatorio = new Random();
		int indiceAleatorio = generadorAleatorio.nextInt(this.listaDePalabras.length);
		this.palabraSecreta = this.listaDePalabras[indiceAleatorio];
		this.intentosRestantes = intentos;
		this.fechaInicio = null;
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
				observer.onJuegoTerminado(true, obtenerTiempoUsuario());
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
			notifyObservers(observer -> observer.onJuegoTerminado(gano, 0));
		}
		this.fila++;
	}

	private int obtenerTiempoUsuario() {
		LocalDateTime fechaFin = LocalDateTime.now();
		Duration duracion = Duration.between(this.fechaInicio, fechaFin);
		int tiempoUsuario = Math.toIntExact(duracion.toSeconds());
		
		return tiempoUsuario;
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
		this.fechaInicio = LocalDateTime.now();
		notifyObservers(observer -> {
			observer.onInitialize(intentosRestantes, palabraSecreta);
		});
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

}
