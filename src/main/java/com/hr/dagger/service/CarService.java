package com.hr.dagger.service;

import javax.inject.Inject;

import com.hr.dagger.interfaces.Car;

public class CarService implements Car {

	@Inject AccelarateService accelerate;

	@Inject
	public CarService(){

	}

	public void runCar(){

		accelerate.speedUp();
	}


}
