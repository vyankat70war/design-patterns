package com.vss.design_patterns.abstractfactory.factory.location;

import com.vss.design_patterns.abstractfactory.cars.Car;
import com.vss.design_patterns.abstractfactory.cars.LuxuryCar;
import com.vss.design_patterns.abstractfactory.cars.MicroCar;
import com.vss.design_patterns.abstractfactory.cars.MiniCar;
import com.vss.design_patterns.abstractfactory.enums.CarType;
import com.vss.design_patterns.abstractfactory.enums.Location;

public class USACarFactory {

	public static Car buidCar(CarType model){
		Car car = null;
		switch (model){
			case MINI:
				car = new MiniCar(Location.USA);
				break;
			case MICRO:
				car = new MicroCar(Location.USA);
				break;
			case LUXURY:
				car = new LuxuryCar(Location.USA);
				break;
			default:
				break;

		}
		return car;
	}

}
