package com.hr.dagger.modules;

import javax.inject.Singleton;

import com.hr.dagger.interfaces.Accelarate;
import com.hr.dagger.interfaces.Car;
import com.hr.dagger.interfaces.Driver;
import com.hr.dagger.service.AccelarateService;
import com.hr.dagger.service.CarService;
import com.hr.dagger.service.DriverService;

import dagger.Module;
import dagger.Provides;

@Module
public class ProviderModule {

	@Provides
	@Singleton
	public Accelarate accelerate() {
		return new AccelarateService();
	}

	@Provides
	@Singleton
	public Car car() {
		return new CarService();
	}

	@Provides
	@Singleton
	public Driver drive() {
		return new DriverService();
	}

}
