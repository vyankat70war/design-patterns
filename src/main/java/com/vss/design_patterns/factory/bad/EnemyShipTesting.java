package com.vss.design_patterns.factory.bad;

import com.vss.design_patterns.factory.EnemyShip;
import com.vss.design_patterns.factory.RocketEnemyShip;
import com.vss.design_patterns.factory.UFOEnemyShip;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShip enemyShip = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please select ship : (U/R)? : ");
		String input = scanner.nextLine();
		if(input.equalsIgnoreCase("U")){
			enemyShip = new UFOEnemyShip();
		}else if(input.equalsIgnoreCase("R")){
			enemyShip = new RocketEnemyShip();
		}
		doStuffEnemy(enemyShip);
	}

	private static void doStuffEnemy(EnemyShip ufoShip) {
		ufoShip.displayEnamyShip();
		ufoShip.followHeroShip();
		ufoShip.enemyShipShoots();
	}

}
