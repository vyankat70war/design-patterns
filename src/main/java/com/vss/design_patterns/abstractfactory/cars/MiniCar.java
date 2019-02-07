package com.vss.design_patterns.abstractfactory.cars;

import com.vss.design_patterns.abstractfactory.enums.CarType;
import com.vss.design_patterns.abstractfactory.enums.Location;

public class MiniCar extends Car {

	public MiniCar(Location location) {
		super(CarType.MINI, location);
	}

	@Override void construct() {
		System.out.println("connecting to " + CarType.MINI);
	}
}
