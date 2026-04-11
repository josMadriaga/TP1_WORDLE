package controller;

import events.INavigationObserver;
import model.JuegoM;
import model.LeaderBoard;
import model.Navigation;
import model.Setting;
import utils.ViewEnum;
import view.PrincipalView;

public class NavigationController implements INavigationObserver {
	private PrincipalView principal;
	private Navigation navigation;
	private Setting setting;
	private int tiempoUsuario;

	public NavigationController(PrincipalView principal, Navigation navigation) {
		this.principal = principal;
		this.navigation = navigation;
		this.setting = new Setting();

		this.navigation.addObserver(this);
		handleEvents();
		
		new MenuController(this.setting, this.principal.getPanelMenu());
	}

	private void handleEvents() {
		this.principal.getPanelMenu().getBtnStart().addActionListener(e -> {
			this.tiempoUsuario = 0;
			this.navigation.updateView(ViewEnum.JUEGO, this.tiempoUsuario);
		});

	}

	@Override
	public void onViewChanged(ViewEnum viewName, int tiempoUsuario) {
		if (this.tiempoUsuario == 0) {
			this.tiempoUsuario = tiempoUsuario;
		}
		this.principal.navegarA(viewName.toString());
		switch (viewName) {
		case MENU:
			new MenuController(this.setting, this.principal.getPanelMenu());
			break;
		case JUEGO:
			JuegoM juegoModel = new JuegoM(setting.getDificultad(),setting.getLenguaje(),6);
			this.principal.getPanelJuego().limpiarTablero();
			this.principal.getPanelJuego().updateTexts();
			new JuegoController(this.principal.getPanelJuego(), juegoModel, this.navigation);
			juegoModel.initialize();
			break;
		case GAMEOVER:
			new GameOverController(this.principal.getPanelGameOver(), this.navigation);
			break;
		case LEADERBOARD:
			LeaderBoard rankingModel = new LeaderBoard(this.tiempoUsuario);
			new LeaderBoardController(rankingModel, this.principal.getPanelLeaderBoard());
			break;
		}
	}

}
