package com.hr.dagger.service;

import javax.inject.Inject;

import com.hr.dagger.interfaces.Driver;

public class DriverService implements Driver {

	@Inject CarService car;

	@Inject
	public DriverService(){

	}

	public void driveCar(){

		car.runCar();

	}

}
