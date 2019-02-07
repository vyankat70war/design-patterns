package com.vss.design_patterns.abstractfactory.cars;

import com.vss.design_patterns.abstractfactory.enums.CarType;
import com.vss.design_patterns.abstractfactory.enums.Location;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Car {
	private CarType model;
	private Location location;

	abstract void construct();

	Car(CarType model, Location location){
		this.model = model;
		this.location = location;
	}

	@Override public String toString() {
		return "CarModel "+ this.model + " located in " + this.location;
	}
}
