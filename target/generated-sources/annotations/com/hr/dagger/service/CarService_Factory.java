package com.hr.dagger.service;

import com.hr.dagger.interfaces.Break;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CarService_Factory implements Factory<CarService> {
  private final Provider<DriverService> driverProvider;

  private final Provider<AccelarateService> accelerateProvider;

  private final Provider<Break> breakkProvider;

  public CarService_Factory(
      Provider<DriverService> driverProvider,
      Provider<AccelarateService> accelerateProvider,
      Provider<Break> breakkProvider) {
    this.driverProvider = driverProvider;
    this.accelerateProvider = accelerateProvider;
    this.breakkProvider = breakkProvider;
  }

  @Override
  public CarService get() {
    CarService instance = new CarService();
    CarService_MembersInjector.injectDriver(instance, driverProvider.get());
    CarService_MembersInjector.injectAccelerate(instance, accelerateProvider.get());
    CarService_MembersInjector.injectBreakk(instance, breakkProvider.get());
    return instance;
  }

  public static Factory<CarService> create(
      Provider<DriverService> driverProvider,
      Provider<AccelarateService> accelerateProvider,
      Provider<Break> breakkProvider) {
    return new CarService_Factory(driverProvider, accelerateProvider, breakkProvider);
  }

  public static CarService newCarService() {
    return new CarService();
  }
}
