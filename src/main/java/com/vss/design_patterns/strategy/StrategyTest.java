package com.vss.design_patterns.strategy;

import com.vss.design_patterns.models.Animal;
import com.vss.design_patterns.models.Cat;
import com.vss.design_patterns.models.Dog;

public class StrategyTest {
	

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.canFly();
		cat.canFly();
	}
}
