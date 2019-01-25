package com.hr.dagger.service;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DriverService_MembersInjector implements MembersInjector<DriverService> {
  private final Provider<CarService> carProvider;

  public DriverService_MembersInjector(Provider<CarService> carProvider) {
    this.carProvider = carProvider;
  }

  public static MembersInjector<DriverService> create(Provider<CarService> carProvider) {
    return new DriverService_MembersInjector(carProvider);
  }

  @Override
  public void injectMembers(DriverService instance) {
    injectCar(instance, carProvider.get());
  }

  public static void injectCar(DriverService instance, CarService car) {
    instance.car = car;
  }
}
