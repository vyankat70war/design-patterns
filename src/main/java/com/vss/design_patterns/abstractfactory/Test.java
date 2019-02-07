package com.vss.design_patterns.abstractfactory;

import com.vss.design_patterns.abstractfactory.enums.CarType;
import com.vss.design_patterns.abstractfactory.factory.car.CarFactory;

public class Test {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}

}
