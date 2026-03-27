package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Observable<T> {
	
	private List<T> observers = new ArrayList<T>();

	public void addObserver(T observer) {
		observers.add(observer);
	}
		
	public void removeObserver(T observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(Consumer<T> action) {
		for (T t : observers) {
			action.accept(t);
		}
	}
}
