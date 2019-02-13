package com.vss.design_patterns.abstractfactory.factory.car;

import com.vss.design_patterns.abstractfactory.cars.Car;
import com.vss.design_patterns.abstractfactory.enums.CarType;
import com.vss.design_patterns.abstractfactory.enums.Location;
import com.vss.design_patterns.abstractfactory.factory.location.DEFAULTCarFactory;
import com.vss.design_patterns.abstractfactory.factory.location.INDIACarFactory;
import com.vss.design_patterns.abstractfactory.factory.location.USACarFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CarFactory {

	private CarFactory(){}

	public static Car buildCar(CarType model){
		Location location = getRandomLocation();
		switch (location){
			case USA:
				return USACarFactory.buidCar(model);
			case INDIA:
				return INDIACarFactory.buidCar(model);
			case DEFAULT:
				return DEFAULTCarFactory.buidCar(model);
		}
		return null;
	}

	/**
	 * this method just demonstrate how location service can be implemented
	 * we can have this automated using GPS location as well
	 *
	 * @return
	 */
	private static Location getRandomLocation() {
		List<Location> locationList = Arrays.asList(Location.values());
		int index = new Random().nextInt(locationList.size());
		return locationList.get(index);
	}

}
