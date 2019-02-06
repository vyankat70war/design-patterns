package com.vss.design_patterns.factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class EnemyShip {
	private String name;
	private double amtDamage;

	public void followHeroShip(){
		System.out.println(getName() + " is following hero");
	}

	public void displayEnamyShip(){
		System.out.println(getName() + " is on screen");
	}

	public void enemyShipShoots(){
		System.out.println(getName() + " attacks and does " + getAmtDamage());
	}

}
