 package events;

import utils.ViewEnum;

public interface INavigationObserver {
	void onViewChanged(ViewEnum viewName, int tiempoUsuario);
}
