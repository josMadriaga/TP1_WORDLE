package model;

import events.ISettingsObserver;
import utils.DifficultEnum;
import utils.LanguageEnum;
import utils.Observable;

public class Setting extends Observable<ISettingsObserver> {
	private DifficultEnum dificultad;
	private LanguageEnum lenguaje;
	
	public Setting() {
		this.dificultad = DifficultEnum.EASY;
		this.lenguaje = LanguageEnum.SPANISH;
	}
	
	public void updateDifficult(DifficultEnum newDifficult) {
		this.dificultad = newDifficult;
		notifyObservers(observer -> observer.onDifficultChanged(newDifficult));
	}
	
	public void updateLanguage(LanguageEnum newLanguage) {
		this.lenguaje = newLanguage;
		notifyObservers(observer -> observer.onLanguageChanged(newLanguage));
	}

	public DifficultEnum getDificultad() {
		return dificultad;
	}

	public LanguageEnum getLenguaje() {
		return lenguaje;
	}
}
