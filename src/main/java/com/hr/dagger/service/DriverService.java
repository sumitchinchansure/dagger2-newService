package com.hr.dagger.service;

import javax.inject.Inject;

public class DriverService {


	@Inject
	public DriverService(){

	}

	public void driveCar(){

		System.out.println("Driving the car...!!");

	}

}
