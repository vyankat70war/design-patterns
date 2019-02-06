package com.vss.design_patterns.factory.good;

import com.vss.design_patterns.factory.EnemyShip;
import com.vss.design_patterns.factory.UFOEnemyShip;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShip enemyShip = EnemyShipFactory.getEnemyShip();
		doStuffEnemy(enemyShip);
	}

	private static void doStuffEnemy(EnemyShip ufoShip) {
		ufoShip.displayEnamyShip();
		ufoShip.followHeroShip();
		ufoShip.enemyShipShoots();
	}

}
