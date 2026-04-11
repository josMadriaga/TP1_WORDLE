package model;

import events.ISettingsObserver;
import utils.DifficultEnum;
import utils.LanguageEnum;
import utils.LanguageUtil;
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
	}

	public void updateLanguage(LanguageEnum newLanguage) {
		this.lenguaje = newLanguage;
		setGlobalLanguage();
		notifyObservers(observer -> observer.onLanguageChanged(newLanguage));
	}

	private void setGlobalLanguage() {
		switch (this.lenguaje) {
		case LanguageEnum.ENGLISH:
			LanguageUtil.setIdioma("en");
			break;
		case LanguageEnum.SPANISH:
			LanguageUtil.setIdioma("es");
			break;
		}
	}

	public DifficultEnum getDificultad() {
		return dificultad;
	}

	public LanguageEnum getLenguaje() {
		return lenguaje;
	}
}
