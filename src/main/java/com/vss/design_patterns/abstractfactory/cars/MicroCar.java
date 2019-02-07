package com.vss.design_patterns.abstractfactory.cars;

import com.vss.design_patterns.abstractfactory.enums.CarType;
import com.vss.design_patterns.abstractfactory.enums.Location;

public class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
	}

	@Override void construct() {
		System.out.println("connecting to " + CarType.MICRO);
	}
}
