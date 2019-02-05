package com.vss.design_patterns.models;

public interface Flys {
	void fly();
}

class ItFly implements Flys{

	public void fly() {
		System.out.println("I can fly");
	}
	
}

class CantFly implements Flys{

	public void fly() {
		System.out.println("I can't fly");
	}
	
}
