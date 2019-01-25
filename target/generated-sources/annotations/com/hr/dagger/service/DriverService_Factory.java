package com.hr.dagger.service;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DriverService_Factory implements Factory<DriverService> {
  private final Provider<CarService> carProvider;

  public DriverService_Factory(Provider<CarService> carProvider) {
    this.carProvider = carProvider;
  }

  @Override
  public DriverService get() {
    DriverService instance = new DriverService();
    DriverService_MembersInjector.injectCar(instance, carProvider.get());
    return instance;
  }

  public static Factory<DriverService> create(Provider<CarService> carProvider) {
    return new DriverService_Factory(carProvider);
  }

  public static DriverService newDriverService() {
    return new DriverService();
  }
}
