package controller;

import model.Navigation;
import utils.ViewEnum;
import view.GameOverView;
import view.JuegoView;

public class GameOverController {
	
	private GameOverView vistaGameOver;
    private JuegoView vistaJuego;
    private Navigation navigation;
	public GameOverController(GameOverView vistaGameOver, JuegoView vistaJuego, Navigation navigation) {
		this.vistaGameOver = vistaGameOver;
		this.vistaJuego = vistaJuego; 
		this.navigation = navigation;	
		manejarEventos();
	}

	private void manejarEventos() {
				// Botón reintentar 
				this.vistaGameOver.getBtnNewButton().addActionListener(e -> {				    
				    this.vistaJuego.limpiarTablero(); 
				    this.navigation.updateView(ViewEnum.JUEGO); 
				});
				// Botón VOLVER AL MENÚ 
				this.vistaGameOver.getBtnNewButton_1().addActionListener(e -> {
					this.navigation.updateView(ViewEnum.MENU);
				});
	}
}