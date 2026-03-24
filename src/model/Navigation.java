package model;

import events.INavigationObserver;
import utils.Observable;
import utils.ViewEnum;

public class Navigation extends Observable<INavigationObserver> {
	private ViewEnum view;
	
	public Navigation() {
		this.view = ViewEnum.MENU;
	}
	
	public void updateView(ViewEnum newView) {
		this.view = newView;
		notifyObservers(observer -> observer.onViewChanged(newView));
	}
	
	public ViewEnum getView() {
		return this.view;
	}
}
