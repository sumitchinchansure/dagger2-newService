package com.hr.dagger.modules;

import com.hr.dagger.interfaces.Driver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProviderModule_DriveFactory implements Factory<Driver> {
  private final ProviderModule module;

  public ProviderModule_DriveFactory(ProviderModule module) {
    this.module = module;
  }

  @Override
  public Driver get() {
    return Preconditions.checkNotNull(
        module.drive(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Driver> create(ProviderModule module) {
    return new ProviderModule_DriveFactory(module);
  }
}
