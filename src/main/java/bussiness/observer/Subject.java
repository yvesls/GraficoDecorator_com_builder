package bussiness.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	public void add(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers(int status) {
		for (Observer o : observers) {
			o.update(status);
		}
	}
}
