package com.hr.dagger.service;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Driver_Factory implements Factory<DriverService> {
  private static final Driver_Factory INSTANCE = new Driver_Factory();

  @Override
  public DriverService get() {
    return new DriverService();
  }

  public static Factory<DriverService> create() {
    return INSTANCE;
  }
}
