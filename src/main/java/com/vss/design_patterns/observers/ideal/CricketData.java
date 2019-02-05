package com.vss.design_patterns.observers.ideal;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CricketData implements Subject {
	
	private int runs;
	private float overs;
	private int wickets;
	private List<Observer> observers;

	public CricketData(){
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void unregisterObserver(Observer o) {
		observers.remove(observers.indexOf(o));
	}

	public void notifyObserver() {
		observers.stream().forEach(observer -> observer.update(runs, wickets, overs));
	}

	// create mock data

	private int getRuns(){
		return 90;
	}

	private int getWickets(){
		return 2;
	}

	private float getOvers(){
		return (float)10.2;
	}

	public void dataChanged(){
		runs = getRuns();
		wickets = getWickets();
		overs = getOvers();
		notifyObserver();
	}
}
