package controller;

import events.INavigationObserver;
import model.Navigation;
import utils.ViewEnum;
import view.PrincipalView;

public class NavigationController implements INavigationObserver {
	private PrincipalView principal;
	private Navigation navigation;
	
	public NavigationController(PrincipalView principal, Navigation navigation) {
		this.principal = principal;
		this.navigation = navigation;
		
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
	}

}
