package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.DifficultEnum;
import utils.LanguageEnum;

public class Controlador {
	private model.Setting modelo;
	private view.Interfaz vista;

	public Controlador(model.Setting modelo, view.Interfaz vista) {
		
	    this.modelo = modelo;
	    this.vista = vista;

	 
	    this.vista.addDificultadListener(new DificultadListener());
	    this.vista.addLanguageListener(new LanguageListener());
	}


	public class DificultadListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String dificultadElegida = e.getActionCommand();

			//Castea el string a enum
			DifficultEnum dificultad = DifficultEnum.valueOf(dificultadElegida);
			System.out.println("Dificultad actualizada a: " + dificultad);
			modelo.updateDifficult(dificultad);
			
		}
	}
	public class LanguageListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String languageSelected = e.getActionCommand();

			LanguageEnum language = LanguageEnum.valueOf(languageSelected);

			modelo.updateLanguage(language);

		}
	}
}
