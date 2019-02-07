package com.vss.design_patterns.abstractfactory.cars;

import com.vss.design_patterns.abstractfactory.enums.CarType;
import com.vss.design_patterns.abstractfactory.enums.Location;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
	}

	@Override void construct() {
		System.out.println("connecting to " + CarType.LUXURY);
	}
}
