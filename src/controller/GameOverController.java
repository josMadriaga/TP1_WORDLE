package controller;

import java.time.LocalDateTime;

import model.JuegoM;
import model.Navigation;
import utils.ViewEnum;
import view.GameOverView;
import view.JuegoView;

public class GameOverController {
	
	private GameOverView vistaGameOver;
    private Navigation navigation;
	public GameOverController(GameOverView vistaGameOver, Navigation navigation) {
		this.vistaGameOver = vistaGameOver;
		this.navigation = navigation;	
		manejarEventos();
	}

	private void manejarEventos() {
				// Botón reintentar 
				this.vistaGameOver.getBtnRetry().addActionListener(e -> {	
				    this.navigation.updateView(ViewEnum.JUEGO, 0); 
				});
				// Botón VOLVER AL MENÚ 
				this.vistaGameOver.getBtnMenu().addActionListener(e -> {
					this.navigation.updateView(ViewEnum.MENU, 0);
				});
	}
}