package com.hr.dagger.service;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CarService_Factory implements Factory<CarService> {
  private final Provider<AccelarateService> accelerateProvider;

  public CarService_Factory(Provider<AccelarateService> accelerateProvider) {
    this.accelerateProvider = accelerateProvider;
  }

  @Override
  public CarService get() {
    CarService instance = new CarService();
    CarService_MembersInjector.injectAccelerate(instance, accelerateProvider.get());
    return instance;
  }

  public static Factory<CarService> create(Provider<AccelarateService> accelerateProvider) {
    return new CarService_Factory(accelerateProvider);
  }

  public static CarService newCarService() {
    return new CarService();
  }
}
