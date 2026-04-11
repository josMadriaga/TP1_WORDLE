package controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import utils.DifficultEnum;
import utils.LanguageEnum;
import events.ISettingsObserver;

public class MenuController implements ISettingsObserver {
	private model.Setting modelo;
	private view.MenuView vista;

	public MenuController(model.Setting modelo, view.MenuView vista){
		
	    this.modelo = modelo;
	    this.vista = vista;

	    this.modelo.addObserver(this);
	    this.vista.addDificultadListener(e -> cambiarDificultad(e));
	    this.vista.addLanguageListener(e -> cambiarIdioma(e));
	}


	public void cambiarDificultad(ActionEvent e) {
		String dificultadElegida = e.getActionCommand();
		DifficultEnum dificultad = DifficultEnum.valueOf(dificultadElegida);
		modelo.updateDifficult(dificultad);
	}
	public void cambiarIdioma(ActionEvent e) {
		String languageSelected = e.getActionCommand();
		LanguageEnum language = LanguageEnum.valueOf(languageSelected);
		modelo.updateLanguage(language);
	}

	@Override
	public void onLanguageChanged(LanguageEnum language) {
		this.vista.updateTexts();
	}
}
