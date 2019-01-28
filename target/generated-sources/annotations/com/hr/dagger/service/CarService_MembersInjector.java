package com.hr.dagger.service;

import com.hr.dagger.interfaces.Break;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CarService_MembersInjector implements MembersInjector<CarService> {
  private final Provider<DriverService> driverProvider;

  private final Provider<AccelarateService> accelerateProvider;

  private final Provider<Break> breakkProvider;

  public CarService_MembersInjector(
      Provider<DriverService> driverProvider,
      Provider<AccelarateService> accelerateProvider,
      Provider<Break> breakkProvider) {
    this.driverProvider = driverProvider;
    this.accelerateProvider = accelerateProvider;
    this.breakkProvider = breakkProvider;
  }

  public static MembersInjector<CarService> create(
      Provider<DriverService> driverProvider,
      Provider<AccelarateService> accelerateProvider,
      Provider<Break> breakkProvider) {
    return new CarService_MembersInjector(driverProvider, accelerateProvider, breakkProvider);
  }

  @Override
  public void injectMembers(CarService instance) {
    injectDriver(instance, driverProvider.get());
    injectAccelerate(instance, accelerateProvider.get());
    injectBreakk(instance, breakkProvider.get());
  }

  public static void injectDriver(CarService instance, DriverService driver) {
    instance.driver = driver;
  }

  public static void injectAccelerate(CarService instance, AccelarateService accelerate) {
    instance.accelerate = accelerate;
  }

  public static void injectBreakk(CarService instance, Break breakk) {
    instance.breakk = breakk;
  }
}
