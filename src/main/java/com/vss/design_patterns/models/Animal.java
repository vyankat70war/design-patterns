package com.vss.design_patterns.models;

public class Animal {
	private String name;
	public Flys ableToFly;
	
	public void setfly(Flys newFly) {
		ableToFly = newFly;
	}
	
	public void canFly() {
		ableToFly.fly();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
