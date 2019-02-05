package com.vss.design_patterns.observers.ideal;

public interface Subject {

	void registerObserver(Observer o);
	void unregisterObserver(Observer o);
	void notifyObserver();

}
