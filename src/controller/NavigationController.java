package controller;

import events.INavigationObserver;
import model.JuegoM;
import model.Navigation;
import model.Setting;
import utils.ViewEnum;
import view.PrincipalView;

public class NavigationController implements INavigationObserver {
	private PrincipalView principal;
	private Navigation navigation;
	private Setting setting;

	public NavigationController(PrincipalView principal, Navigation navigation) {
		this.principal = principal;
		this.navigation = navigation;
		this.setting = new Setting();

		this.navigation.addObserver(this);
		handleEvents();
	}

	private void handleEvents() {
		this.principal.getPanelMenu().getBtnStart().addActionListener(e -> {
			this.navigation.updateView(ViewEnum.JUEGO);
		});

	}

	@Override
	public void onViewChanged(ViewEnum viewName) {
		this.principal.navegarA(viewName.toString());
		switch (viewName) {
		case MENU:
			new MenuController(this.setting, this.principal.getPanelMenu());
			break;
		case JUEGO:
			JuegoM juegoModel = new JuegoM(setting.getDificultad(),6);
			this.principal.getPanelJuego().limpiarTablero();
			new JuegoController(this.principal.getPanelJuego(), juegoModel, this.navigation);
			juegoModel.initialize();
			break;
		case GAMEOVER:
			new GameOverController(this.principal.getPanelGameOver(), this.navigation);
			break;
		}
	}

}
