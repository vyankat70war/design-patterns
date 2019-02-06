package com.vss.design_patterns.factory.good;

import com.vss.design_patterns.factory.EnemyShip;
import com.vss.design_patterns.factory.RocketEnemyShip;
import com.vss.design_patterns.factory.UFOEnemyShip;

import java.util.Scanner;

public class EnemyShipFactory {

	public static EnemyShip getEnemyShip(){
		EnemyShip enemyShip = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please select ship : (U/R)? : ");
		String input = scanner.nextLine().toLowerCase();
		switch (input){
			case "u":
				enemyShip = new UFOEnemyShip();
				break;
			case "r":
				enemyShip = new RocketEnemyShip();
				break;
		}

		return enemyShip;
	}

}
