package com.hr.dagger.modules;

import com.hr.dagger.interfaces.Car;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProviderModule_CarFactory implements Factory<Car> {
  private final ProviderModule module;

  public ProviderModule_CarFactory(ProviderModule module) {
    this.module = module;
  }

  @Override
  public Car get() {
    return Preconditions.checkNotNull(
        module.car(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Car> create(ProviderModule module) {
    return new ProviderModule_CarFactory(module);
  }
}
