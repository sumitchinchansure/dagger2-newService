package com.hr.dagger.service;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CarService_MembersInjector implements MembersInjector<CarService> {
  private final Provider<AccelarateService> accelerateProvider;

  public CarService_MembersInjector(Provider<AccelarateService> accelerateProvider) {
    this.accelerateProvider = accelerateProvider;
  }

  public static MembersInjector<CarService> create(Provider<AccelarateService> accelerateProvider) {
    return new CarService_MembersInjector(accelerateProvider);
  }

  @Override
  public void injectMembers(CarService instance) {
    injectAccelerate(instance, accelerateProvider.get());
  }

  public static void injectAccelerate(CarService instance, AccelarateService accelerate) {
    instance.accelerate = accelerate;
  }
}
