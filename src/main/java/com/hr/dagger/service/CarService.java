package com.hr.dagger.service;

import javax.inject.Inject;

import com.hr.dagger.interfaces.Car;

public class CarService implements Car {

	@Inject DriverService driver;
	@Inject AccelarateService accelerate;
	@Inject BreakService breakk;

	@Inject
	public CarService(){

	}

	public void runCar(){

		driver.driveCar();
		accelerate.speedUp();
		breakk.applyBreak();
	}


}
