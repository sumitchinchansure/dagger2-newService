package com.hr.dagger.modules;

import javax.inject.Singleton;

import com.hr.dagger.interfaces.Break;
import com.hr.dagger.service.BreakService;

import dagger.Module;
import dagger.Provides;

@Module
public class ProviderModule {

	/*@Provides
	@Singleton
	public Accelarate accelerater() {
		return new AccelarateService();
	}*/

	/*@Provides
	@Singleton
	public Car car() {
		return new CarService();
	}*/

	@Provides
	@Singleton
	public Break breakk() {
		return new BreakService();
	}

	/*@Provides
	@Singleton
	public Driver driver() {
		return new DriverService();
	}*/

}
